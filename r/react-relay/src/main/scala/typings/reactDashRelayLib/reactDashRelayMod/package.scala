package typings
package reactDashRelayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashRelayMod {
  type ConcreteFragmentDefinition = js.Object
  type ConcreteOperationDefinition = js.Object
  type FragmentOrRegularProp[T] = T | js.Array[_FragmentRefs[js.Any]] | _FragmentRefs[js.Any]
  type MappedFragmentProps[T] = reactDashRelayLib.reactDashRelayLibStrings.MappedFragmentProps with T
  type RelayContainer[P] = reactLib.reactMod.ReactNs.ComponentType[MappedFragmentProps[RemoveRelayProp[P]] with ComponentRef]
  type RelayPaginationProp = RelayProp with reactDashRelayLib.Anon_LoadMore
  type RelayRefetchProp = RelayProp with reactDashRelayLib.Anon_Refetch
  type RemoveRelayProp[P] = stdLib.Pick[
    P, 
    stdLib.Exclude[java.lang.String, reactDashRelayLib.reactDashRelayLibStrings.relay]
  ]
}
