package typings.rcSlider.createSliderWithTooltipMod

import typings.rcSlider.anon.Overlay
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentWrapperProps extends js.Object {
  
  var getTooltipContainer: js.UndefOr[js.Function0[HTMLElement]] = js.native
  
  var tipFormatter: js.UndefOr[js.Function1[/* value */ Double, ReactNode]] = js.native
  
  var tipProps: js.UndefOr[Overlay] = js.native
}
object ComponentWrapperProps {
  
  @scala.inline
  def apply(): ComponentWrapperProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentWrapperProps]
  }
  
  @scala.inline
  implicit class ComponentWrapperPropsOps[Self <: ComponentWrapperProps] (val x: Self) extends AnyVal {
    
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
    def setGetTooltipContainer(value: () => HTMLElement): Self = this.set("getTooltipContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTooltipContainer: Self = this.set("getTooltipContainer", js.undefined)
    
    @scala.inline
    def setTipFormatter(value: /* value */ Double => ReactNode): Self = this.set("tipFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTipFormatter: Self = this.set("tipFormatter", js.undefined)
    
    @scala.inline
    def setTipProps(value: Overlay): Self = this.set("tipProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTipProps: Self = this.set("tipProps", js.undefined)
  }
}
