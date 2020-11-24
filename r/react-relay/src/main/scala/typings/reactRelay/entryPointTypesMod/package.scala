package typings.reactRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object entryPointTypesMod {
  
  type EntryPoint[TEntryPointComponent, TEntryPointParams /* <: js.Object */] = typings.reactRelay.entryPointTypesMod.InternalEntryPointRepresentation[TEntryPointParams, js.Any, js.Any, js.Any, js.Any]
  
  type EntryPointComponent[TPreloadedQueries /* <: typings.std.Record[java.lang.String, typings.relayRuntime.relayRuntimeTypesMod.OperationType] */, TPreloadedEntryPoints /* <: typings.std.Record[
    java.lang.String, 
    js.UndefOr[typings.reactRelay.entryPointTypesMod.EntryPoint[_, _]]
  ] */, TRuntimeProps /* <: js.Object */, TExtraProps /* <: js.Object | scala.Null */] = typings.react.mod.ComponentType[
    typings.reactRelay.entryPointTypesMod.EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
  ]
  
  type EnvironmentProviderOptions[T /* <: typings.std.Record[java.lang.String, _] */] = T
  
  type PreloadedEntryPoint[TEntryPointComponent] = typings.reactRelay.anon.Dispose[TEntryPointComponent]
  
  type PreloadedEntryPoints[TPreloadedEntryPoints] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ T in keyof TPreloadedEntryPoints ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadedEntryPoint<react-relay.react-relay/lib/relay-experimental/helpers.GetEntryPointComponentFromEntryPoint<TPreloadedEntryPoints[T]>>}
    */ typings.reactRelay.reactRelayStrings.PreloadedEntryPoints with org.scalablytyped.runtime.TopLevel[TPreloadedEntryPoints]
  
  type PreloadedQueries[TPreloadedQueries] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ T in keyof TPreloadedQueries ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadedQuery<TPreloadedQueries[T], react-relay.react-relay/lib/relay-experimental/EntryPointTypes.EnvironmentProviderOptions<std.Record<string, unknown>>>}
    */ typings.reactRelay.reactRelayStrings.PreloadedQueries with org.scalablytyped.runtime.TopLevel[TPreloadedQueries]
  
  type ThinNestedEntryPointParamsObject[TPreloadedEntryPoints /* <: typings.std.Record[
    java.lang.String, 
    js.UndefOr[typings.reactRelay.entryPointTypesMod.EntryPoint[_, _]]
  ] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TPreloadedEntryPoints ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ThinNestedEntryPointParams<TPreloadedEntryPoints[K]>}
    */ typings.reactRelay.reactRelayStrings.ThinNestedEntryPointParamsObject with org.scalablytyped.runtime.TopLevel[TPreloadedEntryPoints]
  
  type ThinQueryParamsObject[TPreloadedQueries /* <: typings.std.Record[java.lang.String, typings.relayRuntime.relayRuntimeTypesMod.OperationType] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TPreloadedQueries ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ThinQueryParams<TPreloadedQueries[K], react-relay.react-relay/lib/relay-experimental/EntryPointTypes.EnvironmentProviderOptions<std.Record<string, unknown>>>}
    */ typings.reactRelay.reactRelayStrings.ThinQueryParamsObject with org.scalablytyped.runtime.TopLevel[TPreloadedQueries]
}
