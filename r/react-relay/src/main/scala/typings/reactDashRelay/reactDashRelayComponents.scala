package typings.reactDashRelay

import typings.react.reactMod.ComponentType
import typings.reactDashRelay.reactDashRelayMod.QueryRendererProps
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashRelayComponents extends reactDashRelayProps {
  @scala.inline
  def LazyLoadEntryPointContainer[TEntryPointParams /* <: js.Object */, TPreloadedQueries /* <: js.Object */, TPreloadedEntryPoints /* <: js.Object */, TRuntimeProps /* <: js.Object */, TExtraProps]: ComponentType[
    LazyLoadEntryPointContainerProps[
      // tslint:disable-next-line no-unnecessary-generics
  TEntryPointParams, 
      // tslint:disable-next-line no-unnecessary-generics
  TPreloadedQueries, 
      // tslint:disable-next-line no-unnecessary-generics
  TPreloadedEntryPoints, 
      // tslint:disable-next-line no-unnecessary-generics
  TRuntimeProps, 
      // tslint:disable-next-line no-unnecessary-generics
  TExtraProps
    ]
  ] = typings.reactDashRelay.hooksMod.asInstanceOf[js.Dynamic].selectDynamic("LazyLoadEntryPointContainer").asInstanceOf[typings.react.reactMod.ComponentType[
  LazyLoadEntryPointContainerProps[
    // tslint:disable-next-line no-unnecessary-generics
  TEntryPointParams, 
    // tslint:disable-next-line no-unnecessary-generics
  TPreloadedQueries, 
    // tslint:disable-next-line no-unnecessary-generics
  TPreloadedEntryPoints, 
    // tslint:disable-next-line no-unnecessary-generics
  TRuntimeProps, 
    // tslint:disable-next-line no-unnecessary-generics
  TExtraProps
  ]]]
  @scala.inline
  def LocalQueryRenderer: ComponentType[LocalQueryRendererProps[OperationType]] = js.constructorOf[typings.reactDashRelay.reactDashRelayMod.LocalQueryRenderer[typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType]].asInstanceOf[typings.react.reactMod.ComponentType[
  LocalQueryRendererProps[typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType]]]
  @scala.inline
  def QueryRenderer: ComponentType[Anon_CacheConfig with QueryRendererProps[OperationType]] = js.constructorOf[typings.reactDashRelay.reactDashRelayMod.QueryRenderer[typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType]].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashRelay.Anon_CacheConfig with typings.reactDashRelay.reactDashRelayMod.QueryRendererProps[typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType]]]
  @scala.inline
  def RelayEnvironmentProvider: ComponentType[RelayEnvironmentProviderProps] = typings.reactDashRelay.hooksMod.asInstanceOf[js.Dynamic].selectDynamic("RelayEnvironmentProvider").asInstanceOf[typings.react.reactMod.ComponentType[RelayEnvironmentProviderProps]]
}

