package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementManagedRuleGroupStatement extends StObject {
  
  /**
    * The `rules` whose actions are set to `COUNT` by the web ACL, regardless of the action that is set on the rule. See Excluded Rule below for details.
    */
  var excludedRules: js.UndefOr[Input[js.Array[Input[WebAclRuleStatementManagedRuleGroupStatementExcludedRule]]]] = js.undefined
  
  /**
    * The name of the managed rule group.
    */
  var name: Input[String]
  
  /**
    * The name of the managed rule group vendor.
    */
  var vendorName: Input[String]
}
object WebAclRuleStatementManagedRuleGroupStatement {
  
  inline def apply(name: Input[String], vendorName: Input[String]): WebAclRuleStatementManagedRuleGroupStatement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], vendorName = vendorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementManagedRuleGroupStatement]
  }
  
  extension [Self <: WebAclRuleStatementManagedRuleGroupStatement](x: Self) {
    
    inline def setExcludedRules(value: Input[js.Array[Input[WebAclRuleStatementManagedRuleGroupStatementExcludedRule]]]): Self = StObject.set(x, "excludedRules", value.asInstanceOf[js.Any])
    
    inline def setExcludedRulesUndefined: Self = StObject.set(x, "excludedRules", js.undefined)
    
    inline def setExcludedRulesVarargs(value: Input[WebAclRuleStatementManagedRuleGroupStatementExcludedRule]*): Self = StObject.set(x, "excludedRules", js.Array(value :_*))
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVendorName(value: Input[String]): Self = StObject.set(x, "vendorName", value.asInstanceOf[js.Any])
  }
}
