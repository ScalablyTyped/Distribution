package typings.pulumiAws.usagePlanMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.apigateway.UsagePlanApiStage
import typings.pulumiAws.inputMod.apigateway.UsagePlanQuotaSettings
import typings.pulumiAws.inputMod.apigateway.UsagePlanThrottleSettings
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsagePlanState extends js.Object {
  
  /**
    * The associated API stages of the usage plan.
    */
  val apiStages: js.UndefOr[Input[js.Array[Input[UsagePlanApiStage]]]] = js.native
  
  /**
    * Amazon Resource Name (ARN)
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The description of a usage plan.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the usage plan.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The AWS Marketplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
    */
  val productCode: js.UndefOr[Input[String]] = js.native
  
  /**
    * The quota settings of the usage plan.
    */
  val quotaSettings: js.UndefOr[Input[UsagePlanQuotaSettings]] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The throttling limits of the usage plan.
    */
  val throttleSettings: js.UndefOr[Input[UsagePlanThrottleSettings]] = js.native
}
object UsagePlanState {
  
  @scala.inline
  def apply(): UsagePlanState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsagePlanState]
  }
  
  @scala.inline
  implicit class UsagePlanStateOps[Self <: UsagePlanState] (val x: Self) extends AnyVal {
    
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
    def setApiStagesVarargs(value: Input[UsagePlanApiStage]*): Self = this.set("apiStages", js.Array(value :_*))
    
    @scala.inline
    def setApiStages(value: Input[js.Array[Input[UsagePlanApiStage]]]): Self = this.set("apiStages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiStages: Self = this.set("apiStages", js.undefined)
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProductCode(value: Input[String]): Self = this.set("productCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductCode: Self = this.set("productCode", js.undefined)
    
    @scala.inline
    def setQuotaSettings(value: Input[UsagePlanQuotaSettings]): Self = this.set("quotaSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaSettings: Self = this.set("quotaSettings", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setThrottleSettings(value: Input[UsagePlanThrottleSettings]): Self = this.set("throttleSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottleSettings: Self = this.set("throttleSettings", js.undefined)
  }
}
