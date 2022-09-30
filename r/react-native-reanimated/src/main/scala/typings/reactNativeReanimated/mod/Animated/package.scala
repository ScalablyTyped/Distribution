package typings.reactNativeReanimated.mod.Animated

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AdaptTransforms[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]: react-native-reanimated.react-native-reanimated.Animated.Adaptable<T[P]>}
  */ typings.reactNativeReanimated.reactNativeReanimatedStrings.AdaptTransforms & TopLevel[T]

type Adaptable[T] = T | AnimatedNode[T] | (js.Array[T | AnimatedNode[T] | (js.Array[T | AnimatedNode[T]])])

type AnimateStyle[S] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof S ]: K extends 'transform'? react-native-reanimated.react-native-reanimated.Animated.AnimatedTransform : S[K] extends std.ReadonlyArray<any>? std.ReadonlyArray<react-native-reanimated.react-native-reanimated.Animated.AnimateStyle<S[K][0]>> : S[K] extends object? react-native-reanimated.react-native-reanimated.Animated.AnimateStyle<S[K]> : S[K] extends react-native.react-native.ColorValue | undefined? S[K] | number : S[K] | react-native-reanimated.react-native-reanimated.Animated.AnimatedNode<// allow `number` where `string` normally is to support colors
S[K] extends react-native.react-native.ColorValue | undefined? S[K] | number : S[K]>}
  */ typings.reactNativeReanimated.reactNativeReanimatedStrings.AnimateStyle & TopLevel[Any]

type AnimatedClock = AnimatedNode[Double]

type AnimatedTransform = js.Array[AdaptTransforms[TransformStyleTypes]]

type BinaryOperator[T] = js.Function2[/* left */ Adaptable[Double], /* right */ Adaptable[Double], AnimatedNode[T]]

type Code = Component[CodeProps, js.Object, Any]

type DecayState = PhysicsAnimationState

type EasingFunction = js.Function1[/* value */ Double, Double]

type EasingNodeFunction = js.Function1[/* value */ Adaptable[Double], AnimatedNode[Double]]

// the return type for `event` is a lie, but it's the same lie that
// react-native makes within Animated
type EventArgFunc[T] = js.Function1[/* arg */ T, AnimatedNode[Double]]

type EventMapping[T] = Adaptable[T] | EventArgFunc[T] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]:? react-native-reanimated.react-native-reanimated.Animated.EventMapping<T[K]> | react-native-reanimated.react-native-reanimated.Animated.EventArgFunc<T[K]>}
  */ typings.reactNativeReanimated.reactNativeReanimatedStrings.EventMapping & TopLevel[Any])

type EventMappingArray[T] = js.Array[EventMapping[T]] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ I in keyof T ]: react-native-reanimated.react-native-reanimated.Animated.EventMapping<T[I]>}
  */ typings.reactNativeReanimated.reactNativeReanimatedStrings.EventMappingArray & TopLevel[T])

type Mapping = StringDictionary[Any] | Adaptable[Any]

type Nullable[T] = js.UndefOr[T | Null]

type SpringState = PhysicsAnimationState

type StylesOrDefault[T] = (Record[String, Any]) | (/* import warning: importer.ImportType#apply Failed type conversion: T['style'] */ js.Any)

type TransformStyleTypes = Any

type UnaryOperator = js.Function1[/* value */ Adaptable[Double], AnimatedNode[Double]]

type Value = String | Double | Boolean
