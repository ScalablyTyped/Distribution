package typings.atStorybookAddonDashA11y.distComponentsA11YPanelMod

import typings.axeDashCore.axeDashCoreMod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait A11YPanelState extends js.Object {
  var incomplete: js.Array[Result]
  var passes: js.Array[Result]
  var status: String
  var violations: js.Array[Result]
}

object A11YPanelState {
  @scala.inline
  def apply(
    incomplete: js.Array[Result],
    passes: js.Array[Result],
    status: String,
    violations: js.Array[Result]
  ): A11YPanelState = {
    val __obj = js.Dynamic.literal(incomplete = incomplete.asInstanceOf[js.Any], passes = passes.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], violations = violations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[A11YPanelState]
  }
}

