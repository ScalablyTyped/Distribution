package typings.reactTextMask.mod

import typings.react.mod.InputHTMLAttributes
import typings.reactTextMask.anon.IndexesOfPipedChars
import typings.reactTextMask.reactTextMaskBooleans.`false`
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaskedInputProps extends InputHTMLAttributes[HTMLInputElement] {
  var guide: js.UndefOr[Boolean] = js.native
  var keepCharPositions: js.UndefOr[Boolean] = js.native
  var mask: js.UndefOr[maskArray | (js.Function1[/* value */ String, maskArray])] = js.native
  var pipe: js.UndefOr[
    js.Function2[
      /* conformedValue */ String, 
      /* config */ js.Any, 
      `false` | String | IndexesOfPipedChars
    ]
  ] = js.native
  var placeholderChar: js.UndefOr[String] = js.native
  var render: js.UndefOr[
    js.Function2[/* ref */ js.Function1[/* inputElement */ HTMLElement, Unit], /* props */ js.Any, _]
  ] = js.native
  var showMask: js.UndefOr[Boolean] = js.native
}

object MaskedInputProps {
  @scala.inline
  def apply(): MaskedInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaskedInputProps]
  }
  @scala.inline
  implicit class MaskedInputPropsOps[Self <: MaskedInputProps] (val x: Self) extends AnyVal {
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
    def setGuide(value: Boolean): Self = this.set("guide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuide: Self = this.set("guide", js.undefined)
    @scala.inline
    def setKeepCharPositions(value: Boolean): Self = this.set("keepCharPositions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepCharPositions: Self = this.set("keepCharPositions", js.undefined)
    @scala.inline
    def setMaskVarargs(value: (String | RegExp)*): Self = this.set("mask", js.Array(value :_*))
    @scala.inline
    def setMaskFunction1(value: /* value */ String => maskArray): Self = this.set("mask", js.Any.fromFunction1(value))
    @scala.inline
    def setMask(value: maskArray | (js.Function1[/* value */ String, maskArray])): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    @scala.inline
    def setPipe(
      value: (/* conformedValue */ String, /* config */ js.Any) => `false` | String | IndexesOfPipedChars
    ): Self = this.set("pipe", js.Any.fromFunction2(value))
    @scala.inline
    def deletePipe: Self = this.set("pipe", js.undefined)
    @scala.inline
    def setPlaceholderChar(value: String): Self = this.set("placeholderChar", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholderChar: Self = this.set("placeholderChar", js.undefined)
    @scala.inline
    def setRender(value: (/* ref */ js.Function1[/* inputElement */ HTMLElement, Unit], /* props */ js.Any) => _): Self = this.set("render", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setShowMask(value: Boolean): Self = this.set("showMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMask: Self = this.set("showMask", js.undefined)
  }
  
}

