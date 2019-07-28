package typings.prosemirrorDashInputrules

import typings.prosemirrorDashInputrules.prosemirrorDashInputrulesMod.InputRule
import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rules[S /* <: Schema[_, _] */] extends js.Object {
  var rules: js.Array[InputRule[S]]
}

object Anon_Rules {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](rules: js.Array[InputRule[S]]): Anon_Rules[S] = {
    val __obj = js.Dynamic.literal(rules = rules)
  
    __obj.asInstanceOf[Anon_Rules[S]]
  }
}

