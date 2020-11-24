package typings.pulumiAws.getSpotPriceMod

import typings.pulumiAws.inputMod.ec2.GetSpotPriceFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSpotPriceArgs extends js.Object {
  
  /**
    * The availability zone in which to query Spot price information.
    */
  val availabilityZone: js.UndefOr[String] = js.native
  
  /**
    * One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSpotPriceHistory.html) for supported filters. Detailed below.
    */
  val filters: js.UndefOr[js.Array[GetSpotPriceFilter]] = js.native
  
  /**
    * The type of instance for which to query Spot Price information.
    */
  val instanceType: js.UndefOr[String] = js.native
}
object GetSpotPriceArgs {
  
  @scala.inline
  def apply(): GetSpotPriceArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSpotPriceArgs]
  }
  
  @scala.inline
  implicit class GetSpotPriceArgsOps[Self <: GetSpotPriceArgs] (val x: Self) extends AnyVal {
    
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
    def setAvailabilityZone(value: String): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: GetSpotPriceFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetSpotPriceFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("instanceType", js.undefined)
  }
}
