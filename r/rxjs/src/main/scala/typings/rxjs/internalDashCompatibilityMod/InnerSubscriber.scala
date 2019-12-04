package typings.rxjs.internalDashCompatibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "InnerSubscriber")
@js.native
class InnerSubscriber[T, R] protected ()
  extends typings.rxjs.internalInnerSubscriberMod.InnerSubscriber[T, R] {
  def this(
    parent: typings.rxjs.internalOuterSubscriberMod.OuterSubscriber[T, R],
    outerValue: T,
    outerIndex: Double
  ) = this()
}

