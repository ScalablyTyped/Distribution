package typings
package rsocketDashTypesLib.reactiveStreamTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubject[T] extends js.Object {
  def onComplete(): scala.Unit
  def onError(error: stdLib.Error): scala.Unit
  def onNext(value: T): scala.Unit
}

object ISubject {
  @scala.inline
  def apply[T](onComplete: () => scala.Unit, onError: stdLib.Error => scala.Unit, onNext: T => scala.Unit): ISubject[T] = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext))
  
    __obj.asInstanceOf[ISubject[T]]
  }
}

