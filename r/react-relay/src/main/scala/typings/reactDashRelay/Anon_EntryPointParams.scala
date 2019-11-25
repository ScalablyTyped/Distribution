package typings.reactDashRelay

import typings.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.EnvironmentProviderOptions
import typings.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.PreloadProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EntryPointParams[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps] extends js.Object {
  var root: js.Any
  def getPreloadProps(entryPointParams: TEntryPointParams): PreloadProps[
    TEntryPointParams, 
    TPreloadedQueries, 
    TPreloadedEntryPoints, 
    TExtraProps, 
    EnvironmentProviderOptions
  ]
}

object Anon_EntryPointParams {
  @scala.inline
  def apply[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps](
    getPreloadProps: TEntryPointParams => PreloadProps[
      TEntryPointParams, 
      TPreloadedQueries, 
      TPreloadedEntryPoints, 
      TExtraProps, 
      EnvironmentProviderOptions
    ],
    root: js.Any
  ): Anon_EntryPointParams[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps] = {
    val __obj = js.Dynamic.literal(getPreloadProps = js.Any.fromFunction1(getPreloadProps), root = root.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EntryPointParams[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps]]
  }
}

