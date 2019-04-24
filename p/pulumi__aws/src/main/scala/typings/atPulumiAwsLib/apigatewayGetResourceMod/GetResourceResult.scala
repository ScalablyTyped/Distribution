package typings
package atPulumiAwsLib.apigatewayGetResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourceResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * Set to the ID of the parent Resource.
    */
  val parentId: java.lang.String
  val path: java.lang.String
  /**
    * Set to the path relative to the parent Resource.
    */
  val pathPart: java.lang.String
  val restApiId: java.lang.String
}

object GetResourceResult {
  @scala.inline
  def apply(
    id: java.lang.String,
    parentId: java.lang.String,
    path: java.lang.String,
    pathPart: java.lang.String,
    restApiId: java.lang.String
  ): GetResourceResult = {
    val __obj = js.Dynamic.literal(id = id, parentId = parentId, path = path, pathPart = pathPart, restApiId = restApiId)
  
    __obj.asInstanceOf[GetResourceResult]
  }
}

