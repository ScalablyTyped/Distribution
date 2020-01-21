package typings.protractor.pluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertionResult extends js.Object {
  var errorMsg: js.UndefOr[String] = js.undefined
  var passed: Boolean
  var stackTrace: js.UndefOr[String] = js.undefined
}

object AssertionResult {
  @scala.inline
  def apply(passed: Boolean, errorMsg: String = null, stackTrace: String = null): AssertionResult = {
    val __obj = js.Dynamic.literal(passed = passed.asInstanceOf[js.Any])
    if (errorMsg != null) __obj.updateDynamic("errorMsg")(errorMsg.asInstanceOf[js.Any])
    if (stackTrace != null) __obj.updateDynamic("stackTrace")(stackTrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertionResult]
  }
}

