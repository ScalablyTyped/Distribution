package typings.rxjs.internalBehaviorSubjectMod

import typings.rxjs.internalSubjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/BehaviorSubject", "BehaviorSubject")
@js.native
class BehaviorSubject[T] protected () extends Subject[T] {
  def this(_value: T) = this()
  var _value: js.Any = js.native
  val value: T = js.native
  def getValue(): T = js.native
}

