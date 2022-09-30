package typings.reactNativeReanimated.indexWebMod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.MutableRefObject
import typings.react.mod.RefObject
import typings.reactNativeReanimated.anon.TypeofBaseAnimationBuildeInstantiable
import typings.reactNativeReanimated.colorsMod.HSV
import typings.reactNativeReanimated.colorsMod.ParsedColorArray
import typings.reactNativeReanimated.colorsMod.RGB
import typings.reactNativeReanimated.commonTypesMod.DelayAnimation
import typings.reactNativeReanimated.commonTypesMod.NextAnimation
import typings.reactNativeReanimated.commonTypesMod.RepeatAnimation
import typings.reactNativeReanimated.commonTypesMod.SequenceAnimation
import typings.reactNativeReanimated.commonTypesMod.StyleLayoutAnimation
import typings.reactNativeReanimated.coreMod.RunOnJSFunction
import typings.reactNativeReanimated.decayMod.DecayAnimation
import typings.reactNativeReanimated.decayMod.DecayConfig
import typings.reactNativeReanimated.hookCommonTypesMod.Context
import typings.reactNativeReanimated.hookCommonTypesMod.DependencyList
import typings.reactNativeReanimated.hookCommonTypesMod.Descriptor
import typings.reactNativeReanimated.hookCommonTypesMod.RefObjectFunction
import typings.reactNativeReanimated.indexWebMod.^
import typings.reactNativeReanimated.interpolateColorMod.InterpolateConfig
import typings.reactNativeReanimated.interpolationMod.ExtrapolationType
import typings.reactNativeReanimated.interpolationMod.InterpolatedNode
import typings.reactNativeReanimated.nativeMethodsMod.MeasuredDimensions
import typings.reactNativeReanimated.reanimated2CommonTypesMod.AdapterWorkletFunction
import typings.reactNativeReanimated.reanimated2CommonTypesMod.AnimatableValue
import typings.reactNativeReanimated.reanimated2CommonTypesMod.AnimatedKeyboardInfo
import typings.reactNativeReanimated.reanimated2CommonTypesMod.AnimatedStyle
import typings.reactNativeReanimated.reanimated2CommonTypesMod.Animation
import typings.reactNativeReanimated.reanimated2CommonTypesMod.AnimationCallback
import typings.reactNativeReanimated.reanimated2CommonTypesMod.AnimationObject
import typings.reactNativeReanimated.reanimated2CommonTypesMod.BasicWorkletFunction
import typings.reactNativeReanimated.reanimated2CommonTypesMod.ComplexWorkletFunction
import typings.reactNativeReanimated.reanimated2CommonTypesMod.NativeEvent
import typings.reactNativeReanimated.reanimated2CommonTypesMod.SharedValue
import typings.reactNativeReanimated.reanimated2CommonTypesMod.Timestamp
import typings.reactNativeReanimated.reanimated2UtilsMod.ComponentCoords
import typings.reactNativeReanimated.springMod.SpringAnimation
import typings.reactNativeReanimated.springMod.SpringConfig
import typings.reactNativeReanimated.timingMod.TimingAnimation
import typings.reactNativeReanimated.timingMod.TimingConfig
import typings.reactNativeReanimated.useAnimatedGestureHandlerMod.GestureHandlerEvent
import typings.reactNativeReanimated.useAnimatedGestureHandlerMod.GestureHandlers
import typings.reactNativeReanimated.useAnimatedReactionMod.AnimatedReactionWorkletFunction
import typings.reactNativeReanimated.useAnimatedScrollHandlerMod.ScrollEvent
import typings.reactNativeReanimated.useAnimatedScrollHandlerMod.ScrollHandler
import typings.reactNativeReanimated.useAnimatedScrollHandlerMod.ScrollHandlers
import typings.reactNativeReanimated.useAnimatedSensorMod.AnimatedSensor
import typings.reactNativeReanimated.useAnimatedSensorMod.SensorConfig
import typings.reactNativeReanimated.useAnimatedStyleMod.AnimatedStyleResult
import typings.reactNativeReanimated.useDerivedValueMod.DerivedValue
import typings.reactNativeReanimated.useFrameCallbackMod.FrameCallback
import typings.reactNativeReanimated.utilMod.AnimationToDecoration
import typings.reactNativeReanimated.utilsMod.Handlers
import typings.reactNativeReanimated.utilsMod.UseHandlerContext
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

