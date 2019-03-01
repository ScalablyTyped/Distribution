package typings
package semanticDashUiDashFormLib.SemanticUINs.FormNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  var identifier: java.lang.String
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  var rules: js.Array[Rule]
}

object Field {
  @scala.inline
  def apply(
    identifier: java.lang.String,
    rules: js.Array[Rule],
    optional: js.UndefOr[scala.Boolean] = js.undefined
  ): Field = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("identifier")(identifier)
    __obj.updateDynamic("rules")(rules)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    __obj.asInstanceOf[Field]
  }
}

