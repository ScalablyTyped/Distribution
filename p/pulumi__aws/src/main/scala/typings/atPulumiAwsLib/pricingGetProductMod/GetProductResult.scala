package typings
package atPulumiAwsLib.pricingGetProductMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetProductResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * Set to the product returned from the API.
    */
  val result: java.lang.String
}

object GetProductResult {
  @scala.inline
  def apply(id: java.lang.String, result: java.lang.String): GetProductResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[GetProductResult]
  }
}

