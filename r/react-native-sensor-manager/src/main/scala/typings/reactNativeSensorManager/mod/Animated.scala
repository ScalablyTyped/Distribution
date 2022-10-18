package typings.reactNativeSensorManager.mod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.ComponentType
import typings.reactNative.anon.TypeofImage
import typings.reactNative.anon.Typeof_View
import typings.reactNative.anon.Y
import typings.reactNative.mod.Animated.AnimatedComponent
import typings.reactNative.mod.Animated.AnimatedComponentOptions
import typings.reactNative.mod.Animated.AnimatedConfig
import typings.reactNative.mod.Animated.AnimatedProps
import typings.reactNative.mod.Animated.AnimatedValue
import typings.reactNative.mod.Animated.AnimatedValueXY
import typings.reactNative.mod.Animated.CompositeAnimation
import typings.reactNative.mod.Animated.DecayAnimationConfig
import typings.reactNative.mod.Animated.EventConfig
import typings.reactNative.mod.Animated.LoopAnimationConfig
import typings.reactNative.mod.Animated.Mapping
import typings.reactNative.mod.Animated.ParallelConfig
import typings.reactNative.mod.Animated.RgbaAnimatedValue
import typings.reactNative.mod.Animated.RgbaValue
import typings.reactNative.mod.Animated.SpringAnimationConfig
import typings.reactNative.mod.Animated.TimingAnimationConfig
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.FlatListProps
import typings.reactNative.mod.SectionListProps
import typings.reactNative.mod._ScrollView
import typings.reactNative.mod._Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Animated {
  
  @JSImport("react-native-sensor-manager", "Animated")
  @js.native
  val ^ : js.Any = js.native
  @JSImport("react-native-sensor-manager", "Animated.Animated")
  @js.native
  open class Animated ()
    extends typings.reactNative.mod.Animated.Animated
  
  @JSImport("react-native-sensor-manager", "Animated.AnimatedAddition")
  @js.native
  open class AnimatedAddition[OutputT /* <: Double | String */] ()
    extends typings.reactNative.mod.Animated.AnimatedAddition[OutputT]
  
  @JSImport("react-native-sensor-manager", "Animated.AnimatedColor")
  @js.native
  open class AnimatedColor ()
    extends typings.reactNative.mod.Animated.AnimatedColor {
    def this(valueIn: RgbaAnimatedValue) = this()
    def this(valueIn: RgbaValue) = this()
    def this(valueIn: ColorValue) = this()
    def this(valueIn: Null, config: AnimatedConfig) = this()
    def this(valueIn: Unit, config: AnimatedConfig) = this()
    def this(valueIn: RgbaAnimatedValue, config: AnimatedConfig) = this()
    def this(valueIn: RgbaValue, config: AnimatedConfig) = this()
    def this(valueIn: ColorValue, config: AnimatedConfig) = this()
  }
  
  @JSImport("react-native-sensor-manager", "Animated.AnimatedDiffClamp")
  @js.native
  open class AnimatedDiffClamp[OutputT /* <: Double | String */] ()
    extends typings.reactNative.mod.Animated.AnimatedDiffClamp[OutputT]
  
  @JSImport("react-native-sensor-manager", "Animated.AnimatedDivision")
  @js.native
  open class AnimatedDivision[OutputT /* <: Double | String */] ()
    extends typings.reactNative.mod.Animated.AnimatedDivision[OutputT]
  
  @JSImport("react-native-sensor-manager", "Animated.AnimatedInterpolation")
  @js.native
  open class AnimatedInterpolation[OutputT /* <: Double | String */] ()
    extends typings.reactNative.mod.Animated.AnimatedInterpolation[OutputT]
  
  @JSImport("react-native-sensor-manager", "Animated.AnimatedModulo")
  @js.native
  open class AnimatedModulo[OutputT /* <: Double | String */] ()
    extends typings.reactNative.mod.Animated.AnimatedModulo[OutputT]
  
  @JSImport("react-native-sensor-manager", "Animated.AnimatedMultiplication")
  @js.native
  open class AnimatedMultiplication[OutputT /* <: Double | String */] ()
    extends typings.reactNative.mod.Animated.AnimatedMultiplication[OutputT]
  
  @JSImport("react-native-sensor-manager", "Animated.AnimatedNode")
  @js.native
  open class AnimatedNode ()
    extends typings.reactNative.mod.Animated.AnimatedNode
  
  @JSImport("react-native-sensor-manager", "Animated.AnimatedSubtraction")
  @js.native
  open class AnimatedSubtraction[OutputT /* <: Double | String */] ()
    extends typings.reactNative.mod.Animated.AnimatedSubtraction[OutputT]
  
  @JSImport("react-native-sensor-manager", "Animated.AnimatedWithChildren")
  @js.native
  open class AnimatedWithChildren ()
    extends typings.reactNative.mod.Animated.AnimatedWithChildren
  
  @JSImport("react-native-sensor-manager", "Animated.FlatList")
  @js.native
  open class FlatList[ItemT] protected ()
    extends typings.reactNative.mod.Animated.FlatList[ItemT] {
    def this(props: AnimatedProps[FlatListProps[ItemT]]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AnimatedProps[FlatListProps[ItemT]], context: Any) = this()
  }
  
  @JSImport("react-native-sensor-manager", "Animated.Image")
  @js.native
  val Image: AnimatedComponent[TypeofImage] = js.native
  
  @JSImport("react-native-sensor-manager", "Animated.ScrollView")
  @js.native
  val ScrollView: AnimatedComponent[Instantiable0[_ScrollView]] = js.native
  
  @JSImport("react-native-sensor-manager", "Animated.SectionList")
  @js.native
  open class SectionList[ItemT, SectionT] protected ()
    extends typings.reactNative.mod.Animated.SectionList[ItemT, SectionT] {
    def this(props: AnimatedProps[SectionListProps[ItemT, SectionT]]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AnimatedProps[SectionListProps[ItemT, SectionT]], context: Any) = this()
  }
  
  @JSImport("react-native-sensor-manager", "Animated.Text")
  @js.native
  val Text: AnimatedComponent[Instantiable0[_Text]] = js.native
  
  @JSImport("react-native-sensor-manager", "Animated.Value")
  @js.native
  open class Value protected ()
    extends typings.reactNative.mod.Animated.Value {
    def this(value: Double) = this()
    def this(value: Double, config: AnimatedConfig) = this()
  }
  
  @JSImport("react-native-sensor-manager", "Animated.ValueXY")
  @js.native
  open class ValueXY ()
    extends typings.reactNative.mod.Animated.ValueXY {
    def this(valueIn: Y) = this()
    def this(valueIn: Unit, config: AnimatedConfig) = this()
    def this(valueIn: Y, config: AnimatedConfig) = this()
  }
  
  @JSImport("react-native-sensor-manager", "Animated.View")
  @js.native
  val View: AnimatedComponent[Typeof_View] = js.native
  
  inline def add[OutputT /* <: Double | String */](a: typings.reactNative.mod.Animated.Animated, b: typings.reactNative.mod.Animated.Animated): typings.reactNative.mod.Animated.AnimatedAddition[OutputT] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.AnimatedAddition[OutputT]]
  
  inline def createAnimatedComponent[T /* <: ComponentType[Any] */](component: T): AnimatedComponent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedComponent")(component.asInstanceOf[js.Any]).asInstanceOf[AnimatedComponent[T]]
  inline def createAnimatedComponent[T /* <: ComponentType[Any] */](component: T, options: AnimatedComponentOptions): AnimatedComponent[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedComponent")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimatedComponent[T]]
  
  inline def decay(value: AnimatedValueXY, config: DecayAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("decay")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
  inline def decay(value: AnimatedValue, config: DecayAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("decay")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
  
  inline def delay(time: Double): CompositeAnimation = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(time.asInstanceOf[js.Any]).asInstanceOf[CompositeAnimation]
  
  inline def diffClamp[OutputT /* <: Double | String */](a: typings.reactNative.mod.Animated.Animated, min: Double, max: Double): typings.reactNative.mod.Animated.AnimatedDiffClamp[OutputT] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffClamp")(a.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.AnimatedDiffClamp[OutputT]]
  
  inline def divide[OutputT /* <: Double | String */](a: typings.reactNative.mod.Animated.Animated, b: typings.reactNative.mod.Animated.Animated): typings.reactNative.mod.Animated.AnimatedDivision[OutputT] = (^.asInstanceOf[js.Dynamic].applyDynamic("divide")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.AnimatedDivision[OutputT]]
  
  inline def event[T](argMapping: js.Array[Mapping | Null]): js.Function1[/* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("event")(argMapping.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  inline def event[T](argMapping: js.Array[Mapping | Null], config: EventConfig[T]): js.Function1[/* repeated */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("event")(argMapping.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  
  inline def loop(animation: CompositeAnimation): CompositeAnimation = ^.asInstanceOf[js.Dynamic].applyDynamic("loop")(animation.asInstanceOf[js.Any]).asInstanceOf[CompositeAnimation]
  inline def loop(animation: CompositeAnimation, config: LoopAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("loop")(animation.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
  
  inline def modulo[OutputT /* <: Double | String */](a: typings.reactNative.mod.Animated.Animated, modulus: Double): typings.reactNative.mod.Animated.AnimatedModulo[OutputT] = (^.asInstanceOf[js.Dynamic].applyDynamic("modulo")(a.asInstanceOf[js.Any], modulus.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.AnimatedModulo[OutputT]]
  
  inline def multiply[OutputT /* <: Double | String */](a: typings.reactNative.mod.Animated.Animated, b: typings.reactNative.mod.Animated.Animated): typings.reactNative.mod.Animated.AnimatedMultiplication[OutputT] = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.AnimatedMultiplication[OutputT]]
  
  inline def parallel(animations: js.Array[CompositeAnimation]): CompositeAnimation = ^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(animations.asInstanceOf[js.Any]).asInstanceOf[CompositeAnimation]
  inline def parallel(animations: js.Array[CompositeAnimation], config: ParallelConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(animations.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
  
  inline def sequence(animations: js.Array[CompositeAnimation]): CompositeAnimation = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(animations.asInstanceOf[js.Any]).asInstanceOf[CompositeAnimation]
  
  inline def spring(value: AnimatedValueXY, config: SpringAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("spring")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
  inline def spring(value: AnimatedValue, config: SpringAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("spring")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
  
  inline def stagger(time: Double, animations: js.Array[CompositeAnimation]): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(time.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
  
  inline def subtract[OutputT /* <: Double | String */](a: typings.reactNative.mod.Animated.Animated, b: typings.reactNative.mod.Animated.Animated): typings.reactNative.mod.Animated.AnimatedSubtraction[OutputT] = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.AnimatedSubtraction[OutputT]]
  
  inline def timing(value: AnimatedValueXY, config: TimingAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
  inline def timing(value: AnimatedValue, config: TimingAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
}
