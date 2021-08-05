package typings.reactSlider

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.global.JSX.Element
import typings.reactSlider.anon.Index
import typings.reactSlider.anon.Value
import typings.reactSlider.reactSliderStrings.horizontal
import typings.reactSlider.reactSliderStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-slider", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends Component[ReactSliderProps, ComponentState, js.Any] {
    def this(props: ReactSliderProps) = this()
    def this(props: ReactSliderProps, context: js.Any) = this()
  }
  @JSImport("react-slider", JSImport.Namespace)
  @js.native
  val ^ : js.Object & (ComponentClass[ReactSliderProps, ComponentState]) = js.native
  
  trait ReactSliderProps extends StObject {
    
    /**
      * aria-label for screen-readers to apply to the thumbs.
      * Use an array for more than one thumb.
      * The length of the array must match the number of thumbs in the value array.
      */
    var ariaLabel: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * aria-valuetext for screen-readers.
      * Can be a static string, or a function that returns a string.
      */
    var ariaValuetext: js.UndefOr[String | (js.Function1[/* value */ Index, String])] = js.undefined
    
    /**
      * The css class set on the slider node.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Determines the initial positions of the thumbs and the number of thumbs.
      *
      * If a number is passed a slider with one thumb will be rendered.
      * If an array is passed each value will determine the position of one thumb.
      * The values in the array must be sorted.
      */
    var defaultValue: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    /**
      * If `true` the thumbs can't be moved.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Inverts the slider.
      */
    var invert: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The maximum value of the slider.
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum value of the slider.
      */
    var min: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimal distance between any pair of thumbs.
      * Must be positive, but zero means they can sit on top of each other.
      */
    var minDistance: js.UndefOr[Double] = js.undefined
    
    /**
      * Callback called only after moving a thumb has ended.
      */
    var onAfterChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | js.Array[Double] | Null], Unit]] = js.undefined
    
    /**
      * Callback called before starting to move a thumb.
      */
    var onBeforeChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | js.Array[Double] | Null], Unit]] = js.undefined
    
    /**
      * Callback called on every value change.
      */
    var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | js.Array[Double] | Null], Unit]] = js.undefined
    
    /**
      * Callback called when the the slider is clicked (thumb or tracks).
      * Receives the value at the clicked position as argument.
      */
    var onSliderClick: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    /**
      * Determines whether the slider moves horizontally (from left to right)
      * or vertically (from top to bottom).
      */
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    /**
      * The result of the function is the value to be added or subtracted
      * when the `Page Up` or `Page Down` keys are pressed.
      *
      * The current `step` value will be passed as the only argument.
      * By default, paging will modify `step` by a factor of 10.
      */
    var pageFn: js.UndefOr[js.Function1[/* step */ Double, Double]] = js.undefined
    
    /**
      * If `true` the active thumb will push other thumbs
      * within the constraints of `min`, `max`, `step` and `minDistance`.
      */
    var pearling: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Provide a custom render function for dynamic thumb content.
      * The render function will be passed two arguments.The first is
      * an object that should be added to your thumb node,
      */
    var renderThumb: js.UndefOr[js.Function2[/* props */ js.Object, /* state */ Index, Element]] = js.undefined
    
    /**
      * Provide a custom render function for the track node.
      * The render function will be passed two arguments. The first is
      * an object that should be added to your handle node.
      */
    var renderTrack: js.UndefOr[js.Function2[/* props */ js.Object, /* state */ Value, Element]] = js.undefined
    
    /**
      * Disables thumb move when clicking the slider track
      */
    var snapDragDisabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Value to be added or subtracted on each step the slider makes.
      * Must be greater than zero.
      * `max - min` should be evenly divisible by the step value.
      */
    var step: js.UndefOr[Double] = js.undefined
    
    /**
      * The css class set on the thumb that is currently being moved.
      */
    var thumbActiveClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The css class set on each thumb node.
      *
      * In addition each thumb will receive a numbered css class of the form
      * `${thumbClassName}-${i}`, e.g. `thumb-0`, `thumb-1`, ...
      */
    var thumbClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The css class set on the tracks between the thumbs.
      * In addition track fragment will receive a numbered css class of the form
      * `${trackClassName}-${i}`, e.g. `track-0`, `track-1`, ...
      */
    var trackClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Like `defaultValue` but for
      * [controlled components](http://facebook.github.io/react/docs/forms.html#controlled-components).
      */
    var value: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    /**
      * If `true` tracks between the thumbs will be rendered.
      */
    var withTracks: js.UndefOr[Boolean] = js.undefined
  }
  object ReactSliderProps {
    
    inline def apply(): ReactSliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactSliderProps]
    }
    
    extension [Self <: ReactSliderProps](x: Self) {
      
      inline def setAriaLabel(value: String | js.Array[String]): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaLabelVarargs(value: String*): Self = StObject.set(x, "ariaLabel", js.Array(value :_*))
      
      inline def setAriaValuetext(value: String | (js.Function1[/* value */ Index, String])): Self = StObject.set(x, "ariaValuetext", value.asInstanceOf[js.Any])
      
      inline def setAriaValuetextFunction1(value: /* value */ Index => String): Self = StObject.set(x, "ariaValuetext", js.Any.fromFunction1(value))
      
      inline def setAriaValuetextUndefined: Self = StObject.set(x, "ariaValuetext", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultValue(value: Double | js.Array[Double]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: Double*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
      
      inline def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinDistance(value: Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
      
      inline def setMinDistanceUndefined: Self = StObject.set(x, "minDistance", js.undefined)
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOnAfterChange(value: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Unit): Self = StObject.set(x, "onAfterChange", js.Any.fromFunction1(value))
      
      inline def setOnAfterChangeUndefined: Self = StObject.set(x, "onAfterChange", js.undefined)
      
      inline def setOnBeforeChange(value: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Unit): Self = StObject.set(x, "onBeforeChange", js.Any.fromFunction1(value))
      
      inline def setOnBeforeChangeUndefined: Self = StObject.set(x, "onBeforeChange", js.undefined)
      
      inline def setOnChange(value: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnSliderClick(value: /* value */ Double => Unit): Self = StObject.set(x, "onSliderClick", js.Any.fromFunction1(value))
      
      inline def setOnSliderClickUndefined: Self = StObject.set(x, "onSliderClick", js.undefined)
      
      inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPageFn(value: /* step */ Double => Double): Self = StObject.set(x, "pageFn", js.Any.fromFunction1(value))
      
      inline def setPageFnUndefined: Self = StObject.set(x, "pageFn", js.undefined)
      
      inline def setPearling(value: Boolean): Self = StObject.set(x, "pearling", value.asInstanceOf[js.Any])
      
      inline def setPearlingUndefined: Self = StObject.set(x, "pearling", js.undefined)
      
      inline def setRenderThumb(value: (/* props */ js.Object, /* state */ Index) => Element): Self = StObject.set(x, "renderThumb", js.Any.fromFunction2(value))
      
      inline def setRenderThumbUndefined: Self = StObject.set(x, "renderThumb", js.undefined)
      
      inline def setRenderTrack(value: (/* props */ js.Object, /* state */ Value) => Element): Self = StObject.set(x, "renderTrack", js.Any.fromFunction2(value))
      
      inline def setRenderTrackUndefined: Self = StObject.set(x, "renderTrack", js.undefined)
      
      inline def setSnapDragDisabled(value: Boolean): Self = StObject.set(x, "snapDragDisabled", value.asInstanceOf[js.Any])
      
      inline def setSnapDragDisabledUndefined: Self = StObject.set(x, "snapDragDisabled", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setThumbActiveClassName(value: String): Self = StObject.set(x, "thumbActiveClassName", value.asInstanceOf[js.Any])
      
      inline def setThumbActiveClassNameUndefined: Self = StObject.set(x, "thumbActiveClassName", js.undefined)
      
      inline def setThumbClassName(value: String): Self = StObject.set(x, "thumbClassName", value.asInstanceOf[js.Any])
      
      inline def setThumbClassNameUndefined: Self = StObject.set(x, "thumbClassName", js.undefined)
      
      inline def setTrackClassName(value: String): Self = StObject.set(x, "trackClassName", value.asInstanceOf[js.Any])
      
      inline def setTrackClassNameUndefined: Self = StObject.set(x, "trackClassName", js.undefined)
      
      inline def setValue(value: Double | js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      inline def setWithTracks(value: Boolean): Self = StObject.set(x, "withTracks", value.asInstanceOf[js.Any])
      
      inline def setWithTracksUndefined: Self = StObject.set(x, "withTracks", js.undefined)
    }
  }
  
  type _To = js.Object & (ComponentClass[ReactSliderProps, ComponentState])
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & (ComponentClass[ReactSliderProps, ComponentState]) = ^
}
