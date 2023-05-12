package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  std.Pick<T, @sinclair/typebox.@sinclair/typebox.Assert<std.Extract<K, keyof T>, keyof T>> extends infer R ? {[ K in keyof R ]: @sinclair/typebox.@sinclair/typebox.AssertType<R[K], @sinclair/typebox.@sinclair/typebox.TSchema> extends @sinclair/typebox.@sinclair/typebox.TSchema? R[K] : never} : never
  }}}
  */
@js.native
trait TPickProperties[T /* <: TProperties */, K /* <: /* keyof any */ String */] extends StObject
