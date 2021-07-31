package typings.reactNativeReanimated.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AdaptTransforms[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]: react-native-reanimated.react-native-reanimated.Animated.Adaptable<T[P] extends string? number | string : T[P]>}
  */ typings.reactNativeReanimated.reactNativeReanimatedStrings.AdaptTransforms & org.scalablytyped.runtime.TopLevel[js.Any]

type Adaptable[T] = T | typings.reactNativeReanimated.mod.Animated.AnimatedNode[T] | (js.Array[
T | typings.reactNativeReanimated.mod.Animated.AnimatedNode[T] | (js.Array[T | typings.reactNativeReanimated.mod.Animated.AnimatedNode[T]])])

type AnimateProps[S /* <: js.Object */, P /* <: typings.reactNativeReanimated.anon.Style[S] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof P ]: K extends 'style'? react-native.react-native.StyleProp<react-native-reanimated.react-native-reanimated.Animated.AnimateStyle<S>> : P[K] | react-native-reanimated.react-native-reanimated.Animated.AnimatedNode<P[K]>}
  */ typings.reactNativeReanimated.reactNativeReanimatedStrings.AnimateProps & org.scalablytyped.runtime.TopLevel[js.Any]

type AnimateStyle[S /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof S ]: K extends 'transform'? react-native-reanimated.react-native-reanimated.Animated.AnimatedTransform : S[K] extends std.ReadonlyArray<any>? std.ReadonlyArray</ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-native-reanimated.react-native-reanimated.Animated.AnimateStyle<S[K][0]> * / object> : S[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-native-reanimated.react-native-reanimated.Animated.AnimateStyle<S[K]> * / object : S[K] | react-native-reanimated.react-native-reanimated.Animated.AnimatedNode<// allow `number` where `string` normally is to support colors
S[K] extends string | undefined? S[K] | number : S[K]>}
  */ typings.reactNativeReanimated.reactNativeReanimatedStrings.AnimateStyle & org.scalablytyped.runtime.TopLevel[js.Any]

type AnimatedClock = typings.reactNativeReanimated.mod.Animated.AnimatedNode[scala.Double]

type AnimatedTransform = js.Array[
typings.reactNativeReanimated.mod.Animated.AdaptTransforms[typings.reactNativeReanimated.mod.Animated.TransformStyleTypes]]

type BinaryOperator[T] = js.Function2[
/* left */ typings.reactNativeReanimated.mod.Animated.Adaptable[scala.Double], 
/* right */ typings.reactNativeReanimated.mod.Animated.Adaptable[scala.Double], 
typings.reactNativeReanimated.mod.Animated.AnimatedNode[T]]

type Code = typings.react.mod.Component[typings.reactNativeReanimated.mod.Animated.CodeProps, js.Object, js.Any]

type DecayState = typings.reactNativeReanimated.mod.Animated.PhysicsAnimationState

type EasingFunction = js.Function1[
/* value */ typings.reactNativeReanimated.mod.Animated.Adaptable[scala.Double], 
typings.reactNativeReanimated.mod.Animated.AnimatedNode[scala.Double]]

// the return type for `event` is a lie, but it's the same lie that
// react-native makes within Animated
type EventArgFunc[T] = js.Function1[/* arg */ T, typings.reactNativeReanimated.mod.Animated.AnimatedNode[scala.Double]]

type EventMapping[T] = typings.reactNativeReanimated.mod.Animated.Adaptable[T] | typings.reactNativeReanimated.mod.Animated.EventArgFunc[T] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-native-reanimated.react-native-reanimated.Animated.EventMapping<T[K]> * / object | react-native-reanimated.react-native-reanimated.Animated.EventArgFunc<T[K]>}
  */ typings.reactNativeReanimated.reactNativeReanimatedStrings.EventMapping & org.scalablytyped.runtime.TopLevel[T])

type EventMappingArray[T] = js.Array[typings.reactNativeReanimated.mod.Animated.EventMapping[T]] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ I in keyof T ]: react-native-reanimated.react-native-reanimated.Animated.EventMapping<T[I]>}
  */ typings.reactNativeReanimated.reactNativeReanimatedStrings.EventMappingArray & org.scalablytyped.runtime.TopLevel[T])

type Mapping = (org.scalablytyped.runtime.StringDictionary[
/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-native-reanimated.react-native-reanimated.Animated.Mapping */ js.Object]) | typings.reactNativeReanimated.mod.Animated.Adaptable[js.Any]

type Nullable[T] = js.UndefOr[T | scala.Null]

type SpringState = typings.reactNativeReanimated.mod.Animated.PhysicsAnimationState

type TransformStyleTypes = js.Any

type UnaryOperator = js.Function1[
/* value */ typings.reactNativeReanimated.mod.Animated.Adaptable[scala.Double], 
typings.reactNativeReanimated.mod.Animated.AnimatedNode[scala.Double]]

type Value = java.lang.String | scala.Double | scala.Boolean
