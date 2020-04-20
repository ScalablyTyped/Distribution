package typings.reactRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Container[Props] = typings.react.mod.ComponentType[
    typings.reactRelay.mod.ContainerProps[Props] with typings.reactRelay.AnonComponentRef
  ]
  type ContainerProps[Props] = typings.reactRelay.mod.MappedFragmentProps[
    typings.std.Pick[
      Props, 
      typings.std.Exclude[/* keyof Props */ java.lang.String, typings.reactRelay.reactRelayStrings.relay]
    ]
  ]
  type FragmentOrRegularProp[T] = T | js.Array[typings.relayRuntime.mod._FragmentRefs[js.Any]] | typings.relayRuntime.mod._FragmentRefs[js.Any]
  type MappedFragmentProps[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: react-relay.react-relay.FragmentOrRegularProp<T[K]>}
    */ typings.reactRelay.reactRelayStrings.MappedFragmentProps with org.scalablytyped.runtime.TopLevel[T]
  type ObserverOrCallback = typings.relayRuntime.relayObservableMod.Observer[scala.Unit] | (js.Function1[/* error */ js.UndefOr[typings.std.Error | scala.Null], scala.Unit])
  type ReactRelayLocalQueryRenderer[TOperation /* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */] = typings.react.mod.Component[typings.reactRelay.mod.QueryRendererProps[TOperation], js.Object, js.Any]
  type ReactRelayQueryRenderer[TOperation /* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */] = typings.react.mod.Component[
    typings.reactRelay.AnonCacheConfig with typings.reactRelay.mod.QueryRendererProps[TOperation], 
    js.Object, 
    js.Any
  ]
}
