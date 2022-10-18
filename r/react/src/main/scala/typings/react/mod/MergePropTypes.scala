package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Try to resolve ill-defined props like for JS users: props can be any, or sometimes objects with properties of type any
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  // Distribute over P in case it is a union type
P extends any ? react.react.IsExactlyAny<P> extends true ? T : // If declared props have indexed properties, ignore inferred props entirely as keyof gets widened
string extends keyof P ? P : std.Pick<P, react.react.NotExactlyAnyPropertyKeys<P>> & std.Pick<T, std.Exclude<keyof T, react.react.NotExactlyAnyPropertyKeys<P>>> & std.Pick<P, std.Exclude<keyof P, keyof T>> : never
  }}}
  */
@js.native
trait MergePropTypes[P, T] extends StObject
