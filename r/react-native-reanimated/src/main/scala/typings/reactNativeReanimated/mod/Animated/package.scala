package typings.reactNativeReanimated.mod.Animated

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
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

type Mapping = StringDictionary[Any] | Adaptable[Any]

type Nullable[T] = js.UndefOr[T | Null]

type SpringState = PhysicsAnimationState

type UnaryOperator = js.Function1[/* value */ Adaptable[Double], AnimatedNode[Double]]

type Value = String | Double | Boolean
