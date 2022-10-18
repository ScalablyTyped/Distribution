package typings.reactNativeReanimated.mod

import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.NativeScrollEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.RegisteredStyle
import typings.reactNative.mod.ScrollView
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerTypesCompatMod.GestureHandlerGestureEvent
import typings.reactNativeReanimated.anon.InputRange
import typings.reactNativeReanimated.anon.TypeofBaseAnimationBuildeDelay
import typings.reactNativeReanimated.anon.X
import typings.reactNativeReanimated.mod.Animated.AnimatedClock
import typings.reactNativeReanimated.mod.Animated.AnimatedNode
import typings.reactNativeReanimated.mod.Animated.AnimatedValue
import typings.reactNativeReanimated.mod.Animated.BackwardCompatibleWrapper
import typings.reactNativeReanimated.mod.Animated.BinaryOperator
import typings.reactNativeReanimated.mod.Animated.DecayConfig
import typings.reactNativeReanimated.mod.Animated.DecayState
import typings.reactNativeReanimated.mod.Animated.InterpolationConfig
import typings.reactNativeReanimated.mod.Animated.MultiOperator
import typings.reactNativeReanimated.mod.Animated.Nullable
import typings.reactNativeReanimated.mod.Animated.SpringConfig
import typings.reactNativeReanimated.mod.Animated.SpringState
import typings.reactNativeReanimated.mod.Animated.TimingConfig
import typings.reactNativeReanimated.mod.Animated.TimingState
import typings.reactNativeReanimated.mod.Animated.UnaryOperator
import typings.reactNativeReanimated.mod.SensorType.ROTATION
import typings.reactNativeReanimated.mod.^
import typings.reactNativeReanimated.reactNativeReanimatedInts.`0`
import typings.reactNativeReanimated.reactNativeReanimatedInts.`1`
import typings.reactNativeReanimated.reactNativeReanimatedStrings.HSV
import typings.reactNativeReanimated.reactNativeReanimatedStrings.RGB
import typings.std.Exclude
import typings.std.Parameters
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Easing: EasingStatic = ^.asInstanceOf[js.Dynamic].selectDynamic("Easing").asInstanceOf[EasingStatic]

inline def EasingNode: EasingNodeStatic = ^.asInstanceOf[js.Dynamic].selectDynamic("EasingNode").asInstanceOf[EasingNodeStatic]

inline def Extrapolate: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Animated.Extrapolate */ Any = ^.asInstanceOf[js.Dynamic].selectDynamic("Extrapolate").asInstanceOf[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Animated.Extrapolate */ Any]

inline def ReverseAnimation: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof Animated.ReverseAnimation */ Any = ^.asInstanceOf[js.Dynamic].selectDynamic("ReverseAnimation").asInstanceOf[/* import warning: ResolveTypeQueries.resolve Loop while resolving typeof Animated.ReverseAnimation */ Any]

inline def SpringUtils: typings.reactNativeReanimated.mod.Animated.SpringUtils = ^.asInstanceOf[js.Dynamic].selectDynamic("SpringUtils").asInstanceOf[typings.reactNativeReanimated.mod.Animated.SpringUtils]

inline def abs: js.Function1[
/* value */ typings.reactNativeReanimated.mod.Animated.Adaptable[Double], 
AnimatedNode[Double]] = ^.asInstanceOf[js.Dynamic].selectDynamic("abs").asInstanceOf[js.Function1[
/* value */ typings.reactNativeReanimated.mod.Animated.Adaptable[Double], 
AnimatedNode[Double]]]

inline def acc: js.Function1[
/* value */ typings.reactNativeReanimated.mod.Animated.Adaptable[Double], 
AnimatedNode[Double]] = ^.asInstanceOf[js.Dynamic].selectDynamic("acc").asInstanceOf[js.Function1[
/* value */ typings.reactNativeReanimated.mod.Animated.Adaptable[Double], 
AnimatedNode[Double]]]

inline def acos: UnaryOperator = ^.asInstanceOf[js.Dynamic].selectDynamic("acos").asInstanceOf[UnaryOperator]

inline def add: MultiOperator[Double] = ^.asInstanceOf[js.Dynamic].selectDynamic("add").asInstanceOf[MultiOperator[Double]]

inline def and: MultiOperator[`0` | `1`] = ^.asInstanceOf[js.Dynamic].selectDynamic("and").asInstanceOf[MultiOperator[`0` | `1`]]

inline def asin: UnaryOperator = ^.asInstanceOf[js.Dynamic].selectDynamic("asin").asInstanceOf[UnaryOperator]

inline def atan: UnaryOperator = ^.asInstanceOf[js.Dynamic].selectDynamic("atan").asInstanceOf[UnaryOperator]

inline def block[T1 /* <: typings.reactNativeReanimated.mod.Animated.Value */, T2 /* <: typings.reactNativeReanimated.mod.Animated.Value */](items: js.Array[typings.reactNativeReanimated.mod.Animated.Adaptable[T2]]): AnimatedNode[T1] = ^.asInstanceOf[js.Dynamic].applyDynamic("block")(items.asInstanceOf[js.Any]).asInstanceOf[AnimatedNode[T1]]

inline def call[T](args: js.Array[T | AnimatedNode[T]], callback: js.Function1[/* args */ js.Array[T], Unit]): AnimatedNode[`0`] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[AnimatedNode[`0`]]

