package typings
package rxjsLib.internalInnerSubscriberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/InnerSubscriber", "InnerSubscriber")
@js.native
class InnerSubscriber[T, R] protected ()
  extends rxjsLib.internalSubscriberMod.Subscriber[R] {
  def this(parent: rxjsLib.internalOuterSubscriberMod.OuterSubscriber[T, R], outerValue: T, outerIndex: scala.Double) = this()
  var index: js.Any = js.native
  var outerIndex: scala.Double = js.native
  var outerValue: T = js.native
  var parent: js.Any = js.native
}

