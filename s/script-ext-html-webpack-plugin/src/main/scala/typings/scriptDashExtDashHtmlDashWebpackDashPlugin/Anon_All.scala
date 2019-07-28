package typings.scriptDashExtDashHtmlDashWebpackDashPlugin

import typings.scriptDashExtDashHtmlDashWebpackDashPlugin.scriptDashExtDashHtmlDashWebpackDashPluginStrings.all
import typings.scriptDashExtDashHtmlDashWebpackDashPlugin.scriptDashExtDashHtmlDashWebpackDashPluginStrings.async
import typings.scriptDashExtDashHtmlDashWebpackDashPlugin.scriptDashExtDashHtmlDashWebpackDashPluginStrings.initial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_All extends js.Object {
  var chunks: js.UndefOr[initial | async | all] = js.undefined
}

object Anon_All {
  @scala.inline
  def apply(chunks: initial | async | all = null): Anon_All = {
    val __obj = js.Dynamic.literal()
    if (chunks != null) __obj.updateDynamic("chunks")(chunks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_All]
  }
}

