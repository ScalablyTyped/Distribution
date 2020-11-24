package typings.samchon

import typings.samchon.externalSystemMod.ExternalSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/templates/external/interfaces/IExternalServer", JSImport.Namespace)
@js.native
object iexternalserverMod extends js.Object {
  
  @js.native
  trait IExternalServer extends ExternalSystem {
    
    /**
      * Connect to the external server.
      */
    def connect(): Unit = js.native
  }
}
