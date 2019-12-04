package typings.atStorybookAddonDashJest

import typings.atStorybookAddonDashJest.distHocProvideJestResultMod.AssertionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AssertionResults extends js.Object {
  var assertionResults: js.Array[AssertionResult]
  var status: String
}

object Anon_AssertionResults {
  @scala.inline
  def apply(assertionResults: js.Array[AssertionResult], status: String): Anon_AssertionResults = {
    val __obj = js.Dynamic.literal(assertionResults = assertionResults.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AssertionResults]
  }
}

