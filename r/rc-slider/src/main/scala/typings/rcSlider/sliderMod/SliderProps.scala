package typings.rcSlider.sliderMod

import typings.rcSlider.anon.AriaLabel
import typings.rcSlider.interfaceMod.GenericSliderProps
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderProps extends GenericSliderProps {
  
  var ariaLabelForHandle: js.UndefOr[String] = js.native
  
  var ariaLabelledByForHandle: js.UndefOr[String] = js.native
  
  var ariaValueTextFormatterForHandle: js.UndefOr[String] = js.native
  
  var defaultValue: js.UndefOr[Double] = js.native
  
  var handle: js.UndefOr[js.Function1[/* props */ AriaLabel, ReactElement]] = js.native
  
  @JSName("handleStyle")
  var handleStyle_SliderProps: js.UndefOr[CSSProperties] = js.native
  
  var minimumTrackStyle: js.UndefOr[CSSProperties] = js.native
  
  var onAfterChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  
  var onBeforeChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  
  var startPoint: js.UndefOr[Double] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  @JSName("trackStyle")
  var trackStyle_SliderProps: js.UndefOr[CSSProperties] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object SliderProps {
  
  @scala.inline
  def apply(): SliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderProps]
  }
  
  @scala.inline
  implicit class SliderPropsOps[Self <: SliderProps] (val x: Self) extends AnyVal {
    
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
    def setAriaLabelForHandle(value: String): Self = this.set("ariaLabelForHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabelForHandle: Self = this.set("ariaLabelForHandle", js.undefined)
    
    @scala.inline
    def setAriaLabelledByForHandle(value: String): Self = this.set("ariaLabelledByForHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabelledByForHandle: Self = this.set("ariaLabelledByForHandle", js.undefined)
    
    @scala.inline
    def setAriaValueTextFormatterForHandle(value: String): Self = this.set("ariaValueTextFormatterForHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaValueTextFormatterForHandle: Self = this.set("ariaValueTextFormatterForHandle", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: Double): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setHandle(value: /* props */ AriaLabel => ReactElement): Self = this.set("handle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    
    @scala.inline
    def setHandleStyle(value: CSSProperties): Self = this.set("handleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleStyle: Self = this.set("handleStyle", js.undefined)
    
    @scala.inline
    def setMinimumTrackStyle(value: CSSProperties): Self = this.set("minimumTrackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumTrackStyle: Self = this.set("minimumTrackStyle", js.undefined)
    
    @scala.inline
    def setOnAfterChange(value: /* value */ Double => Unit): Self = this.set("onAfterChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAfterChange: Self = this.set("onAfterChange", js.undefined)
    
    @scala.inline
    def setOnBeforeChange(value: /* value */ Double => Unit): Self = this.set("onBeforeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBeforeChange: Self = this.set("onBeforeChange", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ Double => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setStartPoint(value: Double): Self = this.set("startPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartPoint: Self = this.set("startPoint", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTrackStyle(value: CSSProperties): Self = this.set("trackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackStyle: Self = this.set("trackStyle", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
