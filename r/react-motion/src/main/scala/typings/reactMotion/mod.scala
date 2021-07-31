package typings.reactMotion

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-motion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-motion", "Motion")
  @js.native
  class Motion protected ()
    extends Component[MotionProps, js.Object, js.Any] {
    def this(props: MotionProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MotionProps, context: js.Any) = this()
  }
  
  @JSImport("react-motion", "Presets")
  @js.native
  class Presets_ () extends StObject {
    
    // the default, if nothing provided
    var gentle: OpaqueConfig = js.native
    
    var noWobble: OpaqueConfig = js.native
    
    var stiff: OpaqueConfig = js.native
    
    var wobbly: OpaqueConfig = js.native
  }
  
  @JSImport("react-motion", "StaggeredMotion")
  @js.native
  class StaggeredMotion protected ()
    extends Component[StaggeredMotionProps, js.Object, js.Any] {
    def this(props: StaggeredMotionProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StaggeredMotionProps, context: js.Any) = this()
  }
  
  @JSImport("react-motion", "TransitionMotion")
  @js.native
  class TransitionMotion protected ()
    extends Component[TransitionProps, js.Object, js.Any] {
    def this(props: TransitionProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TransitionProps, context: js.Any) = this()
  }
  
  @JSImport("react-motion", "presets")
  @js.native
  val presets: Presets_ = js.native
  
  @scala.inline
  def spring(`val`: Double): OpaqueConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("spring")(`val`.asInstanceOf[js.Any]).asInstanceOf[OpaqueConfig]
  @scala.inline
  def spring(`val`: Double, config: SpringHelperConfig): OpaqueConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("spring")(`val`.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[OpaqueConfig]
  
  type InterpolateFunction = js.Function1[
    /* previousInterpolatedStyles */ js.UndefOr[js.Array[TransitionPlainStyle]], 
    js.Array[TransitionStyle]
  ]
  
  /**
    * <Motion/> properties
    */
  trait MotionProps extends StObject {
    
    /**
      * Callback with your interpolated styles. Must return one react element to render
      * @param interpolatedStyle
      */
    var children: js.UndefOr[js.Function1[/* interpolatedStyle */ PlainStyle, Element]] = js.undefined
    
    /**
      * The default style. Being ignored on subsequent renders
      * @default Object with same keys as in style whose values are the initial numbers you're interpolating on
      */
    var defaultStyle: js.UndefOr[PlainStyle] = js.undefined
    
    /**
      * The callback that fires when the animation comes to a rest.
      */
    var onRest: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Object that maps to either number or opaque config returned by spring().
      * Must keep same keys throughout component's existence
      */
    var style: Style
  }
  object MotionProps {
    
    @scala.inline
    def apply(style: Style): MotionProps = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[MotionProps]
    }
    
    @scala.inline
    implicit class MotionPropsMutableBuilder[Self <: MotionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: /* interpolatedStyle */ PlainStyle => Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDefaultStyle(value: PlainStyle): Self = StObject.set(x, "defaultStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultStyleUndefined: Self = StObject.set(x, "defaultStyle", js.undefined)
      
      @scala.inline
      def setOnRest(value: () => Unit): Self = StObject.set(x, "onRest", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRestUndefined: Self = StObject.set(x, "onRest", js.undefined)
      
      @scala.inline
      def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpaqueConfig extends StObject {
    
    var damping: Double
    
    var precision: Double
    
    var stiffness: Double
    
    var `val`: Double
  }
  object OpaqueConfig {
    
    @scala.inline
    def apply(damping: Double, precision: Double, stiffness: Double, `val`: Double): OpaqueConfig = {
      val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], stiffness = stiffness.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpaqueConfig]
    }
    
    @scala.inline
    implicit class OpaqueConfigMutableBuilder[Self <: OpaqueConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVal(value: Double): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
  
  type PlainStyle = StringDictionary[Double]
  
  /**
    * Spring additional configuration
    */
  trait SpringHelperConfig extends StObject {
    
    /**
      * Specifies damping
      * @defaults 26
      */
    var damping: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies both the rounding of the interpolated value and the speed (internal).
      * @defaults 0.01
      */
    var precision: js.UndefOr[Double] = js.undefined
    
    /**
      * Specified stiffness
      * @defaults 170
      */
    var stiffness: js.UndefOr[Double] = js.undefined
  }
  object SpringHelperConfig {
    
    @scala.inline
    def apply(): SpringHelperConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpringHelperConfig]
    }
    
    @scala.inline
    implicit class SpringHelperConfigMutableBuilder[Self <: SpringHelperConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
    }
  }
  
  @js.native
  trait StaggeredMotionProps extends StObject {
    
    /**
      * Default styles
      */
    var defaultStyles: js.UndefOr[js.Array[PlainStyle]] = js.native
    
    /**
      * Styles to interpolate
      * @param previousInterpolatedStyles The previously interpolating (array of) styles (undefined at first render, unless defaultStyles is provided).
      */
    def styles(): js.Array[Style] = js.native
    def styles(previousInterpolatedStyles: js.Array[PlainStyle]): js.Array[Style] = js.native
  }
  
  type Style = StringDictionary[Double | OpaqueConfig]
  
  /**
    * Default style for transition
    */
  trait TransitionPlainStyle extends StObject {
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var key: String
    
    // same as TransitionStyle, passed as argument to style/children function
    var style: PlainStyle
  }
  object TransitionPlainStyle {
    
    @scala.inline
    def apply(key: String, style: PlainStyle): TransitionPlainStyle = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionPlainStyle]
    }
    
    @scala.inline
    implicit class TransitionPlainStyleMutableBuilder[Self <: TransitionPlainStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: PlainStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Transition properties
    */
  trait TransitionProps extends StObject {
    
    var children: js.UndefOr[js.Function1[/* interpolatedStyles */ js.Array[TransitionPlainStyle], Element]] = js.undefined
    
    /**
      * Default styles on first render
      */
    var defaultStyles: js.UndefOr[js.Array[TransitionPlainStyle]] = js.undefined
    
    /**
      * Triggers when an element has disappeared
      * @param styleThatLeft
      */
    var didLeave: js.UndefOr[js.Function1[/* styleThatLeft */ TransitionStyle, Unit]] = js.undefined
    
    /**
      * Styles to interpolate. Accepts array of TransitionStyle objects or interpolated function similar as for
      * <StaggeredMotion/>
      */
    var styles: js.Array[TransitionStyle] | InterpolateFunction
    
    /**
      * Triggers when a new element will appear
      * @param styleThatEntered
      */
    var willEnter: js.UndefOr[js.Function1[/* styleThatEntered */ TransitionStyle, PlainStyle]] = js.undefined
    
    /**
      * Triggers when an element will disappear
      * @param styleThatLeft
      */
    var willLeave: js.UndefOr[js.Function1[/* styleThatLeft */ TransitionStyle, Style | Unit]] = js.undefined
  }
  object TransitionProps {
    
    @scala.inline
    def apply(styles: js.Array[TransitionStyle] | InterpolateFunction): TransitionProps = {
      val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionProps]
    }
    
    @scala.inline
    implicit class TransitionPropsMutableBuilder[Self <: TransitionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: /* interpolatedStyles */ js.Array[TransitionPlainStyle] => Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDefaultStyles(value: js.Array[TransitionPlainStyle]): Self = StObject.set(x, "defaultStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultStylesUndefined: Self = StObject.set(x, "defaultStyles", js.undefined)
      
      @scala.inline
      def setDefaultStylesVarargs(value: TransitionPlainStyle*): Self = StObject.set(x, "defaultStyles", js.Array(value :_*))
      
      @scala.inline
      def setDidLeave(value: /* styleThatLeft */ TransitionStyle => Unit): Self = StObject.set(x, "didLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDidLeaveUndefined: Self = StObject.set(x, "didLeave", js.undefined)
      
      @scala.inline
      def setStyles(value: js.Array[TransitionStyle] | InterpolateFunction): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(
        value: /* previousInterpolatedStyles */ js.UndefOr[js.Array[TransitionPlainStyle]] => js.Array[TransitionStyle]
      ): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesVarargs(value: TransitionStyle*): Self = StObject.set(x, "styles", js.Array(value :_*))
      
      @scala.inline
      def setWillEnter(value: /* styleThatEntered */ TransitionStyle => PlainStyle): Self = StObject.set(x, "willEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWillEnterUndefined: Self = StObject.set(x, "willEnter", js.undefined)
      
      @scala.inline
      def setWillLeave(value: /* styleThatLeft */ TransitionStyle => Style | Unit): Self = StObject.set(x, "willLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWillLeaveUndefined: Self = StObject.set(x, "willLeave", js.undefined)
    }
  }
  
  // === TransitionMotion ===
  trait TransitionStyle extends StObject {
    
    /**
      * Anything you'd like to carry along. Will be preserved on re-renders until key off
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /**
      * The ID that TransitionMotion uses to track which configuration is which across renders, even when things are reordered.
      * Typically reused as the component key when you map over the interpolated styles.
      */
    var key: String
    
    /**
      * Actual starting style configuration
      */
    var style: Style
  }
  object TransitionStyle {
    
    @scala.inline
    def apply(key: String, style: Style): TransitionStyle = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionStyle]
    }
    
    @scala.inline
    implicit class TransitionStyleMutableBuilder[Self <: TransitionStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  type Velocity = StringDictionary[Double]
}
