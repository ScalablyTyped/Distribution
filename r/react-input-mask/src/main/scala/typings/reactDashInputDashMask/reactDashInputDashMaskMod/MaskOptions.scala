package typings.reactDashInputDashMask.reactDashInputDashMaskMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskOptions extends js.Object {
  var alwaysShowMask: Boolean
  var formatChars: Record[String, String]
  var mask: String
  var maskChar: String
  var permanents: js.Array[Double]
}

object MaskOptions {
  @scala.inline
  def apply(
    alwaysShowMask: Boolean,
    formatChars: Record[String, String],
    mask: String,
    maskChar: String,
    permanents: js.Array[Double]
  ): MaskOptions = {
    val __obj = js.Dynamic.literal(alwaysShowMask = alwaysShowMask.asInstanceOf[js.Any], formatChars = formatChars.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], maskChar = maskChar.asInstanceOf[js.Any], permanents = permanents.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MaskOptions]
  }
}

