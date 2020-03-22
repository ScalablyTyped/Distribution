package typings.reactRelay

import typings.reactRelay.lazyLoadEntryPointContainerMod.EntryPointContainerProps
import typings.reactRelay.mod.QueryRendererProps
import typings.reactRelay.relayEnvironmentProviderMod.Props
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reactRelayProps {
  @scala.inline
  def LazyLoadEntryPointContainerProps: EntryPointContainerProps.type = typings.reactRelay.lazyLoadEntryPointContainerMod.EntryPointContainerProps
  type LazyLoadEntryPointContainerProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = EntryPointContainerProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
  @scala.inline
  def LocalQueryRendererProps: QueryRendererProps.type = typings.reactRelay.mod.QueryRendererProps
  type LocalQueryRendererProps[TOperation /* <: OperationType */] = QueryRendererProps[TOperation]
  @scala.inline
  def RelayEnvironmentProviderProps: Props.type = typings.reactRelay.relayEnvironmentProviderMod.Props
  type RelayEnvironmentProviderProps = Props
}

