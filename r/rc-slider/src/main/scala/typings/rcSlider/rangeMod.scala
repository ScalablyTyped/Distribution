package typings.rcSlider

import org.scalablytyped.runtime.Shortcut
import typings.rcSlider.anon.AriaLabel
import typings.rcSlider.interfaceMod.GenericSliderProps
import typings.rcSlider.interfaceMod.GenericSliderState
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rc-slider/lib/Range", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[RangeProps, RangeState, js.Any] {
    def this(props: RangeProps) = this()
    def this(props: RangeProps, context: js.Any) = this()
  }
  @JSImport("rc-slider/lib/Range", JSImport.Default)
  @js.native
  val default: ComponentClass[RangeProps, RangeState] = js.native
  
  trait RangeProps
    extends StObject
       with GenericSliderProps {
    
    var allowCross: js.UndefOr[Boolean] = js.undefined
    
    var ariaLabelGroupForHandles: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var ariaLabelledByGroupForHandles: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var ariaValueTextFormatterGroupForHandles: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var count: js.UndefOr[Double] = js.undefined
    
    var defaultValue: js.UndefOr[js.Array[Double]] = js.undefined
    
    var handle: js.UndefOr[js.Function1[/* props */ AriaLabel, ReactElement]] = js.undefined
    
    @JSName("handleStyle")
    var handleStyle_RangeProps: js.UndefOr[js.Array[CSSProperties]] = js.undefined
    
    var onAfterChange: js.UndefOr[js.Function1[/* value */ js.Array[Double], Unit]] = js.undefined
    
    var onBeforeChange: js.UndefOr[js.Function1[/* value */ js.Array[Double], Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.Array[Double], Unit]] = js.undefined
    
    var pushable: js.UndefOr[Boolean] = js.undefined
    
    @JSName("step")
    var step_RangeProps: js.UndefOr[Double] = js.undefined
    
    var tabIndex: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
    
    @JSName("trackStyle")
    var trackStyle_RangeProps: js.UndefOr[js.Array[CSSProperties]] = js.undefined
    
    var value: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object RangeProps {
    
    inline def apply(): RangeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeProps]
    }
    
    extension [Self <: RangeProps](x: Self) {
      
      inline def setAllowCross(value: Boolean): Self = StObject.set(x, "allowCross", value.asInstanceOf[js.Any])
      
      inline def setAllowCrossUndefined: Self = StObject.set(x, "allowCross", js.undefined)
      
      inline def setAriaLabelGroupForHandles(value: String | js.Array[String]): Self = StObject.set(x, "ariaLabelGroupForHandles", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelGroupForHandlesUndefined: Self = StObject.set(x, "ariaLabelGroupForHandles", js.undefined)
      
      inline def setAriaLabelGroupForHandlesVarargs(value: String*): Self = StObject.set(x, "ariaLabelGroupForHandles", js.Array(value :_*))
      
      inline def setAriaLabelledByGroupForHandles(value: String | js.Array[String]): Self = StObject.set(x, "ariaLabelledByGroupForHandles", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByGroupForHandlesUndefined: Self = StObject.set(x, "ariaLabelledByGroupForHandles", js.undefined)
      
      inline def setAriaLabelledByGroupForHandlesVarargs(value: String*): Self = StObject.set(x, "ariaLabelledByGroupForHandles", js.Array(value :_*))
      
      inline def setAriaValueTextFormatterGroupForHandles(value: String | js.Array[String]): Self = StObject.set(x, "ariaValueTextFormatterGroupForHandles", value.asInstanceOf[js.Any])
      
      inline def setAriaValueTextFormatterGroupForHandlesUndefined: Self = StObject.set(x, "ariaValueTextFormatterGroupForHandles", js.undefined)
      
      inline def setAriaValueTextFormatterGroupForHandlesVarargs(value: String*): Self = StObject.set(x, "ariaValueTextFormatterGroupForHandles", js.Array(value :_*))
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setDefaultValue(value: js.Array[Double]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: Double*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      inline def setHandle(value: /* props */ AriaLabel => ReactElement): Self = StObject.set(x, "handle", js.Any.fromFunction1(value))
      
      inline def setHandleStyle(value: js.Array[CSSProperties]): Self = StObject.set(x, "handleStyle", value.asInstanceOf[js.Any])
      
      inline def setHandleStyleUndefined: Self = StObject.set(x, "handleStyle", js.undefined)
      
      inline def setHandleStyleVarargs(value: CSSProperties*): Self = StObject.set(x, "handleStyle", js.Array(value :_*))
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setOnAfterChange(value: /* value */ js.Array[Double] => Unit): Self = StObject.set(x, "onAfterChange", js.Any.fromFunction1(value))
      
      inline def setOnAfterChangeUndefined: Self = StObject.set(x, "onAfterChange", js.undefined)
      
      inline def setOnBeforeChange(value: /* value */ js.Array[Double] => Unit): Self = StObject.set(x, "onBeforeChange", js.Any.fromFunction1(value))
      
      inline def setOnBeforeChangeUndefined: Self = StObject.set(x, "onBeforeChange", js.undefined)
      
      inline def setOnChange(value: /* value */ js.Array[Double] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPushable(value: Boolean): Self = StObject.set(x, "pushable", value.asInstanceOf[js.Any])
      
      inline def setPushableUndefined: Self = StObject.set(x, "pushable", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setTabIndex(value: Double | js.Array[Double]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTabIndexVarargs(value: Double*): Self = StObject.set(x, "tabIndex", js.Array(value :_*))
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setTrackStyle(value: js.Array[CSSProperties]): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
      
      inline def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
      
      inline def setTrackStyleVarargs(value: CSSProperties*): Self = StObject.set(x, "trackStyle", js.Array(value :_*))
      
      inline def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  trait RangeState
    extends StObject
       with GenericSliderState {
    
    var bounds: js.Array[Double]
    
    var handle: Double | Null
    
    var recent: Double
  }
  object RangeState {
    
    inline def apply(bounds: js.Array[Double], recent: Double): RangeState = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], recent = recent.asInstanceOf[js.Any], handle = null)
      __obj.asInstanceOf[RangeState]
    }
    
    extension [Self <: RangeState](x: Self) {
      
      inline def setBounds(value: js.Array[Double]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsVarargs(value: Double*): Self = StObject.set(x, "bounds", js.Array(value :_*))
      
      inline def setHandle(value: Double): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleNull: Self = StObject.set(x, "handle", null)
      
      inline def setRecent(value: Double): Self = StObject.set(x, "recent", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentClass[RangeProps, RangeState]
  
  /* This means you don't have to write `default`, but can instead just say `rangeMod.foo` */
  override def _to: ComponentClass[RangeProps, RangeState] = default
}
