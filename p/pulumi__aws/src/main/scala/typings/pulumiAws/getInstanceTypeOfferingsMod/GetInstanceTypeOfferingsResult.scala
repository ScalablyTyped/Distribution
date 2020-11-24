package typings.pulumiAws.getInstanceTypeOfferingsMod

import typings.pulumiAws.outputMod.ec2.GetInstanceTypeOfferingsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInstanceTypeOfferingsResult extends js.Object {
  
  val filters: js.UndefOr[js.Array[GetInstanceTypeOfferingsFilter]] = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * Set of EC2 Instance Types.
    */
  val instanceTypes: js.Array[String] = js.native
  
  val locationType: js.UndefOr[String] = js.native
}
object GetInstanceTypeOfferingsResult {
  
  @scala.inline
  def apply(id: String, instanceTypes: js.Array[String]): GetInstanceTypeOfferingsResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], instanceTypes = instanceTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceTypeOfferingsResult]
  }
  
  @scala.inline
  implicit class GetInstanceTypeOfferingsResultOps[Self <: GetInstanceTypeOfferingsResult] (val x: Self) extends AnyVal {
    
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
    def setInstanceTypesVarargs(value: String*): Self = this.set("instanceTypes", js.Array(value :_*))
    
    @scala.inline
    def setInstanceTypes(value: js.Array[String]): Self = this.set("instanceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: GetInstanceTypeOfferingsFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetInstanceTypeOfferingsFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setLocationType(value: String): Self = this.set("locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationType: Self = this.set("locationType", js.undefined)
  }
}
