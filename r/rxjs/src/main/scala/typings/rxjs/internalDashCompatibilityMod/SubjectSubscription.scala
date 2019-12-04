package typings.rxjs.internalDashCompatibilityMod

import typings.rxjs.internalSubjectMod.Subject
import typings.rxjs.internalTypesMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "SubjectSubscription")
@js.native
class SubjectSubscription[T] protected ()
  extends typings.rxjs.internalSubjectSubscriptionMod.SubjectSubscription[T] {
  def this(subject: Subject[T], subscriber: Observer[T]) = this()
}

