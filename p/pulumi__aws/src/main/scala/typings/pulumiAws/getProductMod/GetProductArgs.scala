package typings.pulumiAws.getProductMod

import typings.pulumiAws.inputMod.pricing.GetProductFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProductArgs extends js.Object {
  /**
    * A list of filters. Passed directly to the API (see GetProducts API reference). These filters must describe a single product, this resource will fail if more than one product is returned by the API.
    */
  val filters: js.Array[GetProductFilter] = js.native
  /**
    * The code of the service. Available service codes can be fetched using the DescribeServices pricing API call.
    */
  val serviceCode: String = js.native
}

object GetProductArgs {
  @scala.inline
  def apply(filters: js.Array[GetProductFilter], serviceCode: String): GetProductArgs = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], serviceCode = serviceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProductArgs]
  }
  @scala.inline
  implicit class GetProductArgsOps[Self <: GetProductArgs] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: GetProductFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetProductFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceCode(value: String): Self = this.set("serviceCode", value.asInstanceOf[js.Any])
  }
  
}

