package typings.reactRelay.relayHooksEntryPointTypesMod

import typings.react.mod.ComponentType
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.OperationType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type EntryPoint[TEntryPointComponent, TEntryPointParams /* <: js.Object */] = InternalEntryPointRepresentation[
TEntryPointParams, 
/* import warning: importer.ImportType#apply Failed type conversion: TEntryPointComponent extends react-relay.react-relay/relay-hooks/EntryPointTypes.EntryPointComponent<infer TPreloadedQueries, any, any, any> ? TPreloadedQueries : never */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: TEntryPointComponent extends react-relay.react-relay/relay-hooks/EntryPointTypes.EntryPointComponent<any, infer TPreloadedEntryPoints, any, any> ? TPreloadedEntryPoints : never */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: TEntryPointComponent extends react-relay.react-relay/relay-hooks/EntryPointTypes.EntryPointComponent<any, any, infer TRuntimeProps, any> ? TRuntimeProps : never */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: TEntryPointComponent extends react-relay.react-relay/relay-hooks/EntryPointTypes.EntryPointComponent<any, any, any, infer TExtraProps> ? TExtraProps : never */ js.Any]

type EntryPointComponent[TPreloadedQueries /* <: Record[String, OperationType] */, TPreloadedEntryPoints /* <: Record[String, js.UndefOr[EntryPoint[Any, Any]]] */, TRuntimeProps /* <: js.Object */, TExtraProps /* <: js.Object | Null */] = ComponentType[
EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]]

type EnvironmentProviderOptions[T /* <: Record[String, Any] */] = T
