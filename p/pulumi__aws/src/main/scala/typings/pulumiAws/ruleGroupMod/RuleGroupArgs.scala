package typings.pulumiAws.ruleGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.networkfirewall.RuleGroupRuleGroup
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupArgs extends js.Object {
  
  /**
    * The maximum number of operating resources that this rule group can use. For a stateless rule group, the capacity required is the sum of the capacity requirements of the individual rules. For a stateful rule group, the minimum capacity required is the number of individual rules.
    */
  val capacity: Input[Double] = js.native
  
  /**
    * A friendly description of the rule group.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * A friendly name of the rule group.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * A configuration block that defines the rule group rules. Required unless `rules` is specified. See Rule Group below for details.
    */
  val ruleGroup: js.UndefOr[Input[RuleGroupRuleGroup]] = js.native
  
  /**
    * The stateful rule group rules specifications in Suricata file format, with one rule per line. Use this to import your existing Suricata compatible rule groups. Required unless `ruleGroup` is specified.
    */
  val rules: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of key:value pairs to associate with the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Whether the rule group is stateless (containing stateless rules) or stateful (containing stateful rules). Valid values include: `STATEFUL` or `STATELESS`.
    */
  val `type`: Input[String] = js.native
}
object RuleGroupArgs {
  
  @scala.inline
  def apply(capacity: Input[Double], `type`: Input[String]): RuleGroupArgs = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupArgs]
  }
  
  @scala.inline
  implicit class RuleGroupArgsOps[Self <: RuleGroupArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCapacity(value: Input[Double]): Self = this.set("capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRuleGroup(value: Input[RuleGroupRuleGroup]): Self = this.set("ruleGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleGroup: Self = this.set("ruleGroup", js.undefined)
    
    @scala.inline
    def setRules(value: Input[String]): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
