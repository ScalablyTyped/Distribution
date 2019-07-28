package typings.atPulumiAws.apigatewayGetResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourceArgs extends js.Object {
  /**
    * The full path of the resource.  If no path is found, an error will be returned.
    */
  val path: String
  /**
    * The REST API id that owns the resource. If no REST API is found, an error will be returned.
    */
  val restApiId: String
}

object GetResourceArgs {
  @scala.inline
  def apply(path: String, restApiId: String): GetResourceArgs = {
    val __obj = js.Dynamic.literal(path = path, restApiId = restApiId)
  
    __obj.asInstanceOf[GetResourceArgs]
  }
}

