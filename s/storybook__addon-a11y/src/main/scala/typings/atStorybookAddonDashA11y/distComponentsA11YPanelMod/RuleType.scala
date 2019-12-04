package typings.atStorybookAddonDashA11y.distComponentsA11YPanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RuleType extends js.Object

@JSImport("@storybook/addon-a11y/dist/components/A11YPanel", "RuleType")
@js.native
object RuleType extends js.Object {
  @js.native
  sealed trait INCOMPLETION extends RuleType
  
  @js.native
  sealed trait PASS extends RuleType
  
  @js.native
  sealed trait VIOLATION extends RuleType
  
  /* 2 */ val INCOMPLETION: typings.atStorybookAddonDashA11y.distComponentsA11YPanelMod.RuleType.INCOMPLETION with Double = js.native
  /* 1 */ val PASS: typings.atStorybookAddonDashA11y.distComponentsA11YPanelMod.RuleType.PASS with Double = js.native
  /* 0 */ val VIOLATION: typings.atStorybookAddonDashA11y.distComponentsA11YPanelMod.RuleType.VIOLATION with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RuleType with Double] = js.native
}

