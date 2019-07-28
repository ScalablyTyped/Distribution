package typings.reactDashWeui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoDectect extends js.Object {
  var autoDectect: Boolean
  var buttons: js.Array[_]
  var show: Boolean
  var title: String
  var `type`: String
}

object Anon_AutoDectect {
  @scala.inline
  def apply(autoDectect: Boolean, buttons: js.Array[_], show: Boolean, title: String, `type`: String): Anon_AutoDectect = {
    val __obj = js.Dynamic.literal(autoDectect = autoDectect, buttons = buttons, show = show, title = title)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AutoDectect]
  }
}

