package typings.reactDashRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashRelayMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.react.reactMod.Component
  import typings.react.reactMod.ComponentType
  import typings.reactDashRelay.Anon_CacheConfig
  import typings.reactDashRelay.Anon_ComponentRef
  import typings.reactDashRelay.reactDashRelayStrings.relay
  import typings.relayDashRuntime.libNetworkRelayObservableMod.Observer
  import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
  import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
  import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
  import typings.std.Error
  import typings.std.Exclude
  import typings.std.Pick

  type Container[Props] = ComponentType[ContainerProps[Props] with Anon_ComponentRef]
  type ContainerProps[Props] = MappedFragmentProps[Pick[Props, Exclude[String, relay]]]
  type FragmentOrRegularProp[T] = T | js.Array[_FragmentRefs[js.Any]] | _FragmentRefs[js.Any]
  type FragmentVariablesGetter = js.Function2[/* prevVars */ Variables, /* totalCount */ Double, Variables]
  type GeneratedNodeMap = StringDictionary[GraphQLTaggedNode]
  type MappedFragmentProps[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: react-relay.react-relay.FragmentOrRegularProp<T[K]>}
    */ typings.reactDashRelay.reactDashRelayStrings.MappedFragmentProps with T
  type ObserverOrCallback = Observer[Unit] | (js.Function1[/* error */ js.UndefOr[Error | Null], Unit])
  type ReactRelayQueryRenderer[TOperation /* <: OperationType */] = Component[Anon_CacheConfig[TOperation], js.Object, js.Any]
}
