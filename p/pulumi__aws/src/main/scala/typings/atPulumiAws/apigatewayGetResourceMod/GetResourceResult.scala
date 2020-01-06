package typings.atPulumiAws.apigatewayGetResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Set to the ID of the parent Resource.
    */
  val parentId: String = js.native
  val path: String = js.native
  /**
    * Set to the path relative to the parent Resource.
    */
  val pathPart: String = js.native
  val restApiId: String = js.native
}

object GetResourceResult {
  @scala.inline
  def apply(id: String, parentId: String, path: String, pathPart: String, restApiId: String): GetResourceResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathPart = pathPart.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetResourceResult]
  }
}

