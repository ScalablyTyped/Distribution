package typings.pulumiAws.getRegionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRegionResult extends js.Object {
  /**
    * The region's description in this format: "Location (Region name)".
    */
  val description: String = js.native
  /**
    * The EC2 endpoint for the selected region.
    */
  val endpoint: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The name of the selected region.
    */
  val name: String = js.native
}

object GetRegionResult {
  @scala.inline
  def apply(description: String, endpoint: String, id: String, name: String): GetRegionResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetRegionResult]
  }
}

