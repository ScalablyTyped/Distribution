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
}

