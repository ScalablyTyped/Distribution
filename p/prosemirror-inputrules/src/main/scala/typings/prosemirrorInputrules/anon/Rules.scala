package typings.prosemirrorInputrules.anon

import typings.prosemirrorInputrules.mod.InputRule
import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rules[S /* <: Schema[_, _] */] extends js.Object {
  var rules: js.Array[InputRule[S]]
}

object Rules {
  @scala.inline
  def apply[/* <: typings.prosemirrorModel.mod.Schema[_, _] */ S](rules: js.Array[InputRule[S]]): Rules[S] = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rules[S]]
  }
}

