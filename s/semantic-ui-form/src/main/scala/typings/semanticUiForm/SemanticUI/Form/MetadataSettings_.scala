package typings.semanticUiForm.SemanticUI.Form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined semantic-ui-form.SemanticUI.Form.MetadataSettings.Param */
trait MetadataSettings_ extends js.Object {
  var validate: js.UndefOr[String] = js.undefined
}

object MetadataSettings_ {
  @scala.inline
  def apply(validate: String = null): MetadataSettings_ = {
    val __obj = js.Dynamic.literal()
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataSettings_]
  }
}

