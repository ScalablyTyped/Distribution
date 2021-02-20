package typings.samchon

import typings.samchon.dedicatedWorkerServerMod.DedicatedWorkerServer
import typings.samchon.iserverMod.IServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dedicatedWorkerServerBaseMod {
  
  @JSImport("samchon/protocol/server/base/DedicatedWorkerServerBase", "DedicatedWorkerServerBase")
  @js.native
  class DedicatedWorkerServerBase protected () extends DedicatedWorkerServer {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: IServer) = this()
    
    /**
      * @hidden
      */
    var hooker_ : js.Any = js.native
  }
}
