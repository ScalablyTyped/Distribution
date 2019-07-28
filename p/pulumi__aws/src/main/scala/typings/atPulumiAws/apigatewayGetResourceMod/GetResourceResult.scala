package typings.atPulumiAws.apigatewayGetResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourceResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * Set to the ID of the parent Resource.
    */
  val parentId: String
  val path: String
  /**
    * Set to the path relative to the parent Resource.
    */
  val pathPart: String
  val restApiId: String
}

object GetResourceResult {
  @scala.inline
  def apply(id: String, parentId: String, path: String, pathPart: String, restApiId: String): GetResourceResult = {
    val __obj = js.Dynamic.literal(id = id, parentId = parentId, path = path, pathPart = pathPart, restApiId = restApiId)
  
    __obj.asInstanceOf[GetResourceResult]
  }
}

