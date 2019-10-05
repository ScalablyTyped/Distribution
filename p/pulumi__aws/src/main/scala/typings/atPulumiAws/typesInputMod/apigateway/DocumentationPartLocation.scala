package typings.atPulumiAws.typesInputMod.apigateway

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentationPartLocation extends js.Object {
  /**
    * The HTTP verb of a method. The default value is `*` for any method.
    */
  var method: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the targeted API entity.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The URL path of the target. The default value is `/` for the root resource.
    */
  var path: js.UndefOr[Input[String]] = js.undefined
  /**
    * The HTTP status code of a response. The default value is `*` for any status code.
    */
  var statusCode: js.UndefOr[Input[String]] = js.undefined
  /**
    * The type of API entity to which the documentation content applies. e.g. `API`, `METHOD` or `REQUEST_BODY`
    */
  var `type`: Input[String]
}

object DocumentationPartLocation {
  @scala.inline
  def apply(
    `type`: Input[String],
    method: Input[String] = null,
    name: Input[String] = null,
    path: Input[String] = null,
    statusCode: Input[String] = null
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

