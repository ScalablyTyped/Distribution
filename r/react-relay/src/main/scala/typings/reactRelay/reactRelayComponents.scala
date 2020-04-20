package typings.reactRelay

import typings.react.mod.ComponentType
import typings.reactRelay.hooksMod
import typings.reactRelay.mod.QueryRendererProps
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactRelayComponents extends reactRelayProps {
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
  ] = hooksMod.asInstanceOf[js.Dynamic].selectDynamic("LazyLoadEntryPointContainer").asInstanceOf[ComponentType[
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
  ]]
  @scala.inline
  def LocalQueryRenderer[TOperation /* <: OperationType */]: ComponentType[LocalQueryRendererProps[TOperation]] = js.constructorOf[typings.reactRelay.mod.LocalQueryRenderer[TOperation]].asInstanceOf[ComponentType[LocalQueryRendererProps[TOperation]]]
  @scala.inline
  def QueryRenderer[TOperation /* <: OperationType */]: ComponentType[AnonCacheConfig with QueryRendererProps[TOperation]] = js.constructorOf[typings.reactRelay.mod.QueryRenderer[TOperation]].asInstanceOf[ComponentType[AnonCacheConfig with QueryRendererProps[TOperation]]]
  @scala.inline
  def RelayEnvironmentProvider: ComponentType[RelayEnvironmentProviderProps] = hooksMod.asInstanceOf[js.Dynamic].selectDynamic("RelayEnvironmentProvider").asInstanceOf[ComponentType[RelayEnvironmentProviderProps]]
}

