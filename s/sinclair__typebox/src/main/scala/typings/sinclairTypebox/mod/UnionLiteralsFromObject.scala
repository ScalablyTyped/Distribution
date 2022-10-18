package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ K in @sinclair/typebox.@sinclair/typebox.ObjectPropertyKeys<T> ]: @sinclair/typebox.@sinclair/typebox.TLiteral<K>} extends infer R ? @sinclair/typebox.@sinclair/typebox.UnionToTuple<R[keyof R], @sinclair/typebox.@sinclair/typebox.UnionLast<R[keyof R]>> : never
  }}}
  */
@js.native
trait UnionLiteralsFromObject[T /* <: TObject[TProperties] */] extends StObject
