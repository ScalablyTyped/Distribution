package typings
package atPulumiAwsLib.apigatewayGetResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourceArgs extends js.Object {
  /**
    * The full path of the resource.  If no path is found, an error will be returned.
    */
  val path: java.lang.String
  /**
    * The REST API id that owns the resource. If no REST API is found, an error will be returned.
    */
  val restApiId: java.lang.String
}

object GetResourceArgs {
  @scala.inline
  def apply(path: java.lang.String, restApiId: java.lang.String): GetResourceArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("restApiId")(restApiId)
    __obj.asInstanceOf[GetResourceArgs]
  }
}

