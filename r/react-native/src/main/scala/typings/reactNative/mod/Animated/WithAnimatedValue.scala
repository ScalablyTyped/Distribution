package typings.reactNative.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends react-native.react-native.Animated.Builtin | react-native.react-native.Animated.Nullable ? T : T extends react-native.react-native.Animated.Primitive ? T | react-native.react-native.Animated.Value | react-native.react-native.Animated.AnimatedInterpolation<number | string> : T extends std.Array<infer P> ? react-native.react-native.Animated.WithAnimatedArray<P> : T extends {} ? react-native.react-native.Animated.WithAnimatedObject<T> : T
  }}}
  */
@js.native
trait WithAnimatedValue[T] extends StObject
