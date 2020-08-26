package typings.storybookAddonJest.anon

import typings.storybookAddonJest.provideJestResultMod.AssertionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssertionResults extends js.Object {
  var assertionResults: js.Array[AssertionResult] = js.native
  var status: String = js.native
}

object AssertionResults {
  @scala.inline
  def apply(assertionResults: js.Array[AssertionResult], status: String): AssertionResults = {
    val __obj = js.Dynamic.literal(assertionResults = assertionResults.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertionResults]
  }
  @scala.inline
  implicit class AssertionResultsOps[Self <: AssertionResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssertionResultsVarargs(value: AssertionResult*): Self = this.set("assertionResults", js.Array(value :_*))
    @scala.inline
    def setAssertionResults(value: js.Array[AssertionResult]): Self = this.set("assertionResults", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

