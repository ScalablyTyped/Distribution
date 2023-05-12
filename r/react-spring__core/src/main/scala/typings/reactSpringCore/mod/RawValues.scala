package typings.reactSpringCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Unwrap any `FluidValue` object types */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ P in keyof T ]: T[P] extends @react-spring/shared.@react-spring/shared.FluidValue<infer U, any>? U : T[P]}
  }}}
  */
@js.native
trait RawValues[T /* <: js.Object */] extends StObject
