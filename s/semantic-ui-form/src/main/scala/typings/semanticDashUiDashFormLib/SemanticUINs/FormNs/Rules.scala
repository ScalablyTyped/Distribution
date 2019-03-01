package typings
package semanticDashUiDashFormLib.SemanticUINs.FormNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rules extends js.Object {
  var rules: js.Array[Rule]
}

object Rules {
  @scala.inline
  def apply(rules: js.Array[Rule]): Rules = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rules")(rules)
    __obj.asInstanceOf[Rules]
  }
}

