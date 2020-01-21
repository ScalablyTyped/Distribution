package typings.pulumiAws.getRestApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRestApiResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val name: String = js.native
  /**
    * Set to the ID of the API Gateway Resource on the found REST API where the route matches '/'.
    */
  val rootResourceId: String = js.native
}

object GetRestApiResult {
  @scala.inline
  def apply(id: String, name: String, rootResourceId: String): GetRestApiResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rootResourceId = rootResourceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetRestApiResult]
  }
}

