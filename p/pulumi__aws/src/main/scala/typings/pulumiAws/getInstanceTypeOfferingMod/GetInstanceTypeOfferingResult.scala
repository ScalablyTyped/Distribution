package typings.pulumiAws.getInstanceTypeOfferingMod

import typings.pulumiAws.outputMod.ec2.GetInstanceTypeOfferingFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceTypeOfferingResult extends js.Object {
  val filters: js.UndefOr[js.Array[GetInstanceTypeOfferingFilter]] = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * EC2 Instance Type.
    */
  val instanceType: String = js.native
  val locationType: js.UndefOr[String] = js.native
  val preferredInstanceTypes: js.UndefOr[js.Array[String]] = js.native
}

object GetInstanceTypeOfferingResult {
  @scala.inline
  def apply(id: String, instanceType: String): GetInstanceTypeOfferingResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceTypeOfferingResult]
  }
  @scala.inline
  implicit class GetInstanceTypeOfferingResultOps[Self <: GetInstanceTypeOfferingResult] (val x: Self) extends AnyVal {
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
    def setInstanceType(value: String): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltersVarargs(value: GetInstanceTypeOfferingFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetInstanceTypeOfferingFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setLocationType(value: String): Self = this.set("locationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationType: Self = this.set("locationType", js.undefined)
    @scala.inline
    def setPreferredInstanceTypesVarargs(value: String*): Self = this.set("preferredInstanceTypes", js.Array(value :_*))
    @scala.inline
    def setPreferredInstanceTypes(value: js.Array[String]): Self = this.set("preferredInstanceTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredInstanceTypes: Self = this.set("preferredInstanceTypes", js.undefined)
  }
  
}

