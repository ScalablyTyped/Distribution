package typings.storybookAddonA11y

import typings.axeCore.mod.CheckResult
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ComponentsReportRulesMod {
  
  @js.native
  sealed trait ImpactValue extends StObject
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/Report/Rules", "ImpactValue")
  @js.native
  object ImpactValue extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ImpactValue & String] = js.native
    
    @js.native
    sealed trait CRITICAL
      extends StObject
         with ImpactValue
    /* "critical" */ val CRITICAL: typings.storybookAddonA11y.distTs3Dot9ComponentsReportRulesMod.ImpactValue.CRITICAL & String = js.native
    
    @js.native
    sealed trait MINOR
      extends StObject
         with ImpactValue
    /* "minor" */ val MINOR: typings.storybookAddonA11y.distTs3Dot9ComponentsReportRulesMod.ImpactValue.MINOR & String = js.native
    
    @js.native
    sealed trait MODERATE
      extends StObject
         with ImpactValue
    /* "moderate" */ val MODERATE: typings.storybookAddonA11y.distTs3Dot9ComponentsReportRulesMod.ImpactValue.MODERATE & String = js.native
    
    @js.native
    sealed trait SERIOUS
      extends StObject
         with ImpactValue
    /* "serious" */ val SERIOUS: typings.storybookAddonA11y.distTs3Dot9ComponentsReportRulesMod.ImpactValue.SERIOUS & String = js.native
  }
  
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/Report/Rules", "Rules")
  @js.native
  val Rules: FunctionComponent[RulesProps] = js.native
  
  trait RulesProps extends StObject {
    
    var rules: js.Array[CheckResult]
  }
  object RulesProps {
    
    inline def apply(rules: js.Array[CheckResult]): RulesProps = {
      val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[RulesProps]
    }
    
    extension [Self <: RulesProps](x: Self) {
      
      inline def setRules(value: js.Array[CheckResult]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: CheckResult*): Self = StObject.set(x, "rules", js.Array(value*))
    }
  }
}
