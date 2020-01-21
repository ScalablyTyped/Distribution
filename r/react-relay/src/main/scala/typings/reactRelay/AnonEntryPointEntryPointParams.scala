package typings.reactRelay

import typings.reactRelay.entryPointTypesMod.EntryPoint
import typings.reactRelay.entryPointTypesMod.EntryPointComponent
import typings.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
import typings.reactRelay.entryPointTypesMod.IEnvironmentProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEntryPointEntryPointParams[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] extends js.Object {
  var entryPoint: EntryPoint[
    TEntryPointParams, 
    EntryPointComponent[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
  ]
  var entryPointParams: TEntryPointParams
  var environmentProvider: js.UndefOr[IEnvironmentProvider[EnvironmentProviderOptions]] = js.undefined
  var props: TRuntimeProps
}

object AnonEntryPointEntryPointParams {
  @scala.inline
  def apply[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps](
    entryPoint: EntryPoint[
      TEntryPointParams, 
      EntryPointComponent[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]
    ],
    entryPointParams: TEntryPointParams,
    props: TRuntimeProps,
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions] = null
  ): AnonEntryPointEntryPointParams[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
    val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], entryPointParams = entryPointParams.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    if (environmentProvider != null) __obj.updateDynamic("environmentProvider")(environmentProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEntryPointEntryPointParams[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]]
  }
}

