package typings.storybookAddonA11y.a11YPanelMod

import typings.axeCore.mod.Result
import typings.storybookAddonA11y.storybookAddonA11yStrings.ran
import typings.storybookAddonA11y.storybookAddonA11yStrings.ready
import typings.storybookAddonA11y.storybookAddonA11yStrings.running
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait A11YPanelNormalState extends A11YPanelState {
  var incomplete: js.Array[Result] = js.native
  var passes: js.Array[Result] = js.native
  var status: ready | ran | running = js.native
  var violations: js.Array[Result] = js.native
}

object A11YPanelNormalState {
  @scala.inline
  def apply(
    incomplete: js.Array[Result],
    passes: js.Array[Result],
    status: ready | ran | running,
    violations: js.Array[Result]
  ): A11YPanelNormalState = {
    val __obj = js.Dynamic.literal(incomplete = incomplete.asInstanceOf[js.Any], passes = passes.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], violations = violations.asInstanceOf[js.Any])
    __obj.asInstanceOf[A11YPanelNormalState]
  }
  @scala.inline
  implicit class A11YPanelNormalStateOps[Self <: A11YPanelNormalState] (val x: Self) extends AnyVal {
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
    def setIncompleteVarargs(value: Result*): Self = this.set("incomplete", js.Array(value :_*))
    @scala.inline
    def setIncomplete(value: js.Array[Result]): Self = this.set("incomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassesVarargs(value: Result*): Self = this.set("passes", js.Array(value :_*))
    @scala.inline
    def setPasses(value: js.Array[Result]): Self = this.set("passes", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: ready | ran | running): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setViolationsVarargs(value: Result*): Self = this.set("violations", js.Array(value :_*))
    @scala.inline
    def setViolations(value: js.Array[Result]): Self = this.set("violations", value.asInstanceOf[js.Any])
  }
  
}

