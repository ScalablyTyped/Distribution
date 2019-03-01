package typings
package reactDashWeuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionsGroups extends js.Object {
  var actions: js.Array[_]
  var groups: js.Array[_]
  var lang: Anon_LeftBtn
  var show: scala.Boolean
}

object Anon_ActionsGroups {
  @scala.inline
  def apply(actions: js.Array[_], groups: js.Array[_], lang: Anon_LeftBtn, show: scala.Boolean): Anon_ActionsGroups = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actions")(actions)
    __obj.updateDynamic("groups")(groups)
    __obj.updateDynamic("lang")(lang)
    __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_ActionsGroups]
  }
}

