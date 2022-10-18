package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  [U] extends [never] ? [] : [...@sinclair/typebox.@sinclair/typebox.UnionToTuple<std.Exclude<U, L>, @sinclair/typebox.@sinclair/typebox.UnionLast<std.Exclude<U, L>>>, L]
  }}}
  */
@js.native
trait UnionToTuple[U, L] extends StObject
