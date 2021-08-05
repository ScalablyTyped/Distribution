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

object sliderMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rc-slider/lib/Slider", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[SliderProps, SliderState, js.Any] {
    def this(props: SliderProps) = this()
    def this(props: SliderProps, context: js.Any) = this()
  }
  @JSImport("rc-slider/lib/Slider", JSImport.Default)
  @js.native
  val default: ComponentClass[SliderProps, SliderState] = js.native
  
  trait SliderProps
    extends StObject
       with GenericSliderProps {
    
    var ariaLabelForHandle: js.UndefOr[String] = js.undefined
    
    var ariaLabelledByForHandle: js.UndefOr[String] = js.undefined
    
    var ariaValueTextFormatterForHandle: js.UndefOr[String] = js.undefined
    
    var defaultValue: js.UndefOr[Double] = js.undefined
    
    var handle: js.UndefOr[js.Function1[/* props */ AriaLabel, ReactElement]] = js.undefined
    
    @JSName("handleStyle")
    var handleStyle_SliderProps: js.UndefOr[CSSProperties] = js.undefined
    
    var minimumTrackStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var onAfterChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    var onBeforeChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    var startPoint: js.UndefOr[Double] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    @JSName("trackStyle")
    var trackStyle_SliderProps: js.UndefOr[CSSProperties] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object SliderProps {
    
    inline def apply(): SliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderProps]
    }
    
    extension [Self <: SliderProps](x: Self) {
      
      inline def setAriaLabelForHandle(value: String): Self = StObject.set(x, "ariaLabelForHandle", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelForHandleUndefined: Self = StObject.set(x, "ariaLabelForHandle", js.undefined)
      
      inline def setAriaLabelledByForHandle(value: String): Self = StObject.set(x, "ariaLabelledByForHandle", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByForHandleUndefined: Self = StObject.set(x, "ariaLabelledByForHandle", js.undefined)
      
      inline def setAriaValueTextFormatterForHandle(value: String): Self = StObject.set(x, "ariaValueTextFormatterForHandle", value.asInstanceOf[js.Any])
      
      inline def setAriaValueTextFormatterForHandleUndefined: Self = StObject.set(x, "ariaValueTextFormatterForHandle", js.undefined)
      
      inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setHandle(value: /* props */ AriaLabel => ReactElement): Self = StObject.set(x, "handle", js.Any.fromFunction1(value))
      
      inline def setHandleStyle(value: CSSProperties): Self = StObject.set(x, "handleStyle", value.asInstanceOf[js.Any])
      
      inline def setHandleStyleUndefined: Self = StObject.set(x, "handleStyle", js.undefined)
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setMinimumTrackStyle(value: CSSProperties): Self = StObject.set(x, "minimumTrackStyle", value.asInstanceOf[js.Any])
      
      inline def setMinimumTrackStyleUndefined: Self = StObject.set(x, "minimumTrackStyle", js.undefined)
      
      inline def setOnAfterChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onAfterChange", js.Any.fromFunction1(value))
      
      inline def setOnAfterChangeUndefined: Self = StObject.set(x, "onAfterChange", js.undefined)
      
      inline def setOnBeforeChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onBeforeChange", js.Any.fromFunction1(value))
      
      inline def setOnBeforeChangeUndefined: Self = StObject.set(x, "onBeforeChange", js.undefined)
      
      inline def setOnChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setStartPoint(value: Double): Self = StObject.set(x, "startPoint", value.asInstanceOf[js.Any])
      
      inline def setStartPointUndefined: Self = StObject.set(x, "startPoint", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTrackStyle(value: CSSProperties): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
      
      inline def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait SliderState
    extends StObject
       with GenericSliderState {
    
    var dragging: Boolean
    
    @JSName("value")
    var value_SliderState: Double
  }
  object SliderState {
    
    inline def apply(dragging: Boolean, value: Double): SliderState = {
      val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderState]
    }
    
    extension [Self <: SliderState](x: Self) {
      
      inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentClass[SliderProps, SliderState]
  
  /* This means you don't have to write `default`, but can instead just say `sliderMod.foo` */
  override def _to: ComponentClass[SliderProps, SliderState] = default
}
