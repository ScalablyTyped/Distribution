package typings.reactDashInstantsearchDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashInstantsearchDashCoreMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.reactDashInstantsearchDashCore.Anon_Args
  import typings.reactDashInstantsearchDashCore.Anon_HighlightResult
  import typings.reactDashInstantsearchDashCore.Omit

  type AllSearchResults[TDoc] = StringDictionary[SearchResults[TDoc]] with SearchResults[TDoc]
  type BasicDoc = StringDictionary[String]
  type ConnectedComponentClass[TProps, TProvidedProps, TExposedProps] = ComponentClass[(Omit[TProps, TProvidedProps]) with TExposedProps, ComponentState]
  type ConnectorProvided[TProvided] = Anon_Args with TProvided
  type HighlightProps[TDoc] = HighlightProvided[TDoc] with HighlightPassedThru[TDoc]
  type HighlightResult[TDoc] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof TDoc ]:? react-instantsearch-core.react-instantsearch-core.HighlightResultField<TDoc[K]>}
    */ typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreStrings.HighlightResult with TDoc
  type HighlightResultArray[TItem] = js.Array[HighlightResult[TItem] | HighlightResultPrimitive]
  type HighlightResultField[TField] = HighlightResult[TField] | HighlightResultPrimitive | HighlightResultArray[js.Any]
  type Hit[TDoc] = TDoc with Anon_HighlightResult[TDoc]
  type RefinementValue = js.Function1[/* searchState */ SearchState, SearchState]
}
