package typings
package reactDashInstantsearchDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashInstantsearchDashCoreMod {
  type AllSearchResults[TDoc] = org.scalablytyped.runtime.StringDictionary[SearchResults[TDoc]] with SearchResults[TDoc]
  type ConnectedComponentClass[TProps, TProvidedProps, TExposedProps] = reactLib.reactMod.ReactNs.ComponentClass[
    (reactDashInstantsearchDashCoreLib.Omit[TProps, TProvidedProps]) with TExposedProps, 
    reactLib.reactMod.ReactNs.ComponentState
  ]
  type ConnectorProvided[TProvided] = reactDashInstantsearchDashCoreLib.Anon_Args with TProvided
  type HighlightProps[TDoc] = HighlightProvided[TDoc] with HighlightPassedThru[TDoc]
  type HighlightResult[TDoc] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof TDoc ]:? react-instantsearch-core.HighlightResultField<TDoc[K]>}
    */ reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreLibStrings.HighlightResult with TDoc
  type Hit[TDoc] = TDoc with reactDashInstantsearchDashCoreLib.Anon_HighlightResult[TDoc]
  type Refinement = reactDashInstantsearchDashCoreLib.Anon_Attribute with (reactDashInstantsearchDashCoreLib.Anon_CurrentRefinement | reactDashInstantsearchDashCoreLib.Anon_CurrentRefinementItems)
  type RefinementValue = js.Function1[/* searchState */ SearchState, SearchState]
}
