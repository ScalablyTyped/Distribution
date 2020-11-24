package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerDescriptor[T /* <: Ractive[T] */] extends js.Object {
  
  /**
  	 * The callback to call when the event is fired.
  	 */
  def handler(ctx: ContextHelper, args: js.Any*): Boolean | Unit | js.Promise[_] = js.native
  /**
  	 * The callback to call when the event is fired.
  	 */
  @JSName("handler")
  var handler_Original: ListenerCallback[T] = js.native
  
  /**
  	 * Whether or not to immediately cancel the listener after the first firing.
  	 */
  var once: js.UndefOr[Boolean] = js.native
}
