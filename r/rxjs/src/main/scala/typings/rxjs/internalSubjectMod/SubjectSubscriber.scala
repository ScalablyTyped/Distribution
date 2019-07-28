package typings.rxjs.internalSubjectMod

import typings.rxjs.internalSubscriberMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Subject", "SubjectSubscriber")
@js.native
class SubjectSubscriber[T] protected () extends Subscriber[T] {
  def this(destination: Subject[T]) = this()
  @JSName("destination")
  var destination_SubjectSubscriber: Subject[T] = js.native
}

