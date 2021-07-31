package typings.rcSlider

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.rcSlider.anon.Label
import typings.rcSlider.anon.Value
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.TouchEvent
import typings.react.mod.ValidationMap
import typings.react.mod.WeakValidationMap
import typings.std.HTMLDivElement
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  /* Inlined parent std.Pick<react.react.ComponentClass<Props, State>, 'displayName' | 'defaultProps' | 'propTypes' | 'contextType' | 'contextTypes' | 'childContextTypes'> */
  @js.native
  trait GenericSlider[Props, State]
    extends StObject
       with Instantiable1[/* props */ Props, GenericSliderClass[Props, State]]
       with Instantiable2[/* props */ Props, /* context */ js.Any, GenericSliderClass[Props, State]] {
    
    var childContextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    
    var contextType: js.UndefOr[Context[js.Any]] = js.native
    
    var contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    
    var defaultProps: js.UndefOr[Partial[Props]] = js.native
    
    var displayName: js.UndefOr[String] = js.native
    
    var propTypes: js.UndefOr[WeakValidationMap[Props]] = js.native
  }
  
  @js.native
  trait GenericSliderClass[Props, State]
    extends Component[Props, State, js.Any] {
    
    def getLowerBound(): Double = js.native
    
    def getUpperBound(): Double = js.native
    
    def onChange(state: Value): Unit = js.native
    
    def onEnd(): Unit = js.native
    def onEnd(force: Boolean): Unit = js.native
    
    def onKeyboard(e: KeyboardEvent[HTMLDivElement]): Unit = js.native
    
    def onMove(e: MouseEvent[HTMLDivElement, NativeMouseEvent], position: Double): Unit = js.native
    def onMove(e: TouchEvent[HTMLDivElement], position: Double): Unit = js.native
    
    def onStart(position: Double): Unit = js.native
    
    def trimAlignValue(v: Double): Double = js.native
    def trimAlignValue(v: Double, nextProps: Partial[Props]): Double = js.native
  }
  
  trait GenericSliderProps extends StObject {
    
    var activeDotStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var dotStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var dots: js.UndefOr[Boolean] = js.undefined
    
    var handleStyle: js.UndefOr[CSSProperties | js.Array[CSSProperties]] = js.undefined
    
    var included: js.UndefOr[Boolean] = js.undefined
    
    var marks: js.UndefOr[Record[Double, ReactNode | Label]] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var maximumTrackStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement], Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement], Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var railStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var step: js.UndefOr[Double | Null] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var trackStyle: js.UndefOr[CSSProperties | js.Array[CSSProperties]] = js.undefined
    
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object GenericSliderProps {
    
    @scala.inline
    def apply(): GenericSliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenericSliderProps]
    }
    
    @scala.inline
    implicit class GenericSliderPropsMutableBuilder[Self <: GenericSliderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveDotStyle(value: CSSProperties): Self = StObject.set(x, "activeDotStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveDotStyleUndefined: Self = StObject.set(x, "activeDotStyle", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDotStyle(value: CSSProperties): Self = StObject.set(x, "dotStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotStyleUndefined: Self = StObject.set(x, "dotStyle", js.undefined)
      
      @scala.inline
      def setDots(value: Boolean): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
      
      @scala.inline
      def setHandleStyle(value: CSSProperties | js.Array[CSSProperties]): Self = StObject.set(x, "handleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleStyleUndefined: Self = StObject.set(x, "handleStyle", js.undefined)
      
      @scala.inline
      def setHandleStyleVarargs(value: CSSProperties*): Self = StObject.set(x, "handleStyle", js.Array(value :_*))
      
      @scala.inline
      def setIncluded(value: Boolean): Self = StObject.set(x, "included", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludedUndefined: Self = StObject.set(x, "included", js.undefined)
      
      @scala.inline
      def setMarks(value: Record[Double, ReactNode | Label]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMaximumTrackStyle(value: CSSProperties): Self = StObject.set(x, "maximumTrackStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumTrackStyleUndefined: Self = StObject.set(x, "maximumTrackStyle", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* e */ FocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* e */ FocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRailStyle(value: CSSProperties): Self = StObject.set(x, "railStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRailStyleUndefined: Self = StObject.set(x, "railStyle", js.undefined)
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepNull: Self = StObject.set(x, "step", null)
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTrackStyle(value: CSSProperties | js.Array[CSSProperties]): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
      
      @scala.inline
      def setTrackStyleVarargs(value: CSSProperties*): Self = StObject.set(x, "trackStyle", js.Array(value :_*))
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  trait GenericSliderState extends StObject {
    
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object GenericSliderState {
    
    @scala.inline
    def apply(): GenericSliderState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenericSliderState]
    }
    
    @scala.inline
    implicit class GenericSliderStateMutableBuilder[Self <: GenericSliderState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
