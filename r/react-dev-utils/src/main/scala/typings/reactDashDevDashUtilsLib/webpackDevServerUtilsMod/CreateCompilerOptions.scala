package typings
package reactDashDevDashUtilsLib.webpackDevServerUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCompilerOptions extends js.Object {
  /**
    * The name that will be printed to the terminal.
    */
  var appName: java.lang.String = js.native
  /**
    * The webpack configuration options to be provided to the webpack constructor.
    */
  var config: webpackLib.webpackMod.Configuration = js.native
  /**
    * To provide the `urls` argument, use `prepareUrls()` described below.
    */
  var urls: Urls = js.native
  /**
    * If `true`; yarn instructions will be emitted in the terminal instead of npm.
    */
  var useYarn: js.UndefOr[scala.Boolean] = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  @JSName("webpack")
  var webpack_Original: reactDashDevDashUtilsLib.Anon_BannerPlugin = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  def webpack(): webpackLib.webpackMod.Compiler = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  def webpack(options: js.Array[webpackLib.webpackMod.Configuration]): webpackLib.webpackMod.MultiCompiler = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  def webpack(
    options: js.Array[webpackLib.webpackMod.Configuration],
    handler: webpackLib.webpackMod.MultiCompilerNs.Handler
  ): webpackLib.webpackMod.MultiWatching | webpackLib.webpackMod.MultiCompiler = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  def webpack(options: webpackLib.webpackMod.Configuration): webpackLib.webpackMod.Compiler = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  def webpack(options: webpackLib.webpackMod.Configuration, handler: webpackLib.webpackMod.CompilerNs.Handler): webpackLib.webpackMod.CompilerNs.Watching | webpackLib.webpackMod.Compiler = js.native
}

