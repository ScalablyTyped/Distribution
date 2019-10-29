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
  def LocalQueryRenderer[TOperation /* <: OperationType */]: ComponentType[LocalQueryRendererProps[TOperation]] = js.constructorOf[typings.reactDashRelay.reactDashRelayMod.LocalQueryRenderer[TOperation]].asInstanceOf[typings.react.reactMod.ComponentType[LocalQueryRendererProps[TOperation]]]
  @scala.inline
  def QueryRenderer[TOperation /* <: OperationType */]: ComponentType[Anon_CacheConfig with QueryRendererProps[TOperation]] = js.constructorOf[typings.reactDashRelay.reactDashRelayMod.QueryRenderer[TOperation]].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.reactDashRelay.Anon_CacheConfig with typings.reactDashRelay.reactDashRelayMod.QueryRendererProps[TOperation]]]
  @scala.inline
  def RelayEnvironmentProvider: ComponentType[RelayEnvironmentProviderProps] = typings.reactDashRelay.hooksMod.asInstanceOf[js.Dynamic].selectDynamic("RelayEnvironmentProvider").asInstanceOf[typings.react.reactMod.ComponentType[RelayEnvironmentProviderProps]]
}

