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
  def LazyLoadEntryPointContainerProps: EntryPointContainerProps.type = EntryPointContainerProps
  type LazyLoadEntryPointContainerProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = EntryPointContainerProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
  @scala.inline
  def LocalQueryRendererProps: QueryRendererProps.type = QueryRendererProps
  type LocalQueryRendererProps[TOperation /* <: OperationType */] = QueryRendererProps[TOperation]
  @scala.inline
  def RelayEnvironmentProviderProps: Props.type = Props
  type RelayEnvironmentProviderProps = Props
}

