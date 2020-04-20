package typings.storybookAddonJest

import typings.storybookAddonJest.provideJestResultMod.AssertionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAssertionResults extends js.Object {
  var assertionResults: js.Array[AssertionResult]
  var status: String
}

object AnonAssertionResults {
  @scala.inline
  def apply(assertionResults: js.Array[AssertionResult], status: String): AnonAssertionResults = {
    val __obj = js.Dynamic.literal(assertionResults = assertionResults.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAssertionResults]
  }
}

