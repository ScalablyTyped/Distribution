package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObserverBaseDescriptor[T /* <: Ractive[T] */]
  extends ObserverOpts
     with ObserverDescriptor[T] {
  
  /**
  	 * The observer callback.
  	 */
  def handler(value: js.Any, old: js.Any, keypath: String, parts: String*): Unit | js.Promise[_] = js.native
  /**
  	 * The observer callback.
  	 */
  @JSName("handler")
  var handler_Original: ObserverCallback[T] = js.native
  
  /**
  	 * Whether or not to use observeOnce when subscribing the observer. Defaults to false.
  	 */
  var once: js.UndefOr[Boolean] = js.native
}
