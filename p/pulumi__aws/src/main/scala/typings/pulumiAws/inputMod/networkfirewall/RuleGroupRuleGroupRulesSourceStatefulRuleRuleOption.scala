package typings.pulumiAws.inputMod.networkfirewall

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption extends StObject {
  
  /**
    * Keyword defined by open source detection systems like Snort or Suricata for stateful rule inspection.
    * See [Snort General Rule Options](http://manual-snort-org.s3-website-us-east-1.amazonaws.com/node31.html) or [Suricata Rule Options](https://suricata.readthedocs.io/en/suricata-5.0.1/rules/intro.html#rule-options) for more details.
    */
  var keyword: Input[String]
  
  /**
    * Set of strings for additional settings to use in stateful rule inspection.
    */
  var settings: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption {
  
  @scala.inline
  def apply(keyword: Input[String]): RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption]
  }
  
  @scala.inline
  implicit class RuleGroupRuleGroupRulesSourceStatefulRuleRuleOptionMutableBuilder[Self <: RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyword(value: Input[String]): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    @scala.inline
    def setSettingsVarargs(value: Input[String]*): Self = StObject.set(x, "settings", js.Array(value :_*))
  }
}
