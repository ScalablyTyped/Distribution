package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  T extends [infer I] ? I : T extends [infer I, ...infer R] ? I & @sinclair/typebox.@sinclair/typebox.TupleToIntersect<R> : never
  }}}
  */
@js.native
trait TupleToIntersect[T /* <: js.Array[Any] */] extends StObject
