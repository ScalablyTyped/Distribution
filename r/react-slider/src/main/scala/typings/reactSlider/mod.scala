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
import scala.scalajs.js.`|`
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
  val ^ : ComponentClass[ReactSliderProps, ComponentState] = js.native
  
  @js.native
  trait ReactSliderProps extends StObject {
    
    /**
      * aria-label for screen-readers to apply to the thumbs.
      * Use an array for more than one thumb.
      * The length of the array must match the number of thumbs in the value array.
      */
    var ariaLabel: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * aria-valuetext for screen-readers.
      * Can be a static string, or a function that returns a string.
      */
    var ariaValuetext: js.UndefOr[String | (js.Function1[/* value */ Index, String])] = js.native
    
    /**
      * The css class set on the slider node.
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Determines the initial positions of the thumbs and the number of thumbs.
      *
      * If a number is passed a slider with one thumb will be rendered.
      * If an array is passed each value will determine the position of one thumb.
      * The values in the array must be sorted.
      */
    var defaultValue: js.UndefOr[Double | js.Array[Double]] = js.native
    
    /**
      * If `true` the thumbs can't be moved.
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Inverts the slider.
      */
    var invert: js.UndefOr[Boolean] = js.native
    
    /**
      * The maximum value of the slider.
      */
    var max: js.UndefOr[Double] = js.native
    
    /**
      * The minimum value of the slider.
      */
    var min: js.UndefOr[Double] = js.native
    
    /**
      * The minimal distance between any pair of thumbs.
      * Must be positive, but zero means they can sit on top of each other.
      */
    var minDistance: js.UndefOr[Double] = js.native
    
    /**
      * Callback called only after moving a thumb has ended.
      */
    var onAfterChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | js.Array[Double] | Null], Unit]] = js.native
    
    /**
      * Callback called before starting to move a thumb.
      */
    var onBeforeChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | js.Array[Double] | Null], Unit]] = js.native
    
    /**
      * Callback called on every value change.
      */
    var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | js.Array[Double] | Null], Unit]] = js.native
    
    /**
      * Callback called when the the slider is clicked (thumb or tracks).
      * Receives the value at the clicked position as argument.
      */
    var onSliderClick: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    /**
      * Determines whether the slider moves horizontally (from left to right)
      * or vertically (from top to bottom).
      */
    var orientation: js.UndefOr[horizontal | vertical] = js.native
    
    /**
      * The result of the function is the value to be added or subtracted
      * when the `Page Up` or `Page Down` keys are pressed.
      *
      * The current `step` value will be passed as the only argument.
      * By default, paging will modify `step` by a factor of 10.
      */
    var pageFn: js.UndefOr[js.Function1[/* step */ Double, Double]] = js.native
    
    /**
      * If `true` the active thumb will push other thumbs
      * within the constraints of `min`, `max`, `step` and `minDistance`.
      */
    var pearling: js.UndefOr[Boolean] = js.native
    
    /**
      * Provide a custom render function for dynamic thumb content.
      * The render function will be passed two arguments.The first is
      * an object that should be added to your thumb node,
      */
    var renderThumb: js.UndefOr[js.Function2[/* props */ js.Object, /* state */ Index, Element]] = js.native
    
    /**
      * Provide a custom render function for the track node.
      * The render function will be passed two arguments. The first is
      * an object that should be added to your handle node.
      */
    var renderTrack: js.UndefOr[js.Function2[/* props */ js.Object, /* state */ Value, Element]] = js.native
    
    /**
      * Disables thumb move when clicking the slider track
      */
    var snapDragDisabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Value to be added or subtracted on each step the slider makes.
      * Must be greater than zero.
      * `max - min` should be evenly divisible by the step value.
      */
    var step: js.UndefOr[Double] = js.native
    
    /**
      * The css class set on the thumb that is currently being moved.
      */
    var thumbActiveClassName: js.UndefOr[String] = js.native
    
    /**
      * The css class set on each thumb node.
      *
      * In addition each thumb will receive a numbered css class of the form
      * `${thumbClassName}-${i}`, e.g. `thumb-0`, `thumb-1`, ...
      */
    var thumbClassName: js.UndefOr[String] = js.native
    
    /**
      * The css class set on the tracks between the thumbs.
      * In addition track fragment will receive a numbered css class of the form
      * `${trackClassName}-${i}`, e.g. `track-0`, `track-1`, ...
      */
    var trackClassName: js.UndefOr[String] = js.native
    
    /**
      * Like `defaultValue` but for
      * [controlled components](http://facebook.github.io/react/docs/forms.html#controlled-components).
      */
    var value: js.UndefOr[Double | js.Array[Double]] = js.native
    
    /**
      * If `true` tracks between the thumbs will be rendered.
      */
    var withTracks: js.UndefOr[Boolean] = js.native
  }
  object ReactSliderProps {
    
    @scala.inline
    def apply(): ReactSliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactSliderProps]
    }
    
    @scala.inline
    implicit class ReactSliderPropsMutableBuilder[Self <: ReactSliderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabel(value: String | js.Array[String]): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setAriaLabelVarargs(value: String*): Self = StObject.set(x, "ariaLabel", js.Array(value :_*))
      
      @scala.inline
      def setAriaValuetext(value: String | (js.Function1[/* value */ Index, String])): Self = StObject.set(x, "ariaValuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaValuetextFunction1(value: /* value */ Index => String): Self = StObject.set(x, "ariaValuetext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAriaValuetextUndefined: Self = StObject.set(x, "ariaValuetext", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Double | js.Array[Double]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: Double*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDistance(value: Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDistanceUndefined: Self = StObject.set(x, "minDistance", js.undefined)
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOnAfterChange(value: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Unit): Self = StObject.set(x, "onAfterChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAfterChangeUndefined: Self = StObject.set(x, "onAfterChange", js.undefined)
      
      @scala.inline
      def setOnBeforeChange(value: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Unit): Self = StObject.set(x, "onBeforeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeChangeUndefined: Self = StObject.set(x, "onBeforeChange", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnSliderClick(value: /* value */ Double => Unit): Self = StObject.set(x, "onSliderClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSliderClickUndefined: Self = StObject.set(x, "onSliderClick", js.undefined)
      
      @scala.inline
      def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setPageFn(value: /* step */ Double => Double): Self = StObject.set(x, "pageFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPageFnUndefined: Self = StObject.set(x, "pageFn", js.undefined)
      
      @scala.inline
      def setPearling(value: Boolean): Self = StObject.set(x, "pearling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPearlingUndefined: Self = StObject.set(x, "pearling", js.undefined)
      
      @scala.inline
      def setRenderThumb(value: (/* props */ js.Object, /* state */ Index) => Element): Self = StObject.set(x, "renderThumb", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderThumbUndefined: Self = StObject.set(x, "renderThumb", js.undefined)
      
      @scala.inline
      def setRenderTrack(value: (/* props */ js.Object, /* state */ Value) => Element): Self = StObject.set(x, "renderTrack", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderTrackUndefined: Self = StObject.set(x, "renderTrack", js.undefined)
      
      @scala.inline
      def setSnapDragDisabled(value: Boolean): Self = StObject.set(x, "snapDragDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapDragDisabledUndefined: Self = StObject.set(x, "snapDragDisabled", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setThumbActiveClassName(value: String): Self = StObject.set(x, "thumbActiveClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbActiveClassNameUndefined: Self = StObject.set(x, "thumbActiveClassName", js.undefined)
      
      @scala.inline
      def setThumbClassName(value: String): Self = StObject.set(x, "thumbClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbClassNameUndefined: Self = StObject.set(x, "thumbClassName", js.undefined)
      
      @scala.inline
      def setTrackClassName(value: String): Self = StObject.set(x, "trackClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackClassNameUndefined: Self = StObject.set(x, "trackClassName", js.undefined)
      
      @scala.inline
      def setValue(value: Double | js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      @scala.inline
      def setWithTracks(value: Boolean): Self = StObject.set(x, "withTracks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithTracksUndefined: Self = StObject.set(x, "withTracks", js.undefined)
    }
  }
  
  type _To = ComponentClass[ReactSliderProps, ComponentState]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ComponentClass[ReactSliderProps, ComponentState] = ^
}
