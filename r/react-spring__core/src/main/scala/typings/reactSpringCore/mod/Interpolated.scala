package typings.reactSpringCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Extract the raw value types that are being interpolated */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ P in keyof T ]: T[P] extends infer Element? Element extends @react-spring/shared.@react-spring/shared.FluidValue<infer U, any>? U : Element : never}
  }}}
  */
@js.native
trait Interpolated[T /* <: js.Array[scala.Any] */] extends StObject
