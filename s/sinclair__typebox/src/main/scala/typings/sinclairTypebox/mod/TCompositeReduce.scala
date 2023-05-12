package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  K extends [infer L, ...infer R] ? {[ _ in @sinclair/typebox.@sinclair/typebox.Assert<L, string> ]: @sinclair/typebox.@sinclair/typebox.TIndexType<T, @sinclair/typebox.@sinclair/typebox.Assert<L, string>>} & @sinclair/typebox.@sinclair/typebox.TCompositeReduce<T, @sinclair/typebox.@sinclair/typebox.Assert<R, std.Array<string>>> : {}
  }}}
  */
@js.native
trait TCompositeReduce[T /* <: TIntersect[js.Array[TObject[TProperties]]] */, K /* <: js.Array[String] */] extends StObject
