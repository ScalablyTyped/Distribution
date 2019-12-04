package typings.atStorybookAddonDashA11y.distComponentsReportRulesMod

import typings.axeDashCore.axeDashCoreMod.CheckResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RulesProps extends js.Object {
  var rules: js.Array[CheckResult]
}

object RulesProps {
  @scala.inline
  def apply(rules: js.Array[CheckResult]): RulesProps = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RulesProps]
  }
}

