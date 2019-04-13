package typings
package reactDashRelayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashRelayMod {
  type ConcreteFragmentDefinition = js.Object
  type ConcreteOperationDefinition = js.Object
  type FragmentOrRegularProp[T] = T | js.Array[_FragmentRefs[js.Any]] | _FragmentRefs[js.Any]
  type GeneratedNodeMap = org.scalablytyped.runtime.StringDictionary[relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode]
  type MappedFragmentProps[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: react-relay.react-relay.FragmentOrRegularProp<T[K]>}
    */ reactDashRelayLib.reactDashRelayLibStrings.MappedFragmentProps with T
  type RelayContainer[P] = reactLib.reactMod.ComponentType[MappedFragmentProps[RemoveRelayProp[P]] with ComponentRef]
  type RelayPaginationProp = RelayProp with reactDashRelayLib.Anon_Callback
  type RelayRefetchProp = RelayProp with reactDashRelayLib.Anon_CallbackError
  type RemoveRelayProp[P] = stdLib.Pick[
    P, 
    stdLib.Exclude[java.lang.String, reactDashRelayLib.reactDashRelayLibStrings.relay]
  ]
}
