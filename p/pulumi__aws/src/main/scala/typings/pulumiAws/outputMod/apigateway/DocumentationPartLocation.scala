package typings.pulumiAws.outputMod.apigateway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentationPartLocation extends js.Object {
  /**
    * The HTTP verb of a method. The default value is `*` for any method.
    */
  var method: js.UndefOr[String] = js.native
  /**
    * The name of the targeted API entity.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The URL path of the target. The default value is `/` for the root resource.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The HTTP status code of a response. The default value is `*` for any status code.
    */
  var statusCode: js.UndefOr[String] = js.native
  /**
    * The type of API entity to which the documentation content applies. e.g. `API`, `METHOD` or `REQUEST_BODY`
    */
  var `type`: String = js.native
}

object DocumentationPartLocation {
  @scala.inline
  def apply(
    `type`: String,
    method: String = null,
    name: String = null,
    path: String = null,
    statusCode: String = null
  ): DocumentationPartLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentationPartLocation]
  }
}

