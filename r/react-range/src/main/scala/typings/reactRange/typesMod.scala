package typings.reactRange

import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.react.mod.TouchEvent
import typings.reactRange.anon.Children
import typings.reactRange.anon.Index
import typings.reactRange.anon.IsDragged
import typings.reactRange.anon.X
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  sealed trait Direction extends StObject
  @JSImport("react-range/lib/types", "Direction")
  @js.native
  object Direction extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Direction with String] = js.native
    
    @js.native
    sealed trait Down extends Direction
    /* "to bottom" */ val Down: typings.reactRange.typesMod.Direction.Down with String = js.native
    
    @js.native
    sealed trait Left extends Direction
    /* "to left" */ val Left: typings.reactRange.typesMod.Direction.Left with String = js.native
    
    @js.native
    sealed trait Right extends Direction
    /* "to right" */ val Right: typings.reactRange.typesMod.Direction.Right with String = js.native
    
    @js.native
    sealed trait Up extends Direction
    /* "to top" */ val Up: typings.reactRange.typesMod.Direction.Up with String = js.native
  }
  
  @js.native
  trait IMarkProps extends StObject {
    
    var key: String = js.native
    
    var ref: RefObject[_] = js.native
    
    var style: CSSProperties = js.native
  }
  object IMarkProps {
    
    @scala.inline
    def apply(key: String, ref: RefObject[_], style: CSSProperties): IMarkProps = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMarkProps]
    }
    
    @scala.inline
    implicit class IMarkPropsMutableBuilder[Self <: IMarkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: RefObject[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IProps extends StObject {
    
    var allowOverlap: Boolean = js.native
    
    var direction: Direction = js.native
    
    var disabled: Boolean = js.native
    
    var draggableTrack: Boolean = js.native
    
    var max: Double = js.native
    
    var min: Double = js.native
    
    def onChange(values: js.Array[Double]): Unit = js.native
    
    var onFinalChange: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.native
    
    var renderMark: js.UndefOr[js.Function1[/* params */ Index, ReactNode]] = js.native
    
    def renderThumb(params: IsDragged): ReactNode = js.native
    
    def renderTrack(params: Children): ReactNode = js.native
    
    var rtl: Boolean = js.native
    
    var step: Double = js.native
    
    var values: js.Array[Double] = js.native
  }
  object IProps {
    
    @scala.inline
    def apply(
      allowOverlap: Boolean,
      direction: Direction,
      disabled: Boolean,
      draggableTrack: Boolean,
      max: Double,
      min: Double,
      onChange: js.Array[Double] => Unit,
      renderThumb: IsDragged => ReactNode,
      renderTrack: Children => ReactNode,
      rtl: Boolean,
      step: Double,
      values: js.Array[Double]
    ): IProps = {
      val __obj = js.Dynamic.literal(allowOverlap = allowOverlap.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], draggableTrack = draggableTrack.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), renderThumb = js.Any.fromFunction1(renderThumb), renderTrack = js.Any.fromFunction1(renderTrack), rtl = rtl.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProps]
    }
    
    @scala.inline
    implicit class IPropsMutableBuilder[Self <: IProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowOverlap(value: Boolean): Self = StObject.set(x, "allowOverlap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableTrack(value: Boolean): Self = StObject.set(x, "draggableTrack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: js.Array[Double] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFinalChange(value: /* values */ js.Array[Double] => Unit): Self = StObject.set(x, "onFinalChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFinalChangeUndefined: Self = StObject.set(x, "onFinalChange", js.undefined)
      
      @scala.inline
      def setRenderMark(value: /* params */ Index => ReactNode): Self = StObject.set(x, "renderMark", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderMarkUndefined: Self = StObject.set(x, "renderMark", js.undefined)
      
      @scala.inline
      def setRenderThumb(value: IsDragged => ReactNode): Self = StObject.set(x, "renderThumb", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderTrack(value: Children => ReactNode): Self = StObject.set(x, "renderTrack", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IThumbProps extends StObject {
    
    var `aria-valuemax`: Double = js.native
    
    var `aria-valuemin`: Double = js.native
    
    var `aria-valuenow`: Double = js.native
    
    var draggable: Boolean = js.native
    
    var key: Double = js.native
    
    def onKeyDown(e: KeyboardEvent[Element]): Unit = js.native
    
    def onKeyUp(e: KeyboardEvent[Element]): Unit = js.native
    
    var ref: RefObject[_] = js.native
    
    var role: String = js.native
    
    var style: CSSProperties = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
  }
  object IThumbProps {
    
    @scala.inline
    def apply(
      `aria-valuemax`: Double,
      `aria-valuemin`: Double,
      `aria-valuenow`: Double,
      draggable: Boolean,
      key: Double,
      onKeyDown: KeyboardEvent[Element] => Unit,
      onKeyUp: KeyboardEvent[Element] => Unit,
      ref: RefObject[_],
      role: String,
      style: CSSProperties
    ): IThumbProps = {
      val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp), ref = ref.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
      __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
      __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IThumbProps]
    }
    
    @scala.inline
    implicit class IThumbPropsMutableBuilder[Self <: IThumbProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnKeyDown(value: KeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUp(value: KeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRef(value: RefObject[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    }
  }
  
  @js.native
  trait ITrackBackground extends StObject {
    
    var colors: js.Array[String] = js.native
    
    var direction: js.UndefOr[Direction] = js.native
    
    var max: Double = js.native
    
    var min: Double = js.native
    
    var rtl: js.UndefOr[Boolean] = js.native
    
    var values: js.Array[Double] = js.native
  }
  object ITrackBackground {
    
    @scala.inline
    def apply(colors: js.Array[String], max: Double, min: Double, values: js.Array[Double]): ITrackBackground = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITrackBackground]
    }
    
    @scala.inline
    implicit class ITrackBackgroundMutableBuilder[Self <: ITrackBackground] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ITrackProps extends StObject {
    
    def onMouseDown(e: MouseEvent[Element, NativeMouseEvent]): Unit = js.native
    
    def onTouchStart(e: TouchEvent[Element]): Unit = js.native
    
    var ref: RefObject[_] = js.native
    
    var style: CSSProperties = js.native
  }
  object ITrackProps {
    
    @scala.inline
    def apply(
      onMouseDown: MouseEvent[Element, NativeMouseEvent] => Unit,
      onTouchStart: TouchEvent[Element] => Unit,
      ref: RefObject[_],
      style: CSSProperties
    ): ITrackProps = {
      val __obj = js.Dynamic.literal(onMouseDown = js.Any.fromFunction1(onMouseDown), onTouchStart = js.Any.fromFunction1(onTouchStart), ref = ref.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITrackProps]
    }
    
    @scala.inline
    implicit class ITrackPropsMutableBuilder[Self <: ITrackProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnMouseDown(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStart(value: TouchEvent[Element] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRef(value: RefObject[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  type TThumbOffsets = js.Array[X]
}
