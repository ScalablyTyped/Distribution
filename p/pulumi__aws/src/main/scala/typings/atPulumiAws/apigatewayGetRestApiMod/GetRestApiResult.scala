package typings.atPulumiAws.apigatewayGetRestApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRestApiResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val name: String
  /**
    * Set to the ID of the API Gateway Resource on the found REST API where the route matches '/'.
    */
  val rootResourceId: String
}

object GetRestApiResult {
  @scala.inline
  def apply(id: String, name: String, rootResourceId: String): GetRestApiResult = {
    val __obj = js.Dynamic.literal(id = id, name = name, rootResourceId = rootResourceId)
  
    __obj.asInstanceOf[GetRestApiResult]
  }
}

