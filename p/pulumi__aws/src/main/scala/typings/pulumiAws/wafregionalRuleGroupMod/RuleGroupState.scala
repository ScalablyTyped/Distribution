package typings.pulumiAws.wafregionalRuleGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.wafregional.RuleGroupActivatedRule
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupState extends js.Object {
  
  /**
    * A list of activated rules, see below
    */
  val activatedRules: js.UndefOr[Input[js.Array[Input[RuleGroupActivatedRule]]]] = js.native
  
  /**
    * The ARN of the WAF Regional Rule Group.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * A friendly name for the metrics from the rule group
    */
  val metricName: js.UndefOr[Input[String]] = js.native
  
  /**
    * A friendly name of the rule group
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object RuleGroupState {
  
  @scala.inline
  def apply(): RuleGroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupState]
  }
  
  @scala.inline
  implicit class RuleGroupStateOps[Self <: RuleGroupState] (val x: Self) extends AnyVal {
    
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
    def setActivatedRulesVarargs(value: Input[RuleGroupActivatedRule]*): Self = this.set("activatedRules", js.Array(value :_*))
    
    @scala.inline
    def setActivatedRules(value: Input[js.Array[Input[RuleGroupActivatedRule]]]): Self = this.set("activatedRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivatedRules: Self = this.set("activatedRules", js.undefined)
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setMetricName(value: Input[String]): Self = this.set("metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricName: Self = this.set("metricName", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
