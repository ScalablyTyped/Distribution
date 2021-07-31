package typings.reactNative.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def Image: typings.reactNative.mod.Animated.AnimatedComponent[typings.reactNative.anon.TypeofImage] = typings.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].selectDynamic("Image").asInstanceOf[typings.reactNative.mod.Animated.AnimatedComponent[typings.reactNative.anon.TypeofImage]]

@scala.inline
def ScrollView: typings.reactNative.mod.Animated.AnimatedComponent[org.scalablytyped.runtime.Instantiable0[typings.reactNative.mod._ScrollView]] = typings.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].selectDynamic("ScrollView").asInstanceOf[typings.reactNative.mod.Animated.AnimatedComponent[org.scalablytyped.runtime.Instantiable0[typings.reactNative.mod._ScrollView]]]

@scala.inline
def Text: typings.reactNative.mod.Animated.AnimatedComponent[org.scalablytyped.runtime.Instantiable0[typings.reactNative.mod._Text]] = typings.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].selectDynamic("Text").asInstanceOf[typings.reactNative.mod.Animated.AnimatedComponent[org.scalablytyped.runtime.Instantiable0[typings.reactNative.mod._Text]]]

@scala.inline
def View: typings.reactNative.mod.Animated.AnimatedComponent[typings.reactNative.anon.TypeofView] = typings.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].selectDynamic("View").asInstanceOf[typings.reactNative.mod.Animated.AnimatedComponent[typings.reactNative.anon.TypeofView]]

@scala.inline
def add(a: typings.reactNative.mod.Animated.Animated, b: typings.reactNative.mod.Animated.Animated): typings.reactNative.mod.Animated.AnimatedAddition = (typings.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.AnimatedAddition]

@scala.inline
def createAnimatedComponent[T /* <: typings.react.mod.ComponentType[js.Any] */](component: T): typings.reactNative.mod.Animated.AnimatedComponent[T] = typings.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedComponent")(component.asInstanceOf[js.Any]).asInstanceOf[typings.reactNative.mod.Animated.AnimatedComponent[T]]

@scala.inline
def decay(
  value: typings.reactNative.mod.Animated.AnimatedValueXY,
  config: typings.reactNative.mod.Animated.DecayAnimationConfig
): typings.reactNative.mod.Animated.CompositeAnimation = (typings.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("decay")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.CompositeAnimation]
@scala.inline
def decay(
  value: typings.reactNative.mod.Animated.AnimatedValue,
  config: typings.reactNative.mod.Animated.DecayAnimationConfig
): typings.reactNative.mod.Animated.CompositeAnimation = (typings.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("decay")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.CompositeAnimation]

@scala.inline
def delay(time: scala.Double): typings.reactNative.mod.Animated.CompositeAnimation = typings.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("delay")(time.asInstanceOf[js.Any]).asInstanceOf[typings.reactNative.mod.Animated.CompositeAnimation]

@scala.inline
def diffClamp(a: typings.reactNative.mod.Animated.Animated, min: scala.Double, max: scala.Double): typings.reactNative.mod.Animated.AnimatedDiffClamp = (typings.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("diffClamp")(a.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.AnimatedDiffClamp]

@scala.inline
def divide(a: typings.reactNative.mod.Animated.Animated, b: typings.reactNative.mod.Animated.Animated): typings.reactNative.mod.Animated.AnimatedDivision = (typings.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("divide")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.AnimatedDivision]

@scala.inline
def event[T](argMapping: js.Array[typings.reactNative.mod.Animated.Mapping | scala.Null]): js.Function1[/* repeated */ js.Any, scala.Unit] = typings.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("event")(argMapping.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, scala.Unit]]
@scala.inline
def event[T](
  argMapping: js.Array[typings.reactNative.mod.Animated.Mapping | scala.Null],
  config: typings.reactNative.mod.Animated.EventConfig[T]
): js.Function1[/* repeated */ js.Any, scala.Unit] = (typings.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("event")(argMapping.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, scala.Unit]]

