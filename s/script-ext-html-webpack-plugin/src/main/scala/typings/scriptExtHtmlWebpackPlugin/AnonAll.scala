package typings.scriptExtHtmlWebpackPlugin

import typings.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.all
import typings.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.async
import typings.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.initial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAll extends js.Object {
  var chunks: js.UndefOr[initial | async | all] = js.undefined
}

object AnonAll {
  @scala.inline
  def apply(chunks: initial | async | all = null): AnonAll = {
    val __obj = js.Dynamic.literal()
    if (chunks != null) __obj.updateDynamic("chunks")(chunks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAll]
  }
}

