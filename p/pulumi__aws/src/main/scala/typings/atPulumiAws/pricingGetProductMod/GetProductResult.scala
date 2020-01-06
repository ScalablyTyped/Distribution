package typings.atPulumiAws.pricingGetProductMod

import typings.atPulumiAws.typesOutputMod.pricing.GetProductFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProductResult extends js.Object {
  val filters: js.Array[GetProductFilter] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Set to the product returned from the API.
    */
  val result: String = js.native
  val serviceCode: String = js.native
}

object GetProductResult {
  @scala.inline
  def apply(filters: js.Array[GetProductFilter], id: String, result: String, serviceCode: String): GetProductResult = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], serviceCode = serviceCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetProductResult]
  }
}

