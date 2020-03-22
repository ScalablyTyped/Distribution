package typings.reduxTestkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToChangeInState extends js.Object {
  def toChangeInState(expectedChanges: js.Any): Unit
  def toReturnState(expected: js.Any): Unit
  def toStayTheSame(): Unit
}

object AnonToChangeInState {
  @scala.inline
  def apply(toChangeInState: js.Any => Unit, toReturnState: js.Any => Unit, toStayTheSame: () => Unit): AnonToChangeInState = {
    val __obj = js.Dynamic.literal(toChangeInState = js.Any.fromFunction1(toChangeInState), toReturnState = js.Any.fromFunction1(toReturnState), toStayTheSame = js.Any.fromFunction0(toStayTheSame))
  
    __obj.asInstanceOf[AnonToChangeInState]
  }
}

