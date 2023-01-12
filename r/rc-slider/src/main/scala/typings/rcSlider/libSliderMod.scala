package typings.rcSlider

import org.scalablytyped.runtime.Shortcut
import typings.rcSlider.libInterfaceMod.AriaValueFormat
import typings.rcSlider.libMarksMod.MarkObj
import typings.react.mod.CSSProperties
import typings.react.mod.FocusEvent
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSliderMod extends Shortcut {
  
  @JSImport("rc-slider/lib/Slider", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[(SliderProps[Double | js.Array[Double]]) & RefAttributes[SliderRef]] = js.native
  
  trait SliderProps[ValueType] extends StObject {
    
    var activeDotStyle: js.UndefOr[CSSProperties | (js.Function1[/* dotValue */ Double, CSSProperties])] = js.undefined
    
    var allowCross: js.UndefOr[Boolean] = js.undefined
    
    var ariaLabelForHandle: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var ariaLabelledByForHandle: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var ariaValueTextFormatterForHandle: js.UndefOr[AriaValueFormat | js.Array[AriaValueFormat]] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var count: js.UndefOr[Double] = js.undefined
    
    var defaultValue: js.UndefOr[ValueType] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var dotStyle: js.UndefOr[CSSProperties | (js.Function1[/* dotValue */ Double, CSSProperties])] = js.undefined
    
    var dots: js.UndefOr[Boolean] = js.undefined
    
    /** range only */
    var draggableTrack: js.UndefOr[Boolean] = js.undefined
    
    var handleRender: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: rc-slider.rc-slider/lib/Handles/Handle.HandleProps['render'] */ js.Any
      ] = js.undefined
    
    var handleStyle: js.UndefOr[CSSProperties | js.Array[CSSProperties]] = js.undefined
    
    var included: js.UndefOr[Boolean] = js.undefined
    
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    var marks: js.UndefOr[Record[String | Double, ReactNode | MarkObj]] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    /** @deprecated It's always better to use `onChange` instead */
    var onAfterChange: js.UndefOr[js.Function1[/* value */ ValueType, Unit]] = js.undefined
    
    /** @deprecated It's always better to use `onChange` instead */
    var onBeforeChange: js.UndefOr[js.Function1[/* value */ ValueType, Unit]] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement, Element], Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ ValueType, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement, Element], Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var pushable: js.UndefOr[Boolean | Double] = js.undefined
    
    var railStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var range: js.UndefOr[Boolean] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var startPoint: js.UndefOr[Double] = js.undefined
    
    var step: js.UndefOr[Double | Null] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tabIndex: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var trackStyle: js.UndefOr[CSSProperties | js.Array[CSSProperties]] = js.undefined
    
    var value: js.UndefOr[ValueType] = js.undefined
    
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object SliderProps {
    
    inline def apply[ValueType](): SliderProps[ValueType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderProps[ValueType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SliderProps[?], ValueType] (val x: Self & SliderProps[ValueType]) extends AnyVal {
      
      inline def setActiveDotStyle(value: CSSProperties | (js.Function1[/* dotValue */ Double, CSSProperties])): Self = StObject.set(x, "activeDotStyle", value.asInstanceOf[js.Any])
      
      inline def setActiveDotStyleFunction1(value: /* dotValue */ Double => CSSProperties): Self = StObject.set(x, "activeDotStyle", js.Any.fromFunction1(value))
      
      inline def setActiveDotStyleUndefined: Self = StObject.set(x, "activeDotStyle", js.undefined)
      
      inline def setAllowCross(value: Boolean): Self = StObject.set(x, "allowCross", value.asInstanceOf[js.Any])
      
      inline def setAllowCrossUndefined: Self = StObject.set(x, "allowCross", js.undefined)
      
      inline def setAriaLabelForHandle(value: String | js.Array[String]): Self = StObject.set(x, "ariaLabelForHandle", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelForHandleUndefined: Self = StObject.set(x, "ariaLabelForHandle", js.undefined)
      
      inline def setAriaLabelForHandleVarargs(value: String*): Self = StObject.set(x, "ariaLabelForHandle", js.Array(value*))
      
      inline def setAriaLabelledByForHandle(value: String | js.Array[String]): Self = StObject.set(x, "ariaLabelledByForHandle", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByForHandleUndefined: Self = StObject.set(x, "ariaLabelledByForHandle", js.undefined)
      
      inline def setAriaLabelledByForHandleVarargs(value: String*): Self = StObject.set(x, "ariaLabelledByForHandle", js.Array(value*))
      
      inline def setAriaValueTextFormatterForHandle(value: AriaValueFormat | js.Array[AriaValueFormat]): Self = StObject.set(x, "ariaValueTextFormatterForHandle", value.asInstanceOf[js.Any])
      
      inline def setAriaValueTextFormatterForHandleFunction1(value: /* value */ Double => String): Self = StObject.set(x, "ariaValueTextFormatterForHandle", js.Any.fromFunction1(value))
      
      inline def setAriaValueTextFormatterForHandleUndefined: Self = StObject.set(x, "ariaValueTextFormatterForHandle", js.undefined)
      
      inline def setAriaValueTextFormatterForHandleVarargs(value: AriaValueFormat*): Self = StObject.set(x, "ariaValueTextFormatterForHandle", js.Array(value*))
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setDefaultValue(value: ValueType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDotStyle(value: CSSProperties | (js.Function1[/* dotValue */ Double, CSSProperties])): Self = StObject.set(x, "dotStyle", value.asInstanceOf[js.Any])
      
      inline def setDotStyleFunction1(value: /* dotValue */ Double => CSSProperties): Self = StObject.set(x, "dotStyle", js.Any.fromFunction1(value))
      
      inline def setDotStyleUndefined: Self = StObject.set(x, "dotStyle", js.undefined)
      
      inline def setDots(value: Boolean): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
      
      inline def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
      
      inline def setDraggableTrack(value: Boolean): Self = StObject.set(x, "draggableTrack", value.asInstanceOf[js.Any])
      
      inline def setDraggableTrackUndefined: Self = StObject.set(x, "draggableTrack", js.undefined)
      
      inline def setHandleRender(
        value: /* import warning: importer.ImportType#apply Failed type conversion: rc-slider.rc-slider/lib/Handles/Handle.HandleProps['render'] */ js.Any
      ): Self = StObject.set(x, "handleRender", value.asInstanceOf[js.Any])
      
      inline def setHandleRenderUndefined: Self = StObject.set(x, "handleRender", js.undefined)
      
      inline def setHandleStyle(value: CSSProperties | js.Array[CSSProperties]): Self = StObject.set(x, "handleStyle", value.asInstanceOf[js.Any])
      
      inline def setHandleStyleUndefined: Self = StObject.set(x, "handleStyle", js.undefined)
      
      inline def setHandleStyleVarargs(value: CSSProperties*): Self = StObject.set(x, "handleStyle", js.Array(value*))
      
      inline def setIncluded(value: Boolean): Self = StObject.set(x, "included", value.asInstanceOf[js.Any])
      
      inline def setIncludedUndefined: Self = StObject.set(x, "included", js.undefined)
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setMarks(value: Record[String | Double, ReactNode | MarkObj]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      inline def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOnAfterChange(value: /* value */ ValueType => Unit): Self = StObject.set(x, "onAfterChange", js.Any.fromFunction1(value))
      
      inline def setOnAfterChangeUndefined: Self = StObject.set(x, "onAfterChange", js.undefined)
      
      inline def setOnBeforeChange(value: /* value */ ValueType => Unit): Self = StObject.set(x, "onBeforeChange", js.Any.fromFunction1(value))
      
      inline def setOnBeforeChangeUndefined: Self = StObject.set(x, "onBeforeChange", js.undefined)
      
      inline def setOnBlur(value: /* e */ FocusEvent[HTMLDivElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* value */ ValueType => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: /* e */ FocusEvent[HTMLDivElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setPushable(value: Boolean | Double): Self = StObject.set(x, "pushable", value.asInstanceOf[js.Any])
      
      inline def setPushableUndefined: Self = StObject.set(x, "pushable", js.undefined)
      
      inline def setRailStyle(value: CSSProperties): Self = StObject.set(x, "railStyle", value.asInstanceOf[js.Any])
      
      inline def setRailStyleUndefined: Self = StObject.set(x, "railStyle", js.undefined)
      
      inline def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setStartPoint(value: Double): Self = StObject.set(x, "startPoint", value.asInstanceOf[js.Any])
      
      inline def setStartPointUndefined: Self = StObject.set(x, "startPoint", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepNull: Self = StObject.set(x, "step", null)
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: Double | js.Array[Double]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTabIndexVarargs(value: Double*): Self = StObject.set(x, "tabIndex", js.Array(value*))
      
      inline def setTrackStyle(value: CSSProperties | js.Array[CSSProperties]): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
      
      inline def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
      
      inline def setTrackStyleVarargs(value: CSSProperties*): Self = StObject.set(x, "trackStyle", js.Array(value*))
      
      inline def setValue(value: ValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  trait SliderRef extends StObject {
    
    def blur(): Unit
    
    def focus(): Unit
  }
  object SliderRef {
    
    inline def apply(blur: () => Unit, focus: () => Unit): SliderRef = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[SliderRef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SliderRef] (val x: Self) extends AnyVal {
      
      inline def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  type _To = ForwardRefExoticComponent[(SliderProps[Double | js.Array[Double]]) & RefAttributes[SliderRef]]
  
  /* This means you don't have to write `default`, but can instead just say `libSliderMod.foo` */
  override def _to: ForwardRefExoticComponent[(SliderProps[Double | js.Array[Double]]) & RefAttributes[SliderRef]] = default
}
