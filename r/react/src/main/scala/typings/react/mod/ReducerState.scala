package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// types used to try and prevent the compiler from reducing S
// to a supertype common with the second argument to useReducer()
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  R extends react.react.Reducer<infer S, any> ? S : never
  }}}
  */
@js.native
trait ReducerState[R /* <: Reducer[Any, Any] */] extends StObject
