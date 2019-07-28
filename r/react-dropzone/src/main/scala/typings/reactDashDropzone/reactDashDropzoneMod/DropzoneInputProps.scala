package typings.reactDashDropzone.reactDashDropzoneMod

import typings.react.reactMod.InputHTMLAttributes
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropzoneInputProps extends InputHTMLAttributes[HTMLInputElement] {
  var refKey: js.UndefOr[String] = js.undefined
}

object DropzoneInputProps {
  @scala.inline
  def apply(InputHTMLAttributes: InputHTMLAttributes[HTMLInputElement] = null, refKey: String = null): DropzoneInputProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, InputHTMLAttributes)
    if (refKey != null) __obj.updateDynamic("refKey")(refKey)
    __obj.asInstanceOf[DropzoneInputProps]
  }
}

