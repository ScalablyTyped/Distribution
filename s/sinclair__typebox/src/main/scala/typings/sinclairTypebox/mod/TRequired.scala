package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  T extends @sinclair/typebox.@sinclair/typebox.TRecursive<infer S> ? @sinclair/typebox.@sinclair/typebox.TRecursive<@sinclair/typebox.@sinclair/typebox.TRequired<S>> : T extends @sinclair/typebox.@sinclair/typebox.TIntersect<infer S> ? @sinclair/typebox.@sinclair/typebox.TIntersect<@sinclair/typebox.@sinclair/typebox.TRequiredArray<S>> : T extends @sinclair/typebox.@sinclair/typebox.TUnion<infer S> ? @sinclair/typebox.@sinclair/typebox.TUnion<@sinclair/typebox.@sinclair/typebox.TRequiredArray<S>> : T extends @sinclair/typebox.@sinclair/typebox.TObject<infer S> ? @sinclair/typebox.@sinclair/typebox.TObject<@sinclair/typebox.@sinclair/typebox.TRequiredProperties<S>> : T
  }}}
  */
@js.native
trait TRequired[T /* <: TSchema */] extends StObject
