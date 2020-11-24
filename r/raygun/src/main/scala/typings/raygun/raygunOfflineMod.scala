package typings.raygun

import typings.raygun.typesMod.IOfflineStorage
import typings.raygun.typesMod.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raygun/build/raygun.offline", JSImport.Namespace)
@js.native
object raygunOfflineMod extends js.Object {
  
  @js.native
  class OfflineStorage protected () extends IOfflineStorage {
    def this(transport: Transport) = this()
    
    var _sendAndDelete: js.Any = js.native
    
    var cacheLimit: Double = js.native
    
    var cachePath: String = js.native
    
    var transport: Transport = js.native
  }
}
