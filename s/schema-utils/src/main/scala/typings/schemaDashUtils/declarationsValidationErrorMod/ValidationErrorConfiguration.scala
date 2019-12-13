package typings.schemaDashUtils.declarationsValidationErrorMod

import typings.ajv.ajvMod.ErrorObject
import typings.schemaDashUtils.Anon_Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationErrorConfiguration extends js.Object {
  var baseDataPath: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var postFormatter: js.UndefOr[typings.schemaDashUtils.declarationsValidateMod.PostFormatter] = js.undefined
}

object ValidationErrorConfiguration {
  @scala.inline
  def apply(
    baseDataPath: String = null,
    name: String = null,
    postFormatter: (/* formattedError */ String, /* error */ ErrorObject with Anon_Children) => String = null
  ): ValidationErrorConfiguration = {
    val __obj = js.Dynamic.literal()
    if (baseDataPath != null) __obj.updateDynamic("baseDataPath")(baseDataPath.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (postFormatter != null) __obj.updateDynamic("postFormatter")(js.Any.fromFunction2(postFormatter))
    __obj.asInstanceOf[ValidationErrorConfiguration]
  }
}

