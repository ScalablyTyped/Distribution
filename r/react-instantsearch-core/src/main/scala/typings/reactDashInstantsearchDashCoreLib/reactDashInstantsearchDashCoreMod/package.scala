package typings
package reactDashInstantsearchDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashInstantsearchDashCoreMod {
  type AllSearchResults[TDoc] = org.scalablytyped.runtime.StringDictionary[SearchResults[TDoc]] with SearchResults[TDoc]
  type BasicDoc = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type ConnectedComponentClass[TProps, TProvidedProps, TExposedProps] = reactLib.reactMod.ComponentClass[
    (reactDashInstantsearchDashCoreLib.Omit[TProps, TProvidedProps]) with TExposedProps, 
    reactLib.reactMod.ComponentState
  ]
  type ConnectorProvided[TProvided] = reactDashInstantsearchDashCoreLib.Anon_Args with TProvided
  type HighlightProps[TDoc] = HighlightProvided[TDoc] with HighlightPassedThru[TDoc]
  type HighlightResult[TDoc] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof TDoc ]:? react-instantsearch-core.react-instantsearch-core.HighlightResultField<TDoc[K]>}
    */ reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreLibStrings.HighlightResult with TDoc
  type HighlightResultArray[TItem] = js.Array[HighlightResult[TItem] | HighlightResultPrimitive]
  type HighlightResultField[TField] = HighlightResult[TField] | HighlightResultPrimitive | HighlightResultArray[js.Any]
  type Hit[TDoc] = TDoc with reactDashInstantsearchDashCoreLib.Anon_HighlightResult[TDoc]
  type RefinementValue = js.Function1[/* searchState */ SearchState, SearchState]
}
