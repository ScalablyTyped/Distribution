package typings.reactStonecutter

import typings.react.mod.Component
import typings.reactStonecutter.reactStonecutterStrings.deg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-stonecutter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-stonecutter", "CSSGrid")
  @js.native
  open class CSSGrid protected ()
    extends Component[CSSGridProps, js.Object, Any] {
    def this(props: CSSGridProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: CSSGridProps, context: Any) = this()
  }
  
  @JSImport("react-stonecutter", "SpringGrid")
  @js.native
  open class SpringGrid protected ()
    extends Component[SpringGridProps, js.Object, Any] {
    def this(props: SpringGridProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: SpringGridProps, context: Any) = this()
  }
  
  @JSImport("react-stonecutter", "easings")
  @js.native
  val easings: Easings_ = js.native
  
  object enterExitStyle {
    
    @JSImport("react-stonecutter", "enterExitStyle")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-stonecutter", "enterExitStyle.foldUp")
    @js.native
    def foldUp: Any = js.native
    inline def foldUp_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("foldUp")(x.asInstanceOf[js.Any])
    
    @JSImport("react-stonecutter", "enterExitStyle.fromBottom")
    @js.native
    def fromBottom: Any = js.native
    inline def fromBottom_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromBottom")(x.asInstanceOf[js.Any])
    
    @JSImport("react-stonecutter", "enterExitStyle.fromCenter")
    @js.native
    def fromCenter: Any = js.native
    inline def fromCenter_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromCenter")(x.asInstanceOf[js.Any])
    
    @JSImport("react-stonecutter", "enterExitStyle.fromLeftToRight")
    @js.native
    def fromLeftToRight: Any = js.native
    inline def fromLeftToRight_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromLeftToRight")(x.asInstanceOf[js.Any])
    
    @JSImport("react-stonecutter", "enterExitStyle.fromTop")
    @js.native
    def fromTop: Any = js.native
    inline def fromTop_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromTop")(x.asInstanceOf[js.Any])
    
    @JSImport("react-stonecutter", "enterExitStyle.newspaper")
    @js.native
    def newspaper: Any = js.native
    inline def newspaper_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("newspaper")(x.asInstanceOf[js.Any])
    
    @JSImport("react-stonecutter", "enterExitStyle.simple")
    @js.native
    def simple: Any = js.native
    inline def simple_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("simple")(x.asInstanceOf[js.Any])
    
    @JSImport("react-stonecutter", "enterExitStyle.skew")
    @js.native
    def skew: Any = js.native
    inline def skew_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skew")(x.asInstanceOf[js.Any])
  }
  
  object layout {
    
    @JSImport("react-stonecutter", "layout")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-stonecutter", "layout.pinterest")
    @js.native
    def pinterest: LayoutFunction = js.native
    inline def pinterest_=(x: LayoutFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pinterest")(x.asInstanceOf[js.Any])
    
    @JSImport("react-stonecutter", "layout.simple")
    @js.native
    def simple: LayoutFunction = js.native
    inline def simple_=(x: LayoutFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("simple")(x.asInstanceOf[js.Any])
  }
  
  inline def makeResponsive[T](grid: T, options: MakeResponsiveOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("makeResponsive")(grid.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def measureItems[T](grid: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("measureItems")(grid.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def measureItems[T](grid: T, options: MeasureItemsOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("measureItems")(grid.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  type AngleUnit = deg
  
  trait CSSGridProps
    extends StObject
       with CommonGridProps {
    
    /**
      * Animation duration in ms. Required.
      */
    var duration: Double
    
    /**
      * Animation easing function in CSS transition-timing-function format.
      * Some Penner easings are included for convenience.
      * Default: easings.cubicOut.
      */
    var easing: js.UndefOr[Easing] = js.undefined
  }
  object CSSGridProps {
    
    inline def apply(columnWidth: Double, columns: Double, duration: Double): CSSGridProps = {
      val __obj = js.Dynamic.literal(columnWidth = columnWidth.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSSGridProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CSSGridProps] (val x: Self) extends AnyVal {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEasing(value: Easing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    }
  }
  
  trait CommonGridProps extends StObject {
    
    /**
      * The angle unit. Affects transform-functions such as rotate. Default: 'deg'.
      */
    var angleUnit: js.UndefOr[AngleUnit] = js.undefined
    
    /**
      * Width of a single column, by default in px units. Required.
      */
    var columnWidth: Double
    
    /**
      * Number of columns. Required.
      * You can wrap the Grid component in the `makeResponsive` higher-order component to set this dynamically.
      */
    var columns: Double
    
    /**
      * Change the HTML tagName of the Grid element, for example to 'ul' or 'ol' for a list. Default: 'div'.
      */
    var component: js.UndefOr[String] = js.undefined
    
    /**
      * These allow you to change how items animate as they appear and disappear from the grid.
      * Supply functions that return objects with the opacity and transform values for an item's start and end states.
      * By default the item's scale and opacity go from 0 to 1 and back to 0 on exit
      */
    var enter: js.UndefOr[
        js.Function3[/* itemProps */ js.Array[Any], /* gridProps */ js.Array[Any], /* gridState */ Any, Any]
      ] = js.undefined
    
    var entered: js.UndefOr[
        js.Function3[/* itemProps */ js.Array[Any], /* gridProps */ js.Array[Any], /* gridState */ Any, Any]
      ] = js.undefined
    
    var exit: js.UndefOr[
        js.Function3[/* itemProps */ js.Array[Any], /* gridProps */ js.Array[Any], /* gridState */ Any, Any]
      ] = js.undefined
    
    /**
      * Height of vertical space between items. Default: 0.
      */
    var gutterHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Width of space between columns. Default: 0.
      */
    var gutterWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Use one of the included layouts, or create your own. Defaults to a 'simple' layout with items of fixed height.
      */
    var layout: js.UndefOr[LayoutFunction] = js.undefined
    
    /**
      * The length unit used throughout.
      * Default: 'px'. Experimental.
      * You could try using 'em' or 'rem' and then adjust the font-size for a fluid layout,
      * but it may not work well with the measureItems and makeResponsive higher-order components.
      * `%` does not work well due to the way CSS transforms work.
      */
    var lengthUnit: js.UndefOr[LengthUnit] = js.undefined
    
    /**
      * The perspective distance used for 3D transforms.
      * If you are using a transform function like rotateX, use this to strengthen the effect.
      * Default is no perspective applied.
      */
    var perspective: js.UndefOr[Double] = js.undefined
  }
  object CommonGridProps {
    
    inline def apply(columnWidth: Double, columns: Double): CommonGridProps = {
      val __obj = js.Dynamic.literal(columnWidth = columnWidth.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonGridProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonGridProps] (val x: Self) extends AnyVal {
      
      inline def setAngleUnit(value: AngleUnit): Self = StObject.set(x, "angleUnit", value.asInstanceOf[js.Any])
      
      inline def setAngleUnitUndefined: Self = StObject.set(x, "angleUnit", js.undefined)
      
      inline def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setEnter(value: (/* itemProps */ js.Array[Any], /* gridProps */ js.Array[Any], /* gridState */ Any) => Any): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setEntered(value: (/* itemProps */ js.Array[Any], /* gridProps */ js.Array[Any], /* gridState */ Any) => Any): Self = StObject.set(x, "entered", js.Any.fromFunction3(value))
      
      inline def setEnteredUndefined: Self = StObject.set(x, "entered", js.undefined)
      
      inline def setExit(value: (/* itemProps */ js.Array[Any], /* gridProps */ js.Array[Any], /* gridState */ Any) => Any): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
      
      inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
      
      inline def setGutterHeight(value: Double): Self = StObject.set(x, "gutterHeight", value.asInstanceOf[js.Any])
      
      inline def setGutterHeightUndefined: Self = StObject.set(x, "gutterHeight", js.undefined)
      
      inline def setGutterWidth(value: Double): Self = StObject.set(x, "gutterWidth", value.asInstanceOf[js.Any])
      
      inline def setGutterWidthUndefined: Self = StObject.set(x, "gutterWidth", js.undefined)
      
      inline def setLayout(value: (/* itemProps */ js.Array[Any], /* gridProps */ js.Array[Any]) => Layout_): Self = StObject.set(x, "layout", js.Any.fromFunction2(value))
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setLengthUnit(value: LengthUnit): Self = StObject.set(x, "lengthUnit", value.asInstanceOf[js.Any])
      
      inline def setLengthUnitUndefined: Self = StObject.set(x, "lengthUnit", js.undefined)
      
      inline def setPerspective(value: Double): Self = StObject.set(x, "perspective", value.asInstanceOf[js.Any])
      
      inline def setPerspectiveUndefined: Self = StObject.set(x, "perspective", js.undefined)
    }
  }
  
  type Coordinates = js.Tuple2[Double, Double]
  
  type Easing = String
  
  trait Easings_ extends StObject {
    
    var backIn: Easing
    
    var backInOut: Easing
    
    var backOut: Easing
    
    var circIn: Easing
    
    var circInOut: Easing
    
    var circOut: Easing
    
    var cubicIn: Easing
    
    var cubicInOut: Easing
    
    var cubicOut: Easing
    
    var expoIn: Easing
    
    var expoInOut: Easing
    
    var expoOut: Easing
    
    var quadIn: Easing
    
    var quadInOut: Easing
    
    var quadOut: Easing
    
    var quartIn: Easing
    
    var quartInOut: Easing
    
    var quartOut: Easing
    
    var quintIn: Easing
    
    var quintInOut: Easing
    
    var quintOut: Easing
    
    var sineIn: Easing
    
    var sineInOut: Easing
    
    var sineOut: Easing
  }
  object Easings_ {
    
    inline def apply(
      backIn: Easing,
      backInOut: Easing,
      backOut: Easing,
      circIn: Easing,
      circInOut: Easing,
      circOut: Easing,
      cubicIn: Easing,
      cubicInOut: Easing,
      cubicOut: Easing,
      expoIn: Easing,
      expoInOut: Easing,
      expoOut: Easing,
      quadIn: Easing,
      quadInOut: Easing,
      quadOut: Easing,
      quartIn: Easing,
      quartInOut: Easing,
      quartOut: Easing,
      quintIn: Easing,
      quintInOut: Easing,
      quintOut: Easing,
      sineIn: Easing,
      sineInOut: Easing,
      sineOut: Easing
    ): Easings_ = {
      val __obj = js.Dynamic.literal(backIn = backIn.asInstanceOf[js.Any], backInOut = backInOut.asInstanceOf[js.Any], backOut = backOut.asInstanceOf[js.Any], circIn = circIn.asInstanceOf[js.Any], circInOut = circInOut.asInstanceOf[js.Any], circOut = circOut.asInstanceOf[js.Any], cubicIn = cubicIn.asInstanceOf[js.Any], cubicInOut = cubicInOut.asInstanceOf[js.Any], cubicOut = cubicOut.asInstanceOf[js.Any], expoIn = expoIn.asInstanceOf[js.Any], expoInOut = expoInOut.asInstanceOf[js.Any], expoOut = expoOut.asInstanceOf[js.Any], quadIn = quadIn.asInstanceOf[js.Any], quadInOut = quadInOut.asInstanceOf[js.Any], quadOut = quadOut.asInstanceOf[js.Any], quartIn = quartIn.asInstanceOf[js.Any], quartInOut = quartInOut.asInstanceOf[js.Any], quartOut = quartOut.asInstanceOf[js.Any], quintIn = quintIn.asInstanceOf[js.Any], quintInOut = quintInOut.asInstanceOf[js.Any], quintOut = quintOut.asInstanceOf[js.Any], sineIn = sineIn.asInstanceOf[js.Any], sineInOut = sineInOut.asInstanceOf[js.Any], sineOut = sineOut.asInstanceOf[js.Any])
      __obj.asInstanceOf[Easings_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Easings_] (val x: Self) extends AnyVal {
      
      inline def setBackIn(value: Easing): Self = StObject.set(x, "backIn", value.asInstanceOf[js.Any])
      
      inline def setBackInOut(value: Easing): Self = StObject.set(x, "backInOut", value.asInstanceOf[js.Any])
      
      inline def setBackOut(value: Easing): Self = StObject.set(x, "backOut", value.asInstanceOf[js.Any])
      
      inline def setCircIn(value: Easing): Self = StObject.set(x, "circIn", value.asInstanceOf[js.Any])
      
      inline def setCircInOut(value: Easing): Self = StObject.set(x, "circInOut", value.asInstanceOf[js.Any])
      
      inline def setCircOut(value: Easing): Self = StObject.set(x, "circOut", value.asInstanceOf[js.Any])
      
      inline def setCubicIn(value: Easing): Self = StObject.set(x, "cubicIn", value.asInstanceOf[js.Any])
      
      inline def setCubicInOut(value: Easing): Self = StObject.set(x, "cubicInOut", value.asInstanceOf[js.Any])
      
      inline def setCubicOut(value: Easing): Self = StObject.set(x, "cubicOut", value.asInstanceOf[js.Any])
      
      inline def setExpoIn(value: Easing): Self = StObject.set(x, "expoIn", value.asInstanceOf[js.Any])
      
      inline def setExpoInOut(value: Easing): Self = StObject.set(x, "expoInOut", value.asInstanceOf[js.Any])
      
      inline def setExpoOut(value: Easing): Self = StObject.set(x, "expoOut", value.asInstanceOf[js.Any])
      
      inline def setQuadIn(value: Easing): Self = StObject.set(x, "quadIn", value.asInstanceOf[js.Any])
      
      inline def setQuadInOut(value: Easing): Self = StObject.set(x, "quadInOut", value.asInstanceOf[js.Any])
      
      inline def setQuadOut(value: Easing): Self = StObject.set(x, "quadOut", value.asInstanceOf[js.Any])
      
      inline def setQuartIn(value: Easing): Self = StObject.set(x, "quartIn", value.asInstanceOf[js.Any])
      
      inline def setQuartInOut(value: Easing): Self = StObject.set(x, "quartInOut", value.asInstanceOf[js.Any])
      
      inline def setQuartOut(value: Easing): Self = StObject.set(x, "quartOut", value.asInstanceOf[js.Any])
      
      inline def setQuintIn(value: Easing): Self = StObject.set(x, "quintIn", value.asInstanceOf[js.Any])
      
      inline def setQuintInOut(value: Easing): Self = StObject.set(x, "quintInOut", value.asInstanceOf[js.Any])
      
      inline def setQuintOut(value: Easing): Self = StObject.set(x, "quintOut", value.asInstanceOf[js.Any])
      
      inline def setSineIn(value: Easing): Self = StObject.set(x, "sineIn", value.asInstanceOf[js.Any])
      
      inline def setSineInOut(value: Easing): Self = StObject.set(x, "sineInOut", value.asInstanceOf[js.Any])
      
      inline def setSineOut(value: Easing): Self = StObject.set(x, "sineOut", value.asInstanceOf[js.Any])
    }
  }
  
  type LayoutFunction = js.Function2[/* itemProps */ js.Array[Any], /* gridProps */ js.Array[Any], Layout_]
  
  trait Layout_ extends StObject {
    
    /**
      * height of the entire grid
      */
    var gridHeight: Double
    
    /**
      * width of the entire grid
      */
    var gridWidth: Double
    
    /**
      * an Array of [x, y] coordinate pairs like this: [[0, 0], [20, 0], [0, 30]]
      */
    var positions: js.Array[Coordinates]
  }
  object Layout_ {
    
    inline def apply(gridHeight: Double, gridWidth: Double, positions: js.Array[Coordinates]): Layout_ = {
      val __obj = js.Dynamic.literal(gridHeight = gridHeight.asInstanceOf[js.Any], gridWidth = gridWidth.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Layout_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Layout_] (val x: Self) extends AnyVal {
      
      inline def setGridHeight(value: Double): Self = StObject.set(x, "gridHeight", value.asInstanceOf[js.Any])
      
      inline def setGridWidth(value: Double): Self = StObject.set(x, "gridWidth", value.asInstanceOf[js.Any])
      
      inline def setPositions(value: js.Array[Coordinates]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
      
      inline def setPositionsVarargs(value: Coordinates*): Self = StObject.set(x, "positions", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactStonecutter.reactStonecutterStrings.px
    - typings.reactStonecutter.reactStonecutterStrings.em
    - typings.reactStonecutter.reactStonecutterStrings.rem
  */
  trait LengthUnit extends StObject
  object LengthUnit {
    
    inline def em: typings.reactStonecutter.reactStonecutterStrings.em = "em".asInstanceOf[typings.reactStonecutter.reactStonecutterStrings.em]
    
    inline def px: typings.reactStonecutter.reactStonecutterStrings.px = "px".asInstanceOf[typings.reactStonecutter.reactStonecutterStrings.px]
    
    inline def rem: typings.reactStonecutter.reactStonecutterStrings.rem = "rem".asInstanceOf[typings.reactStonecutter.reactStonecutterStrings.rem]
  }
  
  trait MakeResponsiveOptions extends StObject {
    
    /**
      * Default number of columns before the breakpoints kick in.
      * May be useful when rendering server-side in a universal app.
      * Default: 4.
      */
    var defaultColumns: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum width for the Grid in px.
      */
    var maxWidth: Double
    
    /**
      * Minimum horizontal length between the edge of the Grid and the edge of the viewport in px. Default: 0.
      */
    var minPadding: js.UndefOr[Double] = js.undefined
  }
  object MakeResponsiveOptions {
    
    inline def apply(maxWidth: Double): MakeResponsiveOptions = {
      val __obj = js.Dynamic.literal(maxWidth = maxWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[MakeResponsiveOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MakeResponsiveOptions] (val x: Self) extends AnyVal {
      
      inline def setDefaultColumns(value: Double): Self = StObject.set(x, "defaultColumns", value.asInstanceOf[js.Any])
      
      inline def setDefaultColumnsUndefined: Self = StObject.set(x, "defaultColumns", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMinPadding(value: Double): Self = StObject.set(x, "minPadding", value.asInstanceOf[js.Any])
      
      inline def setMinPaddingUndefined: Self = StObject.set(x, "minPadding", js.undefined)
    }
  }
  
  trait MeasureItemsOptions extends StObject {
    
    /**
      * This option is passed through to the imagesLoaded library.
      * It allows you to wait for background images to load, in addition to <img> tags.
      */
    var background: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * If set to true, waits for images to load before measuring items and adding them to the Grid.
      * This may be necessary if you don't know the height of your images ahead of time.
      * Powered by imagesLoaded.
      */
    var measureImages: Boolean
  }
  object MeasureItemsOptions {
    
    inline def apply(measureImages: Boolean): MeasureItemsOptions = {
      val __obj = js.Dynamic.literal(measureImages = measureImages.asInstanceOf[js.Any])
      __obj.asInstanceOf[MeasureItemsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MeasureItemsOptions] (val x: Self) extends AnyVal {
      
      inline def setBackground(value: Boolean | String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setMeasureImages(value: Boolean): Self = StObject.set(x, "measureImages", value.asInstanceOf[js.Any])
    }
  }
  
  trait SpringGridProps
    extends StObject
       with CommonGridProps {
    
    /**
      * Configuration of the React-Motion spring.
      * See the React-Motion docs for more info. Default: { stiffness: 60, damping: 14, precision: 0.1 }.
      */
    var springConfig: js.UndefOr[Any] = js.undefined
  }
  object SpringGridProps {
    
    inline def apply(columnWidth: Double, columns: Double): SpringGridProps = {
      val __obj = js.Dynamic.literal(columnWidth = columnWidth.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpringGridProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpringGridProps] (val x: Self) extends AnyVal {
      
      inline def setSpringConfig(value: Any): Self = StObject.set(x, "springConfig", value.asInstanceOf[js.Any])
      
      inline def setSpringConfigUndefined: Self = StObject.set(x, "springConfig", js.undefined)
    }
  }
}
