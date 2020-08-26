package typings.reactRelay.entryPointTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  entryPoints :{[ T in keyof TPreloadedEntryPoints ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ExtractEntryPointTypeHelper<TPreloadParams>} | undefined,   extraProps :TExtraProps | undefined,   queries :{[ T in keyof TPreloadedQueries ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ExtractQueryTypeHelper<TEnvironmentProviderOptions>} | undefined}> */
@js.native
trait PreloadProps[TPreloadParams, TPreloadedQueries /* <: js.Object */, TPreloadedEntryPoints /* <: js.Object */, TExtraProps, TEnvironmentProviderOptions] extends js.Object {
  val entryPoints: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ T in keyof TPreloadedEntryPoints ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ExtractEntryPointTypeHelper<TPreloadParams>}
    */ typings.reactRelay.reactRelayStrings.PreloadProps with TopLevel[js.Any]
  ] = js.native
  val extraProps: js.UndefOr[TExtraProps] = js.native
  val queries: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ T in keyof TPreloadedQueries ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ExtractQueryTypeHelper<TEnvironmentProviderOptions>}
    */ typings.reactRelay.reactRelayStrings.PreloadProps with TopLevel[js.Any]
  ] = js.native
}

object PreloadProps {
  @scala.inline
  def apply[TPreloadParams, /* <: js.Object */ TPreloadedQueries, /* <: js.Object */ TPreloadedEntryPoints, TExtraProps, TEnvironmentProviderOptions](): PreloadProps[
    TPreloadParams, 
    TPreloadedQueries, 
    TPreloadedEntryPoints, 
    TExtraProps, 
    TEnvironmentProviderOptions
  ] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreloadProps[
      TPreloadParams, 
      TPreloadedQueries, 
      TPreloadedEntryPoints, 
      TExtraProps, 
      TEnvironmentProviderOptions
    ]]
  }
  @scala.inline
  implicit class PreloadPropsOps[Self <: PreloadProps[_, _, _, _, _], TPreloadParams, /* <: js.Object */ TPreloadedQueries, /* <: js.Object */ TPreloadedEntryPoints, TExtraProps, TEnvironmentProviderOptions] (val x: Self with (PreloadProps[
        TPreloadParams, 
        TPreloadedQueries, 
        TPreloadedEntryPoints, 
        TExtraProps, 
        TEnvironmentProviderOptions
      ])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEntryPoints(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ T in keyof TPreloadedEntryPoints ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ExtractEntryPointTypeHelper<TPreloadParams>}
      */ typings.reactRelay.reactRelayStrings.PreloadProps with TopLevel[js.Any]
    ): Self = this.set("entryPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntryPoints: Self = this.set("entryPoints", js.undefined)
    @scala.inline
    def setExtraProps(value: TExtraProps): Self = this.set("extraProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraProps: Self = this.set("extraProps", js.undefined)
    @scala.inline
    def setQueries(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ T in keyof TPreloadedQueries ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ExtractQueryTypeHelper<TEnvironmentProviderOptions>}
      */ typings.reactRelay.reactRelayStrings.PreloadProps with TopLevel[js.Any]
    ): Self = this.set("queries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueries: Self = this.set("queries", js.undefined)
  }
  
}

