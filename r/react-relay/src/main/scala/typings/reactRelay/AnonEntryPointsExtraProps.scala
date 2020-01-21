package typings.reactRelay

import typings.reactRelay.reactRelayStrings.Anon_EntryPointsExtraProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEntryPointsExtraProps[TPreloadedEntryPoints /* <: js.Object */, TPreloadParams, TExtraProps, TPreloadedQueries /* <: js.Object */, TEnvironmentProviderOptions] extends js.Object {
  var entryPoints: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ T in keyof TPreloadedEntryPoints ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ExtractEntryPointTypeHelper<TPreloadParams>}
    */ Anon_EntryPointsExtraProps with js.Any
  ] = js.undefined
  var extraProps: js.UndefOr[TExtraProps] = js.undefined
  var queries: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ T in keyof TPreloadedQueries ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ExtractQueryTypeHelper<TEnvironmentProviderOptions>}
    */ Anon_EntryPointsExtraProps with js.Any
  ] = js.undefined
}

object AnonEntryPointsExtraProps {
  @scala.inline
  def apply[TPreloadedEntryPoints /* <: js.Object */, TPreloadParams, TExtraProps, TPreloadedQueries /* <: js.Object */, TEnvironmentProviderOptions](
    entryPoints: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ T in keyof TPreloadedEntryPoints ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ExtractEntryPointTypeHelper<TPreloadParams>}
    */ Anon_EntryPointsExtraProps with js.Any = null,
    extraProps: TExtraProps = null,
    queries: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ T in keyof TPreloadedQueries ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ExtractQueryTypeHelper<TEnvironmentProviderOptions>}
    */ Anon_EntryPointsExtraProps with js.Any = null
  ): AnonEntryPointsExtraProps[
    TPreloadedEntryPoints, 
    TPreloadParams, 
    TExtraProps, 
    TPreloadedQueries, 
    TEnvironmentProviderOptions
  ] = {
    val __obj = js.Dynamic.literal()
    if (entryPoints != null) __obj.updateDynamic("entryPoints")(entryPoints.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEntryPointsExtraProps[
  TPreloadedEntryPoints, 
  TPreloadParams, 
  TExtraProps, 
  TPreloadedQueries, 
  TEnvironmentProviderOptions]]
  }
}

