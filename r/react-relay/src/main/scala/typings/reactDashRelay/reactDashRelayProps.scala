package typings.reactDashRelay

import typings.reactDashRelay.libRelayDashExperimentalLazyLoadEntryPointContainerMod.EntryPointContainerProps
import typings.reactDashRelay.libRelayDashExperimentalRelayEnvironmentProviderMod.Props
import typings.reactDashRelay.reactDashRelayMod.QueryRendererProps
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reactDashRelayProps {
  type LazyLoadEntryPointContainerProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = EntryPointContainerProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
  @scala.inline
  def LocalQueryRendererProps: QueryRendererProps.type = typings.reactDashRelay.reactDashRelayMod.QueryRendererProps
  type LocalQueryRendererProps[TOperation /* <: OperationType */] = QueryRendererProps[TOperation]
  @scala.inline
  def RelayEnvironmentProviderProps: Props.type = typings.reactDashRelay.libRelayDashExperimentalRelayEnvironmentProviderMod.Props
  type RelayEnvironmentProviderProps = Props
}

