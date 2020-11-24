package typings.pulumiAws.wafRuleGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.waf.RuleGroupActivatedRule
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupArgs extends js.Object {
  
  /**
    * A list of activated rules, see below
    */
  val activatedRules: js.UndefOr[Input[js.Array[Input[RuleGroupActivatedRule]]]] = js.native
  
  /**
    * A friendly name for the metrics from the rule group
    */
  val metricName: Input[String] = js.native
  
  /**
    * A friendly name of the rule group
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object RuleGroupArgs {
  
  @scala.inline
  def apply(metricName: Input[String]): RuleGroupArgs = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any])
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
    def setMetricName(value: Input[String]): Self = this.set("metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivatedRulesVarargs(value: Input[RuleGroupActivatedRule]*): Self = this.set("activatedRules", js.Array(value :_*))
    
    @scala.inline
    def setActivatedRules(value: Input[js.Array[Input[RuleGroupActivatedRule]]]): Self = this.set("activatedRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivatedRules: Self = this.set("activatedRules", js.undefined)
    
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
