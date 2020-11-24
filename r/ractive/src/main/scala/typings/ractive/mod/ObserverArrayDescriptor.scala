package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObserverArrayDescriptor[T /* <: Ractive[T] */]
  extends ObserverArrayOpts
     with ObserverDescriptor[T] {
  
  /**
  	 * The observer callback.j
  	 */
  def handler(changes: ArrayChanges): Unit | js.Promise[_] = js.native
  /**
  	 * The observer callback.j
  	 */
  @JSName("handler")
  var handler_Original: ObserverArrayCallback[T] = js.native
  
  /**
  	 * Whether or not to use observeOnce when subscribing the observer. Defaults to false.
  	 */
  var once: js.UndefOr[Boolean] = js.native
}
