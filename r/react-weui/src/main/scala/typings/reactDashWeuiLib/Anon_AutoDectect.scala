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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("autoDectect")(autoDectect)
    __obj.updateDynamic("buttons")(buttons)
    __obj.updateDynamic("show")(show)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_AutoDectect]
  }
}

