package typings.reactDropzone.mod

import typings.react.mod.InputHTMLAttributes
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropzoneInputProps extends InputHTMLAttributes[HTMLInputElement] {
  var refKey: js.UndefOr[String] = js.native
}

object DropzoneInputProps {
  @scala.inline
  def apply(): DropzoneInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropzoneInputProps]
  }
  @scala.inline
  implicit class DropzoneInputPropsOps[Self <: DropzoneInputProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRefKey(value: String): Self = this.set("refKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefKey: Self = this.set("refKey", js.undefined)
  }
  
}

