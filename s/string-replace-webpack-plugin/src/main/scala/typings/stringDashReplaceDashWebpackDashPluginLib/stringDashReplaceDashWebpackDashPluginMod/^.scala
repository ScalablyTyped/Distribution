package typings
package stringDashReplaceDashWebpackDashPluginLib.stringDashReplaceDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("string-replace-webpack-plugin", JSImport.Namespace)
@js.native
class ^ () extends StringReplacePlugin

@JSImport("string-replace-webpack-plugin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def replace(options: Options): webpackLib.webpackMod.RuleSetUse = js.native
  def replace(options: Options, /**
    * loaders to follow the replacement
    */
  nextLoaders: java.lang.String): webpackLib.webpackMod.RuleSetUse = js.native
  def replace(
    /**
    * loaders to apply prior to the replacement
    */
  prevLoaders: java.lang.String,
    options: Options
  ): webpackLib.webpackMod.RuleSetUse = js.native
  def replace(
    /**
    * loaders to apply prior to the replacement
    */
  prevLoaders: java.lang.String,
    options: Options,
    /**
    * loaders to follow the replacement
    */
  nextLoaders: java.lang.String
  ): webpackLib.webpackMod.RuleSetUse = js.native
}

