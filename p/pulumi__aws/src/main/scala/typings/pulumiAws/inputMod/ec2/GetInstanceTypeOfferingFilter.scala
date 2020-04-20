package typings.pulumiAws.inputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceTypeOfferingFilter extends js.Object {
  /**
    * Name of the filter. The `location` filter depends on the top-level `locationType` argument and if not specified, defaults to the current region.
    */
  var name: String = js.native
  /**
    * List of one or more values for the filter.
    */
  var values: js.Array[String] = js.native
}

object GetInstanceTypeOfferingFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetInstanceTypeOfferingFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceTypeOfferingFilter]
  }
}

