package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  T extends @sinclair/typebox.@sinclair/typebox.TRecursive<infer S> ? @sinclair/typebox.@sinclair/typebox.TRecursive<@sinclair/typebox.@sinclair/typebox.TPick<S, K>> : T extends @sinclair/typebox.@sinclair/typebox.TIntersect<infer S> ? @sinclair/typebox.@sinclair/typebox.TIntersect<@sinclair/typebox.@sinclair/typebox.TPickArray<S, K>> : T extends @sinclair/typebox.@sinclair/typebox.TUnion<infer S> ? @sinclair/typebox.@sinclair/typebox.TUnion<@sinclair/typebox.@sinclair/typebox.TPickArray<S, K>> : T extends @sinclair/typebox.@sinclair/typebox.TObject<infer S> ? @sinclair/typebox.@sinclair/typebox.TObject<@sinclair/typebox.@sinclair/typebox.TPickProperties<S, K>> : T
  }}}
  */
@js.native
trait TPick[T /* <: TSchema */, K /* <: /* keyof any */ String */] extends StObject
