package typings.semanticUiForm.SemanticUI.Form.MetadataSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.MetadataSettings._Impl, 'validate'> & std.Partial<std.Pick<semantic-ui-form.SemanticUI.Form.MetadataSettings._Impl, keyof semantic-ui-form.SemanticUI.Form.MetadataSettings._Impl>> */
trait Param extends js.Object {
  var validate: js.UndefOr[String] = js.undefined
}

object Param {
  @scala.inline
  def apply(validate: String = null): Param = {
    val __obj = js.Dynamic.literal()
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Param]
  }
}

