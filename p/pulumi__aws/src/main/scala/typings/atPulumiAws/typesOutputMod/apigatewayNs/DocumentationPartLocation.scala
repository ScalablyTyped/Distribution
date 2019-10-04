package typings.atPulumiAws.typesOutputMod.apigatewayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentationPartLocation extends js.Object {
  /**
    * The HTTP verb of a method. The default value is `*` for any method.
    */
  var method: js.UndefOr[String] = js.undefined
  /**
    * The name of the targeted API entity.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The URL path of the target. The default value is `/` for the root resource.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * The HTTP status code of a response. The default value is `*` for any status code.
    */
  var statusCode: js.UndefOr[String] = js.undefined
  /**
    * The type of API entity to which the documentation content applies. e.g. `API`, `METHOD` or `REQUEST_BODY`
    */
  var `type`: String
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
    __obj.updateDynamic("type")(`type`)
    if (method != null) __obj.updateDynamic("method")(method)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode)
    __obj.asInstanceOf[DocumentationPartLocation]
  }
}

