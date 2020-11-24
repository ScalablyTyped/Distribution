package typings.pulumiAws.rateBasedRuleMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.wafregional.RateBasedRulePredicate
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RateBasedRuleArgs extends js.Object {
  
  /**
    * The name or description for the Amazon CloudWatch metric of this rule.
    */
  val metricName: Input[String] = js.native
  
  /**
    * The name or description of the rule.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The objects to include in a rule (documented below).
    */
  val predicates: js.UndefOr[Input[js.Array[Input[RateBasedRulePredicate]]]] = js.native
  
  /**
    * Valid value is IP.
    */
  val rateKey: Input[String] = js.native
  
  /**
    * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. Minimum value is 100.
    */
  val rateLimit: Input[Double] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object RateBasedRuleArgs {
  
  @scala.inline
  def apply(metricName: Input[String], rateKey: Input[String], rateLimit: Input[Double]): RateBasedRuleArgs = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], rateKey = rateKey.asInstanceOf[js.Any], rateLimit = rateLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateBasedRuleArgs]
  }
  
  @scala.inline
  implicit class RateBasedRuleArgsOps[Self <: RateBasedRuleArgs] (val x: Self) extends AnyVal {
    
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
    def setRateKey(value: Input[String]): Self = this.set("rateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateLimit(value: Input[Double]): Self = this.set("rateLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPredicatesVarargs(value: Input[RateBasedRulePredicate]*): Self = this.set("predicates", js.Array(value :_*))
    
    @scala.inline
    def setPredicates(value: Input[js.Array[Input[RateBasedRulePredicate]]]): Self = this.set("predicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredicates: Self = this.set("predicates", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
