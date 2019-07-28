package typings.atPulumiAws.getRegionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRegionResult extends js.Object {
  /**
    * The region's description in this format: "Location (Region name)".
    */
  val description: String
  /**
    * The EC2 endpoint for the selected region.
    */
  val endpoint: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The name of the selected region.
    */
  val name: String
}

object GetRegionResult {
  @scala.inline
  def apply(description: String, endpoint: String, id: String, name: String): GetRegionResult = {
    val __obj = js.Dynamic.literal(description = description, endpoint = endpoint, id = id, name = name)
  
    __obj.asInstanceOf[GetRegionResult]
  }
}

