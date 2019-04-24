package typings
package atPulumiAwsLib.apigatewayGetRestApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRestApiResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val name: java.lang.String
  /**
    * Set to the ID of the API Gateway Resource on the found REST API where the route matches '/'.
    */
  val rootResourceId: java.lang.String
}

object GetRestApiResult {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String, rootResourceId: java.lang.String): GetRestApiResult = {
    val __obj = js.Dynamic.literal(id = id, name = name, rootResourceId = rootResourceId)
  
    __obj.asInstanceOf[GetRestApiResult]
  }
}

