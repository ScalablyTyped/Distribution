package typings
package reactDashWeuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoDectect extends js.Object {
  var autoDectect: scala.Boolean
  var buttons: js.Array[_]
  var show: scala.Boolean
  var title: java.lang.String
  var `type`: java.lang.String
}

object Anon_AutoDectect {
  @scala.inline
  def apply(
    autoDectect: scala.Boolean,
    buttons: js.Array[_],
    show: scala.Boolean,
    title: java.lang.String,
    `type`: java.lang.String
  ): Anon_AutoDectect = {
    val __obj = js.Dynamic.literal(autoDectect = autoDectect, buttons = buttons, show = show, title = title)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AutoDectect]
  }
}

