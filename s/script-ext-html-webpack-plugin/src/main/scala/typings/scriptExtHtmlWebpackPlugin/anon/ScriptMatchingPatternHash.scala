package typings.scriptExtHtmlWebpackPlugin.anon

import typings.scriptExtHtmlWebpackPlugin.mod.ScriptMatchingPatternBase
import typings.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.all
import typings.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.async
import typings.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.initial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined script-ext-html-webpack-plugin.script-ext-html-webpack-plugin.ScriptMatchingPatternHash & {  chunks ? :'initial' | 'async' | 'all'} */
trait ScriptMatchingPatternHash extends js.Object {
  var chunks: js.UndefOr[initial | async | all] = js.undefined
  var test: ScriptMatchingPatternBase
}

object ScriptMatchingPatternHash {
  @scala.inline
  def apply(test: ScriptMatchingPatternBase, chunks: initial | async | all = null): ScriptMatchingPatternHash = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
    if (chunks != null) __obj.updateDynamic("chunks")(chunks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptMatchingPatternHash]
  }
}

