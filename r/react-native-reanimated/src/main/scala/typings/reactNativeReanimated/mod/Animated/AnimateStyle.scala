package typings.reactNativeReanimated.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ K in keyof S ]: K extends 'transform'? react-native-reanimated.react-native-reanimated.Animated.AnimatedTransform : S[K] extends std.ReadonlyArray<any>? std.ReadonlyArray<react-native-reanimated.react-native-reanimated.Animated.AnimateStyle<S[K][0]>> : S[K] extends object? react-native-reanimated.react-native-reanimated.Animated.AnimateStyle<S[K]> : S[K] extends react-native.react-native.ColorValue | undefined? S[K] | number : S[K] | react-native-reanimated.react-native-reanimated.Animated.AnimatedNode<// allow `number` where `string` normally is to support colors
S[K] extends react-native.react-native.ColorValue | undefined? S[K] | number : S[K]>}
  }}}
  */
@js.native
trait AnimateStyle[S] extends StObject
