package typings.reactDashRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EntryPointsExtraProps[TPreloadParams, TPreloadedEntryPoints /* <: js.Object */, TExtraProps, TEnvironmentProviderOptions, TPreloadedQueries /* <: js.Object */] extends js.Object {
  var entryPoints: js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ T in keyof TPreloadedEntryPoints ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ExtractEntryPointTypeHelper<TPreloadParams>}
    */ typings.reactDashRelay.reactDashRelayStrings.Anon_EntryPointsExtraProps with js.Any
  ] = js.undefined
  var extraProps: js.UndefOr[TExtraProps] = js.undefined
  var queries: js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ T in keyof TPreloadedQueries ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ExtractQueryTypeHelper<TEnvironmentProviderOptions>}
    */ typings.reactDashRelay.reactDashRelayStrings.Anon_EntryPointsExtraProps with js.Any
  ] = js.undefined
}

object Anon_EntryPointsExtraProps {
  @scala.inline
  def apply[TPreloadParams, TPreloadedEntryPoints /* <: js.Object */, TExtraProps, TEnvironmentProviderOptions, TPreloadedQueries /* <: js.Object */](
    entryPoints: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ T in keyof TPreloadedEntryPoints ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ExtractEntryPointTypeHelper<TPreloadParams>}
    */ typings.reactDashRelay.reactDashRelayStrings.Anon_EntryPointsExtraProps with js.Any = null,
    extraProps: TExtraProps = null,
    queries: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ T in keyof TPreloadedQueries ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ExtractQueryTypeHelper<TEnvironmentProviderOptions>}
    */ typings.reactDashRelay.reactDashRelayStrings.Anon_EntryPointsExtraProps with js.Any = null
  ): Anon_EntryPointsExtraProps[
    TPreloadParams, 
    TPreloadedEntryPoints, 
    TExtraProps, 
    TEnvironmentProviderOptions, 
    TPreloadedQueries
  ] = {
    val __obj = js.Dynamic.literal()
    if (entryPoints != null) __obj.updateDynamic("entryPoints")(entryPoints)
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    if (queries != null) __obj.updateDynamic("queries")(queries)
    __obj.asInstanceOf[Anon_EntryPointsExtraProps[
  TPreloadParams, 
  TPreloadedEntryPoints, 
  TExtraProps, 
  TEnvironmentProviderOptions, 
  TPreloadedQueries]]
  }
}

