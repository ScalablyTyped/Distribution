package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderSliderMod {
  
  @JSImport("react-toolbox/components/slider/Slider", JSImport.Default)
  @js.native
  open class default protected () extends Slider {
    def this(props: SliderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SliderProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/slider/Slider", "Slider")
  @js.native
  open class Slider protected ()
    extends Component[SliderProps, js.Object, Any] {
    def this(props: SliderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SliderProps, context: Any) = this()
  }
  
  trait SliderProps
    extends StObject
       with Props {
    
    /**
      * Used to style the ProgressBar element
      */
    var buffer: js.UndefOr[Double] = js.undefined
    
    /**
      * If true, component will be disabled.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, an input is shown and the user can set the slider from keyboard value.
      * @default false
      */
    var editable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum value permitted.
      * @default 100
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum value permitted.
      * @default 0
      */
    var min: js.UndefOr[Double] = js.undefined
    
    /**
      * Callback function that will be invoked when the slider value changes.
      */
    var onChange: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback function that will be invoked when the slider stops being dragged.
      */
    var onDragStop: js.UndefOr[js.Function] = js.undefined
    
    /**
      * If true, a pin with numeric value label is shown when the slider thumb is pressed. Use for settings for which users need to know the exact value of the setting.
      * @default false
      */
    var pinned: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the slider thumb snaps to tick marks evenly spaced based on the step property value.
      * @default false
      */
    var snaps: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Amount to vary the value when the knob is moved or increase/decrease is called.
      * @default 0.01
      */
    var step: js.UndefOr[Double] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[SliderTheme] = js.undefined
    
    /**
      * Current value of the slider.
      * @default 0
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object SliderProps {
    
    inline def apply(): SliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderProps]
    }
    
    extension [Self <: SliderProps](x: Self) {
      
      inline def setBuffer(value: Double): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOnChange(value: js.Function): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnDragStop(value: js.Function): Self = StObject.set(x, "onDragStop", value.asInstanceOf[js.Any])
      
      inline def setOnDragStopUndefined: Self = StObject.set(x, "onDragStop", js.undefined)
      
      inline def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
      
      inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
      
      inline def setSnaps(value: Boolean): Self = StObject.set(x, "snaps", value.asInstanceOf[js.Any])
      
      inline def setSnapsUndefined: Self = StObject.set(x, "snaps", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setTheme(value: SliderTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait SliderTheme extends StObject {
    
    /**
      * Used as an inner container of the root component.
      */
    var container: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root of in case the Slider is editable.
      */
    var editable: js.UndefOr[String] = js.undefined
    
    /**
      * Used to style the inner element of the knob.
      */
    var innerknob: js.UndefOr[String] = js.undefined
    
    /**
      * Provided to the ProgressBar component.
      */
    var innerprogress: js.UndefOr[String] = js.undefined
    
    /**
      * Provided to the Input element in case it's editable.
      */
    var input: js.UndefOr[String] = js.undefined
    
    /**
      * Used to style the outer layer of the knob.
      */
    var knob: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root in case the Slider is pinned.
      */
    var pinned: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root in case the state is pressed.
      */
    var pressed: js.UndefOr[String] = js.undefined
    
    /**
      * Used as an outer wrapper for the ProgressBar.
      */
    var progress: js.UndefOr[String] = js.undefined
    
    /**
      * Used in the root when the knob should be a ring.
      */
    var ring: js.UndefOr[String] = js.undefined
    
    /**
      * Class used for the root element.
      */
    var slider: js.UndefOr[String] = js.undefined
    
    /**
      * Used for every individual snap element.
      */
    var snap: js.UndefOr[String] = js.undefined
    
    /**
      * Used as a wrapper for the group of snaps when it's snapped.
      */
    var snaps: js.UndefOr[String] = js.undefined
  }
  object SliderTheme {
    
    inline def apply(): SliderTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderTheme]
    }
    
    extension [Self <: SliderTheme](x: Self) {
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setEditable(value: String): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setInnerknob(value: String): Self = StObject.set(x, "innerknob", value.asInstanceOf[js.Any])
      
      inline def setInnerknobUndefined: Self = StObject.set(x, "innerknob", js.undefined)
      
      inline def setInnerprogress(value: String): Self = StObject.set(x, "innerprogress", value.asInstanceOf[js.Any])
      
      inline def setInnerprogressUndefined: Self = StObject.set(x, "innerprogress", js.undefined)
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setKnob(value: String): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
      
      inline def setKnobUndefined: Self = StObject.set(x, "knob", js.undefined)
      
      inline def setPinned(value: String): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
      
      inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
      
      inline def setPressed(value: String): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
      
      inline def setPressedUndefined: Self = StObject.set(x, "pressed", js.undefined)
      
      inline def setProgress(value: String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setRing(value: String): Self = StObject.set(x, "ring", value.asInstanceOf[js.Any])
      
      inline def setRingUndefined: Self = StObject.set(x, "ring", js.undefined)
      
      inline def setSlider(value: String): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      inline def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
      
      inline def setSnap(value: String): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
      
      inline def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
      
      inline def setSnaps(value: String): Self = StObject.set(x, "snaps", value.asInstanceOf[js.Any])
      
      inline def setSnapsUndefined: Self = StObject.set(x, "snaps", js.undefined)
    }
  }
}
