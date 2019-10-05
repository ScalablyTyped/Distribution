package typings.semanticDashUiDashForm.SemanticUI.Form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  var prompt: String
  var `type`: String
}

object Rule {
  @scala.inline
  def apply(prompt: String, `type`: String): Rule = {
    val __obj = js.Dynamic.literal(prompt = prompt)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Rule]
  }
}

