package typings.pusherJs

import typings.pusherJs.typesSrcCoreSocketMod.Socket
import typings.pusherJs.typesSrcCoreTransportsUrlSchemeMod.URLScheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreTransportsTransportHooksMod {
  
  @js.native
  trait TransportHooks extends StObject {
    
    var beforeOpen: js.UndefOr[js.Function] = js.native
    
    var file: js.UndefOr[String] = js.native
    
    def getSocket(url: String): Socket = js.native
    def getSocket(url: String, options: Any): Socket = js.native
    
    var handlesActivityChecks: Boolean = js.native
    
    def isInitialized(): Boolean = js.native
    
    def isSupported(): Boolean = js.native
    def isSupported(environment: Any): Boolean = js.native
    
    var supportsPing: Boolean = js.native
    
    var urls: URLScheme = js.native
  }
}
