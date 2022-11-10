package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// The identity check is done with the SameValue algorithm (Object.is), which is stricter than ===
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  R extends react.react.ReducerWithoutAction<infer S> ? S : never
  }}}
  */
@js.native
trait ReducerStateWithoutAction[R /* <: ReducerWithoutAction[Any] */] extends StObject
