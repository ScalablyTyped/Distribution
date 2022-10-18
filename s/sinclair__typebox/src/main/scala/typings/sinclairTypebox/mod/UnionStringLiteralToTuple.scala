package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends @sinclair/typebox.@sinclair/typebox.TUnion<infer L> ? {[ I in keyof L ]: L[I] extends @sinclair/typebox.@sinclair/typebox.TLiteral<infer C>? C : never} : never
  }}}
  */
@js.native
trait UnionStringLiteralToTuple[T] extends StObject
