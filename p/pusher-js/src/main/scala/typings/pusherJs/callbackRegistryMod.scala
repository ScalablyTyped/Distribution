package typings.pusherJs

import typings.pusherJs.callbackMod.Callback
import typings.pusherJs.callbackTableMod.CallbackTable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callbackRegistryMod {
  
  @JSImport("pusher-js/types/src/core/events/callback_registry", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with CallbackRegistry
  
  @js.native
  trait CallbackRegistry extends StObject {
    
    var _callbacks: CallbackTable = js.native
    
    def add(name: String, callback: js.Function, context: Any): Unit = js.native
    
    def get(name: String): js.Array[Callback] = js.native
    
    def remove(): Unit = js.native
    def remove(name: String): Unit = js.native
    def remove(name: String, callback: js.Function): Unit = js.native
    def remove(name: String, callback: js.Function, context: Any): Unit = js.native
    def remove(name: String, callback: Unit, context: Any): Unit = js.native
    def remove(name: Unit, callback: js.Function): Unit = js.native
    def remove(name: Unit, callback: js.Function, context: Any): Unit = js.native
    def remove(name: Unit, callback: Unit, context: Any): Unit = js.native
    
    /* private */ var removeAllCallbacks: Any = js.native
    
    /* private */ var removeCallback: Any = js.native
  }
}
