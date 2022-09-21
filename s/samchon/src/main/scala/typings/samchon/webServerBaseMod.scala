package typings.samchon

import typings.samchon.iserverMod.IServer
import typings.samchon.webServerMod.WebServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webServerBaseMod {
  
  @JSImport("samchon/protocol/server/base/WebServerBase", "WebServerBase")
  @js.native
  open class WebServerBase protected () extends WebServer {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: IServer) = this()
    
    /**
      * @hidden
      */
    /* private */ var hooker_ : Any = js.native
  }
}
