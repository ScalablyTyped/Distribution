package typings.progressbarJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.progressbarJs.anon.Typeofutils
import typings.std.Element
import typings.std.SVGPathElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("progressbar.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("progressbar.js", "Circle")
  @js.native
  class Circle ()
    extends typings.progressbarJs.circleMod.^
  @JSImport("progressbar.js", "Circle")
  @js.native
  def Circle: Instantiable0[typings.progressbarJs.circleMod.^] = js.native
  @scala.inline
  def Circle_=(x: Instantiable0[typings.progressbarJs.circleMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Circle")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("progressbar.js", "Line")
  @js.native
  class Line ()
    extends typings.progressbarJs.lineMod.^
  @JSImport("progressbar.js", "Line")
  @js.native
  def Line: Instantiable0[typings.progressbarJs.lineMod.^] = js.native
  @scala.inline
  def Line_=(x: Instantiable0[typings.progressbarJs.lineMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Line")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("progressbar.js", "Path")
  @js.native
  class Path[SElement /* <: Element */] ()
    extends typings.progressbarJs.pathMod.^[SElement] {
    def this(path: String) = this()
    def this(path: /* import warning: RewrittenClass.unapply cls was tparam SElement */ js.Any) = this()
    def this(path: String, options: AnimationOptions) = this()
    def this(
      path: /* import warning: RewrittenClass.unapply cls was tparam SElement */ js.Any,
      options: AnimationOptions
    ) = this()
    def this(path: Null, options: AnimationOptions) = this()
  }
  @JSImport("progressbar.js", "Path")
  @js.native
  def Path: Instantiable2[
    /* path */ (/* import warning: RewrittenClass.unapply cls was tparam SElement */ js.Any) | String | Null, 
    /* options */ js.UndefOr[AnimationOptions], 
    typings.progressbarJs.pathMod.^[Element]
  ] = js.native
  @scala.inline
  def Path_=(
    x: Instantiable2[
      /* path */ (/* import warning: RewrittenClass.unapply cls was tparam SElement */ js.Any) | String | Null, 
      /* options */ js.UndefOr[AnimationOptions], 
      typings.progressbarJs.pathMod.^[Element]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Path")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("progressbar.js", "SemiCircle")
  @js.native
  class SemiCircle ()
    extends typings.progressbarJs.semicircleMod.^
  @JSImport("progressbar.js", "SemiCircle")
  @js.native
  def SemiCircle: Instantiable0[typings.progressbarJs.semicircleMod.^] = js.native
  @scala.inline
  def SemiCircle_=(x: Instantiable0[typings.progressbarJs.semicircleMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SemiCircle")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("progressbar.js", "Shape")
  @js.native
  /**
    * `Line`, `Circle` or `SemiCircle` shaped progress bar. Appends SVG to container.
    * @param container - Element where SVG is added.
    * @param [opts] - Options for path drawing.
    * @see {@link https://progressbarjs.readthedocs.io/en/latest/api/shape/#new-shapecontainer-options}
    */
  class Shape ()
    extends typings.progressbarJs.shapeMod.^ {
    def this(container: String) = this()
    def this(container: SVGPathElement) = this()
    def this(container: String, opts: PathDrawingOptions) = this()
    def this(container: Null, opts: PathDrawingOptions) = this()
    def this(container: SVGPathElement, opts: PathDrawingOptions) = this()
  }
  @JSImport("progressbar.js", "Shape")
  @js.native
  def Shape: Instantiable2[
    /* container */ SVGPathElement | String | Null, 
    /* opts */ js.UndefOr[PathDrawingOptions], 
    typings.progressbarJs.shapeMod.^
  ] = js.native
  @scala.inline
  def Shape_=(
    x: Instantiable2[
      /* container */ SVGPathElement | String | Null, 
      /* opts */ js.UndefOr[PathDrawingOptions], 
      typings.progressbarJs.shapeMod.^
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Shape")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("progressbar.js", "Square")
  @js.native
  class Square ()
    extends typings.progressbarJs.squareMod.^
  @JSImport("progressbar.js", "Square")
  @js.native
  def Square: Instantiable0[typings.progressbarJs.squareMod.^] = js.native
  @scala.inline
  def Square_=(x: Instantiable0[typings.progressbarJs.squareMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Square")(x.asInstanceOf[js.Any])
  
  @JSImport("progressbar.js", "utils")
  @js.native
  def utils: Typeofutils = js.native
  @scala.inline
  def utils_=(x: Typeofutils): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utils")(x.asInstanceOf[js.Any])
  
  @js.native
  trait AnimationOptions extends StObject {
    
    /**
      * Attachment which can be any object
      * you need to modify within the step function.
      * Passed as a parameter to step function.
      */
    var attachement: js.UndefOr[SVGPathElement] = js.native
    
    /**
      * Duration for animation in milliseconds
      * @default 800
      */
    var duration: js.UndefOr[Double] = js.native
    
    /**
      * Easing for animation.
      */
    var easing: js.UndefOr[String] = js.native
    
    var from: js.UndefOr[Color] = js.native
    
    var step: js.UndefOr[StepFunction] = js.native
    
    var to: js.UndefOr[Color] = js.native
  }
  object AnimationOptions {
    
    @scala.inline
    def apply(): AnimationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimationOptions]
    }
    
    @scala.inline
    implicit class AnimationOptionsMutableBuilder[Self <: AnimationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachement(value: SVGPathElement): Self = StObject.set(x, "attachement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachementUndefined: Self = StObject.set(x, "attachement", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setFrom(value: Color): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setStep(
        value: (/* state */ StringDictionary[js.Any], /* path */ typings.progressbarJs.pathMod.^[SVGPathElement], /* attachement */ SVGPathElement) => Unit
      ): Self = StObject.set(x, "step", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setTo(value: Color): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  @js.native
  trait AnimationSupport extends StObject {
    
    /**
      * @param progress - progress from 0 to 1.
      * @param [options] - Animation options. These options override the defaults given in initialization
      * @param [cb] - Callback function which is called after transition ends.
      */
    def animate(progress: Double): Unit = js.native
    def animate(progress: Double, options: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): Unit = js.native
    def animate(progress: Double, options: AnimationOptions): Unit = js.native
    def animate(progress: Double, options: AnimationOptions, cb: js.Function0[Unit]): Unit = js.native
    
    def pause(): Unit = js.native
    
    def resume(): Unit = js.native
    
    /**
      * @param progress = progress from 0 to 1.
      */
    def set(progress: Double): Unit = js.native
    
    /**
      * Stops animation to its current position.
      */
    def stop(): Unit = js.native
    
    /**
      * Returns current shown progress from 0 to 1.
      * This value changes when animation is running.
      */
    def value(): Double = js.native
  }
  
  @js.native
  trait Color extends StObject {
    
    var color: String = js.native
  }
  object Color {
    
    @scala.inline
    def apply(color: String): Color = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options for path drawing
    */
  @js.native
  trait PathDrawingOptions extends AnimationOptions {
    
    /**
      * Stroke color.
      * @default '#3a3a3a'
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * Fill color for the shape. If null, no fill.
      * @default null
      */
    var fill: js.UndefOr[String | Null] = js.native
    
    /**
      * Width of the stroke.
      * Unit is percentage of SVG canvas' size.
      * @desc In Line shape, you should control
      * the stroke width by setting container's height.
      * WARNING: IE doesn't support values over 6, see this bug:
      * @see {@link https://github.com/kimmobrunfeldt/progressbar.js/issues/79}
      * @default 1.0
      */
    var strokeWidth: js.UndefOr[Double] = js.native
    
    /**
      * Inline CSS styles for the created SVG element
      * Set `null` to disable all default styles.
      * You can disable individual defaults by setting them to `null`
      * If you specify anything in this object, none of the default styles apply
      * @default null
      */
    var svgStyle: js.UndefOr[SvgInlineStyle | Null] = js.native
    
    /**
      *  Text element is a <p> element appended to container
      * You can add CSS rules for the text element with the className
      * NOTE: When text is set, 'position: relative' will be set to the container for centering.
      * You can also prevent all default inline styles with 'text.style: null'
      * @default null
      */
    var text: js.UndefOr[TextOptions | Null] = js.native
    
    /**
      * If trail options are not defined, trail won't be drawn
      * Color for lighter trail stroke underneath the actual progress path.
      * @default '#eee'
      */
    var trailColor: js.UndefOr[String] = js.native
    
    /**
      * Width of the trail stroke.
      * Trail is always centered relative to actual progress path.
      * @default 1.0
      */
    var trailWidth: js.UndefOr[Double] = js.native
    
    /**
      * If true, some useful console.warn calls will be done if it seems
      * that progressbar is used incorrectly
      * @default false
      */
    var warnings: js.UndefOr[Boolean] = js.native
  }
  object PathDrawingOptions {
    
    @scala.inline
    def apply(): PathDrawingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathDrawingOptions]
    }
    
    @scala.inline
    implicit class PathDrawingOptionsMutableBuilder[Self <: PathDrawingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillNull: Self = StObject.set(x, "fill", null)
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setSvgStyle(value: SvgInlineStyle): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgStyleNull: Self = StObject.set(x, "svgStyle", null)
      
      @scala.inline
      def setSvgStyleUndefined: Self = StObject.set(x, "svgStyle", js.undefined)
      
      @scala.inline
      def setText(value: TextOptions): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextNull: Self = StObject.set(x, "text", null)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTrailColor(value: String): Self = StObject.set(x, "trailColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailColorUndefined: Self = StObject.set(x, "trailColor", js.undefined)
      
      @scala.inline
      def setTrailWidth(value: Double): Self = StObject.set(x, "trailWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailWidthUndefined: Self = StObject.set(x, "trailWidth", js.undefined)
      
      @scala.inline
      def setWarnings(value: Boolean): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    }
  }
  
  type StepFunction = js.Function3[
    /* state */ StringDictionary[js.Any], 
    /* path */ typings.progressbarJs.pathMod.^[SVGPathElement], 
    /* attachement */ SVGPathElement, 
    Unit
  ]
  
  /** Inline CSS styles for the created SVG element */
  type SvgInlineStyle = StringDictionary[js.Any | Null]
  
  type SvgSelector = SVGPathElement | String
  
  /** Inline CSS styles for the text element */
  type TextInlineStyle = StringDictionary[js.Any]
  
  @js.native
  trait TextOptions extends StObject {
    
    /**
      * Only effective if the shape is SemiCircle.
      * If true, baseline for text is aligned with bottom of the SVG canvas.
      * If false, bottom line of SVG canvas is in the center of text.
      * @default true
      */
    var alignToBottom: js.UndefOr[Boolean] = js.native
    
    /**
      * Only effective if the `text.style` is not `null`.
      * By default `position: relative` is applied to container if text is set.
      * Setting this to false disables that feature.
      * @default true
      */
    var autoStyleContainer: js.UndefOr[Boolean] = js.native
    
    /**
      * Class name for text element.
      * @default 'progressbar-text'
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Inline CSS styles for the text element.
      * If you want to modify all CSS your self, set null to disable all default styles.
      * If the style option contains values, container is automatically
      * set to position: relative. You can disable behavior this with `autoStyleContainer: false`
      * If you specify anything in this object, none of the default styles apply.
      */
    var style: js.UndefOr[TextInlineStyle | Null] = js.native
    
    /**
      * Initial value for text.
      * @default null
      */
    var value: js.UndefOr[String | Null] = js.native
  }
  object TextOptions {
    
    @scala.inline
    def apply(): TextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextOptions]
    }
    
    @scala.inline
    implicit class TextOptionsMutableBuilder[Self <: TextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignToBottom(value: Boolean): Self = StObject.set(x, "alignToBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignToBottomUndefined: Self = StObject.set(x, "alignToBottom", js.undefined)
      
      @scala.inline
      def setAutoStyleContainer(value: Boolean): Self = StObject.set(x, "autoStyleContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoStyleContainerUndefined: Self = StObject.set(x, "autoStyleContainer", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setStyle(value: TextInlineStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
