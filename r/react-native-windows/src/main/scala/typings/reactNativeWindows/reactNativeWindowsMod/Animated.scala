package typings.reactNativeWindows.reactNativeWindowsMod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.ComponentType
import typings.reactNativeWindows.anon.TypeofImage
import typings.reactNativeWindows.anon.Typeof_View
import typings.reactNativeWindows.anon.Y
import typings.reactNativeWindows.rntypesMod.Animated.AnimatedComponent
import typings.reactNativeWindows.rntypesMod.Animated.AnimatedComponentOptions
import typings.reactNativeWindows.rntypesMod.Animated.AnimatedProps
import typings.reactNativeWindows.rntypesMod.Animated.AnimatedValue
import typings.reactNativeWindows.rntypesMod.Animated.AnimatedValueXY
import typings.reactNativeWindows.rntypesMod.Animated.CompositeAnimation
import typings.reactNativeWindows.rntypesMod.Animated.DecayAnimationConfig
import typings.reactNativeWindows.rntypesMod.Animated.EventConfig
import typings.reactNativeWindows.rntypesMod.Animated.LoopAnimationConfig
import typings.reactNativeWindows.rntypesMod.Animated.Mapping
import typings.reactNativeWindows.rntypesMod.Animated.ParallelConfig
import typings.reactNativeWindows.rntypesMod.Animated.SpringAnimationConfig
import typings.reactNativeWindows.rntypesMod.Animated.TimingAnimationConfig
import typings.reactNativeWindows.rntypesMod.FlatListProps
import typings.reactNativeWindows.rntypesMod.SectionListProps
import typings.reactNativeWindows.rntypesMod._ScrollView
import typings.reactNativeWindows.rntypesMod._Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Animated {
  
  @JSImport("react-native-windows", "Animated")
  @js.native
  val ^ : js.Any = js.native
  @JSImport("react-native-windows", "Animated.Animated")
  @js.native
  open class Animated ()
    extends typings.reactNativeWindows.rntypesMod.Animated.Animated
  
  @JSImport("react-native-windows", "Animated.AnimatedAddition")
  @js.native
  open class AnimatedAddition ()
    extends typings.reactNativeWindows.rntypesMod.Animated.AnimatedAddition
  
  @JSImport("react-native-windows", "Animated.AnimatedDiffClamp")
  @js.native
  open class AnimatedDiffClamp ()
    extends typings.reactNativeWindows.rntypesMod.Animated.AnimatedDiffClamp
  
  @JSImport("react-native-windows", "Animated.AnimatedDivision")
  @js.native
  open class AnimatedDivision ()
    extends typings.reactNativeWindows.rntypesMod.Animated.AnimatedDivision
  
  @JSImport("react-native-windows", "Animated.AnimatedInterpolation")
  @js.native
  open class AnimatedInterpolation ()
    extends typings.reactNativeWindows.rntypesMod.Animated.AnimatedInterpolation
  
  @JSImport("react-native-windows", "Animated.AnimatedModulo")
  @js.native
  open class AnimatedModulo ()
    extends typings.reactNativeWindows.rntypesMod.Animated.AnimatedModulo
  
  @JSImport("react-native-windows", "Animated.AnimatedMultiplication")
  @js.native
  open class AnimatedMultiplication ()
    extends typings.reactNativeWindows.rntypesMod.Animated.AnimatedMultiplication
  
  @JSImport("react-native-windows", "Animated.AnimatedNode")
  @js.native
  open class AnimatedNode ()
    extends typings.reactNativeWindows.rntypesMod.Animated.AnimatedNode
  
  @JSImport("react-native-windows", "Animated.AnimatedSubtraction")
  @js.native
  open class AnimatedSubtraction ()
    extends typings.reactNativeWindows.rntypesMod.Animated.AnimatedSubtraction
  
  @JSImport("react-native-windows", "Animated.AnimatedWithChildren")
  @js.native
  open class AnimatedWithChildren ()
    extends typings.reactNativeWindows.rntypesMod.Animated.AnimatedWithChildren
  
  @JSImport("react-native-windows", "Animated.FlatList")
  @js.native
  open class FlatList[ItemT] protected ()
    extends typings.reactNativeWindows.rntypesMod.Animated.FlatList[ItemT] {
    def this(props: AnimatedProps[FlatListProps[ItemT]]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AnimatedProps[FlatListProps[ItemT]], context: Any) = this()
  }
  
  @JSImport("react-native-windows", "Animated.Image")
  @js.native
  val Image: AnimatedComponent[TypeofImage] = js.native
  
  @JSImport("react-native-windows", "Animated.ScrollView")
  @js.native
  val ScrollView: AnimatedComponent[Instantiable0[_ScrollView]] = js.native
  
  @JSImport("react-native-windows", "Animated.SectionList")
  @js.native
  open class SectionList[ItemT, SectionT] protected ()
    extends typings.reactNativeWindows.rntypesMod.Animated.SectionList[ItemT, SectionT] {
    def this(props: AnimatedProps[SectionListProps[ItemT, SectionT]]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AnimatedProps[SectionListProps[ItemT, SectionT]], context: Any) = this()
  }
  
  @JSImport("react-native-windows", "Animated.Text")
  @js.native
  val Text: AnimatedComponent[Instantiable0[_Text]] = js.native
  
  @JSImport("react-native-windows", "Animated.Value")
  @js.native
  open class Value protected ()
    extends typings.reactNativeWindows.rntypesMod.Animated.Value {
    def this(value: Double) = this()
  }
  
  @JSImport("react-native-windows", "Animated.ValueXY")
  @js.native
  open class ValueXY ()
    extends typings.reactNativeWindows.rntypesMod.Animated.ValueXY {
    def this(valueIn: Y) = this()
  }
  
  @JSImport("react-native-windows", "Animated.View")
  @js.native
  val View: AnimatedComponent[Typeof_View] = js.native
  
  inline def add(
    a: typings.reactNativeWindows.rntypesMod.Animated.Animated,
    b: typings.reactNativeWindows.rntypesMod.Animated.Animated
  ): typings.reactNativeWindows.rntypesMod.Animated.AnimatedAddition = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeWindows.rntypesMod.Animated.AnimatedAddition]
  
  inline def createAnimatedComponent[T /* <: ComponentType[Any] */](component: T): AnimatedComponent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedComponent")(component.asInstanceOf[js.Any]).asInstanceOf[AnimatedComponent[T]]
  inline def createAnimatedComponent[T /* <: ComponentType[Any] */](component: T, options: AnimatedComponentOptions): AnimatedComponent[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedComponent")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimatedComponent[T]]
  
  inline def decay(value: AnimatedValueXY, config: DecayAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("decay")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
  inline def decay(value: AnimatedValue, config: DecayAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("decay")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
  
  inline def delay(time: Double): CompositeAnimation = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(time.asInstanceOf[js.Any]).asInstanceOf[CompositeAnimation]
  
  inline def diffClamp(a: typings.reactNativeWindows.rntypesMod.Animated.Animated, min: Double, max: Double): typings.reactNativeWindows.rntypesMod.Animated.AnimatedDiffClamp = (^.asInstanceOf[js.Dynamic].applyDynamic("diffClamp")(a.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeWindows.rntypesMod.Animated.AnimatedDiffClamp]
  
  inline def divide(
    a: typings.reactNativeWindows.rntypesMod.Animated.Animated,
    b: typings.reactNativeWindows.rntypesMod.Animated.Animated
  ): typings.reactNativeWindows.rntypesMod.Animated.AnimatedDivision = (^.asInstanceOf[js.Dynamic].applyDynamic("divide")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeWindows.rntypesMod.Animated.AnimatedDivision]
  
  inline def event[T](argMapping: js.Array[Mapping | Null]): js.Function1[/* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("event")(argMapping.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  inline def event[T](argMapping: js.Array[Mapping | Null], config: EventConfig[T]): js.Function1[/* repeated */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("event")(argMapping.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  
  inline def loop(animation: CompositeAnimation): CompositeAnimation = ^.asInstanceOf[js.Dynamic].applyDynamic("loop")(animation.asInstanceOf[js.Any]).asInstanceOf[CompositeAnimation]
  inline def loop(animation: CompositeAnimation, config: LoopAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("loop")(animation.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
  
  inline def modulo(a: typings.reactNativeWindows.rntypesMod.Animated.Animated, modulus: Double): typings.reactNativeWindows.rntypesMod.Animated.AnimatedModulo = (^.asInstanceOf[js.Dynamic].applyDynamic("modulo")(a.asInstanceOf[js.Any], modulus.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeWindows.rntypesMod.Animated.AnimatedModulo]
  
  inline def multiply(
    a: typings.reactNativeWindows.rntypesMod.Animated.Animated,
    b: typings.reactNativeWindows.rntypesMod.Animated.Animated
  ): typings.reactNativeWindows.rntypesMod.Animated.AnimatedMultiplication = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeWindows.rntypesMod.Animated.AnimatedMultiplication]
  
  inline def parallel(animations: js.Array[CompositeAnimation]): CompositeAnimation = ^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(animations.asInstanceOf[js.Any]).asInstanceOf[CompositeAnimation]
  inline def parallel(animations: js.Array[CompositeAnimation], config: ParallelConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(animations.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
  
  inline def sequence(animations: js.Array[CompositeAnimation]): CompositeAnimation = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(animations.asInstanceOf[js.Any]).asInstanceOf[CompositeAnimation]
  
  inline def spring(value: AnimatedValueXY, config: SpringAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("spring")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
  inline def spring(value: AnimatedValue, config: SpringAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("spring")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
  
  inline def stagger(time: Double, animations: js.Array[CompositeAnimation]): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(time.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
  
  inline def subtract(
    a: typings.reactNativeWindows.rntypesMod.Animated.Animated,
    b: typings.reactNativeWindows.rntypesMod.Animated.Animated
  ): typings.reactNativeWindows.rntypesMod.Animated.AnimatedSubtraction = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeWindows.rntypesMod.Animated.AnimatedSubtraction]
  
  inline def timing(value: AnimatedValueXY, config: TimingAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
  inline def timing(value: AnimatedValue, config: TimingAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
}
