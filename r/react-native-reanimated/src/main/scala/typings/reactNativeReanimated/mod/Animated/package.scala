package typings.reactNativeReanimated.mod.Animated

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Adaptable[T] = T | AnimatedNode[T] | (js.Array[T | AnimatedNode[T] | (js.Array[T | AnimatedNode[T]])])

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

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends object ? {[ K in keyof T ]:? react-native-reanimated.react-native-reanimated.Animated.EventMapping<T[K]> | react-native-reanimated.react-native-reanimated.Animated.EventArgFunc<T[K]>} : react-native-reanimated.react-native-reanimated.Animated.Adaptable<T> | react-native-reanimated.react-native-reanimated.Animated.EventArgFunc<T>
  }}}
  */
type EventMapping[T] = Adaptable[T] | EventArgFunc[T]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends std.Array<any> ? {[ I in keyof T ]: react-native-reanimated.react-native-reanimated.Animated.EventMapping<T[I]>} : [react-native-reanimated.react-native-reanimated.Animated.EventMapping<T>]
  }}}
  */
type EventMappingArray[T] = js.Array[EventMapping[T]]

/** 
NOTE: Rewritten from type alias:
{{{
type Mapping = {[key: string] : react-native-reanimated.react-native-reanimated.Animated.Mapping} | react-native-reanimated.react-native-reanimated.Animated.Adaptable<any>
}}}
to avoid circular code involving: 
- react-native-reanimated.react-native-reanimated.Animated.Mapping
*/
type Mapping = StringDictionary[Any] | Adaptable[Any]

type Nullable[T] = js.UndefOr[T | Null]

type SpringState = PhysicsAnimationState

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  'style' extends keyof T ? T['style'] : std.Record<string, unknown>
  }}}
  */
type StylesOrDefault[T] = Record[String, Any]

type UnaryOperator = js.Function1[/* value */ Adaptable[Double], AnimatedNode[Double]]

type Value = String | Double | Boolean
