package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  {readonly [ K in @sinclair/typebox.@sinclair/typebox.ReadonlyOptionalPropertyKeys<T> ]:? @sinclair/typebox.@sinclair/typebox.Static<T[K], P>} & {readonly [ K in @sinclair/typebox.@sinclair/typebox.ReadonlyPropertyKeys<T> ]: @sinclair/typebox.@sinclair/typebox.Static<T[K], P>} & {[ K in @sinclair/typebox.@sinclair/typebox.OptionalPropertyKeys<T> ]:? @sinclair/typebox.@sinclair/typebox.Static<T[K], P>} & {[ K in @sinclair/typebox.@sinclair/typebox.RequiredPropertyKeys<T> ]: @sinclair/typebox.@sinclair/typebox.Static<T[K], P>} extends infer R ? {[ K in keyof R ]: R[K]} : never
  }}}
  */
@js.native
trait PropertiesReduce[T /* <: TProperties */, P /* <: js.Array[Any] */] extends StObject
