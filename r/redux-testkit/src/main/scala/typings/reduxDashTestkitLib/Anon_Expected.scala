package typings
package reduxDashTestkitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expected extends js.Object {
  def toChangeInState(expectedChanges: js.Any): scala.Unit
  def toReturnState(expected: js.Any): scala.Unit
  def toStayTheSame(): scala.Unit
}

object Anon_Expected {
  @scala.inline
  def apply(
    toChangeInState: js.Any => scala.Unit,
    toReturnState: js.Any => scala.Unit,
    toStayTheSame: () => scala.Unit
  ): Anon_Expected = {
    val __obj = js.Dynamic.literal(toChangeInState = js.Any.fromFunction1(toChangeInState), toReturnState = js.Any.fromFunction1(toReturnState), toStayTheSame = js.Any.fromFunction0(toStayTheSame))
  
    __obj.asInstanceOf[Anon_Expected]
  }
}

