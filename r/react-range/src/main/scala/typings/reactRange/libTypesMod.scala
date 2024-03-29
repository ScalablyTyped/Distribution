package typings.reactRange

import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.react.mod.TouchEvent
import typings.reactRange.anon.X
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  @js.native
  sealed trait Direction extends StObject
  @JSImport("react-range/lib/types", "Direction")
  @js.native
  object Direction extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Direction & String] = js.native
    
    @js.native
    sealed trait Down
      extends StObject
         with Direction
    /* "to bottom" */ val Down: typings.reactRange.libTypesMod.Direction.Down & String = js.native
    
    @js.native
    sealed trait Left
      extends StObject
         with Direction
    /* "to left" */ val Left: typings.reactRange.libTypesMod.Direction.Left & String = js.native
    
    @js.native
    sealed trait Right
      extends StObject
         with Direction
    /* "to right" */ val Right: typings.reactRange.libTypesMod.Direction.Right & String = js.native
    
    @js.native
    sealed trait Up
      extends StObject
         with Direction
    /* "to top" */ val Up: typings.reactRange.libTypesMod.Direction.Up & String = js.native
  }
  
  trait IMarkProps extends StObject {
    
    var key: String
    
    var ref: RefObject[Any]
    
    var style: CSSProperties
  }
  object IMarkProps {
    
    inline def apply(key: String, ref: RefObject[Any], style: CSSProperties): IMarkProps = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMarkProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IMarkProps] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRef(value: RefObject[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait IProps extends StObject {
    
    var allowOverlap: Boolean
    
    var direction: Direction
    
    var disabled: Boolean
    
    var draggableTrack: Boolean
    
    var max: Double
    
    var min: Double
    
    def onChange(values: js.Array[Double]): Unit
    
    var onFinalChange: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.undefined
    
    var renderMark: js.UndefOr[js.Function1[/* params */ IRenderMarkParams, ReactNode]] = js.undefined
    
    def renderThumb(params: IRenderThumbParams): ReactNode
    
    def renderTrack(params: IRenderTrackParams): ReactNode
    
    var rtl: Boolean
    
    var step: Double
    
    var values: js.Array[Double]
  }
  object IProps {
    
    inline def apply(
      allowOverlap: Boolean,
      direction: Direction,
      disabled: Boolean,
      draggableTrack: Boolean,
      max: Double,
      min: Double,
      onChange: js.Array[Double] => Unit,
      renderThumb: IRenderThumbParams => ReactNode,
      renderTrack: IRenderTrackParams => ReactNode,
      rtl: Boolean,
      step: Double,
      values: js.Array[Double]
    ): IProps = {
      val __obj = js.Dynamic.literal(allowOverlap = allowOverlap.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], draggableTrack = draggableTrack.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), renderThumb = js.Any.fromFunction1(renderThumb), renderTrack = js.Any.fromFunction1(renderTrack), rtl = rtl.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IProps] (val x: Self) extends AnyVal {
      
      inline def setAllowOverlap(value: Boolean): Self = StObject.set(x, "allowOverlap", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDraggableTrack(value: Boolean): Self = StObject.set(x, "draggableTrack", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: js.Array[Double] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnFinalChange(value: /* values */ js.Array[Double] => Unit): Self = StObject.set(x, "onFinalChange", js.Any.fromFunction1(value))
      
      inline def setOnFinalChangeUndefined: Self = StObject.set(x, "onFinalChange", js.undefined)
      
      inline def setRenderMark(value: /* params */ IRenderMarkParams => ReactNode): Self = StObject.set(x, "renderMark", js.Any.fromFunction1(value))
      
      inline def setRenderMarkUndefined: Self = StObject.set(x, "renderMark", js.undefined)
      
      inline def setRenderThumb(value: IRenderThumbParams => ReactNode): Self = StObject.set(x, "renderThumb", js.Any.fromFunction1(value))
      
      inline def setRenderTrack(value: IRenderTrackParams => ReactNode): Self = StObject.set(x, "renderTrack", js.Any.fromFunction1(value))
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait IRenderMarkParams extends StObject {
    
    var index: Double
    
    var props: IMarkProps
  }
  object IRenderMarkParams {
    
    inline def apply(index: Double, props: IMarkProps): IRenderMarkParams = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRenderMarkParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRenderMarkParams] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setProps(value: IMarkProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRenderThumbParams extends StObject {
    
    var index: Double
    
    var isDragged: Boolean
    
    var props: IThumbProps
    
    var value: Double
  }
  object IRenderThumbParams {
    
    inline def apply(index: Double, isDragged: Boolean, props: IThumbProps, value: Double): IRenderThumbParams = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isDragged = isDragged.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRenderThumbParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRenderThumbParams] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIsDragged(value: Boolean): Self = StObject.set(x, "isDragged", value.asInstanceOf[js.Any])
      
      inline def setProps(value: IThumbProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRenderTrackParams extends StObject {
    
    var children: ReactNode
    
    var disabled: Boolean
    
    var isDragged: Boolean
    
    var props: ITrackProps
  }
  object IRenderTrackParams {
    
    inline def apply(disabled: Boolean, isDragged: Boolean, props: ITrackProps): IRenderTrackParams = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], isDragged = isDragged.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRenderTrackParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRenderTrackParams] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setIsDragged(value: Boolean): Self = StObject.set(x, "isDragged", value.asInstanceOf[js.Any])
      
      inline def setProps(value: ITrackProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait IThumbProps extends StObject {
    
    var `aria-valuemax`: Double
    
    var `aria-valuemin`: Double
    
    var `aria-valuenow`: Double
    
    var draggable: Boolean
    
    var key: Double
    
    def onKeyDown(e: KeyboardEvent[Element]): Unit
    
    def onKeyUp(e: KeyboardEvent[Element]): Unit
    
    var ref: RefObject[Any]
    
    var role: String
    
    var style: CSSProperties
    
    var tabIndex: js.UndefOr[Double] = js.undefined
  }
  object IThumbProps {
    
    inline def apply(
      `aria-valuemax`: Double,
      `aria-valuemin`: Double,
      `aria-valuenow`: Double,
      draggable: Boolean,
      key: Double,
      onKeyDown: KeyboardEvent[Element] => Unit,
      onKeyUp: KeyboardEvent[Element] => Unit,
      ref: RefObject[Any],
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
    implicit open class MutableBuilder[Self <: IThumbProps] (val x: Self) extends AnyVal {
      
      inline def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOnKeyDown(value: KeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyUp(value: KeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setRef(value: RefObject[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    }
  }
  
  trait ITrackBackground extends StObject {
    
    var colors: js.Array[String]
    
    var direction: js.UndefOr[Direction] = js.undefined
    
    var max: Double
    
    var min: Double
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var values: js.Array[Double]
  }
  object ITrackBackground {
    
    inline def apply(colors: js.Array[String], max: Double, min: Double, values: js.Array[Double]): ITrackBackground = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITrackBackground]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITrackBackground] (val x: Self) extends AnyVal {
      
      inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait ITrackProps extends StObject {
    
    def onMouseDown(e: MouseEvent[Element, NativeMouseEvent]): Unit
    
    def onTouchStart(e: TouchEvent[Element]): Unit
    
    var ref: RefObject[Any]
    
    var style: CSSProperties
  }
  object ITrackProps {
    
    inline def apply(
      onMouseDown: MouseEvent[Element, NativeMouseEvent] => Unit,
      onTouchStart: TouchEvent[Element] => Unit,
      ref: RefObject[Any],
      style: CSSProperties
    ): ITrackProps = {
      val __obj = js.Dynamic.literal(onMouseDown = js.Any.fromFunction1(onMouseDown), onTouchStart = js.Any.fromFunction1(onTouchStart), ref = ref.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITrackProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITrackProps] (val x: Self) extends AnyVal {
      
      inline def setOnMouseDown(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnTouchStart(value: TouchEvent[Element] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setRef(value: RefObject[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  type TThumbOffsets = js.Array[X]
}
