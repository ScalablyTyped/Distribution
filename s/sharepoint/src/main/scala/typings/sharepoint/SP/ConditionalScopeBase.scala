package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionalScopeBase extends js.Object {
  def customFromJson(initValue: js.Any): Boolean
  def fromJson(initValue: js.Any): Unit
  def get_testResult(): Boolean
  def startIfFalse(): js.Any
  def startIfTrue(): js.Any
  def startScope(): js.Any
}

object ConditionalScopeBase {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    fromJson: js.Any => Unit,
    get_testResult: () => Boolean,
    startIfFalse: () => js.Any,
    startIfTrue: () => js.Any,
    startScope: () => js.Any
  ): ConditionalScopeBase = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), fromJson = js.Any.fromFunction1(fromJson), get_testResult = js.Any.fromFunction0(get_testResult), startIfFalse = js.Any.fromFunction0(startIfFalse), startIfTrue = js.Any.fromFunction0(startIfTrue), startScope = js.Any.fromFunction0(startScope))
    __obj.asInstanceOf[ConditionalScopeBase]
  }
}

