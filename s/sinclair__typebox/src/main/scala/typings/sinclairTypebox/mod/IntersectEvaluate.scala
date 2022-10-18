package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ K in keyof T ]: T[K] extends @sinclair/typebox.@sinclair/typebox.TSchema? @sinclair/typebox.@sinclair/typebox.Static<T[K], P> : never}
  }}}
  */
@js.native
trait IntersectEvaluate[T /* <: js.Array[TSchema] */, P /* <: js.Array[Any] */] extends StObject
