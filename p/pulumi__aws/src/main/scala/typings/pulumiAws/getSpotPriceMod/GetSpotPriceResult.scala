package typings.pulumiAws.getSpotPriceMod

import typings.pulumiAws.outputMod.ec2.GetSpotPriceFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSpotPriceResult extends js.Object {
  
  val availabilityZone: js.UndefOr[String] = js.native
  
  val filters: js.UndefOr[js.Array[GetSpotPriceFilter]] = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  val instanceType: js.UndefOr[String] = js.native
  
  /**
    * The most recent Spot Price value for the given instance type and AZ.
    */
  val spotPrice: String = js.native
  
  /**
    * The timestamp at which the Spot Price value was published.
    */
  val spotPriceTimestamp: String = js.native
}
object GetSpotPriceResult {
  
  @scala.inline
  def apply(id: String, spotPrice: String, spotPriceTimestamp: String): GetSpotPriceResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], spotPrice = spotPrice.asInstanceOf[js.Any], spotPriceTimestamp = spotPriceTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSpotPriceResult]
  }
  
  @scala.inline
  implicit class GetSpotPriceResultOps[Self <: GetSpotPriceResult] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotPrice(value: String): Self = this.set("spotPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotPriceTimestamp(value: String): Self = this.set("spotPriceTimestamp", value.asInstanceOf[js.Any])
    
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
