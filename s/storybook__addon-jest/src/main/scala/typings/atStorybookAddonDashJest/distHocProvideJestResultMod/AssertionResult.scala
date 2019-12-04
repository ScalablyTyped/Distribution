package typings.atStorybookAddonDashJest.distHocProvideJestResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertionResult extends js.Object {
  var failureMessages: js.Array[String]
  var fullName: String
  var status: String
  var title: String
}

object AssertionResult {
  @scala.inline
  def apply(failureMessages: js.Array[String], fullName: String, status: String, title: String): AssertionResult = {
    val __obj = js.Dynamic.literal(failureMessages = failureMessages.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssertionResult]
  }
}

