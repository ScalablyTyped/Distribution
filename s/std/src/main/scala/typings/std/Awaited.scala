package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Recursively unwraps the "awaited type" of a type. Non-promise "thenables" should resolve to `never`. This emulates the behavior of `await`.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends null | undefined ? T : // special case for `null | undefined` when not in `--strictNullChecks` mode
T extends object & {then (onfulfilled : infer F): any} ? // `await` only unwraps object types with a callable `then`. Non-object types are not unwrapped
F extends (value : infer V, args : any): any ? // if the argument to `then` is callable, extracts the first argument
std.Awaited<V> : // recursively unwrap the value
never : // the argument to `then` was not callable
T
  }}}
  */
@js.native
trait Awaited[T] extends StObject
