package typings.atStorybookAddonDashA11y.distComponentsA11YPanelMod

import typings.atStorybookAddonDashA11y.atStorybookAddonDashA11yStrings.ran
import typings.atStorybookAddonDashA11y.atStorybookAddonDashA11yStrings.ready
import typings.atStorybookAddonDashA11y.atStorybookAddonDashA11yStrings.running
import typings.axeDashCore.axeDashCoreMod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait A11YPanelNormalState extends A11YPanelState {
  var incomplete: js.Array[Result]
  var passes: js.Array[Result]
  var status: ready | ran | running
  var violations: js.Array[Result]
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
}

