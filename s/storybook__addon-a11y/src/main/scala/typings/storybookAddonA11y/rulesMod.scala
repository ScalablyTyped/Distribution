package typings.storybookAddonA11y

import typings.axeCore.mod.CheckResult
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rulesMod {
  
  @js.native
  sealed trait ImpactValue extends StObject
  @JSImport("@storybook/addon-a11y/dist/components/Report/Rules", "ImpactValue")
  @js.native
  object ImpactValue extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ImpactValue with String] = js.native
    
    @js.native
    sealed trait CRITICAL extends ImpactValue
    /* "critical" */ val CRITICAL: typings.storybookAddonA11y.rulesMod.ImpactValue.CRITICAL with String = js.native
    
    @js.native
    sealed trait MINOR extends ImpactValue
    /* "minor" */ val MINOR: typings.storybookAddonA11y.rulesMod.ImpactValue.MINOR with String = js.native
    
    @js.native
    sealed trait MODERATE extends ImpactValue
    /* "moderate" */ val MODERATE: typings.storybookAddonA11y.rulesMod.ImpactValue.MODERATE with String = js.native
    
    @js.native
    sealed trait SERIOUS extends ImpactValue
    /* "serious" */ val SERIOUS: typings.storybookAddonA11y.rulesMod.ImpactValue.SERIOUS with String = js.native
  }
  
  @JSImport("@storybook/addon-a11y/dist/components/Report/Rules", "Rules")
  @js.native
  val Rules: FunctionComponent[RulesProps] = js.native
  
  @js.native
  trait RulesProps extends StObject {
    
    var rules: js.Array[CheckResult] = js.native
  }
  object RulesProps {
    
    @scala.inline
    def apply(rules: js.Array[CheckResult]): RulesProps = {
      val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[RulesProps]
    }
    
    @scala.inline
    implicit class RulesPropsMutableBuilder[Self <: RulesProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRules(value: js.Array[CheckResult]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesVarargs(value: CheckResult*): Self = StObject.set(x, "rules", js.Array(value :_*))
    }
  }
}
