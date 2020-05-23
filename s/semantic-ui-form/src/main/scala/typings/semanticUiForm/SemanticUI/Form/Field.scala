package typings.semanticUiForm.SemanticUI.Form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  var identifier: String
  var optional: js.UndefOr[Boolean] = js.undefined
  var rules: js.Array[Rule]
}

object Field {
  @scala.inline
  def apply(identifier: String, rules: js.Array[Rule], optional: js.UndefOr[Boolean] = js.undefined): Field = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
}

