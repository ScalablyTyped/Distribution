package typings
package reactDashInputDashMaskLib.reactDashInputDashMaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskOptions extends js.Object {
  var alwaysShowMask: scala.Boolean
  var formatChars: stdLib.Record[java.lang.String, java.lang.String]
  var mask: java.lang.String
  var maskChar: java.lang.String
  var permanents: js.Array[scala.Double]
}

object MaskOptions {
  @scala.inline
  def apply(
    alwaysShowMask: scala.Boolean,
    formatChars: stdLib.Record[java.lang.String, java.lang.String],
    mask: java.lang.String,
    maskChar: java.lang.String,
    permanents: js.Array[scala.Double]
  ): MaskOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alwaysShowMask")(alwaysShowMask)
    __obj.updateDynamic("formatChars")(formatChars)
    __obj.updateDynamic("mask")(mask)
    __obj.updateDynamic("maskChar")(maskChar)
    __obj.updateDynamic("permanents")(permanents)
    __obj.asInstanceOf[MaskOptions]
  }
}

