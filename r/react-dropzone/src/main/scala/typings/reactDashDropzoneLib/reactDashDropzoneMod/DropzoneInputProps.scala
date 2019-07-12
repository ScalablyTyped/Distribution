package typings
package reactDashDropzoneLib.reactDashDropzoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropzoneInputProps
  extends reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement] {
  var refKey: js.UndefOr[java.lang.String] = js.undefined
}

object DropzoneInputProps {
  @scala.inline
  def apply(
    InputHTMLAttributes: reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement] = null,
    refKey: java.lang.String = null
  ): DropzoneInputProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, InputHTMLAttributes)
    if (refKey != null) __obj.updateDynamic("refKey")(refKey)
    __obj.asInstanceOf[DropzoneInputProps]
  }
}