inline def cancelAnimation[T](sharedValue: SharedValue[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelAnimation")(sharedValue.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def ceil: UnaryOperator = ^.asInstanceOf[js.Dynamic].selectDynamic("ceil").asInstanceOf[UnaryOperator]

inline def clockRunning: js.Function1[/* clock */ AnimatedClock, AnimatedNode[`0` | `1`]] = ^.asInstanceOf[js.Dynamic].selectDynamic("clockRunning").asInstanceOf[js.Function1[/* clock */ AnimatedClock, AnimatedNode[`0` | `1`]]]

inline def color: js.Function4[
/* r */ typings.reactNativeReanimated.mod.Animated.Adaptable[Double], 
/* g */ typings.reactNativeReanimated.mod.Animated.Adaptable[Double], 
/* b */ typings.reactNativeReanimated.mod.Animated.Adaptable[Double], 
/* a */ js.UndefOr[typings.reactNativeReanimated.mod.Animated.Adaptable[Double]], 
AnimatedNode[Double | String]] = ^.asInstanceOf[js.Dynamic].selectDynamic("color").asInstanceOf[js.Function4[
/* r */ typings.reactNativeReanimated.mod.Animated.Adaptable[Double], 
/* g */ typings.reactNativeReanimated.mod.Animated.Adaptable[Double], 
/* b */ typings.reactNativeReanimated.mod.Animated.Adaptable[Double], 
/* a */ js.UndefOr[typings.reactNativeReanimated.mod.Animated.Adaptable[Double]], 
AnimatedNode[Double | String]]]

inline def combineTransition(exiting: TypeofBaseAnimationBuildeDelay, entering: TypeofBaseAnimationBuildeDelay): EntryExitTransition = (^.asInstanceOf[js.Dynamic].applyDynamic("combineTransition")(exiting.asInstanceOf[js.Any], entering.asInstanceOf[js.Any])).asInstanceOf[EntryExitTransition]
inline def combineTransition(exiting: TypeofBaseAnimationBuildeDelay, entering: BaseAnimationBuilder): EntryExitTransition = (^.asInstanceOf[js.Dynamic].applyDynamic("combineTransition")(exiting.asInstanceOf[js.Any], entering.asInstanceOf[js.Any])).asInstanceOf[EntryExitTransition]
inline def combineTransition(exiting: BaseAnimationBuilder, entering: TypeofBaseAnimationBuildeDelay): EntryExitTransition = (^.asInstanceOf[js.Dynamic].applyDynamic("combineTransition")(exiting.asInstanceOf[js.Any], entering.asInstanceOf[js.Any])).asInstanceOf[EntryExitTransition]
inline def combineTransition(exiting: BaseAnimationBuilder, entering: BaseAnimationBuilder): EntryExitTransition = (^.asInstanceOf[js.Dynamic].applyDynamic("combineTransition")(exiting.asInstanceOf[js.Any], entering.asInstanceOf[js.Any])).asInstanceOf[EntryExitTransition]

inline def concat: js.Function1[
/* repeated */ typings.reactNativeReanimated.mod.Animated.Adaptable[Double | String], 
AnimatedNode[String]] = ^.asInstanceOf[js.Dynamic].selectDynamic("concat").asInstanceOf[js.Function1[
/* repeated */ typings.reactNativeReanimated.mod.Animated.Adaptable[Double | String], 
AnimatedNode[String]]]

inline def cond[T1 /* <: typings.reactNativeReanimated.mod.Animated.Value */, T2 /* <: typings.reactNativeReanimated.mod.Animated.Value */](
  conditionNode: typings.reactNativeReanimated.mod.Animated.Adaptable[Double],
  ifNode: typings.reactNativeReanimated.mod.Animated.Adaptable[T1]
): AnimatedNode[T1 | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("cond")(conditionNode.asInstanceOf[js.Any], ifNode.asInstanceOf[js.Any])).asInstanceOf[AnimatedNode[T1 | T2]]
inline def cond[T1 /* <: typings.reactNativeReanimated.mod.Animated.Value */, T2 /* <: typings.reactNativeReanimated.mod.Animated.Value */](
  conditionNode: typings.reactNativeReanimated.mod.Animated.Adaptable[Double],
  ifNode: typings.reactNativeReanimated.mod.Animated.Adaptable[T1],
  elseNode: typings.reactNativeReanimated.mod.Animated.Adaptable[T2]
): AnimatedNode[T1 | T2] = (^.asInstanceOf[js.Dynamic].applyDynamic("cond")(conditionNode.asInstanceOf[js.Any], ifNode.asInstanceOf[js.Any], elseNode.asInstanceOf[js.Any])).asInstanceOf[AnimatedNode[T1 | T2]]

inline def cos: UnaryOperator = ^.asInstanceOf[js.Dynamic].selectDynamic("cos").asInstanceOf[UnaryOperator]

inline def createAnimatedPropAdapter(adapter: PropsAdapterFunction): PropsAdapterFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedPropAdapter")(adapter.asInstanceOf[js.Any]).asInstanceOf[PropsAdapterFunction]
inline def createAnimatedPropAdapter(adapter: PropsAdapterFunction, nativeProps: js.Array[String]): PropsAdapterFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedPropAdapter")(adapter.asInstanceOf[js.Any], nativeProps.asInstanceOf[js.Any])).asInstanceOf[PropsAdapterFunction]

inline def debug[T](message: String, value: AnimatedNode[T]): AnimatedNode[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("debug")(message.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[AnimatedNode[T]]

inline def decay(clock: AnimatedClock, state: DecayState, config: DecayConfig): AnimatedNode[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("decay")(clock.asInstanceOf[js.Any], state.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[AnimatedNode[Double]]
inline def decay(node: AnimatedNode[Double], config: DecayConfig): BackwardCompatibleWrapper = (^.asInstanceOf[js.Dynamic].applyDynamic("decay")(node.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[BackwardCompatibleWrapper]

inline def defineAnimation[T](starting: Any, factory: js.Function0[T]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defineAnimation")(starting.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def defined: js.Function1[
/* value */ typings.reactNativeReanimated.mod.Animated.Adaptable[Any], 
AnimatedNode[`0` | `1`]] = ^.asInstanceOf[js.Dynamic].selectDynamic("defined").asInstanceOf[js.Function1[
/* value */ typings.reactNativeReanimated.mod.Animated.Adaptable[Any], 
AnimatedNode[`0` | `1`]]]

inline def diff: js.Function1[
/* value */ typings.reactNativeReanimated.mod.Animated.Adaptable[Double], 
AnimatedNode[Double]] = ^.asInstanceOf[js.Dynamic].selectDynamic("diff").asInstanceOf[js.Function1[
/* value */ typings.reactNativeReanimated.mod.Animated.Adaptable[Double], 
AnimatedNode[Double]]]

inline def diffClamp: js.Function3[
/* value */ typings.reactNativeReanimated.mod.Animated.Adaptable[Double], 
/* minVal */ typings.reactNativeReanimated.mod.Animated.Adaptable[Double], 
/* maxVal */ typings.reactNativeReanimated.mod.Animated.Adaptable[Double], 
AnimatedNode[Double]] = ^.asInstanceOf[js.Dynamic].selectDynamic("diffClamp").asInstanceOf[js.Function3[
/* value */ typings.reactNativeReanimated.mod.Animated.Adaptable[Double], 
/* minVal */ typings.reactNativeReanimated.mod.Animated.Adaptable[Double], 
/* maxVal */ typings.reactNativeReanimated.mod.Animated.Adaptable[Double], 
AnimatedNode[Double]]]

inline def divide: MultiOperator[Double] = ^.asInstanceOf[js.Dynamic].selectDynamic("divide").asInstanceOf[MultiOperator[Double]]

inline def enableLayoutAnimations(flag: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLayoutAnimations")(flag.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def eq_ : BinaryOperator[`0` | `1`] = ^.asInstanceOf[js.Dynamic].selectDynamic("eq").asInstanceOf[BinaryOperator[`0` | `1`]]

inline def event[T](
  argMapping: /* import warning: importer.ImportType#apply Failed type conversion: T extends never ? std.ReadonlyArray<react-native-reanimated.react-native-reanimated.Animated.Mapping> : std.Readonly<react-native-reanimated.react-native-reanimated.Animated.EventMappingArray<T>> */ js.Any
): js.Function1[/* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("event")(argMapping.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
inline def event[T](
  argMapping: /* import warning: importer.ImportType#apply Failed type conversion: T extends never ? std.ReadonlyArray<react-native-reanimated.react-native-reanimated.Animated.Mapping> : std.Readonly<react-native-reanimated.react-native-reanimated.Animated.EventMappingArray<T>> */ js.Any,
  config: js.Object
): js.Function1[/* repeated */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("event")(argMapping.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]

inline def exp: UnaryOperator = ^.asInstanceOf[js.Dynamic].selectDynamic("exp").asInstanceOf[UnaryOperator]

inline def floor: UnaryOperator = ^.asInstanceOf[js.Dynamic].selectDynamic("floor").asInstanceOf[UnaryOperator]

inline def getRelativeCoords(ref: RefObject[Component[js.Object, js.Object, Any]], x: Double, y: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativeCoords")(ref.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[X]

inline def greaterOrEq: BinaryOperator[`0` | `1`] = ^.asInstanceOf[js.Dynamic].selectDynamic("greaterOrEq").asInstanceOf[BinaryOperator[`0` | `1`]]

inline def greaterThan: BinaryOperator[`0` | `1`] = ^.asInstanceOf[js.Dynamic].selectDynamic("greaterThan").asInstanceOf[BinaryOperator[`0` | `1`]]

inline def interpolate(x: Double, input: js.Array[Double], output: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(x.asInstanceOf[js.Any], input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def interpolate(x: Double, input: js.Array[Double], output: js.Array[Double], `type`: ExtrapolationType): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(x.asInstanceOf[js.Any], input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def interpolateColor[T /* <: String | Double */](value: Double, inputRange: js.Array[Double], outputRange: js.Array[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateColor")(value.asInstanceOf[js.Any], inputRange.asInstanceOf[js.Any], outputRange.asInstanceOf[js.Any])).asInstanceOf[T]
inline def interpolateColor[T /* <: String | Double */](value: Double, inputRange: js.Array[Double], outputRange: js.Array[T], colorSpace: RGB | HSV): T = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateColor")(value.asInstanceOf[js.Any], inputRange.asInstanceOf[js.Any], outputRange.asInstanceOf[js.Any], colorSpace.asInstanceOf[js.Any])).asInstanceOf[T]

inline def interpolateColors[T /* <: String | Double */](
  animationValue: typings.reactNativeReanimated.mod.Animated.Adaptable[Double],
  hasInputRangeOutputColorRange: InputRange[T]
): AnimatedNode[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateColors")(animationValue.asInstanceOf[js.Any], hasInputRangeOutputColorRange.asInstanceOf[js.Any])).asInstanceOf[AnimatedNode[T]]

inline def interpolateNode: js.Function2[
/* value */ typings.reactNativeReanimated.mod.Animated.Adaptable[Double], 
/* config */ InterpolationConfig, 
AnimatedNode[Double]] = ^.asInstanceOf[js.Dynamic].selectDynamic("interpolateNode").asInstanceOf[js.Function2[
/* value */ typings.reactNativeReanimated.mod.Animated.Adaptable[Double], 
/* config */ InterpolationConfig, 
AnimatedNode[Double]]]

inline def interpolateSharableColor(value: Double, interpolateConfig: SharedValue[InterpolateConfig]): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateSharableColor")(value.asInstanceOf[js.Any], interpolateConfig.asInstanceOf[js.Any])).asInstanceOf[String | Double]

inline def lessOrEq: BinaryOperator[`0` | `1`] = ^.asInstanceOf[js.Dynamic].selectDynamic("lessOrEq").asInstanceOf[BinaryOperator[`0` | `1`]]

inline def lessThan: BinaryOperator[`0` | `1`] = ^.asInstanceOf[js.Dynamic].selectDynamic("lessThan").asInstanceOf[BinaryOperator[`0` | `1`]]

inline def log: UnaryOperator = ^.asInstanceOf[js.Dynamic].selectDynamic("log").asInstanceOf[UnaryOperator]

inline def makeMutable[T](initialValue: T): SharedValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMutable")(initialValue.asInstanceOf[js.Any]).asInstanceOf[SharedValue[T]]

inline def max: BinaryOperator[Double] = ^.asInstanceOf[js.Dynamic].selectDynamic("max").asInstanceOf[BinaryOperator[Double]]

inline def measure[T /* <: Component[js.Object, js.Object, Any] */](ref: RefObject[T]): MeasuredDimensions | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("measure")(ref.asInstanceOf[js.Any]).asInstanceOf[MeasuredDimensions | Null]

inline def min: BinaryOperator[Double] = ^.asInstanceOf[js.Dynamic].selectDynamic("min").asInstanceOf[BinaryOperator[Double]]

inline def modulo: MultiOperator[Double] = ^.asInstanceOf[js.Dynamic].selectDynamic("modulo").asInstanceOf[MultiOperator[Double]]

inline def multiply: MultiOperator[Double] = ^.asInstanceOf[js.Dynamic].selectDynamic("multiply").asInstanceOf[MultiOperator[Double]]

inline def neq: BinaryOperator[`0` | `1`] = ^.asInstanceOf[js.Dynamic].selectDynamic("neq").asInstanceOf[BinaryOperator[`0` | `1`]]

inline def not: js.Function1[
/* value */ typings.reactNativeReanimated.mod.Animated.Adaptable[Any], 
AnimatedNode[`0` | `1`]] = ^.asInstanceOf[js.Dynamic].selectDynamic("not").asInstanceOf[js.Function1[
/* value */ typings.reactNativeReanimated.mod.Animated.Adaptable[Any], 
AnimatedNode[`0` | `1`]]]

inline def onChange: js.Function2[
/* value */ typings.reactNativeReanimated.mod.Animated.Adaptable[Double], 
/* action */ typings.reactNativeReanimated.mod.Animated.Adaptable[Double], 
AnimatedNode[Double]] = ^.asInstanceOf[js.Dynamic].selectDynamic("onChange").asInstanceOf[js.Function2[
/* value */ typings.reactNativeReanimated.mod.Animated.Adaptable[Double], 
/* action */ typings.reactNativeReanimated.mod.Animated.Adaptable[Double], 
AnimatedNode[Double]]]

inline def or: MultiOperator[`0` | `1`] = ^.asInstanceOf[js.Dynamic].selectDynamic("or").asInstanceOf[MultiOperator[`0` | `1`]]

inline def pow: MultiOperator[Double] = ^.asInstanceOf[js.Dynamic].selectDynamic("pow").asInstanceOf[MultiOperator[Double]]

inline def proc[T /* <: js.Array[
js.UndefOr[
  typings.reactNativeReanimated.mod.Animated.Adaptable[typings.reactNativeReanimated.mod.Animated.Value]
]] */](func: js.Function1[/* args */ T, AnimatedNode[Double]]): /* import warning: importer.ImportType#apply Failed type conversion: typeof func */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("proc")(func.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: typeof func */ js.Any]

inline def processColor(color: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("processColor")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
inline def processColor(color: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("processColor")(color.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def round: UnaryOperator = ^.asInstanceOf[js.Dynamic].selectDynamic("round").asInstanceOf[UnaryOperator]

inline def runOnJS[A /* <: js.Array[Any] */, R](fn: js.Function1[/* args */ A, R]): js.Function1[
/* args */ Parameters[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fn */ Any], 
Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("runOnJS")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* args */ Parameters[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fn */ Any], 
Unit]]

inline def runOnUI[A /* <: js.Array[Any] */, R](fn: js.Function1[/* args */ A, R]): js.Function1[
/* args */ Parameters[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fn */ Any], 
Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("runOnUI")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* args */ Parameters[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fn */ Any], 
Unit]]

inline def scrollTo(
  ref: RefObject[
  ScrollView | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScrollView */ Any)
],
  x: Double,
  y: Double,
  animated: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollTo")(ref.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], animated.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def set[T /* <: typings.reactNativeReanimated.mod.Animated.Value */](
  valueToBeUpdated: AnimatedValue[T],
  sourceNode: typings.reactNativeReanimated.mod.Animated.Adaptable[T]
): AnimatedNode[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(valueToBeUpdated.asInstanceOf[js.Any], sourceNode.asInstanceOf[js.Any])).asInstanceOf[AnimatedNode[T]]

inline def sin: UnaryOperator = ^.asInstanceOf[js.Dynamic].selectDynamic("sin").asInstanceOf[UnaryOperator]

inline def spring(clock: AnimatedClock, state: SpringState, config: SpringConfig): AnimatedNode[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("spring")(clock.asInstanceOf[js.Any], state.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[AnimatedNode[Double]]
inline def spring(node: AnimatedNode[Double], config: SpringConfig): BackwardCompatibleWrapper = (^.asInstanceOf[js.Dynamic].applyDynamic("spring")(node.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[BackwardCompatibleWrapper]

inline def sqrt: UnaryOperator = ^.asInstanceOf[js.Dynamic].selectDynamic("sqrt").asInstanceOf[UnaryOperator]

inline def startClock: js.Function1[/* clock */ AnimatedClock, AnimatedNode[`0`]] = ^.asInstanceOf[js.Dynamic].selectDynamic("startClock").asInstanceOf[js.Function1[/* clock */ AnimatedClock, AnimatedNode[`0`]]]

inline def stopClock: js.Function1[/* clock */ AnimatedClock, AnimatedNode[`0`]] = ^.asInstanceOf[js.Dynamic].selectDynamic("stopClock").asInstanceOf[js.Function1[/* clock */ AnimatedClock, AnimatedNode[`0`]]]

inline def sub: MultiOperator[Double] = ^.asInstanceOf[js.Dynamic].selectDynamic("sub").asInstanceOf[MultiOperator[Double]]

inline def tan: UnaryOperator = ^.asInstanceOf[js.Dynamic].selectDynamic("tan").asInstanceOf[UnaryOperator]

inline def timing(clock: AnimatedClock, state: TimingState, config: TimingConfig): AnimatedNode[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(clock.asInstanceOf[js.Any], state.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[AnimatedNode[Double]]
inline def timing(node: AnimatedNode[Double], config: TimingConfig): BackwardCompatibleWrapper = (^.asInstanceOf[js.Dynamic].applyDynamic("timing")(node.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[BackwardCompatibleWrapper]

inline def useAnimatedGestureHandler_nativeEvent[T /* <: GestureHandlerGestureEvent */, TContext /* <: Context */](
  handlers: GestureHandlers[
  /* import warning: importer.ImportType#apply Failed type conversion: T['nativeEvent'] */ js.Any, 
  TContext
]
): OnGestureEvent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedGestureHandler")(handlers.asInstanceOf[js.Any]).asInstanceOf[OnGestureEvent[T]]
inline def useAnimatedGestureHandler_nativeEvent[T /* <: GestureHandlerGestureEvent */, TContext /* <: Context */](
  handlers: GestureHandlers[
  /* import warning: importer.ImportType#apply Failed type conversion: T['nativeEvent'] */ js.Any, 
  TContext
],
  deps: DependencyList
): OnGestureEvent[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedGestureHandler")(handlers.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[OnGestureEvent[T]]

inline def useAnimatedKeyboard(): AnimatedKeyboardInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedKeyboard")().asInstanceOf[AnimatedKeyboardInfo]

inline def useAnimatedProps[T /* <: js.Object */](updater: js.Function0[Partial[T]]): Partial[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedProps")(updater.asInstanceOf[js.Any]).asInstanceOf[Partial[T]]
inline def useAnimatedProps[T /* <: js.Object */](updater: js.Function0[Partial[T]], deps: Null, adapters: js.Array[PropsAdapterFunction]): Partial[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedProps")(updater.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[Partial[T]]
inline def useAnimatedProps[T /* <: js.Object */](updater: js.Function0[Partial[T]], deps: Null, adapters: PropsAdapterFunction): Partial[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedProps")(updater.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[Partial[T]]
inline def useAnimatedProps[T /* <: js.Object */](updater: js.Function0[Partial[T]], deps: Unit, adapters: js.Array[PropsAdapterFunction]): Partial[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedProps")(updater.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[Partial[T]]
inline def useAnimatedProps[T /* <: js.Object */](updater: js.Function0[Partial[T]], deps: Unit, adapters: PropsAdapterFunction): Partial[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedProps")(updater.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[Partial[T]]
inline def useAnimatedProps[T /* <: js.Object */](updater: js.Function0[Partial[T]], deps: DependencyList): Partial[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedProps")(updater.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Partial[T]]
inline def useAnimatedProps[T /* <: js.Object */](updater: js.Function0[Partial[T]], deps: DependencyList, adapters: js.Array[PropsAdapterFunction]): Partial[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedProps")(updater.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[Partial[T]]
inline def useAnimatedProps[T /* <: js.Object */](updater: js.Function0[Partial[T]], deps: DependencyList, adapters: PropsAdapterFunction): Partial[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedProps")(updater.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[Partial[T]]

inline def useAnimatedReaction[D](
  prepare: js.Function0[D],
  react: js.Function2[/* prepareResult */ D, /* preparePreviousResult */ D | Null, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedReaction")(prepare.asInstanceOf[js.Any], react.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def useAnimatedReaction[D](
  prepare: js.Function0[D],
  react: js.Function2[/* prepareResult */ D, /* preparePreviousResult */ D | Null, Unit],
  deps: DependencyList
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedReaction")(prepare.asInstanceOf[js.Any], react.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def useAnimatedRef[T /* <: Component[js.Object, js.Object, Any] */](): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedRef")().asInstanceOf[RefObject[T]]

inline def useAnimatedScrollHandler[TContext /* <: Context */](handlers: ScrollHandler[TContext]): OnScroll = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedScrollHandler")(handlers.asInstanceOf[js.Any]).asInstanceOf[OnScroll]
inline def useAnimatedScrollHandler[TContext /* <: Context */](handlers: ScrollHandler[TContext], deps: DependencyList): OnScroll = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedScrollHandler")(handlers.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[OnScroll]
inline def useAnimatedScrollHandler[TContext /* <: Context */](handlers: ScrollHandlers[TContext]): OnScroll = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedScrollHandler")(handlers.asInstanceOf[js.Any]).asInstanceOf[OnScroll]
inline def useAnimatedScrollHandler[TContext /* <: Context */](handlers: ScrollHandlers[TContext], deps: DependencyList): OnScroll = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedScrollHandler")(handlers.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[OnScroll]

inline def useAnimatedSensor(sensorType: SensorType): AnimatedSensor[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedSensor")(sensorType.asInstanceOf[js.Any]).asInstanceOf[AnimatedSensor[Any]]
inline def useAnimatedSensor(sensorType: ROTATION): AnimatedSensor[SensorValueRotation] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedSensor")(sensorType.asInstanceOf[js.Any]).asInstanceOf[AnimatedSensor[SensorValueRotation]]
inline def useAnimatedSensor(sensorType: ROTATION, userConfig: SensorConfig): AnimatedSensor[SensorValueRotation] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedSensor")(sensorType.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[AnimatedSensor[SensorValueRotation]]
inline def useAnimatedSensor(sensorType: SensorType, userConfig: SensorConfig): AnimatedSensor[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedSensor")(sensorType.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[AnimatedSensor[Any]]
inline def useAnimatedSensor(sensorType: Exclude[SensorType, ROTATION]): AnimatedSensor[SensorValue3D] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedSensor")(sensorType.asInstanceOf[js.Any]).asInstanceOf[AnimatedSensor[SensorValue3D]]
inline def useAnimatedSensor(sensorType: Exclude[SensorType, ROTATION], userConfig: SensorConfig): AnimatedSensor[SensorValue3D] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedSensor")(sensorType.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[AnimatedSensor[SensorValue3D]]

inline def useAnimatedStyle[T /* <: AnimatedStyleProp[ViewStyle | ImageStyle | TextStyle] */](updater: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedStyle")(updater.asInstanceOf[js.Any]).asInstanceOf[T]
inline def useAnimatedStyle[T /* <: AnimatedStyleProp[ViewStyle | ImageStyle | TextStyle] */](updater: js.Function0[T], deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedStyle")(updater.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]

inline def useCode: js.Function2[
/* exec */ js.Function0[(Nullable[js.Array[AnimatedNode[Double]] | AnimatedNode[Double]]) | Boolean], 
/* deps */ js.Array[Any], 
Unit] = ^.asInstanceOf[js.Dynamic].selectDynamic("useCode").asInstanceOf[js.Function2[
/* exec */ js.Function0[(Nullable[js.Array[AnimatedNode[Double]] | AnimatedNode[Double]]) | Boolean], 
/* deps */ js.Array[Any], 
Unit]]

inline def useDerivedValue[T](processor: js.Function0[T]): DerivedValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDerivedValue")(processor.asInstanceOf[js.Any]).asInstanceOf[DerivedValue[T]]
inline def useDerivedValue[T](processor: js.Function0[T], deps: DependencyList): DerivedValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDerivedValue")(processor.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[DerivedValue[T]]

inline def useEvent[T /* <: js.Object */](handler: js.Function1[/* e */ T, Unit]): js.Function1[/* e */ NativeSyntheticEvent[T], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEvent")(handler.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* e */ NativeSyntheticEvent[T], Unit]]
inline def useEvent[T /* <: js.Object */](handler: js.Function1[/* e */ T, Unit], eventNames: js.Array[String]): js.Function1[/* e */ NativeSyntheticEvent[T], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useEvent")(handler.asInstanceOf[js.Any], eventNames.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* e */ NativeSyntheticEvent[T], Unit]]
inline def useEvent[T /* <: js.Object */](handler: js.Function1[/* e */ T, Unit], eventNames: js.Array[String], rebuild: Boolean): js.Function1[/* e */ NativeSyntheticEvent[T], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useEvent")(handler.asInstanceOf[js.Any], eventNames.asInstanceOf[js.Any], rebuild.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* e */ NativeSyntheticEvent[T], Unit]]
inline def useEvent[T /* <: js.Object */](handler: js.Function1[/* e */ T, Unit], eventNames: Unit, rebuild: Boolean): js.Function1[/* e */ NativeSyntheticEvent[T], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useEvent")(handler.asInstanceOf[js.Any], eventNames.asInstanceOf[js.Any], rebuild.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* e */ NativeSyntheticEvent[T], Unit]]

inline def useFrameCallback(callback: js.Function1[/* frameInfo */ FrameInfo, Unit]): FrameCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("useFrameCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[FrameCallback]
inline def useFrameCallback(callback: js.Function1[/* frameInfo */ FrameInfo, Unit], autostart: Boolean): FrameCallback = (^.asInstanceOf[js.Dynamic].applyDynamic("useFrameCallback")(callback.asInstanceOf[js.Any], autostart.asInstanceOf[js.Any])).asInstanceOf[FrameCallback]

inline def useHandler[T, TContext /* <: Context */](handlers: Record[String, Handler[T, TContext]]): typings.reactNativeReanimated.anon.Context[TContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("useHandler")(handlers.asInstanceOf[js.Any]).asInstanceOf[typings.reactNativeReanimated.anon.Context[TContext]]
inline def useHandler[T, TContext /* <: Context */](handlers: Record[String, Handler[T, TContext]], deps: DependencyList): typings.reactNativeReanimated.anon.Context[TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("useHandler")(handlers.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeReanimated.anon.Context[TContext]]

inline def useInterpolateConfig(inputRange: js.Array[Double], outputRange: js.Array[String | Double]): SharedValue[InterpolateConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterpolateConfig")(inputRange.asInstanceOf[js.Any], outputRange.asInstanceOf[js.Any])).asInstanceOf[SharedValue[InterpolateConfig]]
inline def useInterpolateConfig(inputRange: js.Array[Double], outputRange: js.Array[String | Double], colorSpace: ColorSpace): SharedValue[InterpolateConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterpolateConfig")(inputRange.asInstanceOf[js.Any], outputRange.asInstanceOf[js.Any], colorSpace.asInstanceOf[js.Any])).asInstanceOf[SharedValue[InterpolateConfig]]

inline def useScrollViewOffset(aref: RefObject[typings.reactNativeReanimated.mod.Animated.ScrollView]): SharedValue[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollViewOffset")(aref.asInstanceOf[js.Any]).asInstanceOf[SharedValue[Double]]

inline def useSharedValue[T](initialValue: T): SharedValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSharedValue")(initialValue.asInstanceOf[js.Any]).asInstanceOf[SharedValue[T]]

inline def useValue(initialValue: String): AnimatedValue[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useValue")(initialValue.asInstanceOf[js.Any]).asInstanceOf[AnimatedValue[String]]
inline def useValue(initialValue: Boolean): AnimatedValue[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useValue")(initialValue.asInstanceOf[js.Any]).asInstanceOf[AnimatedValue[Boolean]]
inline def useValue(initialValue: Double): AnimatedValue[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("useValue")(initialValue.asInstanceOf[js.Any]).asInstanceOf[AnimatedValue[Double]]

inline def useWorkletCallback[A /* <: js.Array[Any] */, R](fn: js.Function1[/* args */ A, R]): js.Function1[
/* args */ Parameters[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fn */ Any], 
R] = ^.asInstanceOf[js.Dynamic].applyDynamic("useWorkletCallback")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* args */ Parameters[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fn */ Any], 
R]]
inline def useWorkletCallback[A /* <: js.Array[Any] */, R](fn: js.Function1[/* args */ A, R], deps: DependencyList): js.Function1[
/* args */ Parameters[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fn */ Any], 
R] = (^.asInstanceOf[js.Dynamic].applyDynamic("useWorkletCallback")(fn.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
/* args */ Parameters[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fn */ Any], 
R]]

inline def withDecay(userConfig: WithDecayConfig): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("withDecay")(userConfig.asInstanceOf[js.Any]).asInstanceOf[Double]
inline def withDecay(userConfig: WithDecayConfig, callback: AnimationCallback): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("withDecay")(userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def withDelay(delayMS: Double, delayedAnimation: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("withDelay")(delayMS.asInstanceOf[js.Any], delayedAnimation.asInstanceOf[js.Any])).asInstanceOf[String]
inline def withDelay(delayMS: Double, delayedAnimation: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("withDelay")(delayMS.asInstanceOf[js.Any], delayedAnimation.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
inline def withDelay(delayMS: Double, delayedAnimation: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("withDelay")(delayMS.asInstanceOf[js.Any], delayedAnimation.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def withRepeat(animation: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(animation.asInstanceOf[js.Any]).asInstanceOf[String]
inline def withRepeat(animation: String, numberOfReps: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(animation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any])).asInstanceOf[String]
inline def withRepeat(animation: String, numberOfReps: Double, reverse: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(animation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[String]
inline def withRepeat(animation: String, numberOfReps: Double, reverse: Boolean, callback: AnimationCallback): String = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(animation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
inline def withRepeat(animation: String, numberOfReps: Double, reverse: Unit, callback: AnimationCallback): String = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(animation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
inline def withRepeat(animation: String, numberOfReps: Unit, reverse: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(animation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[String]
inline def withRepeat(animation: String, numberOfReps: Unit, reverse: Boolean, callback: AnimationCallback): String = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(animation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
inline def withRepeat(animation: String, numberOfReps: Unit, reverse: Unit, callback: AnimationCallback): String = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(animation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
inline def withRepeat(animation: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(animation.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
inline def withRepeat(animation: js.Array[Double], numberOfReps: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(animation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
inline def withRepeat(animation: js.Array[Double], numberOfReps: Double, reverse: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(animation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
inline def withRepeat(animation: js.Array[Double], numberOfReps: Double, reverse: Boolean, callback: AnimationCallback): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(animation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
inline def withRepeat(animation: js.Array[Double], numberOfReps: Double, reverse: Unit, callback: AnimationCallback): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(animation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
inline def withRepeat(animation: js.Array[Double], numberOfReps: Unit, reverse: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(animation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
inline def withRepeat(animation: js.Array[Double], numberOfReps: Unit, reverse: Boolean, callback: AnimationCallback): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(animation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
inline def withRepeat(animation: js.Array[Double], numberOfReps: Unit, reverse: Unit, callback: AnimationCallback): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(animation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
inline def withRepeat(animation: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(animation.asInstanceOf[js.Any]).asInstanceOf[Double]
inline def withRepeat(animation: Double, numberOfReps: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(animation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def withRepeat(animation: Double, numberOfReps: Double, reverse: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(animation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def withRepeat(animation: Double, numberOfReps: Double, reverse: Boolean, callback: AnimationCallback): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(animation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def withRepeat(animation: Double, numberOfReps: Double, reverse: Unit, callback: AnimationCallback): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(animation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def withRepeat(animation: Double, numberOfReps: Unit, reverse: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(animation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def withRepeat(animation: Double, numberOfReps: Unit, reverse: Boolean, callback: AnimationCallback): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(animation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def withRepeat(animation: Double, numberOfReps: Unit, reverse: Unit, callback: AnimationCallback): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(animation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def withSequence[T /* <: AnimatableValue */](
  /* import warning: parser.TsParser#functionParam Dropping repeated marker of param animations because its type [T, ...Array<T>] is not an array type */ animations: Array[T]
): T = ^.asInstanceOf[js.Dynamic].applyDynamic("withSequence")(animations.asInstanceOf[js.Any]).asInstanceOf[T]

inline def withSpring(toValue: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("withSpring")(toValue.asInstanceOf[js.Any]).asInstanceOf[String]
inline def withSpring(toValue: String, userConfig: Unit, callback: AnimationCallback): String = (^.asInstanceOf[js.Dynamic].applyDynamic("withSpring")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
inline def withSpring(toValue: String, userConfig: WithSpringConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("withSpring")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[String]
inline def withSpring(toValue: String, userConfig: WithSpringConfig, callback: AnimationCallback): String = (^.asInstanceOf[js.Dynamic].applyDynamic("withSpring")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
inline def withSpring(toValue: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("withSpring")(toValue.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
inline def withSpring(toValue: js.Array[Double], userConfig: Unit, callback: AnimationCallback): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSpring")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
inline def withSpring(toValue: js.Array[Double], userConfig: WithSpringConfig): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSpring")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
inline def withSpring(toValue: js.Array[Double], userConfig: WithSpringConfig, callback: AnimationCallback): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSpring")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
inline def withSpring(toValue: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("withSpring")(toValue.asInstanceOf[js.Any]).asInstanceOf[Double]
inline def withSpring(toValue: Double, userConfig: Unit, callback: AnimationCallback): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("withSpring")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def withSpring(toValue: Double, userConfig: WithSpringConfig): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("withSpring")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def withSpring(toValue: Double, userConfig: WithSpringConfig, callback: AnimationCallback): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("withSpring")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def withTiming(toValue: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("withTiming")(toValue.asInstanceOf[js.Any]).asInstanceOf[String]
inline def withTiming(toValue: String, userConfig: Unit, callback: AnimationCallback): String = (^.asInstanceOf[js.Dynamic].applyDynamic("withTiming")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
inline def withTiming(toValue: String, userConfig: WithTimingConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("withTiming")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[String]
inline def withTiming(toValue: String, userConfig: WithTimingConfig, callback: AnimationCallback): String = (^.asInstanceOf[js.Dynamic].applyDynamic("withTiming")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
inline def withTiming(toValue: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTiming")(toValue.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
inline def withTiming(toValue: js.Array[Double], userConfig: Unit, callback: AnimationCallback): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTiming")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
inline def withTiming(toValue: js.Array[Double], userConfig: WithTimingConfig): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTiming")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
inline def withTiming(toValue: js.Array[Double], userConfig: WithTimingConfig, callback: AnimationCallback): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTiming")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
inline def withTiming(toValue: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("withTiming")(toValue.asInstanceOf[js.Any]).asInstanceOf[Double]
inline def withTiming(toValue: Double, userConfig: Unit, callback: AnimationCallback): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("withTiming")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def withTiming(toValue: Double, userConfig: WithTimingConfig): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("withTiming")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def withTiming(toValue: Double, userConfig: WithTimingConfig, callback: AnimationCallback): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("withTiming")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Double]

type AdaptTransforms[T] = typings.reactNativeReanimated.mod.Animated.AdaptTransforms[T]

type Adaptable[T] = typings.reactNativeReanimated.mod.Animated.Adaptable[T]

type AnimatableValue = Double | String | js.Array[Double]

type AnimateProps[P /* <: js.Object */] = typings.reactNativeReanimated.mod.Animated.AnimateProps[P]

type AnimateStyle[S] = typings.reactNativeReanimated.mod.Animated.AnimateStyle[S]

type AnimatedStyleProp[T] = AnimateStyle[T] | RegisteredStyle[AnimateStyle[T]]

type AnimatedTransform = typings.reactNativeReanimated.mod.Animated.AnimatedTransform

type Animation[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_commonTypes.Animation<T> */ Any

type AnimationCallback = js.Function2[/* finished */ js.UndefOr[Boolean], /* current */ js.UndefOr[AnimatableValue], Unit]

type Context = Record[String, Any]

type DecayAnimation = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.DecayAnimation */ Any

type DelayAnimation = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_commonTypes.DelayAnimation */ Any

type DependencyList = js.Array[Any]

type EasingFn = js.Function1[/* t */ Double, Double]

type EntryExitAnimationFunction = js.Function1[
(/* targetValues */ EntryAnimationsValues) | (/* targetValues */ ExitAnimationsValues), 
LayoutAnimation]

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeReanimated.mod.ExtrapolationConfig
  - typings.reactNativeReanimated.mod.Extrapolation
  - java.lang.String
  - scala.Unit
*/
type ExtrapolationType = js.UndefOr[_ExtrapolationType | String]

type Handler[T, TContext /* <: Context */] = js.Function2[/* event */ T, /* context */ TContext, Unit]

type LayoutAnimationFunction = js.Function1[/* targetValues */ LayoutAnimationsValues, LayoutAnimation]

type MeasuredDimensions = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_commonTypes.MeasuredDimensions */ Any

// gesture-handler
type OnGestureEvent[T /* <: GestureHandlerGestureEvent */] = js.Function1[/* event */ T, Unit]

// scroll view
type OnScroll = js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]

type PropsAdapterFunction = js.Function1[/* props */ Record[String, Any], Unit]

type RepeatAnimation = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.RepeatAnimation */ Any

type ScrollHandler[TContext /* <: Context */] = js.Function2[/* event */ NativeScrollEvent, /* context */ TContext, Unit]

type SensorValue3D = SharedValue[Value3D]

type SensorValueRotation = SharedValue[ValueRotation]

type SequenceAnimation = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.SequenceAnimation */ Any

type SharedValue[T] = typings.reactNativeReanimated.mod.Animated.SharedValue[T]

type SpringAnimation = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.SpringAnimation */ Any

type StyleLayoutAnimation = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.StyleLayoutAnimation */ Any

type TimingAnimation = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.TimingAnimation */ Any

type TransformStyleTypes = typings.reactNativeReanimated.mod.Animated.TransformStyleTypes
