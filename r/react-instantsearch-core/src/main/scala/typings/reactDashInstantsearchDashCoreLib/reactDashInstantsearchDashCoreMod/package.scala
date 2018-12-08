package typings
package reactDashInstantsearchDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashInstantsearchDashCoreMod {
  type ConnectedComponentClass[TProps, TProvidedProps, TExposedProps] = reactLib.reactMod.ReactNs.ComponentClass[
    (reactDashInstantsearchDashCoreLib.Omit[TProps, TProvidedProps]) with TExposedProps, 
    reactLib.reactMod.ReactNs.ComponentState
  ]
  type HighlightResult[TDoc] = reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreLibStrings.HighlightResult with TDoc
  type Hit[TDoc] = TDoc with reactDashInstantsearchDashCoreLib.Anon_ObjectID[TDoc]
  type Refinement = reactDashInstantsearchDashCoreLib.Anon_Label with (reactDashInstantsearchDashCoreLib.Anon_CurrentRefinement | reactDashInstantsearchDashCoreLib.Anon_Items)
  type RefinementValue = js.Function1[/* searchState */ SearchState, SearchState]
}
