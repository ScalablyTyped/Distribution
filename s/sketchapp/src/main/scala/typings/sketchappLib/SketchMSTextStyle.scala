package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSTextStyle extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.textStyle
  var encodedAttributes: Anon_MSAttributedStringColorAttribute
}

object SketchMSTextStyle {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.textStyle,
    encodedAttributes: Anon_MSAttributedStringColorAttribute
  ): SketchMSTextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_class")(_class)
    __obj.updateDynamic("encodedAttributes")(encodedAttributes)
    __obj.asInstanceOf[SketchMSTextStyle]
  }
}

