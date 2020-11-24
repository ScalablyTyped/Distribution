package typings.stringReplaceWebpackPlugin.mod

import typings.std.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("string-replace-webpack-plugin", JSImport.Namespace)
@js.native
class ^ () extends Plugin
@JSImport("string-replace-webpack-plugin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def replace(options: Options): js.Any = js.native
  def replace(options: Options, /**
    * loaders to follow the replacement
    */
  nextLoaders: String): js.Any = js.native
  def replace(/**
    * loaders to apply prior to the replacement
    */
  prevLoaders: String, options: Options): js.Any = js.native
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
  ): js.Any = js.native
}
