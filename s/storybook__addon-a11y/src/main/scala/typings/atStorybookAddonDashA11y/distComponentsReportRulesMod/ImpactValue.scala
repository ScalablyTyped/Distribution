package typings.atStorybookAddonDashA11y.distComponentsReportRulesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImpactValue extends js.Object

@JSImport("@storybook/addon-a11y/dist/components/Report/Rules", "ImpactValue")
@js.native
object ImpactValue extends js.Object {
  @js.native
  sealed trait CRITICAL extends ImpactValue
  
  @js.native
  sealed trait MINOR extends ImpactValue
  
  @js.native
  sealed trait MODERATE extends ImpactValue
  
  @js.native
  sealed trait SERIOUS extends ImpactValue
  
  /* "critical" */ val CRITICAL: typings.atStorybookAddonDashA11y.distComponentsReportRulesMod.ImpactValue.CRITICAL with String = js.native
  /* "minor" */ val MINOR: typings.atStorybookAddonDashA11y.distComponentsReportRulesMod.ImpactValue.MINOR with String = js.native
  /* "moderate" */ val MODERATE: typings.atStorybookAddonDashA11y.distComponentsReportRulesMod.ImpactValue.MODERATE with String = js.native
  /* "serious" */ val SERIOUS: typings.atStorybookAddonDashA11y.distComponentsReportRulesMod.ImpactValue.SERIOUS with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ImpactValue with String] = js.native
}

