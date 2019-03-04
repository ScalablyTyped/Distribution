package typings
package atPulumiAwsLib.pricingGetProductMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetProductArgs extends js.Object {
  /**
    * A list of filters. Passed directly to the API (see GetProducts API reference). These filters must describe a single product, this resource will fail if more than one product is returned by the API.
    */
  val filters: js.Array[atPulumiAwsLib.Anon_FieldValue]
  /**
    * The code of the service. Available service codes can be fetched using the DescribeServices pricing API call.
    */
  val serviceCode: java.lang.String
}

object GetProductArgs {
  @scala.inline
  def apply(filters: js.Array[atPulumiAwsLib.Anon_FieldValue], serviceCode: java.lang.String): GetProductArgs = {
    val __obj = js.Dynamic.literal(filters = filters, serviceCode = serviceCode)
  
    __obj.asInstanceOf[GetProductArgs]
  }
}

