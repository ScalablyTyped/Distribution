package typings.reactNative.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ key in keyof T ]: key extends react-native.react-native.Animated.NonAnimatedProps? key extends 'ref'? react-native.react-native.Animated.TAugmentRef<T[key]> : T[key] : react-native.react-native.Animated.WithAnimatedValue<T[key]>}
  }}}
  */
@js.native
trait AnimatedProps[T] extends StObject
