package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplateInstanceMarketOptionsSpotOptions extends js.Object {
  
  /**
    * The required duration in minutes. This value must be a multiple of 60.
    */
  var blockDurationMinutes: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The behavior when a Spot Instance is interrupted. Can be `hibernate`,
    * `stop`, or `terminate`. (Default: `terminate`).
    */
  var instanceInterruptionBehavior: js.UndefOr[Input[String]] = js.native
  
  /**
    * The maximum hourly price you're willing to pay for the Spot Instances.
    */
  var maxPrice: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Spot Instance request type. Can be `one-time`, or `persistent`.
    */
  var spotInstanceType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The end date of the request.
    */
  var validUntil: js.UndefOr[Input[String]] = js.native
}
object LaunchTemplateInstanceMarketOptionsSpotOptions {
  
  @scala.inline
  def apply(): LaunchTemplateInstanceMarketOptionsSpotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateInstanceMarketOptionsSpotOptions]
  }
  
  @scala.inline
  implicit class LaunchTemplateInstanceMarketOptionsSpotOptionsOps[Self <: LaunchTemplateInstanceMarketOptionsSpotOptions] (val x: Self) extends AnyVal {
    
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
    def setBlockDurationMinutes(value: Input[Double]): Self = this.set("blockDurationMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockDurationMinutes: Self = this.set("blockDurationMinutes", js.undefined)
    
    @scala.inline
    def setInstanceInterruptionBehavior(value: Input[String]): Self = this.set("instanceInterruptionBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceInterruptionBehavior: Self = this.set("instanceInterruptionBehavior", js.undefined)
    
    @scala.inline
    def setMaxPrice(value: Input[String]): Self = this.set("maxPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPrice: Self = this.set("maxPrice", js.undefined)
    
    @scala.inline
    def setSpotInstanceType(value: Input[String]): Self = this.set("spotInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpotInstanceType: Self = this.set("spotInstanceType", js.undefined)
    
    @scala.inline
    def setValidUntil(value: Input[String]): Self = this.set("validUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidUntil: Self = this.set("validUntil", js.undefined)
  }
}
