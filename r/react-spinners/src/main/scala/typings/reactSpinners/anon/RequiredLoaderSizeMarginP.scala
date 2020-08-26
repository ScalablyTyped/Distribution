package typings.reactSpinners.anon

import typings.reactSpinners.interfacesMod.LengthType
import typings.reactSpinners.interfacesMod.PrecompiledCss
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<react-spinners.react-spinners/interfaces.LoaderSizeMarginProps> */
@js.native
trait RequiredLoaderSizeMarginP extends js.Object {
  var color: String = js.native
  var css: String | PrecompiledCss = js.native
  var loading: Boolean = js.native
  var margin: LengthType = js.native
  var size: LengthType = js.native
}

object RequiredLoaderSizeMarginP {
  @scala.inline
  def apply(
    color: String,
    css: String | PrecompiledCss,
    loading: Boolean,
    margin: LengthType,
    size: LengthType
  ): RequiredLoaderSizeMarginP = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredLoaderSizeMarginP]
  }
  @scala.inline
  implicit class RequiredLoaderSizeMarginPOps[Self <: RequiredLoaderSizeMarginP] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setCss(value: String | PrecompiledCss): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def setMargin(value: LengthType): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: LengthType): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

