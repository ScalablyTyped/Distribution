package typings.rcSlider.interfaceMod

import typings.rcSlider.anon.Label
import typings.react.mod.CSSProperties
import typings.react.mod.FocusEvent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericSliderProps extends js.Object {
  
  var activeDotStyle: js.UndefOr[CSSProperties] = js.native
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var dotStyle: js.UndefOr[CSSProperties] = js.native
  
  var dots: js.UndefOr[Boolean] = js.native
  
  var handleStyle: js.UndefOr[CSSProperties | js.Array[CSSProperties]] = js.native
  
  var included: js.UndefOr[Boolean] = js.native
  
  var marks: js.UndefOr[Record[Double, ReactNode | Label]] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var maximumTrackStyle: js.UndefOr[CSSProperties] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var onBlur: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement], Unit]] = js.native
  
  var onFocus: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement], Unit]] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var railStyle: js.UndefOr[CSSProperties] = js.native
  
  var reverse: js.UndefOr[Boolean] = js.native
  
  var step: js.UndefOr[Double | Null] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var trackStyle: js.UndefOr[CSSProperties | js.Array[CSSProperties]] = js.native
  
  var vertical: js.UndefOr[Boolean] = js.native
}
object GenericSliderProps {
  
  @scala.inline
  def apply(): GenericSliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericSliderProps]
  }
  
  @scala.inline
  implicit class GenericSliderPropsOps[Self <: GenericSliderProps] (val x: Self) extends AnyVal {
    
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
    def setActiveDotStyle(value: CSSProperties): Self = this.set("activeDotStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveDotStyle: Self = this.set("activeDotStyle", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDotStyle(value: CSSProperties): Self = this.set("dotStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotStyle: Self = this.set("dotStyle", js.undefined)
    
    @scala.inline
    def setDots(value: Boolean): Self = this.set("dots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDots: Self = this.set("dots", js.undefined)
    
    @scala.inline
    def setHandleStyleVarargs(value: CSSProperties*): Self = this.set("handleStyle", js.Array(value :_*))
    
    @scala.inline
    def setHandleStyle(value: CSSProperties | js.Array[CSSProperties]): Self = this.set("handleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleStyle: Self = this.set("handleStyle", js.undefined)
    
    @scala.inline
    def setIncluded(value: Boolean): Self = this.set("included", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncluded: Self = this.set("included", js.undefined)
    
    @scala.inline
    def setMarks(value: Record[Double, ReactNode | Label]): Self = this.set("marks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarks: Self = this.set("marks", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMaximumTrackStyle(value: CSSProperties): Self = this.set("maximumTrackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumTrackStyle: Self = this.set("maximumTrackStyle", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* e */ FocusEvent[HTMLDivElement] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* e */ FocusEvent[HTMLDivElement] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setRailStyle(value: CSSProperties): Self = this.set("railStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRailStyle: Self = this.set("railStyle", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setStepNull: Self = this.set("step", null)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTrackStyleVarargs(value: CSSProperties*): Self = this.set("trackStyle", js.Array(value :_*))
    
    @scala.inline
    def setTrackStyle(value: CSSProperties | js.Array[CSSProperties]): Self = this.set("trackStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackStyle: Self = this.set("trackStyle", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
}
