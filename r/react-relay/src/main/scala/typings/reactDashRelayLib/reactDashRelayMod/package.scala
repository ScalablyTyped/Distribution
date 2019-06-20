package typings
package reactDashRelayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashRelayMod {
  type Container[Props] = reactLib.reactMod.ComponentType[ContainerProps[Props] with reactDashRelayLib.Anon_ComponentRef]
  type ContainerProps[Props] = MappedFragmentProps[
    stdLib.Pick[
      Props, 
      stdLib.Exclude[java.lang.String, reactDashRelayLib.reactDashRelayLibStrings.relay]
    ]
  ]
  type FragmentOrRegularProp[T] = T | js.Array[_FragmentRefs[js.Any]] | _FragmentRefs[js.Any]
  type FragmentVariablesGetter = js.Function2[
    /* prevVars */ relayDashRuntimeLib.relayDashRuntimeMod.Variables, 
    /* totalCount */ scala.Double, 
    relayDashRuntimeLib.relayDashRuntimeMod.Variables
  ]
  type GeneratedNodeMap = org.scalablytyped.runtime.StringDictionary[relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode]
  type MappedFragmentProps[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: react-relay.react-relay.FragmentOrRegularProp<T[K]>}
    */ reactDashRelayLib.reactDashRelayLibStrings.MappedFragmentProps with T
  type ObserverOrCallback = relayDashRuntimeLib.relayDashRuntimeMod.Observer[scala.Unit] | (js.Function1[/* error */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit])
  type ReactRelayQueryRenderer[TOperation /* <: relayDashRuntimeLib.relayDashRuntimeMod.OperationType */] = reactLib.reactMod.Component[reactDashRelayLib.Anon_CacheConfig[TOperation], js.Object, js.Any]
}
