package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends [infer A, ...infer B] ? @sinclair/typebox.@sinclair/typebox.IntersectReduce<I & A, B> : I extends object ? I : {}
  }}}
  */
@js.native
trait IntersectReduce[I /* <: Any */, T /* <: js.Array[Any] */] extends StObject
