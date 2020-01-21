package typings.pulumiAws.inputMod.pricing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProductFilter extends js.Object {
  /**
    * The product attribute name that you want to filter on.
    */
  var field: String = js.native
  /**
    * The product attribute value that you want to filter on.
    */
  var value: String = js.native
}

object GetProductFilter {
  @scala.inline
  def apply(field: String, value: String): GetProductFilter = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetProductFilter]
  }
}

