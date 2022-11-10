package typings.reactSpringTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animatedMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends number ? number : T extends string ? string : T extends std.ReadonlyArray<number | string> ? std.Array<number | string> extends T ? std.ReadonlyArray<number | string> : {[ P in keyof T ]: @react-spring/types.@react-spring/types/animated.Animatable<T[P]>} : never
    }}}
    */
  type Animatable[T] = Double
}
