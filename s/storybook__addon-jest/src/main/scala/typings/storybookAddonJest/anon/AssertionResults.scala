package typings.storybookAddonJest.anon

import typings.storybookAddonJest.provideJestResultMod.AssertionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertionResults extends js.Object {
  var assertionResults: js.Array[AssertionResult]
  var status: String
}

object AssertionResults {
  @scala.inline
  def apply(assertionResults: js.Array[AssertionResult], status: String): AssertionResults = {
    val __obj = js.Dynamic.literal(assertionResults = assertionResults.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertionResults]
  }
}

