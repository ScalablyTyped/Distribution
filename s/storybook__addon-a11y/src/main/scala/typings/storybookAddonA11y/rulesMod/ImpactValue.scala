package typings.storybookAddonA11y.rulesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ImpactValue extends js.Object
@JSImport("@storybook/addon-a11y/dist/components/Report/Rules", "ImpactValue")
@js.native
object ImpactValue extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ImpactValue with String] = js.native
  
  @js.native
  sealed trait CRITICAL extends ImpactValue
  /* "critical" */ @js.native
  object CRITICAL extends TopLevel[CRITICAL with String]
  
  @js.native
  sealed trait MINOR extends ImpactValue
  /* "minor" */ @js.native
  object MINOR extends TopLevel[MINOR with String]
  
  @js.native
  sealed trait MODERATE extends ImpactValue
  /* "moderate" */ @js.native
  object MODERATE extends TopLevel[MODERATE with String]
  
  @js.native
  sealed trait SERIOUS extends ImpactValue
  /* "serious" */ @js.native
  object SERIOUS extends TopLevel[SERIOUS with String]
}
