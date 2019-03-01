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
    toChangeInState: js.Function1[js.Any, scala.Unit],
    toReturnState: js.Function1[js.Any, scala.Unit],
    toStayTheSame: js.Function0[scala.Unit]
  ): Anon_Expected = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toChangeInState")(toChangeInState)
    __obj.updateDynamic("toReturnState")(toReturnState)
    __obj.updateDynamic("toStayTheSame")(toStayTheSame)
    __obj.asInstanceOf[Anon_Expected]
  }
}

