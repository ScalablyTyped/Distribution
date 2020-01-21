package typings.prosemirrorInputrules

import typings.prosemirrorInputrules.mod.InputRule
import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRules[S /* <: Schema[_, _] */] extends js.Object {
  var rules: js.Array[InputRule[S]]
}

object AnonRules {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](rules: js.Array[InputRule[S]]): AnonRules[S] = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRules[S]]
  }
}

