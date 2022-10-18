package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Try to resolve ill-defined props like for JS users: props can be any, or sometimes objects with properties of type any
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  // Distribute over P in case it is a union type
P extends any ? rax.rax.IsExactlyAny<P> extends true ? T : string extends keyof P ? P : std.Pick<P, rax.rax.NotExactlyAnyPropertyKeys<P>> & // For props which are exactly any, use the type inferred from propTypes if present
std.Pick<T, std.Exclude<keyof T, rax.rax.NotExactlyAnyPropertyKeys<P>>> & // Keep leftover props not specified in propTypes
std.Pick<P, std.Exclude<keyof P, keyof T>> : never
  }}}
  */
@js.native
trait MergePropTypes[P, T] extends StObject
