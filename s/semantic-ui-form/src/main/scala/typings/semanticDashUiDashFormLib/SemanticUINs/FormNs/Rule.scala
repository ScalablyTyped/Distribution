package typings
package semanticDashUiDashFormLib.SemanticUINs.FormNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  var prompt: java.lang.String
  var `type`: java.lang.String
}

object Rule {
  @scala.inline
  def apply(prompt: java.lang.String, `type`: java.lang.String): Rule = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("prompt")(prompt)
    __obj.asInstanceOf[Rule]
  }
}

