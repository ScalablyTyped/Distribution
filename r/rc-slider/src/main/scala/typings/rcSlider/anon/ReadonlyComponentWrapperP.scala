package typings.rcSlider.anon

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<rc-slider.rc-slider/es/createSliderWithTooltip.ComponentWrapperProps> */
@js.native
trait ReadonlyComponentWrapperP extends js.Object {
  val getTooltipContainer: js.UndefOr[js.Function0[HTMLElement]] = js.native
  val handleStyle: js.UndefOr[CSSProperties] = js.native
  val tipFormatter: js.Function1[/* value */ Double, ReactNode] = js.native
  val tipProps: Overlay = js.native
}

object ReadonlyComponentWrapperP {
  @scala.inline
  def apply(tipFormatter: /* value */ Double => ReactNode, tipProps: Overlay): ReadonlyComponentWrapperP = {
    val __obj = js.Dynamic.literal(tipFormatter = js.Any.fromFunction1(tipFormatter), tipProps = tipProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyComponentWrapperP]
  }
  @scala.inline
  implicit class ReadonlyComponentWrapperPOps[Self <: ReadonlyComponentWrapperP] (val x: Self) extends AnyVal {
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
    def setTipFormatter(value: /* value */ Double => ReactNode): Self = this.set("tipFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def setTipProps(value: Overlay): Self = this.set("tipProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetTooltipContainer(value: () => HTMLElement): Self = this.set("getTooltipContainer", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTooltipContainer: Self = this.set("getTooltipContainer", js.undefined)
    @scala.inline
    def setHandleStyle(value: CSSProperties): Self = this.set("handleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleStyle: Self = this.set("handleStyle", js.undefined)
  }
  
}

