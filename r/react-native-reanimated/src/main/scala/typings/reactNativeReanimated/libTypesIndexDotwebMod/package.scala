package typings.reactNativeReanimated.libTypesIndexDotwebMod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.MutableRefObject
import typings.react.mod.RefObject
import typings.reactNativeReanimated.anon.TypeofBaseAnimationBuildeInstantiable
import typings.reactNativeReanimated.libTypesIndexDotwebMod.^
import typings.reactNativeReanimated.libTypesReanimated2AnimationCommonTypesMod.DelayAnimation
import typings.reactNativeReanimated.libTypesReanimated2AnimationCommonTypesMod.NextAnimation
import typings.reactNativeReanimated.libTypesReanimated2AnimationCommonTypesMod.RepeatAnimation
import typings.reactNativeReanimated.libTypesReanimated2AnimationCommonTypesMod.SequenceAnimation
import typings.reactNativeReanimated.libTypesReanimated2AnimationCommonTypesMod.StyleLayoutAnimation
import typings.reactNativeReanimated.libTypesReanimated2AnimationDecayMod.DecayAnimation
import typings.reactNativeReanimated.libTypesReanimated2AnimationDecayMod.DecayConfig
import typings.reactNativeReanimated.libTypesReanimated2AnimationSpringMod.SpringAnimation
import typings.reactNativeReanimated.libTypesReanimated2AnimationSpringMod.SpringConfig
import typings.reactNativeReanimated.libTypesReanimated2AnimationTimingMod.TimingAnimation
import typings.reactNativeReanimated.libTypesReanimated2AnimationTimingMod.TimingConfig
import typings.reactNativeReanimated.libTypesReanimated2AnimationUtilMod.AnimationToDecoration
import typings.reactNativeReanimated.libTypesReanimated2ColorsMod.HSV
import typings.reactNativeReanimated.libTypesReanimated2ColorsMod.ParsedColorArray
import typings.reactNativeReanimated.libTypesReanimated2ColorsMod.RGB
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AdapterWorkletFunction
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimatableValue
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimatedKeyboardInfo
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimatedStyle
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.Animation
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimationCallback
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimationObject
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.BasicWorkletFunction
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.ComplexWorkletFunction
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.MeasuredDimensions
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.NativeEvent
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.SharedValue
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.Timestamp
import typings.reactNativeReanimated.libTypesReanimated2CoreMod.RunOnJSFunction
import typings.reactNativeReanimated.libTypesReanimated2FrameCallbackFrameCallbackRegistryUIMod.FrameInfo
import typings.reactNativeReanimated.libTypesReanimated2HookCommonTypesMod.Context
import typings.reactNativeReanimated.libTypesReanimated2HookCommonTypesMod.DependencyList
import typings.reactNativeReanimated.libTypesReanimated2HookCommonTypesMod.Descriptor
import typings.reactNativeReanimated.libTypesReanimated2HookCommonTypesMod.RefObjectFunction
import typings.reactNativeReanimated.libTypesReanimated2HookUseAnimatedGestureHandlerMod.GestureHandlerEvent
import typings.reactNativeReanimated.libTypesReanimated2HookUseAnimatedGestureHandlerMod.GestureHandlers
import typings.reactNativeReanimated.libTypesReanimated2HookUseAnimatedReactionMod.AnimatedReactionWorkletFunction
import typings.reactNativeReanimated.libTypesReanimated2HookUseAnimatedScrollHandlerMod.ScrollEvent
import typings.reactNativeReanimated.libTypesReanimated2HookUseAnimatedScrollHandlerMod.ScrollHandler
import typings.reactNativeReanimated.libTypesReanimated2HookUseAnimatedScrollHandlerMod.ScrollHandlers
import typings.reactNativeReanimated.libTypesReanimated2HookUseAnimatedSensorMod.AnimatedSensor
import typings.reactNativeReanimated.libTypesReanimated2HookUseAnimatedSensorMod.SensorConfig
import typings.reactNativeReanimated.libTypesReanimated2HookUseAnimatedStyleMod.AnimatedStyleResult
import typings.reactNativeReanimated.libTypesReanimated2HookUseDerivedValueMod.DerivedValue
import typings.reactNativeReanimated.libTypesReanimated2HookUseFrameCallbackMod.FrameCallback
import typings.reactNativeReanimated.libTypesReanimated2HookUtilsMod.Handlers
import typings.reactNativeReanimated.libTypesReanimated2HookUtilsMod.UseHandlerContext
import typings.reactNativeReanimated.libTypesReanimated2InterpolateColorMod.InterpolateConfig
import typings.reactNativeReanimated.libTypesReanimated2InterpolationMod.ExtrapolationType
import typings.reactNativeReanimated.libTypesReanimated2InterpolationMod.InterpolatedNode
import typings.reactNativeReanimated.libTypesReanimated2UtilsMod.ComponentCoords
import typings.reactNativeReanimated.mod.Animated.ScrollView
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def RGBtoHSV(rgb: RGB): HSV = ^.asInstanceOf[js.Dynamic].applyDynamic("RGBtoHSV")(rgb.asInstanceOf[js.Any]).asInstanceOf[HSV]
inline def RGBtoHSV(r: Double, g: Double, b: Double): HSV = (^.asInstanceOf[js.Dynamic].applyDynamic("RGBtoHSV")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[HSV]

inline def SVGAdapter: AdapterWorkletFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("SVGAdapter").asInstanceOf[AdapterWorkletFunction]

inline def TextInputAdapter: AdapterWorkletFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("TextInputAdapter").asInstanceOf[AdapterWorkletFunction]

inline def blue(c: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("blue")(c.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def cancelAnimation[T](sharedValue: SharedValue[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelAnimation")(sharedValue.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def checkPluginState(throwError: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkPluginState")(throwError.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def combineTransition(exiting: TypeofBaseAnimationBuildeInstantiable, entering: TypeofBaseAnimationBuildeInstantiable): typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationDefaultTransitionsEntryExitTransitionMod.EntryExitTransition = (^.asInstanceOf[js.Dynamic].applyDynamic("combineTransition")(exiting.asInstanceOf[js.Any], entering.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationDefaultTransitionsEntryExitTransitionMod.EntryExitTransition]
inline def combineTransition(
  exiting: TypeofBaseAnimationBuildeInstantiable,
  entering: typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderMod.BaseAnimationBuilder
): typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationDefaultTransitionsEntryExitTransitionMod.EntryExitTransition = (^.asInstanceOf[js.Dynamic].applyDynamic("combineTransition")(exiting.asInstanceOf[js.Any], entering.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationDefaultTransitionsEntryExitTransitionMod.EntryExitTransition]
inline def combineTransition(
  exiting: typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderMod.BaseAnimationBuilder,
  entering: TypeofBaseAnimationBuildeInstantiable
): typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationDefaultTransitionsEntryExitTransitionMod.EntryExitTransition = (^.asInstanceOf[js.Dynamic].applyDynamic("combineTransition")(exiting.asInstanceOf[js.Any], entering.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationDefaultTransitionsEntryExitTransitionMod.EntryExitTransition]
inline def combineTransition(
  exiting: typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderMod.BaseAnimationBuilder,
  entering: typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderMod.BaseAnimationBuilder
): typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationDefaultTransitionsEntryExitTransitionMod.EntryExitTransition = (^.asInstanceOf[js.Dynamic].applyDynamic("combineTransition")(exiting.asInstanceOf[js.Any], entering.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeReanimated.libTypesReanimated2LayoutReanimationDefaultTransitionsEntryExitTransitionMod.EntryExitTransition]

inline def configureProps(uiProps: js.Array[String], nativeProps: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configureProps")(uiProps.asInstanceOf[js.Any], nativeProps.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def convertToHSVA(color: Any): ParsedColorArray = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToHSVA")(color.asInstanceOf[js.Any]).asInstanceOf[ParsedColorArray]

inline def createAnimatedPropAdapter(adapter: AdapterWorkletFunction): AdapterWorkletFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedPropAdapter")(adapter.asInstanceOf[js.Any]).asInstanceOf[AdapterWorkletFunction]
inline def createAnimatedPropAdapter(adapter: AdapterWorkletFunction, nativeProps: js.Array[String]): AdapterWorkletFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedPropAdapter")(adapter.asInstanceOf[js.Any], nativeProps.asInstanceOf[js.Any])).asInstanceOf[AdapterWorkletFunction]

inline def defineAnimation[T /* <: AnimationObject | StyleLayoutAnimation */](starting: AnimationToDecoration[T], factory: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("defineAnimation")(starting.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[T]

inline def enableLayoutAnimations(flag: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLayoutAnimations")(flag.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def enableLayoutAnimations(flag: Boolean, isCallByUser: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLayoutAnimations")(flag.asInstanceOf[js.Any], isCallByUser.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def getRelativeCoords(
  parentRef: RefObjectFunction[Component[js.Object, js.Object, Any]],
  absoluteX: Double,
  absoluteY: Double
): ComponentCoords | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativeCoords")(parentRef.asInstanceOf[js.Any], absoluteX.asInstanceOf[js.Any], absoluteY.asInstanceOf[js.Any])).asInstanceOf[ComponentCoords | Null]

inline def getTag(): Null | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTag")().asInstanceOf[Null | Double]
inline def getTag(view: Double): Null | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTag")(view.asInstanceOf[js.Any]).asInstanceOf[Null | Double]
inline def getTag(view: Component[Any, Any, Any]): Null | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTag")(view.asInstanceOf[js.Any]).asInstanceOf[Null | Double]
inline def getTag(view: ComponentClass[Any, ComponentState]): Null | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTag")(view.asInstanceOf[js.Any]).asInstanceOf[Null | Double]

inline def getTimestamp(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimestamp")().asInstanceOf[Double]

inline def getViewProp[T](viewTag: String, propName: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getViewProp")(viewTag.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]

inline def green(c: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("green")(c.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def hsvToColor(h: Double, s: Double, v: Double): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("hsvToColor")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Double | String]

inline def initialUpdaterRun[T](updater: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("initialUpdaterRun")(updater.asInstanceOf[js.Any]).asInstanceOf[T]

inline def interpolate(x: Double, input: js.Array[Double], output: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(x.asInstanceOf[js.Any], input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def interpolate(x: Double, input: js.Array[Double], output: js.Array[Double], `type`: ExtrapolationType): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(x.asInstanceOf[js.Any], input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def interpolate(x: InterpolatedNode, input: js.Array[Double], output: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(x.asInstanceOf[js.Any], input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def interpolate(x: InterpolatedNode, input: js.Array[Double], output: js.Array[Double], `type`: ExtrapolationType): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(x.asInstanceOf[js.Any], input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def interpolateColor(value: Double, inputRange: js.Array[Double], outputRange: js.Array[String | Double]): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateColor")(value.asInstanceOf[js.Any], inputRange.asInstanceOf[js.Any], outputRange.asInstanceOf[js.Any])).asInstanceOf[String | Double]
inline def interpolateColor(
  value: Double,
  inputRange: js.Array[Double],
  outputRange: js.Array[String | Double],
  colorSpace: typings.reactNativeReanimated.reactNativeReanimatedStrings.RGB | typings.reactNativeReanimated.reactNativeReanimatedStrings.HSV
): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateColor")(value.asInstanceOf[js.Any], inputRange.asInstanceOf[js.Any], outputRange.asInstanceOf[js.Any], colorSpace.asInstanceOf[js.Any])).asInstanceOf[String | Double]

inline def interpolateSharableColor(value: Double, interpolateConfig: SharedValue[InterpolateConfig]): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateSharableColor")(value.asInstanceOf[js.Any], interpolateConfig.asInstanceOf[js.Any])).asInstanceOf[String | Double]

inline def isColor(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isColor")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isConfigured(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConfigured")().asInstanceOf[Boolean]
inline def isConfigured(throwError: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConfigured")(throwError.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isConfiguredCheck(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isConfiguredCheck")().asInstanceOf[Unit]

inline def jestResetJsReanimatedModule(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("jestResetJsReanimatedModule")().asInstanceOf[Unit]

inline def makeMutable[T](value: T): SharedValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMutable")(value.asInstanceOf[js.Any]).asInstanceOf[SharedValue[T]]

inline def makeRemote[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRemote")().asInstanceOf[T]
inline def makeRemote[T](`object`: js.Object): T = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRemote")(`object`.asInstanceOf[js.Any]).asInstanceOf[T]

inline def makeShareable[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("makeShareable")(value.asInstanceOf[js.Any]).asInstanceOf[T]

inline def measure: js.Function1[
/* animatedRef */ RefObjectFunction[Component[js.Object, js.Object, Any]], 
MeasuredDimensions | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("measure").asInstanceOf[js.Function1[
/* animatedRef */ RefObjectFunction[Component[js.Object, js.Object, Any]], 
MeasuredDimensions | Null]]
inline def measure_=(
  x: js.Function1[
  /* animatedRef */ RefObjectFunction[Component[js.Object, js.Object, Any]], 
  MeasuredDimensions | Null
]
): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("measure")(x.asInstanceOf[js.Any])

inline def opacity(c: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("opacity")(c.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def processColor(color: Any): js.UndefOr[Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("processColor")(color.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double | Null]]

inline def processColorInitially(color: Any): js.UndefOr[Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("processColorInitially")(color.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double | Null]]

inline def red(c: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("red")(c.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def requestFrame(frame: js.Function1[/* timestamp */ Timestamp, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestFrame")(frame.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def rgbaColor(r: Double, g: Double, b: Double): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbaColor")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double | String]
inline def rgbaColor(r: Double, g: Double, b: Double, alpha: Double): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbaColor")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Double | String]

inline def runOnJS[A /* <: js.Array[Any] */, R](fun: RunOnJSFunction[A, R]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("runOnJS")(fun.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]

inline def runOnUI[A /* <: js.Array[Any] */, R](worklet: ComplexWorkletFunction[A, R]): js.Function1[/* args */ A, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("runOnUI")(worklet.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ A, Unit]]

inline def scrollTo: js.Function4[
/* animatedRef */ RefObjectFunction[Component[js.Object, js.Object, Any]], 
/* x */ Double, 
/* y */ Double, 
/* animated */ Boolean, 
Unit] = ^.asInstanceOf[js.Dynamic].selectDynamic("scrollTo").asInstanceOf[js.Function4[
/* animatedRef */ RefObjectFunction[Component[js.Object, js.Object, Any]], 
/* x */ Double, 
/* y */ Double, 
/* animated */ Boolean, 
Unit]]
inline def scrollTo_=(
  x: js.Function4[
  /* animatedRef */ RefObjectFunction[Component[js.Object, js.Object, Any]], 
  /* x */ Double, 
  /* y */ Double, 
  /* animated */ Boolean, 
  Unit
]
): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(x.asInstanceOf[js.Any])

inline def setGestureState(handlerTag: Double, newState: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setGestureState")(handlerTag.asInstanceOf[js.Any], newState.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def startMapper(mapper: js.Function0[Unit]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any]).asInstanceOf[Double]
inline def startMapper(mapper: js.Function0[Unit], inputs: js.Array[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def startMapper(mapper: js.Function0[Unit], inputs: js.Array[Any], outputs: js.Array[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def startMapper(
  mapper: js.Function0[Unit],
  inputs: js.Array[Any],
  outputs: js.Array[Any],
  updater: js.Function0[Unit]
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def startMapper(
  mapper: js.Function0[Unit],
  inputs: js.Array[Any],
  outputs: js.Array[Any],
  updater: js.Function0[Unit],
  viewDescriptors: js.Array[Descriptor]
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def startMapper(
  mapper: js.Function0[Unit],
  inputs: js.Array[Any],
  outputs: js.Array[Any],
  updater: js.Function0[Unit],
  viewDescriptors: SharedValue[js.Array[Descriptor]]
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def startMapper(
  mapper: js.Function0[Unit],
  inputs: js.Array[Any],
  outputs: js.Array[Any],
  updater: Unit,
  viewDescriptors: js.Array[Descriptor]
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def startMapper(
  mapper: js.Function0[Unit],
  inputs: js.Array[Any],
  outputs: js.Array[Any],
  updater: Unit,
  viewDescriptors: SharedValue[js.Array[Descriptor]]
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def startMapper(mapper: js.Function0[Unit], inputs: js.Array[Any], outputs: Unit, updater: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def startMapper(
  mapper: js.Function0[Unit],
  inputs: js.Array[Any],
  outputs: Unit,
  updater: js.Function0[Unit],
  viewDescriptors: js.Array[Descriptor]
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def startMapper(
  mapper: js.Function0[Unit],
  inputs: js.Array[Any],
  outputs: Unit,
  updater: js.Function0[Unit],
  viewDescriptors: SharedValue[js.Array[Descriptor]]
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def startMapper(
  mapper: js.Function0[Unit],
  inputs: js.Array[Any],
  outputs: Unit,
  updater: Unit,
  viewDescriptors: js.Array[Descriptor]
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def startMapper(
  mapper: js.Function0[Unit],
  inputs: js.Array[Any],
  outputs: Unit,
  updater: Unit,
  viewDescriptors: SharedValue[js.Array[Descriptor]]
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def startMapper(mapper: js.Function0[Unit], inputs: Unit, outputs: js.Array[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def startMapper(mapper: js.Function0[Unit], inputs: Unit, outputs: js.Array[Any], updater: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def startMapper(
  mapper: js.Function0[Unit],
  inputs: Unit,
  outputs: js.Array[Any],
  updater: js.Function0[Unit],
  viewDescriptors: js.Array[Descriptor]
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def startMapper(
  mapper: js.Function0[Unit],
  inputs: Unit,
  outputs: js.Array[Any],
  updater: js.Function0[Unit],
  viewDescriptors: SharedValue[js.Array[Descriptor]]
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def startMapper(
  mapper: js.Function0[Unit],
  inputs: Unit,
  outputs: js.Array[Any],
  updater: Unit,
  viewDescriptors: js.Array[Descriptor]
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def startMapper(
  mapper: js.Function0[Unit],
  inputs: Unit,
  outputs: js.Array[Any],
  updater: Unit,
  viewDescriptors: SharedValue[js.Array[Descriptor]]
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def startMapper(mapper: js.Function0[Unit], inputs: Unit, outputs: Unit, updater: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def startMapper(
  mapper: js.Function0[Unit],
  inputs: Unit,
  outputs: Unit,
  updater: js.Function0[Unit],
  viewDescriptors: js.Array[Descriptor]
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def startMapper(
  mapper: js.Function0[Unit],
  inputs: Unit,
  outputs: Unit,
  updater: js.Function0[Unit],
  viewDescriptors: SharedValue[js.Array[Descriptor]]
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def startMapper(
  mapper: js.Function0[Unit],
  inputs: Unit,
  outputs: Unit,
  updater: Unit,
  viewDescriptors: js.Array[Descriptor]
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def startMapper(
  mapper: js.Function0[Unit],
  inputs: Unit,
  outputs: Unit,
  updater: Unit,
  viewDescriptors: SharedValue[js.Array[Descriptor]]
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def stopMapper(mapperId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopMapper")(mapperId.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def toRGBA(HSVA: ParsedColorArray): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toRGBA")(HSVA.asInstanceOf[js.Any]).asInstanceOf[String]

inline def useAnimatedGestureHandler[T /* <: GestureHandlerEvent[T] */, TContext /* <: Context */](handlers: GestureHandlers[T, TContext]): (MutableRefObject[
typings.reactNativeReanimated.libTypesReanimated2WorkletEventHandlerMod.default[T] | Null]) | (js.Function1[/* e */ T, Unit]) = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedGestureHandler")(handlers.asInstanceOf[js.Any]).asInstanceOf[(MutableRefObject[
typings.reactNativeReanimated.libTypesReanimated2WorkletEventHandlerMod.default[T] | Null]) | (js.Function1[/* e */ T, Unit])]
inline def useAnimatedGestureHandler[T /* <: GestureHandlerEvent[T] */, TContext /* <: Context */](handlers: GestureHandlers[T, TContext], dependencies: DependencyList): (MutableRefObject[
typings.reactNativeReanimated.libTypesReanimated2WorkletEventHandlerMod.default[T] | Null]) | (js.Function1[/* e */ T, Unit]) = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedGestureHandler")(handlers.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[(MutableRefObject[
typings.reactNativeReanimated.libTypesReanimated2WorkletEventHandlerMod.default[T] | Null]) | (js.Function1[/* e */ T, Unit])]

inline def useAnimatedKeyboard(): AnimatedKeyboardInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedKeyboard")().asInstanceOf[AnimatedKeyboardInfo]

inline def useAnimatedProps[T /* <: AnimatedStyle */](updater: BasicWorkletFunction[T]): AnimatedStyleResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedProps")(updater.asInstanceOf[js.Any]).asInstanceOf[AnimatedStyleResult]
inline def useAnimatedProps[T /* <: AnimatedStyle */](updater: BasicWorkletFunction[T], dependencies: Unit, adapters: js.Array[AdapterWorkletFunction]): AnimatedStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedProps")(updater.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[AnimatedStyleResult]
inline def useAnimatedProps[T /* <: AnimatedStyle */](updater: BasicWorkletFunction[T], dependencies: Unit, adapters: AdapterWorkletFunction): AnimatedStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedProps")(updater.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[AnimatedStyleResult]
inline def useAnimatedProps[T /* <: AnimatedStyle */](updater: BasicWorkletFunction[T], dependencies: DependencyList): AnimatedStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedProps")(updater.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[AnimatedStyleResult]
inline def useAnimatedProps[T /* <: AnimatedStyle */](
  updater: BasicWorkletFunction[T],
  dependencies: DependencyList,
  adapters: js.Array[AdapterWorkletFunction]
): AnimatedStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedProps")(updater.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[AnimatedStyleResult]
inline def useAnimatedProps[T /* <: AnimatedStyle */](updater: BasicWorkletFunction[T], dependencies: DependencyList, adapters: AdapterWorkletFunction): AnimatedStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedProps")(updater.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[AnimatedStyleResult]

inline def useAnimatedReaction[T](
  prepare: BasicWorkletFunction[T],
  react: AnimatedReactionWorkletFunction[T],
  dependencies: DependencyList
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedReaction")(prepare.asInstanceOf[js.Any], react.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def useAnimatedRef[T /* <: Component[js.Object, js.Object, Any] */](): RefObjectFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedRef")().asInstanceOf[RefObjectFunction[T]]

inline def useAnimatedScrollHandler[TContext /* <: Context */](handlers: ScrollHandler[TContext]): RefObject[
typings.reactNativeReanimated.libTypesReanimated2WorkletEventHandlerMod.default[ScrollEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedScrollHandler")(handlers.asInstanceOf[js.Any]).asInstanceOf[RefObject[
typings.reactNativeReanimated.libTypesReanimated2WorkletEventHandlerMod.default[ScrollEvent]]]
inline def useAnimatedScrollHandler[TContext /* <: Context */](handlers: ScrollHandler[TContext], dependencies: DependencyList): RefObject[
typings.reactNativeReanimated.libTypesReanimated2WorkletEventHandlerMod.default[ScrollEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedScrollHandler")(handlers.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[RefObject[
typings.reactNativeReanimated.libTypesReanimated2WorkletEventHandlerMod.default[ScrollEvent]]]
inline def useAnimatedScrollHandler[TContext /* <: Context */](handlers: ScrollHandlers[TContext]): RefObject[
typings.reactNativeReanimated.libTypesReanimated2WorkletEventHandlerMod.default[ScrollEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedScrollHandler")(handlers.asInstanceOf[js.Any]).asInstanceOf[RefObject[
typings.reactNativeReanimated.libTypesReanimated2WorkletEventHandlerMod.default[ScrollEvent]]]
inline def useAnimatedScrollHandler[TContext /* <: Context */](handlers: ScrollHandlers[TContext], dependencies: DependencyList): RefObject[
typings.reactNativeReanimated.libTypesReanimated2WorkletEventHandlerMod.default[ScrollEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedScrollHandler")(handlers.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[RefObject[
typings.reactNativeReanimated.libTypesReanimated2WorkletEventHandlerMod.default[ScrollEvent]]]

inline def useAnimatedSensor(sensorType: typings.reactNativeReanimated.libTypesReanimated2HookUseAnimatedSensorMod.SensorType): AnimatedSensor = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedSensor")(sensorType.asInstanceOf[js.Any]).asInstanceOf[AnimatedSensor]
inline def useAnimatedSensor(
  sensorType: typings.reactNativeReanimated.libTypesReanimated2HookUseAnimatedSensorMod.SensorType,
  userConfig: SensorConfig
): AnimatedSensor = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedSensor")(sensorType.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[AnimatedSensor]

inline def useAnimatedStyle[T /* <: AnimatedStyle */](updater: BasicWorkletFunction[T]): AnimatedStyleResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedStyle")(updater.asInstanceOf[js.Any]).asInstanceOf[AnimatedStyleResult]
inline def useAnimatedStyle[T /* <: AnimatedStyle */](updater: BasicWorkletFunction[T], dependencies: Unit, adapters: js.Array[AdapterWorkletFunction]): AnimatedStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedStyle")(updater.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[AnimatedStyleResult]
inline def useAnimatedStyle[T /* <: AnimatedStyle */](updater: BasicWorkletFunction[T], dependencies: Unit, adapters: AdapterWorkletFunction): AnimatedStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedStyle")(updater.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[AnimatedStyleResult]
inline def useAnimatedStyle[T /* <: AnimatedStyle */](updater: BasicWorkletFunction[T], dependencies: DependencyList): AnimatedStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedStyle")(updater.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[AnimatedStyleResult]
inline def useAnimatedStyle[T /* <: AnimatedStyle */](
  updater: BasicWorkletFunction[T],
  dependencies: DependencyList,
  adapters: js.Array[AdapterWorkletFunction]
): AnimatedStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedStyle")(updater.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[AnimatedStyleResult]
inline def useAnimatedStyle[T /* <: AnimatedStyle */](updater: BasicWorkletFunction[T], dependencies: DependencyList, adapters: AdapterWorkletFunction): AnimatedStyleResult = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedStyle")(updater.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[AnimatedStyleResult]

inline def useDerivedValue[T](processor: BasicWorkletFunction[T], dependencies: DependencyList): DerivedValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDerivedValue")(processor.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[DerivedValue[T]]

inline def useEvent[T /* <: NativeEvent[T] */](handler: js.Function1[/* event */ T, Unit]): MutableRefObject[
typings.reactNativeReanimated.libTypesReanimated2WorkletEventHandlerMod.default[T] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEvent")(handler.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[
typings.reactNativeReanimated.libTypesReanimated2WorkletEventHandlerMod.default[T] | Null]]
inline def useEvent[T /* <: NativeEvent[T] */](handler: js.Function1[/* event */ T, Unit], eventNames: js.Array[String]): MutableRefObject[
typings.reactNativeReanimated.libTypesReanimated2WorkletEventHandlerMod.default[T] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useEvent")(handler.asInstanceOf[js.Any], eventNames.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[
typings.reactNativeReanimated.libTypesReanimated2WorkletEventHandlerMod.default[T] | Null]]
inline def useEvent[T /* <: NativeEvent[T] */](handler: js.Function1[/* event */ T, Unit], eventNames: js.Array[String], rebuild: Boolean): MutableRefObject[
typings.reactNativeReanimated.libTypesReanimated2WorkletEventHandlerMod.default[T] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useEvent")(handler.asInstanceOf[js.Any], eventNames.asInstanceOf[js.Any], rebuild.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[
typings.reactNativeReanimated.libTypesReanimated2WorkletEventHandlerMod.default[T] | Null]]
inline def useEvent[T /* <: NativeEvent[T] */](handler: js.Function1[/* event */ T, Unit], eventNames: Unit, rebuild: Boolean): MutableRefObject[
typings.reactNativeReanimated.libTypesReanimated2WorkletEventHandlerMod.default[T] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useEvent")(handler.asInstanceOf[js.Any], eventNames.asInstanceOf[js.Any], rebuild.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[
typings.reactNativeReanimated.libTypesReanimated2WorkletEventHandlerMod.default[T] | Null]]

inline def useFrameCallback(callback: js.Function1[/* frameInfo */ FrameInfo, Unit]): FrameCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("useFrameCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[FrameCallback]
inline def useFrameCallback(callback: js.Function1[/* frameInfo */ FrameInfo, Unit], autostart: Boolean): FrameCallback = (^.asInstanceOf[js.Dynamic].applyDynamic("useFrameCallback")(callback.asInstanceOf[js.Any], autostart.asInstanceOf[js.Any])).asInstanceOf[FrameCallback]

inline def useHandler[T, TContext /* <: Context */](handlers: Handlers[T, TContext]): UseHandlerContext[TContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("useHandler")(handlers.asInstanceOf[js.Any]).asInstanceOf[UseHandlerContext[TContext]]
inline def useHandler[T, TContext /* <: Context */](handlers: Handlers[T, TContext], dependencies: DependencyList): UseHandlerContext[TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("useHandler")(handlers.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[UseHandlerContext[TContext]]

inline def useInterpolateConfig(inputRange: js.Array[Double], outputRange: js.Array[String | Double]): SharedValue[InterpolateConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterpolateConfig")(inputRange.asInstanceOf[js.Any], outputRange.asInstanceOf[js.Any])).asInstanceOf[SharedValue[InterpolateConfig]]
inline def useInterpolateConfig(
  inputRange: js.Array[Double],
  outputRange: js.Array[String | Double],
  colorSpace: typings.reactNativeReanimated.libTypesReanimated2InterpolateColorMod.ColorSpace
): SharedValue[InterpolateConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterpolateConfig")(inputRange.asInstanceOf[js.Any], outputRange.asInstanceOf[js.Any], colorSpace.asInstanceOf[js.Any])).asInstanceOf[SharedValue[InterpolateConfig]]

inline def useScrollViewOffset(aref: RefObject[ScrollView]): SharedValue[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollViewOffset")(aref.asInstanceOf[js.Any]).asInstanceOf[SharedValue[Double]]

inline def useSharedValue[T](init: T): SharedValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSharedValue")(init.asInstanceOf[js.Any]).asInstanceOf[SharedValue[T]]

inline def useWorkletCallback[A /* <: js.Array[Any] */, R](fun: js.Function1[/* args */ A, R]): js.Function1[
/* args */ Parameters[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fun */ Any], 
R] = ^.asInstanceOf[js.Dynamic].applyDynamic("useWorkletCallback")(fun.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
/* args */ Parameters[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fun */ Any], 
R]]
inline def useWorkletCallback[A /* <: js.Array[Any] */, R](fun: js.Function1[/* args */ A, R], deps: DependencyList): js.Function1[
/* args */ Parameters[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fun */ Any], 
R] = (^.asInstanceOf[js.Dynamic].applyDynamic("useWorkletCallback")(fun.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
/* args */ Parameters[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fun */ Any], 
R]]

inline def withDecay(userConfig: DecayConfig): Animation[DecayAnimation] = ^.asInstanceOf[js.Dynamic].applyDynamic("withDecay")(userConfig.asInstanceOf[js.Any]).asInstanceOf[Animation[DecayAnimation]]
inline def withDecay(userConfig: DecayConfig, callback: AnimationCallback): Animation[DecayAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withDecay")(userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation[DecayAnimation]]

inline def withDelay(delayMs: Double, _nextAnimation: NextAnimation[DelayAnimation]): Animation[DelayAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withDelay")(delayMs.asInstanceOf[js.Any], _nextAnimation.asInstanceOf[js.Any])).asInstanceOf[Animation[DelayAnimation]]

inline def withRepeat(_nextAnimation: NextAnimation[RepeatAnimation]): Animation[RepeatAnimation] = ^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(_nextAnimation.asInstanceOf[js.Any]).asInstanceOf[Animation[RepeatAnimation]]
inline def withRepeat(_nextAnimation: NextAnimation[RepeatAnimation], numberOfReps: Double): Animation[RepeatAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(_nextAnimation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any])).asInstanceOf[Animation[RepeatAnimation]]
inline def withRepeat(_nextAnimation: NextAnimation[RepeatAnimation], numberOfReps: Double, reverse: Boolean): Animation[RepeatAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(_nextAnimation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Animation[RepeatAnimation]]
inline def withRepeat(
  _nextAnimation: NextAnimation[RepeatAnimation],
  numberOfReps: Double,
  reverse: Boolean,
  callback: AnimationCallback
): Animation[RepeatAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(_nextAnimation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation[RepeatAnimation]]
inline def withRepeat(
  _nextAnimation: NextAnimation[RepeatAnimation],
  numberOfReps: Double,
  reverse: Unit,
  callback: AnimationCallback
): Animation[RepeatAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(_nextAnimation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation[RepeatAnimation]]
inline def withRepeat(_nextAnimation: NextAnimation[RepeatAnimation], numberOfReps: Unit, reverse: Boolean): Animation[RepeatAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(_nextAnimation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Animation[RepeatAnimation]]
inline def withRepeat(
  _nextAnimation: NextAnimation[RepeatAnimation],
  numberOfReps: Unit,
  reverse: Boolean,
  callback: AnimationCallback
): Animation[RepeatAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(_nextAnimation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation[RepeatAnimation]]
inline def withRepeat(
  _nextAnimation: NextAnimation[RepeatAnimation],
  numberOfReps: Unit,
  reverse: Unit,
  callback: AnimationCallback
): Animation[RepeatAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withRepeat")(_nextAnimation.asInstanceOf[js.Any], numberOfReps.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation[RepeatAnimation]]

inline def withSequence(_animations: NextAnimation[AnimationObject]*): Animation[SequenceAnimation] = ^.asInstanceOf[js.Dynamic].applyDynamic("withSequence")(_animations.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Animation[SequenceAnimation]]

inline def withSpring(toValue: AnimatableValue): Animation[SpringAnimation] = ^.asInstanceOf[js.Dynamic].applyDynamic("withSpring")(toValue.asInstanceOf[js.Any]).asInstanceOf[Animation[SpringAnimation]]
inline def withSpring(toValue: AnimatableValue, userConfig: Unit, callback: AnimationCallback): Animation[SpringAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSpring")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation[SpringAnimation]]
inline def withSpring(toValue: AnimatableValue, userConfig: SpringConfig): Animation[SpringAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSpring")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[Animation[SpringAnimation]]
inline def withSpring(toValue: AnimatableValue, userConfig: SpringConfig, callback: AnimationCallback): Animation[SpringAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSpring")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation[SpringAnimation]]

inline def withStyleAnimation(styleAnimations: AnimatedStyle): StyleLayoutAnimation = ^.asInstanceOf[js.Dynamic].applyDynamic("withStyleAnimation")(styleAnimations.asInstanceOf[js.Any]).asInstanceOf[StyleLayoutAnimation]

inline def withTiming(toValue: AnimatableValue): Animation[TimingAnimation] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTiming")(toValue.asInstanceOf[js.Any]).asInstanceOf[Animation[TimingAnimation]]
inline def withTiming(toValue: AnimatableValue, userConfig: Unit, callback: AnimationCallback): Animation[TimingAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTiming")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation[TimingAnimation]]
inline def withTiming(toValue: AnimatableValue, userConfig: TimingConfig): Animation[TimingAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTiming")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[Animation[TimingAnimation]]
inline def withTiming(toValue: AnimatableValue, userConfig: TimingConfig, callback: AnimationCallback): Animation[TimingAnimation] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTiming")(toValue.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation[TimingAnimation]]
