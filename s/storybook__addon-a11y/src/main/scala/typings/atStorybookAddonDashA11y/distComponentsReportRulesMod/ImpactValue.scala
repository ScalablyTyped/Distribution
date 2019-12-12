package typings.atStorybookAddonDashA11y.distComponentsReportRulesMod

import org.scalablytyped.runtime.TopLevel
import typings.atStorybookAddonDashA11y.distComponentsReportRulesMod.ImpactValue.CRITICAL
import typings.atStorybookAddonDashA11y.distComponentsReportRulesMod.ImpactValue.MINOR
import typings.atStorybookAddonDashA11y.distComponentsReportRulesMod.ImpactValue.MODERATE
import typings.atStorybookAddonDashA11y.distComponentsReportRulesMod.ImpactValue.SERIOUS
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ImpactValue with String] = js.native
  /* "critical" */ @js.native
  object CRITICAL extends TopLevel[CRITICAL with String]
  
  /* "minor" */ @js.native
  object MINOR extends TopLevel[MINOR with String]
  
  /* "moderate" */ @js.native
  object MODERATE extends TopLevel[MODERATE with String]
  
  /* "serious" */ @js.native
  object SERIOUS extends TopLevel[SERIOUS with String]
  
}