inline def combineTransition(
  exiting: typings.reactNativeReanimated.animationBuilderMod.BaseAnimationBuilder,
  entering: typings.reactNativeReanimated.animationBuilderMod.BaseAnimationBuilder
): typings.reactNativeReanimated.entryExitTransitionMod.EntryExitTransition = (^.asInstanceOf[js.Dynamic].applyDynamic("combineTransition")(exiting.asInstanceOf[js.Any], entering.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeReanimated.entryExitTransitionMod.EntryExitTransition]
inline def combineTransition(
  exiting: typings.reactNativeReanimated.animationBuilderMod.BaseAnimationBuilder,
  entering: TypeofBaseAnimationBuildeInstantiable
): typings.reactNativeReanimated.entryExitTransitionMod.EntryExitTransition = (^.asInstanceOf[js.Dynamic].applyDynamic("combineTransition")(exiting.asInstanceOf[js.Any], entering.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeReanimated.entryExitTransitionMod.EntryExitTransition]
inline def combineTransition(
  exiting: TypeofBaseAnimationBuildeInstantiable,
  entering: typings.reactNativeReanimated.animationBuilderMod.BaseAnimationBuilder
): typings.reactNativeReanimated.entryExitTransitionMod.EntryExitTransition = (^.asInstanceOf[js.Dynamic].applyDynamic("combineTransition")(exiting.asInstanceOf[js.Any], entering.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeReanimated.entryExitTransitionMod.EntryExitTransition]
inline def combineTransition(exiting: TypeofBaseAnimationBuildeInstantiable, entering: TypeofBaseAnimationBuildeInstantiable): typings.reactNativeReanimated.entryExitTransitionMod.EntryExitTransition = (^.asInstanceOf[js.Dynamic].applyDynamic("combineTransition")(exiting.asInstanceOf[js.Any], entering.asInstanceOf[js.Any])).asInstanceOf[typings.reactNativeReanimated.entryExitTransitionMod.EntryExitTransition]

inline def configureProps(uiProps: js.Array[String], nativeProps: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configureProps")(uiProps.asInstanceOf[js.Any], nativeProps.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def convertToHSVA(color: Any): ParsedColorArray = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToHSVA")(color.asInstanceOf[js.Any]).asInstanceOf[ParsedColorArray]

inline def createAnimatedPropAdapter(adapter: AdapterWorkletFunction): AdapterWorkletFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedPropAdapter")(adapter.asInstanceOf[js.Any]).asInstanceOf[AdapterWorkletFunction]
inline def createAnimatedPropAdapter(adapter: AdapterWorkletFunction, nativeProps: js.Array[String]): AdapterWorkletFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedPropAdapter")(adapter.asInstanceOf[js.Any], nativeProps.asInstanceOf[js.Any])).asInstanceOf[AdapterWorkletFunction]

inline def defineAnimation[T /* <: AnimationObject | StyleLayoutAnimation */](starting: AnimationToDecoration[T], factory: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("defineAnimation")(starting.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[T]

inline def enableLayoutAnimations(flag: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLayoutAnimations")(flag.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def enableLayoutAnimations(flag: Boolean, isCallByUser: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLayoutAnimations")(flag.asInstanceOf[js.Any], isCallByUser.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def getRelativeCoords(parentRef: RefObjectFunction[Component[js.Object, js.Object, Any]], x: Double, y: Double): ComponentCoords = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativeCoords")(parentRef.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[ComponentCoords]

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

inline def measure(
  animatedRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RefObjectFunction<Component> */ Any
): MeasuredDimensions = ^.asInstanceOf[js.Dynamic].applyDynamic("measure")(animatedRef.asInstanceOf[js.Any]).asInstanceOf[MeasuredDimensions]

inline def opacity(c: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("opacity")(c.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def processColor(color: Any): js.UndefOr[Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("processColor")(color.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double | Null]]

inline def processColorInitially(color: Any): js.UndefOr[Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("processColorInitially")(color.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double | Null]]

inline def red(c: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("red")(c.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def requestFrame(frame: js.Function1[/* timestamp */ Timestamp, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestFrame")(frame.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def rgbaColor(r: Double, g: Double, b: Double): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbaColor")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double | String]
inline def rgbaColor(r: Double, g: Double, b: Double, alpha: Double): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("rgbaColor")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Double | String]

inline def runOnJS[A /* <: js.Array[Any] */, R](fun: RunOnJSFunction[A, R]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("runOnJS")(fun.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]

inline def runOnUI[A /* <: js.Array[Any] */, R](worklet: ComplexWorkletFunction[A, R]): js.Function1[/* args */ A, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("runOnUI")(worklet.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ A, Unit]]

inline def scrollTo(
  animatedRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RefObjectFunction<Component> */ Any,
  x: Double,
  y: Double,
  animated: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollTo")(animatedRef.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], animated.asInstanceOf[js.Any])).asInstanceOf[Unit]

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

inline def useAnimatedGestureHandler[T /* <: GestureHandlerEvent[T] */, TContext /* <: Context */](handlers: GestureHandlers[T, TContext]): (MutableRefObject[typings.reactNativeReanimated.workletEventHandlerMod.default[T] | Null]) | (js.Function1[/* e */ T, Unit]) = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedGestureHandler")(handlers.asInstanceOf[js.Any]).asInstanceOf[(MutableRefObject[typings.reactNativeReanimated.workletEventHandlerMod.default[T] | Null]) | (js.Function1[/* e */ T, Unit])]
inline def useAnimatedGestureHandler[T /* <: GestureHandlerEvent[T] */, TContext /* <: Context */](handlers: GestureHandlers[T, TContext], dependencies: DependencyList): (MutableRefObject[typings.reactNativeReanimated.workletEventHandlerMod.default[T] | Null]) | (js.Function1[/* e */ T, Unit]) = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedGestureHandler")(handlers.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[(MutableRefObject[typings.reactNativeReanimated.workletEventHandlerMod.default[T] | Null]) | (js.Function1[/* e */ T, Unit])]

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

inline def useAnimatedScrollHandler[TContext /* <: Context */](handlers: ScrollHandler[TContext]): RefObject[typings.reactNativeReanimated.workletEventHandlerMod.default[ScrollEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedScrollHandler")(handlers.asInstanceOf[js.Any]).asInstanceOf[RefObject[typings.reactNativeReanimated.workletEventHandlerMod.default[ScrollEvent]]]
inline def useAnimatedScrollHandler[TContext /* <: Context */](handlers: ScrollHandler[TContext], dependencies: DependencyList): RefObject[typings.reactNativeReanimated.workletEventHandlerMod.default[ScrollEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedScrollHandler")(handlers.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[RefObject[typings.reactNativeReanimated.workletEventHandlerMod.default[ScrollEvent]]]
inline def useAnimatedScrollHandler[TContext /* <: Context */](handlers: ScrollHandlers[TContext]): RefObject[typings.reactNativeReanimated.workletEventHandlerMod.default[ScrollEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedScrollHandler")(handlers.asInstanceOf[js.Any]).asInstanceOf[RefObject[typings.reactNativeReanimated.workletEventHandlerMod.default[ScrollEvent]]]
inline def useAnimatedScrollHandler[TContext /* <: Context */](handlers: ScrollHandlers[TContext], dependencies: DependencyList): RefObject[typings.reactNativeReanimated.workletEventHandlerMod.default[ScrollEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedScrollHandler")(handlers.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[RefObject[typings.reactNativeReanimated.workletEventHandlerMod.default[ScrollEvent]]]

inline def useAnimatedSensor(sensorType: typings.reactNativeReanimated.useAnimatedSensorMod.SensorType): AnimatedSensor = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedSensor")(sensorType.asInstanceOf[js.Any]).asInstanceOf[AnimatedSensor]
inline def useAnimatedSensor(
  sensorType: typings.reactNativeReanimated.useAnimatedSensorMod.SensorType,
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

inline def useEvent[T /* <: NativeEvent[T] */](handler: js.Function1[/* event */ T, Unit]): MutableRefObject[typings.reactNativeReanimated.workletEventHandlerMod.default[T] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEvent")(handler.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[typings.reactNativeReanimated.workletEventHandlerMod.default[T] | Null]]
inline def useEvent[T /* <: NativeEvent[T] */](handler: js.Function1[/* event */ T, Unit], eventNames: js.Array[String]): MutableRefObject[typings.reactNativeReanimated.workletEventHandlerMod.default[T] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useEvent")(handler.asInstanceOf[js.Any], eventNames.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[typings.reactNativeReanimated.workletEventHandlerMod.default[T] | Null]]
inline def useEvent[T /* <: NativeEvent[T] */](handler: js.Function1[/* event */ T, Unit], eventNames: js.Array[String], rebuild: Boolean): MutableRefObject[typings.reactNativeReanimated.workletEventHandlerMod.default[T] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useEvent")(handler.asInstanceOf[js.Any], eventNames.asInstanceOf[js.Any], rebuild.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[typings.reactNativeReanimated.workletEventHandlerMod.default[T] | Null]]
inline def useEvent[T /* <: NativeEvent[T] */](handler: js.Function1[/* event */ T, Unit], eventNames: Unit, rebuild: Boolean): MutableRefObject[typings.reactNativeReanimated.workletEventHandlerMod.default[T] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useEvent")(handler.asInstanceOf[js.Any], eventNames.asInstanceOf[js.Any], rebuild.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[typings.reactNativeReanimated.workletEventHandlerMod.default[T] | Null]]

inline def useFrameCallback(callback: js.Function0[Unit]): FrameCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("useFrameCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[FrameCallback]
inline def useFrameCallback(callback: js.Function0[Unit], autostart: Boolean): FrameCallback = (^.asInstanceOf[js.Dynamic].applyDynamic("useFrameCallback")(callback.asInstanceOf[js.Any], autostart.asInstanceOf[js.Any])).asInstanceOf[FrameCallback]

inline def useHandler[T, TContext /* <: Context */](handlers: Handlers[T, TContext]): UseHandlerContext[TContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("useHandler")(handlers.asInstanceOf[js.Any]).asInstanceOf[UseHandlerContext[TContext]]
inline def useHandler[T, TContext /* <: Context */](handlers: Handlers[T, TContext], dependencies: DependencyList): UseHandlerContext[TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("useHandler")(handlers.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[UseHandlerContext[TContext]]

inline def useInterpolateConfig(inputRange: js.Array[Double], outputRange: js.Array[String | Double]): SharedValue[InterpolateConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterpolateConfig")(inputRange.asInstanceOf[js.Any], outputRange.asInstanceOf[js.Any])).asInstanceOf[SharedValue[InterpolateConfig]]
inline def useInterpolateConfig(
  inputRange: js.Array[Double],
  outputRange: js.Array[String | Double],
  colorSpace: typings.reactNativeReanimated.interpolateColorMod.ColorSpace
): SharedValue[InterpolateConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterpolateConfig")(inputRange.asInstanceOf[js.Any], outputRange.asInstanceOf[js.Any], colorSpace.asInstanceOf[js.Any])).asInstanceOf[SharedValue[InterpolateConfig]]

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
