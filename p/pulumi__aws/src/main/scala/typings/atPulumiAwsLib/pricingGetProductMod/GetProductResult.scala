package typings
package atPulumiAwsLib.pricingGetProductMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetProductResult extends js.Object {
  val filters: js.Array[atPulumiAwsLib.Anon_FieldValue]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * Set to the product returned from the API.
    */
  val result: java.lang.String
  val serviceCode: java.lang.String
}

object GetProductResult {
  @scala.inline
  def apply(
    filters: js.Array[atPulumiAwsLib.Anon_FieldValue],
    id: java.lang.String,
    result: java.lang.String,
    serviceCode: java.lang.String
  ): GetProductResult = {
    val __obj = js.Dynamic.literal(filters = filters, id = id, result = result, serviceCode = serviceCode)
  
    __obj.asInstanceOf[GetProductResult]
  }
}

