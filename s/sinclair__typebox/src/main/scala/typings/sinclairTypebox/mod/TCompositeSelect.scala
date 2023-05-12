package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  @sinclair/typebox.@sinclair/typebox.UnionToTuple<keyof @sinclair/typebox.@sinclair/typebox.Static<T, []>, @sinclair/typebox.@sinclair/typebox.UnionLast<keyof @sinclair/typebox.@sinclair/typebox.Static<T, []>>> extends infer K ? @sinclair/typebox.@sinclair/typebox.Evaluate<@sinclair/typebox.@sinclair/typebox.TCompositeReduce<T, @sinclair/typebox.@sinclair/typebox.Assert<K, std.Array<string>>>> : {}
  }}}
  */
@js.native
trait TCompositeSelect[T /* <: TIntersect[js.Array[TObject[TProperties]]] */] extends StObject
