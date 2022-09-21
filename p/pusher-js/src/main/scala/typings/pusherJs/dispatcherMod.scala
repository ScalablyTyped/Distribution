package typings.pusherJs

import typings.pusherJs.metadataMod.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dispatcherMod {
  
  @JSImport("pusher-js/types/src/core/events/dispatcher", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Dispatcher {
    def this(failThrough: js.Function) = this()
  }
  
  @js.native
  trait Dispatcher extends StObject {
    
    def bind(eventName: String, callback: js.Function): this.type = js.native
    def bind(eventName: String, callback: js.Function, context: Any): this.type = js.native
    
    def bind_global(callback: js.Function): this.type = js.native
    
    var callbacks: typings.pusherJs.callbackRegistryMod.default = js.native
    
    def emit(eventName: String): Dispatcher = js.native
    def emit(eventName: String, data: Any): Dispatcher = js.native
    def emit(eventName: String, data: Any, metadata: Metadata): Dispatcher = js.native
    def emit(eventName: String, data: Unit, metadata: Metadata): Dispatcher = js.native
    
    var failThrough: js.Function = js.native
    
    var global_callbacks: js.Array[js.Function] = js.native
    
    def unbind(): this.type = js.native
    def unbind(eventName: String): this.type = js.native
    def unbind(eventName: String, callback: js.Function): this.type = js.native
    def unbind(eventName: String, callback: js.Function, context: Any): this.type = js.native
    def unbind(eventName: String, callback: Unit, context: Any): this.type = js.native
    def unbind(eventName: Unit, callback: js.Function): this.type = js.native
    def unbind(eventName: Unit, callback: js.Function, context: Any): this.type = js.native
    def unbind(eventName: Unit, callback: Unit, context: Any): this.type = js.native
    
    def unbind_all(): this.type = js.native
    
    def unbind_global(): this.type = js.native
    def unbind_global(callback: js.Function): this.type = js.native
  }
}
