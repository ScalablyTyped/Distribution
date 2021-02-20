package typings.reactStonecutter

import typings.react.mod.Component
import typings.reactStonecutter.reactStonecutterStrings.deg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-stonecutter", "CSSGrid")
  @js.native
  class CSSGrid protected ()
    extends Component[CSSGridProps, js.Object, js.Any] {
    def this(props: CSSGridProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CSSGridProps, context: js.Any) = this()
  }
  
  @JSImport("react-stonecutter", "SpringGrid")
  @js.native
  class SpringGrid protected ()
    extends Component[SpringGridProps, js.Object, js.Any] {
    def this(props: SpringGridProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SpringGridProps, context: js.Any) = this()
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
    def foldUp: js.Any = js.native
    @scala.inline
    def foldUp_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("foldUp")(x.asInstanceOf[js.Any])
    
    @JSImport("react-stonecutter", "enterExitStyle.fromBottom")
    @js.native
    def fromBottom: js.Any = js.native
    @scala.inline
    def fromBottom_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromBottom")(x.asInstanceOf[js.Any])
    
    @JSImport("react-stonecutter", "enterExitStyle.fromCenter")
    @js.native
    def fromCenter: js.Any = js.native
    @scala.inline
    def fromCenter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromCenter")(x.asInstanceOf[js.Any])
    
    @JSImport("react-stonecutter", "enterExitStyle.fromLeftToRight")
    @js.native
    def fromLeftToRight: js.Any = js.native
    @scala.inline
    def fromLeftToRight_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromLeftToRight")(x.asInstanceOf[js.Any])
    
    @JSImport("react-stonecutter", "enterExitStyle.fromTop")
    @js.native
    def fromTop: js.Any = js.native
    @scala.inline
    def fromTop_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromTop")(x.asInstanceOf[js.Any])
    
    @JSImport("react-stonecutter", "enterExitStyle.newspaper")
    @js.native
    def newspaper: js.Any = js.native
    @scala.inline
    def newspaper_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("newspaper")(x.asInstanceOf[js.Any])
    
    @JSImport("react-stonecutter", "enterExitStyle.simple")
    @js.native
    def simple: js.Any = js.native
    @scala.inline
    def simple_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("simple")(x.asInstanceOf[js.Any])
    
    @JSImport("react-stonecutter", "enterExitStyle.skew")
    @js.native
    def skew: js.Any = js.native
    @scala.inline
    def skew_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skew")(x.asInstanceOf[js.Any])
  }
  
  object layout {
    
    @JSImport("react-stonecutter", "layout")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-stonecutter", "layout.pinterest")
    @js.native
    def pinterest: LayoutFunction = js.native
    @scala.inline
    def pinterest_=(x: LayoutFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pinterest")(x.asInstanceOf[js.Any])
    
    @JSImport("react-stonecutter", "layout.simple")
    @js.native
    def simple: LayoutFunction = js.native
    @scala.inline
    def simple_=(x: LayoutFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("simple")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-stonecutter", "makeResponsive")
  @js.native
  def makeResponsive[T](grid: T, options: MakeResponsiveOptions): T = js.native
  
  @JSImport("react-stonecutter", "measureItems")
  @js.native
  def measureItems[T](grid: T): T = js.native
  @JSImport("react-stonecutter", "measureItems")
  @js.native
  def measureItems[T](grid: T, options: MeasureItemsOptions): T = js.native
  
  type AngleUnit = deg
  
  @js.native
  trait CSSGridProps extends CommonGridProps {
    
    /**
      * Animation duration in ms. Required.
      */
    var duration: Double = js.native
    
    /**
      * Animation easing function in CSS transition-timing-function format.
      * Some Penner easings are included for convenience.
      * Default: easings.cubicOut.
      */
    var easing: js.UndefOr[Easing] = js.native
  }
  object CSSGridProps {
    
    @scala.inline
    def apply(columnWidth: Double, columns: Double, duration: Double): CSSGridProps = {
      val __obj = js.Dynamic.literal(columnWidth = columnWidth.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSSGridProps]
    }
    
    @scala.inline
    implicit class CSSGridPropsMutableBuilder[Self <: CSSGridProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasing(value: Easing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    }
  }
  
  @js.native
  trait CommonGridProps extends StObject {
    
    /**
      * The angle unit. Affects transform-functions such as rotate. Default: 'deg'.
      */
    var angleUnit: js.UndefOr[AngleUnit] = js.native
    
    /**
      * Width of a single column, by default in px units. Required.
      */
    var columnWidth: Double = js.native
    
    /**
      * Number of columns. Required.
      * You can wrap the Grid component in the `makeResponsive` higher-order component to set this dynamically.
      */
    var columns: Double = js.native
    
    /**
      * Change the HTML tagName of the Grid element, for example to 'ul' or 'ol' for a list. Default: 'div'.
      */
    var component: js.UndefOr[String] = js.native
    
    /**
      * These allow you to change how items animate as they appear and disappear from the grid.
      * Supply functions that return objects with the opacity and transform values for an item's start and end states.
      * By default the item's scale and opacity go from 0 to 1 and back to 0 on exit
      */
    var enter: js.UndefOr[
        js.Function3[/* itemProps */ js.Array[_], /* gridProps */ js.Array[_], /* gridState */ js.Any, _]
      ] = js.native
    
    var entered: js.UndefOr[
        js.Function3[/* itemProps */ js.Array[_], /* gridProps */ js.Array[_], /* gridState */ js.Any, _]
      ] = js.native
    
    var exit: js.UndefOr[
        js.Function3[/* itemProps */ js.Array[_], /* gridProps */ js.Array[_], /* gridState */ js.Any, _]
      ] = js.native
    
    /**
      * Height of vertical space between items. Default: 0.
      */
    var gutterHeight: js.UndefOr[Double] = js.native
    
    /**
      * Width of space between columns. Default: 0.
      */
    var gutterWidth: js.UndefOr[Double] = js.native
    
    /**
      * Use one of the included layouts, or create your own. Defaults to a 'simple' layout with items of fixed height.
      */
    var layout: js.UndefOr[LayoutFunction] = js.native
    
    /**
      * The length unit used throughout.
      * Default: 'px'. Experimental.
      * You could try using 'em' or 'rem' and then adjust the font-size for a fluid layout,
      * but it may not work well with the measureItems and makeResponsive higher-order components.
      * `%` does not work well due to the way CSS transforms work.
      */
    var lengthUnit: js.UndefOr[LengthUnit] = js.native
    
    /**
      * The perspective distance used for 3D transforms.
      * If you are using a transform function like rotateX, use this to strengthen the effect.
      * Default is no perspective applied.
      */
    var perspective: js.UndefOr[Double] = js.native
  }
  object CommonGridProps {
    
    @scala.inline
    def apply(columnWidth: Double, columns: Double): CommonGridProps = {
      val __obj = js.Dynamic.literal(columnWidth = columnWidth.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonGridProps]
    }
    
    @scala.inline
    implicit class CommonGridPropsMutableBuilder[Self <: CommonGridProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngleUnit(value: AngleUnit): Self = StObject.set(x, "angleUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUnitUndefined: Self = StObject.set(x, "angleUnit", js.undefined)
      
      @scala.inline
      def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setEnter(value: (/* itemProps */ js.Array[_], /* gridProps */ js.Array[_], /* gridState */ js.Any) => _): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      @scala.inline
      def setEntered(value: (/* itemProps */ js.Array[_], /* gridProps */ js.Array[_], /* gridState */ js.Any) => _): Self = StObject.set(x, "entered", js.Any.fromFunction3(value))
      
      @scala.inline
      def setEnteredUndefined: Self = StObject.set(x, "entered", js.undefined)
      
      @scala.inline
      def setExit(value: (/* itemProps */ js.Array[_], /* gridProps */ js.Array[_], /* gridState */ js.Any) => _): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
      
      @scala.inline
      def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
      
      @scala.inline
      def setGutterHeight(value: Double): Self = StObject.set(x, "gutterHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGutterHeightUndefined: Self = StObject.set(x, "gutterHeight", js.undefined)
      
      @scala.inline
      def setGutterWidth(value: Double): Self = StObject.set(x, "gutterWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGutterWidthUndefined: Self = StObject.set(x, "gutterWidth", js.undefined)
      
      @scala.inline
      def setLayout(value: (/* itemProps */ js.Array[js.Any], /* gridProps */ js.Array[js.Any]) => Layout_): Self = StObject.set(x, "layout", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setLengthUnit(value: LengthUnit): Self = StObject.set(x, "lengthUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUnitUndefined: Self = StObject.set(x, "lengthUnit", js.undefined)
      
      @scala.inline
      def setPerspective(value: Double): Self = StObject.set(x, "perspective", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerspectiveUndefined: Self = StObject.set(x, "perspective", js.undefined)
    }
  }
  
  type Coordinates = js.Tuple2[Double, Double]
  
  type Easing = String
  
  @js.native
  trait Easings_ extends StObject {
    
    var backIn: Easing = js.native
    
    var backInOut: Easing = js.native
    
    var backOut: Easing = js.native
    
    var circIn: Easing = js.native
    
    var circInOut: Easing = js.native
    
    var circOut: Easing = js.native
    
    var cubicIn: Easing = js.native
    
    var cubicInOut: Easing = js.native
    
    var cubicOut: Easing = js.native
    
    var expoIn: Easing = js.native
    
    var expoInOut: Easing = js.native
    
    var expoOut: Easing = js.native
    
    var quadIn: Easing = js.native
    
    var quadInOut: Easing = js.native
    
    var quadOut: Easing = js.native
    
    var quartIn: Easing = js.native
    
    var quartInOut: Easing = js.native
    
    var quartOut: Easing = js.native
    
    var quintIn: Easing = js.native
    
    var quintInOut: Easing = js.native
    
    var quintOut: Easing = js.native
    
    var sineIn: Easing = js.native
    
    var sineInOut: Easing = js.native
    
    var sineOut: Easing = js.native
  }
  object Easings_ {
    
    @scala.inline
    def apply(
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
    implicit class Easings_MutableBuilder[Self <: Easings_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackIn(value: Easing): Self = StObject.set(x, "backIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackInOut(value: Easing): Self = StObject.set(x, "backInOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackOut(value: Easing): Self = StObject.set(x, "backOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircIn(value: Easing): Self = StObject.set(x, "circIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircInOut(value: Easing): Self = StObject.set(x, "circInOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircOut(value: Easing): Self = StObject.set(x, "circOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCubicIn(value: Easing): Self = StObject.set(x, "cubicIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCubicInOut(value: Easing): Self = StObject.set(x, "cubicInOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCubicOut(value: Easing): Self = StObject.set(x, "cubicOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpoIn(value: Easing): Self = StObject.set(x, "expoIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpoInOut(value: Easing): Self = StObject.set(x, "expoInOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpoOut(value: Easing): Self = StObject.set(x, "expoOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuadIn(value: Easing): Self = StObject.set(x, "quadIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuadInOut(value: Easing): Self = StObject.set(x, "quadInOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuadOut(value: Easing): Self = StObject.set(x, "quadOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuartIn(value: Easing): Self = StObject.set(x, "quartIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuartInOut(value: Easing): Self = StObject.set(x, "quartInOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuartOut(value: Easing): Self = StObject.set(x, "quartOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuintIn(value: Easing): Self = StObject.set(x, "quintIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuintInOut(value: Easing): Self = StObject.set(x, "quintInOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuintOut(value: Easing): Self = StObject.set(x, "quintOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSineIn(value: Easing): Self = StObject.set(x, "sineIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSineInOut(value: Easing): Self = StObject.set(x, "sineInOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSineOut(value: Easing): Self = StObject.set(x, "sineOut", value.asInstanceOf[js.Any])
    }
  }
  
  type LayoutFunction = js.Function2[/* itemProps */ js.Array[js.Any], /* gridProps */ js.Array[js.Any], Layout_]
  
  @js.native
  trait Layout_ extends StObject {
    
    /**
      * height of the entire grid
      */
    var gridHeight: Double = js.native
    
    /**
      * width of the entire grid
      */
    var gridWidth: Double = js.native
    
    /**
      * an Array of [x, y] coordinate pairs like this: [[0, 0], [20, 0], [0, 30]]
      */
    var positions: js.Array[Coordinates] = js.native
  }
  object Layout_ {
    
    @scala.inline
    def apply(gridHeight: Double, gridWidth: Double, positions: js.Array[Coordinates]): Layout_ = {
      val __obj = js.Dynamic.literal(gridHeight = gridHeight.asInstanceOf[js.Any], gridWidth = gridWidth.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Layout_]
    }
    
    @scala.inline
    implicit class Layout_MutableBuilder[Self <: Layout_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGridHeight(value: Double): Self = StObject.set(x, "gridHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridWidth(value: Double): Self = StObject.set(x, "gridWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositions(value: js.Array[Coordinates]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionsVarargs(value: Coordinates*): Self = StObject.set(x, "positions", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactStonecutter.reactStonecutterStrings.px
    - typings.reactStonecutter.reactStonecutterStrings.em
    - typings.reactStonecutter.reactStonecutterStrings.rem
  */
  trait LengthUnit extends StObject
  object LengthUnit {
    
    @scala.inline
    def em: typings.reactStonecutter.reactStonecutterStrings.em = "em".asInstanceOf[typings.reactStonecutter.reactStonecutterStrings.em]
    
    @scala.inline
    def px: typings.reactStonecutter.reactStonecutterStrings.px = "px".asInstanceOf[typings.reactStonecutter.reactStonecutterStrings.px]
    
    @scala.inline
    def rem: typings.reactStonecutter.reactStonecutterStrings.rem = "rem".asInstanceOf[typings.reactStonecutter.reactStonecutterStrings.rem]
  }
  
  @js.native
  trait MakeResponsiveOptions extends StObject {
    
    /**
      * Default number of columns before the breakpoints kick in.
      * May be useful when rendering server-side in a universal app.
      * Default: 4.
      */
    var defaultColumns: js.UndefOr[Double] = js.native
    
    /**
      * Maximum width for the Grid in px.
      */
    var maxWidth: Double = js.native
    
    /**
      * Minimum horizontal length between the edge of the Grid and the edge of the viewport in px. Default: 0.
      */
    var minPadding: js.UndefOr[Double] = js.native
  }
  object MakeResponsiveOptions {
    
    @scala.inline
    def apply(maxWidth: Double): MakeResponsiveOptions = {
      val __obj = js.Dynamic.literal(maxWidth = maxWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[MakeResponsiveOptions]
    }
    
    @scala.inline
    implicit class MakeResponsiveOptionsMutableBuilder[Self <: MakeResponsiveOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultColumns(value: Double): Self = StObject.set(x, "defaultColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultColumnsUndefined: Self = StObject.set(x, "defaultColumns", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPadding(value: Double): Self = StObject.set(x, "minPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPaddingUndefined: Self = StObject.set(x, "minPadding", js.undefined)
    }
  }
  
  @js.native
  trait MeasureItemsOptions extends StObject {
    
    /**
      * This option is passed through to the imagesLoaded library.
      * It allows you to wait for background images to load, in addition to <img> tags.
      */
    var background: js.UndefOr[Boolean | String] = js.native
    
    /**
      * If set to true, waits for images to load before measuring items and adding them to the Grid.
      * This may be necessary if you don't know the height of your images ahead of time.
      * Powered by imagesLoaded.
      */
    var measureImages: Boolean = js.native
  }
  object MeasureItemsOptions {
    
    @scala.inline
    def apply(measureImages: Boolean): MeasureItemsOptions = {
      val __obj = js.Dynamic.literal(measureImages = measureImages.asInstanceOf[js.Any])
      __obj.asInstanceOf[MeasureItemsOptions]
    }
    
    @scala.inline
    implicit class MeasureItemsOptionsMutableBuilder[Self <: MeasureItemsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: Boolean | String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setMeasureImages(value: Boolean): Self = StObject.set(x, "measureImages", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SpringGridProps extends CommonGridProps {
    
    /**
      * Configuration of the React-Motion spring.
      * See the React-Motion docs for more info. Default: { stiffness: 60, damping: 14, precision: 0.1 }.
      */
    var springConfig: js.UndefOr[js.Any] = js.native
  }
  object SpringGridProps {
    
    @scala.inline
    def apply(columnWidth: Double, columns: Double): SpringGridProps = {
      val __obj = js.Dynamic.literal(columnWidth = columnWidth.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpringGridProps]
    }
    
    @scala.inline
    implicit class SpringGridPropsMutableBuilder[Self <: SpringGridProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSpringConfig(value: js.Any): Self = StObject.set(x, "springConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpringConfigUndefined: Self = StObject.set(x, "springConfig", js.undefined)
    }
  }
}
