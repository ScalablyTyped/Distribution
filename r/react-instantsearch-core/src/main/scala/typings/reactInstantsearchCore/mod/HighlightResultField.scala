package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  TField extends std.Array<infer TItem> ? react-instantsearch-core.react-instantsearch-core.HighlightResultArray<TItem> : TField extends string ? react-instantsearch-core.react-instantsearch-core.HighlightResultPrimitive : react-instantsearch-core.react-instantsearch-core.HighlightResult<TField>
  }}}
  */
@js.native
trait HighlightResultField[TField] extends StObject
