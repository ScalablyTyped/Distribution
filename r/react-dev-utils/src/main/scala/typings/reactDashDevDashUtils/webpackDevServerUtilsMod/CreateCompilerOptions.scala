package typings.reactDashDevDashUtils.webpackDevServerUtilsMod

import typings.reactDashDevDashUtils.Anon_BannerPlugin
import typings.webpack.webpackMod.Compiler
import typings.webpack.webpackMod.Compiler.Watching
import typings.webpack.webpackMod.Configuration
import typings.webpack.webpackMod.ConfigurationFactory
import typings.webpack.webpackMod.MultiCompiler
import typings.webpack.webpackMod.MultiCompiler.Handler
import typings.webpack.webpackMod.MultiConfigurationFactory
import typings.webpack.webpackMod.MultiWatching
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
  var webpack_Original: Anon_BannerPlugin = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  def webpack(): Compiler = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  def webpack(
    options: ConfigurationFactory | MultiConfigurationFactory,
    handler: Handler | typings.webpack.webpackMod.Compiler.Handler
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
  def webpack(options: Configuration): Compiler = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  def webpack(options: Configuration, handler: typings.webpack.webpackMod.Compiler.Handler): Watching | Compiler = js.native
}

