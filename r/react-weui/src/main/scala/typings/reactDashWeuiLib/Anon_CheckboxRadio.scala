package typings
package reactDashWeuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckboxRadio extends js.Object {
  var checkbox: scala.Boolean
  var radio: scala.Boolean
  var select: scala.Boolean
  var selectPos: js.Any
  var switch: scala.Boolean
  var vcode: scala.Boolean
  var warn: scala.Boolean
}

object Anon_CheckboxRadio {
  @scala.inline
  def apply(
    checkbox: scala.Boolean,
    radio: scala.Boolean,
    select: scala.Boolean,
    selectPos: js.Any,
    switch: scala.Boolean,
    vcode: scala.Boolean,
    warn: scala.Boolean
  ): Anon_CheckboxRadio = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checkbox")(checkbox)
    __obj.updateDynamic("radio")(radio)
    __obj.updateDynamic("select")(select)
    __obj.updateDynamic("selectPos")(selectPos)
    __obj.updateDynamic("switch")(switch)
    __obj.updateDynamic("vcode")(vcode)
    __obj.updateDynamic("warn")(warn)
    __obj.asInstanceOf[Anon_CheckboxRadio]
  }
}

