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
  
  inline def spring(`val`: Double): OpaqueConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("spring")(`val`.asInstanceOf[js.Any]).asInstanceOf[OpaqueConfig]
  inline def spring(`val`: Double, config: SpringHelperConfig): OpaqueConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("spring")(`val`.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[OpaqueConfig]
  
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
    
    inline def apply(style: Style): MotionProps = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[MotionProps]
    }
    
    extension [Self <: MotionProps](x: Self) {
      
      inline def setChildren(value: /* interpolatedStyle */ PlainStyle => Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultStyle(value: PlainStyle): Self = StObject.set(x, "defaultStyle", value.asInstanceOf[js.Any])
      
      inline def setDefaultStyleUndefined: Self = StObject.set(x, "defaultStyle", js.undefined)
      
      inline def setOnRest(value: () => Unit): Self = StObject.set(x, "onRest", js.Any.fromFunction0(value))
      
      inline def setOnRestUndefined: Self = StObject.set(x, "onRest", js.undefined)
      
      inline def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpaqueConfig extends StObject {
    
    var damping: Double
    
    var precision: Double
    
    var stiffness: Double
    
    var `val`: Double
  }
  object OpaqueConfig {
    
    inline def apply(damping: Double, precision: Double, stiffness: Double, `val`: Double): OpaqueConfig = {
      val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], stiffness = stiffness.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpaqueConfig]
    }
    
    extension [Self <: OpaqueConfig](x: Self) {
      
      inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
      
      inline def setVal(value: Double): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
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
    
    inline def apply(): SpringHelperConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpringHelperConfig]
    }
    
    extension [Self <: SpringHelperConfig](x: Self) {
      
      inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      inline def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
      
      inline def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
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
    
    inline def apply(key: String, style: PlainStyle): TransitionPlainStyle = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionPlainStyle]
    }
    
    extension [Self <: TransitionPlainStyle](x: Self) {
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: PlainStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
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
    
    inline def apply(styles: js.Array[TransitionStyle] | InterpolateFunction): TransitionProps = {
      val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionProps]
    }
    
    extension [Self <: TransitionProps](x: Self) {
      
      inline def setChildren(value: /* interpolatedStyles */ js.Array[TransitionPlainStyle] => Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultStyles(value: js.Array[TransitionPlainStyle]): Self = StObject.set(x, "defaultStyles", value.asInstanceOf[js.Any])
      
      inline def setDefaultStylesUndefined: Self = StObject.set(x, "defaultStyles", js.undefined)
      
      inline def setDefaultStylesVarargs(value: TransitionPlainStyle*): Self = StObject.set(x, "defaultStyles", js.Array(value :_*))
      
      inline def setDidLeave(value: /* styleThatLeft */ TransitionStyle => Unit): Self = StObject.set(x, "didLeave", js.Any.fromFunction1(value))
      
      inline def setDidLeaveUndefined: Self = StObject.set(x, "didLeave", js.undefined)
      
      inline def setStyles(value: js.Array[TransitionStyle] | InterpolateFunction): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(
        value: /* previousInterpolatedStyles */ js.UndefOr[js.Array[TransitionPlainStyle]] => js.Array[TransitionStyle]
      ): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesVarargs(value: TransitionStyle*): Self = StObject.set(x, "styles", js.Array(value :_*))
      
      inline def setWillEnter(value: /* styleThatEntered */ TransitionStyle => PlainStyle): Self = StObject.set(x, "willEnter", js.Any.fromFunction1(value))
      
      inline def setWillEnterUndefined: Self = StObject.set(x, "willEnter", js.undefined)
      
      inline def setWillLeave(value: /* styleThatLeft */ TransitionStyle => Style | Unit): Self = StObject.set(x, "willLeave", js.Any.fromFunction1(value))
      
      inline def setWillLeaveUndefined: Self = StObject.set(x, "willLeave", js.undefined)
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
    
    inline def apply(key: String, style: Style): TransitionStyle = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionStyle]
    }
    
    extension [Self <: TransitionStyle](x: Self) {
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  type Velocity = StringDictionary[Double]
}
