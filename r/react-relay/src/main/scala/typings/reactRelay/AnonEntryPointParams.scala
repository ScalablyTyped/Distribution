package typings.reactRelay

import typings.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
import typings.reactRelay.entryPointTypesMod.PreloadProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEntryPointParams[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps] extends js.Object {
  var root: js.Any
  def getPreloadProps(entryPointParams: TEntryPointParams): PreloadProps[
    TEntryPointParams, 
    TPreloadedQueries, 
    TPreloadedEntryPoints, 
    TExtraProps, 
    EnvironmentProviderOptions
  ]
}

object AnonEntryPointParams {
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
  ): AnonEntryPointParams[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps] = {
    val __obj = js.Dynamic.literal(getPreloadProps = js.Any.fromFunction1(getPreloadProps), root = root.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEntryPointParams[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps]]
  }
}

