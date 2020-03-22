package typings.reactInstantsearchCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BasicDoc = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type ConnectedComponentClass[TProps, TProvidedProps, TExposedProps] = typings.react.mod.ComponentClass[
    (typings.reactInstantsearchCore.mod.Omit[TProps, TProvidedProps]) with TExposedProps, 
    typings.react.mod.ComponentState
  ]
  type ConnectorProvided[TProvided] = typings.reactInstantsearchCore.AnonCreateURL with TProvided
  type HighlightProps[TDoc] = typings.reactInstantsearchCore.mod.HighlightProvided[TDoc] with typings.reactInstantsearchCore.mod.HighlightPassedThru[TDoc]
  type HighlightResult[TDoc] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TDoc ]:? react-instantsearch-core.react-instantsearch-core.HighlightResultField<TDoc[K]>}
    */ typings.reactInstantsearchCore.reactInstantsearchCoreStrings.HighlightResult with TDoc
  type HighlightResultArray[TItem] = js.Array[
    typings.reactInstantsearchCore.mod.HighlightResult[TItem] | typings.reactInstantsearchCore.mod.HighlightResultPrimitive
  ]
  type HighlightResultField[TField] = typings.reactInstantsearchCore.mod.HighlightResult[TField] | typings.reactInstantsearchCore.mod.HighlightResultPrimitive | typings.reactInstantsearchCore.mod.HighlightResultArray[js.Any]
  type Hit[TDoc] = TDoc with typings.reactInstantsearchCore.AnonHighlightResult[TDoc]
  type Omit[T1, T2] = typings.std.Pick[T1, typings.std.Exclude[java.lang.String, java.lang.String]]
  type Refinement = typings.reactInstantsearchCore.AnonAttribute with (typings.reactInstantsearchCore.AnonCurrentRefinement | typings.reactInstantsearchCore.AnonItems)
  type RefinementValue = js.Function1[
    /* searchState */ typings.reactInstantsearchCore.mod.SearchState, 
    typings.reactInstantsearchCore.mod.SearchState
  ]
}
