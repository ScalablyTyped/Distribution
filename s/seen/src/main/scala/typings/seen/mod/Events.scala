package typings.seen.mod

import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Events")
@js.native
object Events extends js.Object {
  
  def Event(): Unit = js.native
  
  /**
    * Return a new dispatcher that creates event types using the supplied string argument list. The returned Dispatcher will have methods with the names of the event types.
    */
  def dispatch(): Dispatcher = js.native
  
  /**
    * The Dispatcher class. These objects have methods that can be invoked like dispatch.eventName(). Listeners can be registered with dispatch.on('eventName.uniqueId', callback). Listeners can be
    * removed with dispatch.on('eventName.uniqueId', null). Listeners can also be registered and removed with dispatch.eventName.on('name', callback).
    *
    * Note that only one listener with the name event name and id can be registered at once. If you to generate unique ids, you can use the seen.Util.uniqueId() method.
    */
  @js.native
  class Dispatcher () extends js.Object {
    
    def on(`type`: String, listener: EventListener): Dispatcher = js.native
  }
}
