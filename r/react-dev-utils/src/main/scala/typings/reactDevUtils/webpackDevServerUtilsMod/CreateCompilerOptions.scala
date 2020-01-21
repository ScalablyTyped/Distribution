package typings.reactDevUtils.webpackDevServerUtilsMod

import typings.reactDevUtils.AnonBannerPlugin
import typings.webpack.mod.Compiler_
import typings.webpack.mod.Compiler_.Watching
import typings.webpack.mod.Configuration
import typings.webpack.mod.ConfigurationFactory
import typings.webpack.mod.MultiCompiler
import typings.webpack.mod.MultiCompiler.Handler
import typings.webpack.mod.MultiConfigurationFactory
import typings.webpack.mod.MultiWatching
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCompilerOptions extends js.Object {
  /**
    * The name that will be printed to the terminal.
    */
  var appName: String = js.native
  /**
    * The webpack configuration options to be provided to the webpack constructor.
    */
  var config: Configuration = js.native
  /**
    * To provide the `urls` argument, use `prepareUrls()` described below.
    */
  var urls: Urls = js.native
  /**
    * If `true`; yarn instructions will be emitted in the terminal instead of npm.
    */
  var useYarn: js.UndefOr[Boolean] = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  @JSName("webpack")
  var webpack_Original: AnonBannerPlugin = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  def webpack(): Compiler_ = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  def webpack(
    options: ConfigurationFactory | MultiConfigurationFactory,
    handler: Handler | typings.webpack.mod.Compiler_.Handler
  ): MultiWatching | MultiCompiler = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  def webpack(options: js.Array[Configuration]): MultiCompiler = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  def webpack(options: js.Array[Configuration], handler: Handler): MultiWatching | MultiCompiler = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  def webpack(options: Configuration): Compiler_ = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  def webpack(options: Configuration, handler: typings.webpack.mod.Compiler_.Handler): Watching | Compiler_ = js.native
}

