package typings.reactRelay.lazyLoadEntryPointContainerMod

import typings.reactRelay.entryPointTypesMod.EntryPoint
import typings.reactRelay.entryPointTypesMod.EntryPointComponent
import typings.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
import typings.reactRelay.entryPointTypesMod.IEnvironmentProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Readonly<{  entryPoint :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.EntryPoint<TEntryPointParams, react-relay.react-relay/lib/relay-experimental/EntryPointTypes.EntryPointComponent<TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps>>,   entryPointParams :TEntryPointParams,   environmentProvider :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.IEnvironmentProvider<react-relay.react-relay/lib/relay-experimental/EntryPointTypes.EnvironmentProviderOptions> | undefined,   props :TRuntimeProps}>> */
@js.native
trait EntryPointContainerProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] extends js.Object {
  val entryPoint: EntryPoint[
    TEntryPointParams, 
    EntryPointComponent[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
  ] = js.native
  val entryPointParams: TEntryPointParams = js.native
  val environmentProvider: js.UndefOr[IEnvironmentProvider[EnvironmentProviderOptions]] = js.native
  val props: TRuntimeProps = js.native
}

object EntryPointContainerProps {
  @scala.inline
  def apply[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps](
    entryPoint: EntryPoint[
      TEntryPointParams, 
      EntryPointComponent[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
    ],
    entryPointParams: TEntryPointParams,
    props: TRuntimeProps
  ): EntryPointContainerProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
    val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], entryPointParams = entryPointParams.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryPointContainerProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]]
  }
  @scala.inline
  implicit class EntryPointContainerPropsOps[Self <: EntryPointContainerProps[_, _, _, _, _], TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] (val x: Self with (EntryPointContainerProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps])) extends AnyVal {
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
    def setEntryPoint(
      value: EntryPoint[
          TEntryPointParams, 
          EntryPointComponent[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
        ]
    ): Self = this.set("entryPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntryPointParams(value: TEntryPointParams): Self = this.set("entryPointParams", value.asInstanceOf[js.Any])
    @scala.inline
    def setProps(value: TRuntimeProps): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironmentProvider(value: IEnvironmentProvider[EnvironmentProviderOptions]): Self = this.set("environmentProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentProvider: Self = this.set("environmentProvider", js.undefined)
  }
  
}

