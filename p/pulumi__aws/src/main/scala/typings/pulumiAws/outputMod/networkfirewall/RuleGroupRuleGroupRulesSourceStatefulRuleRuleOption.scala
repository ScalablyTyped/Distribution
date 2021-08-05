package typings.pulumiAws.outputMod.networkfirewall

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption extends StObject {
  
  /**
    * Keyword defined by open source detection systems like Snort or Suricata for stateful rule inspection.
    * See [Snort General Rule Options](http://manual-snort-org.s3-website-us-east-1.amazonaws.com/node31.html) or [Suricata Rule Options](https://suricata.readthedocs.io/en/suricata-5.0.1/rules/intro.html#rule-options) for more details.
    */
  var keyword: String
  
  /**
    * Set of strings for additional settings to use in stateful rule inspection.
    */
  var settings: js.UndefOr[js.Array[String]] = js.undefined
}
object RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption {
  
  inline def apply(keyword: String): RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption]
  }
  
  extension [Self <: RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption](x: Self) {
    
    inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: js.Array[String]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setSettingsVarargs(value: String*): Self = StObject.set(x, "settings", js.Array(value :_*))
  }
}
