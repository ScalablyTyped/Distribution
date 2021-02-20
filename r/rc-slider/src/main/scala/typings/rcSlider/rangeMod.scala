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
import scala.scalajs.js.`|`
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
  
  @js.native
  trait RangeProps extends GenericSliderProps {
    
    var allowCross: js.UndefOr[Boolean] = js.native
    
    var ariaLabelGroupForHandles: js.UndefOr[String | js.Array[String]] = js.native
    
    var ariaLabelledByGroupForHandles: js.UndefOr[String | js.Array[String]] = js.native
    
    var ariaValueTextFormatterGroupForHandles: js.UndefOr[String | js.Array[String]] = js.native
    
    var count: js.UndefOr[Double] = js.native
    
    var defaultValue: js.UndefOr[js.Array[Double]] = js.native
    
    var handle: js.UndefOr[js.Function1[/* props */ AriaLabel, ReactElement]] = js.native
    
    @JSName("handleStyle")
    var handleStyle_RangeProps: js.UndefOr[js.Array[CSSProperties]] = js.native
    
    var onAfterChange: js.UndefOr[js.Function1[/* value */ js.Array[Double], Unit]] = js.native
    
    var onBeforeChange: js.UndefOr[js.Function1[/* value */ js.Array[Double], Unit]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.Array[Double], Unit]] = js.native
    
    var pushable: js.UndefOr[Boolean] = js.native
    
    @JSName("step")
    var step_RangeProps: js.UndefOr[Double] = js.native
    
    var tabIndex: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var threshold: js.UndefOr[Double] = js.native
    
    @JSName("trackStyle")
    var trackStyle_RangeProps: js.UndefOr[js.Array[CSSProperties]] = js.native
    
    var value: js.UndefOr[js.Array[Double]] = js.native
  }
  object RangeProps {
    
    @scala.inline
    def apply(): RangeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeProps]
    }
    
    @scala.inline
    implicit class RangePropsMutableBuilder[Self <: RangeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowCross(value: Boolean): Self = StObject.set(x, "allowCross", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowCrossUndefined: Self = StObject.set(x, "allowCross", js.undefined)
      
      @scala.inline
      def setAriaLabelGroupForHandles(value: String | js.Array[String]): Self = StObject.set(x, "ariaLabelGroupForHandles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelGroupForHandlesUndefined: Self = StObject.set(x, "ariaLabelGroupForHandles", js.undefined)
      
      @scala.inline
      def setAriaLabelGroupForHandlesVarargs(value: String*): Self = StObject.set(x, "ariaLabelGroupForHandles", js.Array(value :_*))
      
      @scala.inline
      def setAriaLabelledByGroupForHandles(value: String | js.Array[String]): Self = StObject.set(x, "ariaLabelledByGroupForHandles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelledByGroupForHandlesUndefined: Self = StObject.set(x, "ariaLabelledByGroupForHandles", js.undefined)
      
      @scala.inline
      def setAriaLabelledByGroupForHandlesVarargs(value: String*): Self = StObject.set(x, "ariaLabelledByGroupForHandles", js.Array(value :_*))
      
      @scala.inline
      def setAriaValueTextFormatterGroupForHandles(value: String | js.Array[String]): Self = StObject.set(x, "ariaValueTextFormatterGroupForHandles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaValueTextFormatterGroupForHandlesUndefined: Self = StObject.set(x, "ariaValueTextFormatterGroupForHandles", js.undefined)
      
      @scala.inline
      def setAriaValueTextFormatterGroupForHandlesVarargs(value: String*): Self = StObject.set(x, "ariaValueTextFormatterGroupForHandles", js.Array(value :_*))
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: js.Array[Double]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: Double*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setHandle(value: /* props */ AriaLabel => ReactElement): Self = StObject.set(x, "handle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleStyle(value: js.Array[CSSProperties]): Self = StObject.set(x, "handleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleStyleUndefined: Self = StObject.set(x, "handleStyle", js.undefined)
      
      @scala.inline
      def setHandleStyleVarargs(value: CSSProperties*): Self = StObject.set(x, "handleStyle", js.Array(value :_*))
      
      @scala.inline
      def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      @scala.inline
      def setOnAfterChange(value: /* value */ js.Array[Double] => Unit): Self = StObject.set(x, "onAfterChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAfterChangeUndefined: Self = StObject.set(x, "onAfterChange", js.undefined)
      
      @scala.inline
      def setOnBeforeChange(value: /* value */ js.Array[Double] => Unit): Self = StObject.set(x, "onBeforeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeChangeUndefined: Self = StObject.set(x, "onBeforeChange", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ js.Array[Double] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setPushable(value: Boolean): Self = StObject.set(x, "pushable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushableUndefined: Self = StObject.set(x, "pushable", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double | js.Array[Double]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTabIndexVarargs(value: Double*): Self = StObject.set(x, "tabIndex", js.Array(value :_*))
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      @scala.inline
      def setTrackStyle(value: js.Array[CSSProperties]): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
      
      @scala.inline
      def setTrackStyleVarargs(value: CSSProperties*): Self = StObject.set(x, "trackStyle", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RangeState extends GenericSliderState {
    
    var bounds: js.Array[Double] = js.native
    
    var handle: Double | Null = js.native
    
    var recent: Double = js.native
  }
  object RangeState {
    
    @scala.inline
    def apply(bounds: js.Array[Double], recent: Double): RangeState = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], recent = recent.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeState]
    }
    
    @scala.inline
    implicit class RangeStateMutableBuilder[Self <: RangeState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: js.Array[Double]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsVarargs(value: Double*): Self = StObject.set(x, "bounds", js.Array(value :_*))
      
      @scala.inline
      def setHandle(value: Double): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleNull: Self = StObject.set(x, "handle", null)
      
      @scala.inline
      def setRecent(value: Double): Self = StObject.set(x, "recent", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentClass[RangeProps, RangeState]
  
  /* This means you don't have to write `default`, but can instead just say `rangeMod.foo` */
  override def _to: ComponentClass[RangeProps, RangeState] = default
}
