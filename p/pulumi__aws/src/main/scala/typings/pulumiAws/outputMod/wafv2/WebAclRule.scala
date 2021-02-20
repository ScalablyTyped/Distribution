package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRule extends StObject {
  
  /**
    * The action that AWS WAF should take on a web request when it matches the rule's statement. This is used only for rules whose **statements do not reference a rule group**. See Action below for details.
    */
  var action: js.UndefOr[WebAclRuleAction] = js.native
  
  /**
    * A friendly name of the rule.
    */
  var name: String = js.native
  
  /**
    * The override action to apply to the rules in a rule group. Used only for rule **statements that reference a rule group**, like `ruleGroupReferenceStatement` and `managedRuleGroupStatement`. See Override Action below for details.
    */
  var overrideAction: js.UndefOr[WebAclRuleOverrideAction] = js.native
  
  /**
    * If you define more than one Rule in a WebACL, AWS WAF evaluates each request against the `rules` in order based on the value of `priority`. AWS WAF processes rules with lower priority first.
    */
  var priority: Double = js.native
  
  /**
    * The AWS WAF processing statement for the rule, for example `byteMatchStatement` or `geoMatchStatement`. See Statement below for details.
    */
  var statement: WebAclRuleStatement = js.native
  
  /**
    * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
    */
  var visibilityConfig: WebAclRuleVisibilityConfig = js.native
}
object WebAclRule {
  
  @scala.inline
  def apply(
    name: String,
    priority: Double,
    statement: WebAclRuleStatement,
    visibilityConfig: WebAclRuleVisibilityConfig
  ): WebAclRule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], statement = statement.asInstanceOf[js.Any], visibilityConfig = visibilityConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRule]
  }
  
  @scala.inline
  implicit class WebAclRuleMutableBuilder[Self <: WebAclRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: WebAclRuleAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideAction(value: WebAclRuleOverrideAction): Self = StObject.set(x, "overrideAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideActionUndefined: Self = StObject.set(x, "overrideAction", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement(value: WebAclRuleStatement): Self = StObject.set(x, "statement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityConfig(value: WebAclRuleVisibilityConfig): Self = StObject.set(x, "visibilityConfig", value.asInstanceOf[js.Any])
  }
}
