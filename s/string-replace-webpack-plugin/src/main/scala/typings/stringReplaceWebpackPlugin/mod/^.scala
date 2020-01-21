package typings.stringReplaceWebpackPlugin.mod

import typings.webpack.mod.Plugin
import typings.webpack.mod.RuleSetUse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("string-replace-webpack-plugin", JSImport.Namespace)
@js.native
class ^ () extends Plugin

@JSImport("string-replace-webpack-plugin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def replace(options: Options): RuleSetUse = js.native
  def replace(options: Options, /**
    * loaders to follow the replacement
    */
  nextLoaders: String): RuleSetUse = js.native
  def replace(/**
    * loaders to apply prior to the replacement
    */
  prevLoaders: String, options: Options): RuleSetUse = js.native
  def replace(
    /**
    * loaders to apply prior to the replacement
    */
  prevLoaders: String,
    options: Options,
    /**
    * loaders to follow the replacement
    */
  nextLoaders: String
  ): RuleSetUse = js.native
}

