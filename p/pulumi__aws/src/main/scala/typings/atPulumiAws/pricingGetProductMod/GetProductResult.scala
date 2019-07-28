package typings.atPulumiAws.pricingGetProductMod

import typings.atPulumiAws.Anon_FieldValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetProductResult extends js.Object {
  val filters: js.Array[Anon_FieldValue]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * Set to the product returned from the API.
    */
  val result: String
  val serviceCode: String
}

object GetProductResult {
  @scala.inline
  def apply(filters: js.Array[Anon_FieldValue], id: String, result: String, serviceCode: String): GetProductResult = {
    val __obj = js.Dynamic.literal(filters = filters, id = id, result = result, serviceCode = serviceCode)
  
    __obj.asInstanceOf[GetProductResult]
  }
}

