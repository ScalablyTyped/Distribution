package typings.reactSlider

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.RefCallback
import typings.react.mod.global.JSX.Element
import typings.reactSlider.anon.Index
import typings.reactSlider.anon.Value
import typings.reactSlider.reactSliderStrings.horizontal
import typings.reactSlider.reactSliderStrings.vertical
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-slider", JSImport.Default)
  @js.native
  open class default[T /* <: Double | js.Array[Double] */] () extends ReactSlider[T]
  
  trait HTMLPropsWithRefCallback[T]
    extends StObject
       with HTMLProps[T] {
    
    @JSName("ref")
    var ref_HTMLPropsWithRefCallback: RefCallback[T]
  }
  object HTMLPropsWithRefCallback {
    
    inline def apply[T](ref: /* instance */ T | Null => Unit): HTMLPropsWithRefCallback[T] = {
      val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1(ref))
      __obj.asInstanceOf[HTMLPropsWithRefCallback[T]]
    }
    
    extension [Self <: HTMLPropsWithRefCallback[?], T](x: Self & HTMLPropsWithRefCallback[T]) {
      
      inline def setRef(value: /* instance */ T | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ReactSlider[T /* <: Double | js.Array[Double] */]
    extends Component[ReactSliderProps[T], js.Object, Any] {
    
    /**
      * Tell the slider to resize, for example if the parent container has resized
      * independently of the window.
      */
    def resize(): Unit = js.native
  }
  
  trait ReactSliderProps[T /* <: Double | js.Array[Double] */] extends StObject {
    
    /**
      * `aria-label` for screen-readers to apply to the thumb(s).
      *
      * Use an array for more than one thumb.
      * The length of the array must match the number of thumbs in the `value` array.
      */
    var ariaLabel: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? string : std.ReadonlyArray<string> | undefined */ js.Any
      ] = js.undefined
    
    /**
      * aria-labelledby for screen-readers to apply to the thumbs.
      * Used when slider rendered with separate label.
      * Use an array for more than one thumb.
      * The length of the array must match the number of thumbs in the value array.
      */
    var ariaLabelledby: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? string : std.ReadonlyArray<string> | undefined */ js.Any
      ] = js.undefined
    
    /**
      * `aria-valuetext` for screen-readers.
      *
      * Can be a static string, or a function that returns a string:
      *
      * ```
      * state => `Value: ${state.value}`
      * ```
      *
      * - `state.index` - the index of the thumb
      * - `state.value` - the current value state
      * - `state.valueNow` - the value of the thumb (i.e. aria-valuenow)
      */
    var ariaValuetext: js.UndefOr[String | (js.Function1[/* value */ Index[T], String])] = js.undefined
    
    // Disallow children
    var children: js.UndefOr[scala.Nothing] = js.undefined
    
    /**
      * The css class set on the slider node.
      *
      * @default "slider"
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Determines the initial position(s) of the thumb(s) and the number of thumbs.
      *
      * If a number is passed a slider with one thumb will be rendered.
      * If an array is passed each value will determine the position of one thumb.
      * The values in the array must be sorted.
      *
      * Don't pass a default value if the slider is controlled (i.e. if you already
      * use the `value` prop).
      *
      * @default 0
      */
    var defaultValue: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: this['value'] extends T ? never : T */ js.Any
      ] = js.undefined
    
    /**
      * If `true` the thumbs can't be moved.
      *
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Inverts the slider.
      *
      * @default false
      */
    var invert: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The CSS class set on the marks.
      *
      * @default "mark"
      */
    var markClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Shows passed marks on the track, if `true` it shows all the marks;
      * if an array of numbers it shows just the passed marks; if a number
      * is passed it shows just the marks in that steps: like passing `3`
      * shows the marks `3`, `6`, `9`.
      *
      * @default []
      */
    var marks: js.UndefOr[Boolean | Double | js.Array[Double]] = js.undefined
    
    /**
      * The maximum value of the slider.
      *
      * @default 100
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum value of the slider.
      *
      * @default 0
      */
    var min: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimal distance between any pair of thumbs.
      * Must be positive, but `0` means they can sit on top of each other.
      *
      * @default 0
      */
    var minDistance: js.UndefOr[Double] = js.undefined
    
    /**
      * Callback called only after moving a thumb has ended. The callback
      * will only be called if the action resulted in a change.
      *
      * - `value` - the result value, or values if the slider has multiple thumbs and the thumb index
      */
    var onAfterChange: js.UndefOr[js.Function2[/* value */ T, /* index */ Double, Unit]] = js.undefined
    
    /**
      * Callback called before starting to move a thumb. The callback will
      * only be called if the action will result in a change.
      *
      * - `value` - the initial value, or values if the slider has multiple thumbs and the thumb index
      */
    var onBeforeChange: js.UndefOr[js.Function2[/* value */ T, /* index */ Double, Unit]] = js.undefined
    
    /**
      * Callback called on every value change.
      *
      * - `value` - the new value, or values if the slider has multiple thumbs and the thumb index
      */
    var onChange: js.UndefOr[js.Function2[/* value */ T, /* index */ Double, Unit]] = js.undefined
    
    /**
      * Callback called when the the slider is clicked (thumb or tracks).
      *
      * - `value` - the value at the clicked position
      */
    var onSliderClick: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    /**
      * Determines whether the slider moves horizontally (from left to right)
      * or vertically (from top to bottom).
      *
      * @default "horizontal"
      */
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    /**
      * The result of the function is the value to be added or subtracted
      * when the `Page Up` or `Page Down` keys are pressed.
      *
      * - `step` - the current step value
      *
      * @default step => step * 10
      */
    var pageFn: js.UndefOr[js.Function1[/* step */ Double, Double]] = js.undefined
    
    /**
      * If `true` the active thumb will push other thumbs within the constraints
      * of `min`, `max`, `step` and `minDistance`.
      *
      * @default false
      */
    var pearling: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Provide a custom render function for the mark node.
      *
      * The render function will be passed one argument, an object with props that
      * should be added to your mark node.
      *
      * - `props` - props to be spread into your mark node
      *
      * @default props => <div {...props} />
      */
    var renderMark: js.UndefOr[
        js.Function1[/* props */ HTMLPropsWithRefCallback[HTMLSpanElement], Element | Null]
      ] = js.undefined
    
    /**
      * Provide a custom render function for dynamic thumb content.
      *
      * The render function will be passed two arguments, an object with props that
      * should be added to your thumb node, and an object with thumb and slider state.
      *
      * - `props` - props to be spread into your thumb node
      * - `state.index` - the index of the thumb
      * - `state.value` - the current value state
      * - `state.valueNow` - the value of the thumb (i.e. `aria-valuenow`)
      *
      * @default props => <div {...props} />
      */
    var renderThumb: js.UndefOr[
        js.Function2[
          /* props */ HTMLPropsWithRefCallback[HTMLDivElement], 
          /* state */ Index[T], 
          Element | Null
        ]
      ] = js.undefined
    
    /**
      * Provide a custom render function for the track node.
      *
      * The render function will be passed two arguments, an object with props that
      * should be added to your handle node, and an object with track and slider state.
      *
      * - `props` - props to be spread into your track node
      * - `state.index` - the index of the track
      * - `state.value` - the current value state
      *
      * @default props => <div {...props} />
      */
    var renderTrack: js.UndefOr[
        js.Function2[
          /* props */ HTMLPropsWithRefCallback[HTMLDivElement], 
          /* state */ Value[T], 
          Element | Null
        ]
      ] = js.undefined
    
    /**
      * Disables thumb move when clicking the slider track
      *
      * @default false
      */
    var snapDragDisabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Value to be added or subtracted on each step the slider makes.
      *
      * Must be greater than zero. `max - min` should be evenly divisible by the step value.
      *
      * @default 1
      */
    var step: js.UndefOr[Double] = js.undefined
    
    /**
      * The css class set on the thumb that is currently being moved.
      * @default "active"
      */
    var thumbActiveClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The css class set on each thumb node.
      *
      * In addition each thumb will receive a numbered css class of the form
      * `${thumbClassName}-${i}`, e.g. `thumb-0`, `thumb-1`, ...
      * @default "thumb"
      */
    var thumbClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The css class set on the tracks between the thumbs.
      *
      * In addition track fragment will receive a numbered css class of the form
      * `${trackClassName}-${i}`, e.g. `track-0`, `track-1`, ...
      * @default "track"
      */
    var trackClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Like `defaultValue` but for
      * [controlled components](http://facebook.github.io/react/docs/forms.html#controlled-components).
      */
    var value: js.UndefOr[T] = js.undefined
    
    /**
      * If `true` tracks between the thumbs will be rendered.
      * @default true
      */
    var withTracks: js.UndefOr[Boolean] = js.undefined
  }
  object ReactSliderProps {
    
    inline def apply[T /* <: Double | js.Array[Double] */](): ReactSliderProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactSliderProps[T]]
    }
    
    extension [Self <: ReactSliderProps[?], T /* <: Double | js.Array[Double] */](x: Self & ReactSliderProps[T]) {
      
      inline def setAriaLabel(
        value: /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? string : std.ReadonlyArray<string> | undefined */ js.Any
      ): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaLabelledby(
        value: /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? string : std.ReadonlyArray<string> | undefined */ js.Any
      ): Self = StObject.set(x, "ariaLabelledby", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledbyUndefined: Self = StObject.set(x, "ariaLabelledby", js.undefined)
      
      inline def setAriaValuetext(value: String | (js.Function1[/* value */ Index[T], String])): Self = StObject.set(x, "ariaValuetext", value.asInstanceOf[js.Any])
      
      inline def setAriaValuetextFunction1(value: /* value */ Index[T] => String): Self = StObject.set(x, "ariaValuetext", js.Any.fromFunction1(value))
      
      inline def setAriaValuetextUndefined: Self = StObject.set(x, "ariaValuetext", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: this['value'] extends T ? never : T */ js.Any
      ): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
      
      inline def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
      
      inline def setMarkClassName(value: String): Self = StObject.set(x, "markClassName", value.asInstanceOf[js.Any])
      
      inline def setMarkClassNameUndefined: Self = StObject.set(x, "markClassName", js.undefined)
      
      inline def setMarks(value: Boolean | Double | js.Array[Double]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      inline def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      inline def setMarksVarargs(value: Double*): Self = StObject.set(x, "marks", js.Array(value*))
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinDistance(value: Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
      
      inline def setMinDistanceUndefined: Self = StObject.set(x, "minDistance", js.undefined)
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOnAfterChange(value: (/* value */ T, /* index */ Double) => Unit): Self = StObject.set(x, "onAfterChange", js.Any.fromFunction2(value))
      
      inline def setOnAfterChangeUndefined: Self = StObject.set(x, "onAfterChange", js.undefined)
      
      inline def setOnBeforeChange(value: (/* value */ T, /* index */ Double) => Unit): Self = StObject.set(x, "onBeforeChange", js.Any.fromFunction2(value))
      
      inline def setOnBeforeChangeUndefined: Self = StObject.set(x, "onBeforeChange", js.undefined)
      
      inline def setOnChange(value: (/* value */ T, /* index */ Double) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnSliderClick(value: /* value */ Double => Unit): Self = StObject.set(x, "onSliderClick", js.Any.fromFunction1(value))
      
      inline def setOnSliderClickUndefined: Self = StObject.set(x, "onSliderClick", js.undefined)
      
      inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPageFn(value: /* step */ Double => Double): Self = StObject.set(x, "pageFn", js.Any.fromFunction1(value))
      
      inline def setPageFnUndefined: Self = StObject.set(x, "pageFn", js.undefined)
      
      inline def setPearling(value: Boolean): Self = StObject.set(x, "pearling", value.asInstanceOf[js.Any])
      
      inline def setPearlingUndefined: Self = StObject.set(x, "pearling", js.undefined)
      
      inline def setRenderMark(value: /* props */ HTMLPropsWithRefCallback[HTMLSpanElement] => Element | Null): Self = StObject.set(x, "renderMark", js.Any.fromFunction1(value))
      
      inline def setRenderMarkUndefined: Self = StObject.set(x, "renderMark", js.undefined)
      
      inline def setRenderThumb(
        value: (/* props */ HTMLPropsWithRefCallback[HTMLDivElement], /* state */ Index[T]) => Element | Null
      ): Self = StObject.set(x, "renderThumb", js.Any.fromFunction2(value))
      
      inline def setRenderThumbUndefined: Self = StObject.set(x, "renderThumb", js.undefined)
      
      inline def setRenderTrack(
        value: (/* props */ HTMLPropsWithRefCallback[HTMLDivElement], /* state */ Value[T]) => Element | Null
      ): Self = StObject.set(x, "renderTrack", js.Any.fromFunction2(value))
      
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
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWithTracks(value: Boolean): Self = StObject.set(x, "withTracks", value.asInstanceOf[js.Any])
      
      inline def setWithTracksUndefined: Self = StObject.set(x, "withTracks", js.undefined)
    }
  }
}
