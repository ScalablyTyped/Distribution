package typings
package rxjsLib.internalSubjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Subject", "SubjectSubscriber")
@js.native
class SubjectSubscriber[T] protected ()
  extends rxjsLib.internalSubscriberMod.Subscriber[T] {
  def this(destination: Subject[T]) = this()
  @JSName("destination")
  var destination_SubjectSubscriber: Subject[T] = js.native
}

