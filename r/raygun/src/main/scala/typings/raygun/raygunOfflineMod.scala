package typings.raygun

import typings.raygun.typesMod.IOfflineStorage
import typings.raygun.typesMod.MessageTransport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object raygunOfflineMod {
  
  @JSImport("raygun/build/raygun.offline", "OfflineStorage")
  @js.native
  open class OfflineStorage protected ()
    extends StObject
       with IOfflineStorage {
    def this(transport: MessageTransport) = this()
    
    /* private */ var _sendAndDelete: Any = js.native
    
    var cacheLimit: Double = js.native
    
    var cachePath: String = js.native
    
    var transport: MessageTransport = js.native
  }
}
