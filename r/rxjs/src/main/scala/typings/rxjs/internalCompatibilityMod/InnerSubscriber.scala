package typings.rxjs.internalCompatibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "InnerSubscriber")
@js.native
class InnerSubscriber[T, R] protected ()
  extends typings.rxjs.innerSubscriberMod.InnerSubscriber[T, R] {
  def this(parent: typings.rxjs.outerSubscriberMod.OuterSubscriber[T, R], outerValue: T, outerIndex: Double) = this()
}

