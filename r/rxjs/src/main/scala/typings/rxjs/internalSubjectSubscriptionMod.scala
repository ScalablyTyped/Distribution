package typings.rxjs

import typings.rxjs.internalSubjectMod.Subject
import typings.rxjs.internalSubscriptionMod.Subscription
import typings.rxjs.internalTypesMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/SubjectSubscription", JSImport.Namespace)
@js.native
object internalSubjectSubscriptionMod extends js.Object {
  @js.native
  class SubjectSubscription[T] protected () extends Subscription {
    def this(subject: Subject[T], subscriber: Observer[T]) = this()
    var subject: Subject[T] = js.native
    var subscriber: Observer[T] = js.native
  }
  
}

