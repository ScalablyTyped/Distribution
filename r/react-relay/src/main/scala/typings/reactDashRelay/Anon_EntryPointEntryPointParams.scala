package typings.reactDashRelay

import typings.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.EntryPoint
import typings.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.EntryPointComponent
import typings.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.EnvironmentProviderOptions
import typings.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.IEnvironmentProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EntryPointEntryPointParams[TPreloadedQueries, TRuntimeProps, TExtraProps, TPreloadedEntryPoints, TEntryPointParams] extends js.Object {
  var entryPoint: EntryPoint[
    TEntryPointParams, 
    EntryPointComponent[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
  ]
  var entryPointParams: TEntryPointParams
  var environmentProvider: js.UndefOr[IEnvironmentProvider[EnvironmentProviderOptions]] = js.undefined
  var props: TRuntimeProps
}

object Anon_EntryPointEntryPointParams {
  @scala.inline
  def apply[TPreloadedQueries, TRuntimeProps, TExtraProps, TPreloadedEntryPoints, TEntryPointParams](
    entryPoint: EntryPoint[
      TEntryPointParams, 
      EntryPointComponent[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
    ],
    entryPointParams: TEntryPointParams,
    props: TRuntimeProps,
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions] = null
  ): Anon_EntryPointEntryPointParams[TPreloadedQueries, TRuntimeProps, TExtraProps, TPreloadedEntryPoints, TEntryPointParams] = {
    val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], entryPointParams = entryPointParams.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    if (environmentProvider != null) __obj.updateDynamic("environmentProvider")(environmentProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EntryPointEntryPointParams[TPreloadedQueries, TRuntimeProps, TExtraProps, TPreloadedEntryPoints, TEntryPointParams]]
  }
}

