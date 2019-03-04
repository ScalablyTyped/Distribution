package typings
package prosemirrorDashInputrulesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rules[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] extends js.Object {
  var rules: js.Array[prosemirrorDashInputrulesLib.prosemirrorDashInputrulesMod.InputRule[S]]
}

object Anon_Rules {
  @scala.inline
  def apply[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](rules: js.Array[prosemirrorDashInputrulesLib.prosemirrorDashInputrulesMod.InputRule[S]]): Anon_Rules[S] = {
    val __obj = js.Dynamic.literal(rules = rules)
  
    __obj.asInstanceOf[Anon_Rules[S]]
  }
}

