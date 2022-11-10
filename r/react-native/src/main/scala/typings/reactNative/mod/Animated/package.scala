package typings.reactNative.mod.Animated

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ComponentType
import typings.react.mod.FC
import typings.reactNative.anon.TypeofImage
import typings.reactNative.anon.Typeof_View
import typings.reactNative.anon.X
import typings.reactNative.mod.Animated.^
import typings.reactNative.mod._ScrollView
import typings.reactNative.mod._Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Image: AnimatedComponent[TypeofImage] = ^.asInstanceOf[js.Dynamic].selectDynamic("Image").asInstanceOf[AnimatedComponent[TypeofImage]]

inline def ScrollView: AnimatedComponent[Instantiable0[_ScrollView]] = ^.asInstanceOf[js.Dynamic].selectDynamic("ScrollView").asInstanceOf[AnimatedComponent[Instantiable0[_ScrollView]]]

inline def Text: AnimatedComponent[Instantiable0[_Text]] = ^.asInstanceOf[js.Dynamic].selectDynamic("Text").asInstanceOf[AnimatedComponent[Instantiable0[_Text]]]

inline def View: AnimatedComponent[Typeof_View] = ^.asInstanceOf[js.Dynamic].selectDynamic("View").asInstanceOf[AnimatedComponent[Typeof_View]]

inline def add[OutputT /* <: Double | String */](a: typings.reactNative.mod.Animated.Animated, b: typings.reactNative.mod.Animated.Animated): AnimatedAddition[OutputT] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[AnimatedAddition[OutputT]]

inline def createAnimatedComponent[T /* <: ComponentType[Any] */](component: T): AnimatedComponent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedComponent")(component.asInstanceOf[js.Any]).asInstanceOf[AnimatedComponent[T]]
inline def createAnimatedComponent[T /* <: ComponentType[Any] */](component: T, options: AnimatedComponentOptions): AnimatedComponent[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedComponent")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimatedComponent[T]]

inline def decay(value: AnimatedValueXY, config: DecayAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("decay")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
inline def decay(value: AnimatedValue, config: DecayAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("decay")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]

inline def delay(time: Double): CompositeAnimation = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(time.asInstanceOf[js.Any]).asInstanceOf[CompositeAnimation]

inline def diffClamp[OutputT /* <: Double | String */](a: typings.reactNative.mod.Animated.Animated, min: Double, max: Double): AnimatedDiffClamp[OutputT] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffClamp")(a.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[AnimatedDiffClamp[OutputT]]

inline def divide[OutputT /* <: Double | String */](a: typings.reactNative.mod.Animated.Animated, b: typings.reactNative.mod.Animated.Animated): AnimatedDivision[OutputT] = (^.asInstanceOf[js.Dynamic].applyDynamic("divide")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[AnimatedDivision[OutputT]]

inline def event[T](argMapping: js.Array[Mapping | Null]): js.Function1[/* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("event")(argMapping.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
inline def event[T](argMapping: js.Array[Mapping | Null], config: EventConfig[T]): js.Function1[/* repeated */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("event")(argMapping.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]

inline def loop(animation: CompositeAnimation): CompositeAnimation = ^.asInstanceOf[js.Dynamic].applyDynamic("loop")(animation.asInstanceOf[js.Any]).asInstanceOf[CompositeAnimation]
inline def loop(animation: CompositeAnimation, config: LoopAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("loop")(animation.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]

inline def modulo[OutputT /* <: Double | String */](a: typings.reactNative.mod.Animated.Animated, modulus: Double): AnimatedModulo[OutputT] = (^.asInstanceOf[js.Dynamic].applyDynamic("modulo")(a.asInstanceOf[js.Any], modulus.asInstanceOf[js.Any])).asInstanceOf[AnimatedModulo[OutputT]]

inline def multiply[OutputT /* <: Double | String */](a: typings.reactNative.mod.Animated.Animated, b: typings.reactNative.mod.Animated.Animated): AnimatedMultiplication[OutputT] = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[AnimatedMultiplication[OutputT]]

inline def parallel(animations: js.Array[CompositeAnimation]): CompositeAnimation = ^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(animations.asInstanceOf[js.Any]).asInstanceOf[CompositeAnimation]
inline def parallel(animations: js.Array[CompositeAnimation], config: ParallelConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(animations.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]

inline def sequence(animations: js.Array[CompositeAnimation]): CompositeAnimation = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(animations.asInstanceOf[js.Any]).asInstanceOf[CompositeAnimation]

inline def spring(value: AnimatedValueXY, config: SpringAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("spring")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
inline def spring(value: AnimatedValue, config: SpringAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("spring")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]

inline def stagger(time: Double, animations: js.Array[CompositeAnimation]): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(time.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]

inline def subtract[OutputT /* <: Double | String */](a: typings.reactNative.mod.Animated.Animated, b: typings.reactNative.mod.Animated.Animated): AnimatedSubtraction[OutputT] = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[AnimatedSubtraction[OutputT]]

inline def timing(value: AnimatedValueXY, config: TimingAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]
inline def timing(value: AnimatedValue, config: TimingAnimationConfig): CompositeAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[CompositeAnimation]

type AnimatedComponent[T /* <: ComponentType[Any] */] = FC[AnimatedProps[ComponentPropsWithRef[T]]]

type AnimatedValue = Value

type AnimatedValueXY = ValueXY

type Builtin = js.Function | js.Date | js.Error | js.RegExp

type EndCallback = js.Function1[/* result */ EndResult, Unit]

type Mapping = StringDictionary[Any] | AnimatedValue

type Nullable = js.UndefOr[Null]

type Primitive = String | Double | Boolean | js.Symbol

type ValueListenerCallback = js.Function1[/* state */ typings.reactNative.anon.Value, Unit]

type ValueXYListenerCallback = js.Function1[/* value */ X, Unit]

type WithAnimatedArray[P] = js.Array[WithAnimatedValue[P]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends react-native.react-native.Animated.Builtin | react-native.react-native.Animated.Nullable ? T : T extends react-native.react-native.Animated.Primitive ? T | react-native.react-native.Animated.Value | react-native.react-native.Animated.AnimatedInterpolation<number | string> : T extends std.Array<infer P> ? react-native.react-native.Animated.WithAnimatedArray<P> : T extends {} ? react-native.react-native.Animated.WithAnimatedObject<T> : T
  }}}
  */
type WithAnimatedValue[T] = T