@scala.inline
def loop(animation: typings.reactNative.mod.Animated.CompositeAnimation): typings.reactNative.mod.Animated.CompositeAnimation = typings.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("loop")(animation.asInstanceOf[js.Any]).asInstanceOf[typings.reactNative.mod.Animated.CompositeAnimation]
@scala.inline
def loop(
  animation: typings.reactNative.mod.Animated.CompositeAnimation,
  config: typings.reactNative.mod.Animated.LoopAnimationConfig
): typings.reactNative.mod.Animated.CompositeAnimation = (typings.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("loop")(animation.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.CompositeAnimation]

@scala.inline
def modulo(a: typings.reactNative.mod.Animated.Animated, modulus: scala.Double): typings.reactNative.mod.Animated.AnimatedModulo = (typings.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("modulo")(a.asInstanceOf[js.Any], modulus.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.AnimatedModulo]

@scala.inline
def multiply(a: typings.reactNative.mod.Animated.Animated, b: typings.reactNative.mod.Animated.Animated): typings.reactNative.mod.Animated.AnimatedMultiplication = (typings.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.AnimatedMultiplication]

@scala.inline
def parallel(animations: js.Array[typings.reactNative.mod.Animated.CompositeAnimation]): typings.reactNative.mod.Animated.CompositeAnimation = typings.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(animations.asInstanceOf[js.Any]).asInstanceOf[typings.reactNative.mod.Animated.CompositeAnimation]
@scala.inline
def parallel(
  animations: js.Array[typings.reactNative.mod.Animated.CompositeAnimation],
  config: typings.reactNative.mod.Animated.ParallelConfig
): typings.reactNative.mod.Animated.CompositeAnimation = (typings.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(animations.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.CompositeAnimation]

@scala.inline
def sequence(animations: js.Array[typings.reactNative.mod.Animated.CompositeAnimation]): typings.reactNative.mod.Animated.CompositeAnimation = typings.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(animations.asInstanceOf[js.Any]).asInstanceOf[typings.reactNative.mod.Animated.CompositeAnimation]

@scala.inline
def spring(
  value: typings.reactNative.mod.Animated.AnimatedValueXY,
  config: typings.reactNative.mod.Animated.SpringAnimationConfig
): typings.reactNative.mod.Animated.CompositeAnimation = (typings.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("spring")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.CompositeAnimation]
@scala.inline
def spring(
  value: typings.reactNative.mod.Animated.AnimatedValue,
  config: typings.reactNative.mod.Animated.SpringAnimationConfig
): typings.reactNative.mod.Animated.CompositeAnimation = (typings.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("spring")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.CompositeAnimation]

@scala.inline
def stagger(time: scala.Double, animations: js.Array[typings.reactNative.mod.Animated.CompositeAnimation]): typings.reactNative.mod.Animated.CompositeAnimation = (typings.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(time.asInstanceOf[js.Any], animations.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.CompositeAnimation]

@scala.inline
def subtract(a: typings.reactNative.mod.Animated.Animated, b: typings.reactNative.mod.Animated.Animated): typings.reactNative.mod.Animated.AnimatedSubtraction = (typings.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.AnimatedSubtraction]

@scala.inline
def timing(
  value: typings.reactNative.mod.Animated.AnimatedValueXY,
  config: typings.reactNative.mod.Animated.TimingAnimationConfig
): typings.reactNative.mod.Animated.CompositeAnimation = (typings.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("timing")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.CompositeAnimation]
@scala.inline
def timing(
  value: typings.reactNative.mod.Animated.AnimatedValue,
  config: typings.reactNative.mod.Animated.TimingAnimationConfig
): typings.reactNative.mod.Animated.CompositeAnimation = (typings.reactNative.mod.Animated.^.asInstanceOf[js.Dynamic].applyDynamic("timing")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.reactNative.mod.Animated.CompositeAnimation]

type AnimatedComponent[T /* <: typings.react.mod.ComponentType[js.Any] */] = typings.react.mod.FC[
typings.reactNative.mod.Animated.AnimatedProps[typings.react.mod.ComponentPropsWithRef[T]]]

type AnimatedProps[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ key in keyof T ]: key extends react-native.react-native.Animated.NonAnimatedProps? key extends 'ref'? react-native.react-native.Animated.TAugmentRef<T[key]> : T[key] : react-native.react-native.Animated.WithAnimatedValue<T[key]>}
  */ typings.reactNative.reactNativeStrings.AnimatedProps & org.scalablytyped.runtime.TopLevel[js.Any]

type AnimatedValue = typings.reactNative.mod.Animated.Value

type AnimatedValueXY = typings.reactNative.mod.Animated.ValueXY

type Builtin = js.Function | typings.std.Date | typings.std.Error | typings.std.RegExp

type ComponentProps[T] = js.Any

type EndCallback = js.Function1[/* result */ typings.reactNative.mod.Animated.EndResult, scala.Unit]

type Mapping = (org.scalablytyped.runtime.StringDictionary[
/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-native.react-native.Animated.Mapping */ js.Object]) | typings.reactNative.mod.Animated.AnimatedValue

type Nullable = js.UndefOr[scala.Null]

type Primitive = java.lang.String | scala.Double | scala.Boolean | js.Symbol

type TAugmentRef[T] = typings.react.mod.Ref[js.Any | typings.reactNative.mod.Animated.LegacyRef[js.Any]]

type ValueListenerCallback = js.Function1[/* state */ typings.reactNative.anon.Value, scala.Unit]

type ValueXYListenerCallback = js.Function1[/* value */ typings.reactNative.anon.X, scala.Unit]

type WithAnimatedObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]: react-native.react-native.Animated.WithAnimatedValue<T[K]>}
  */ typings.reactNative.reactNativeStrings.WithAnimatedObject & org.scalablytyped.runtime.TopLevel[T]

/* Rewritten from type alias, can be one of: 
  - T
  - typings.reactNative.mod.Animated.WithAnimatedObject[T]
  - typings.reactNative.mod.Animated.WithAnimatedArray[js.Any]
  - typings.reactNative.mod.Animated.Value
  - typings.reactNative.mod.Animated.AnimatedInterpolation
*/
type WithAnimatedValue[T] = typings.reactNative.mod.Animated._WithAnimatedValue[T] | typings.reactNative.mod.Animated.WithAnimatedArray[js.Any] | T | typings.reactNative.mod.Animated.WithAnimatedObject[T]
