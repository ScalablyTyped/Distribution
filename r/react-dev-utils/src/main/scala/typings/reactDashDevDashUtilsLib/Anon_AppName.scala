package typings
package reactDashDevDashUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AppName extends js.Object {
  var appName: java.lang.String = js.native
  var config: webpackLib.webpackMod.Configuration = js.native
  var urls: reactDashDevDashUtilsLib.webpackDevServerUtilsMod.Urls = js.native
  var useYarn: scala.Boolean = js.native
  @JSName("webpack")
  var webpack_Original: Anon_BannerPlugin = js.native
  def webpack(): webpackLib.webpackMod.Compiler = js.native
  def webpack(options: js.Array[webpackLib.webpackMod.Configuration]): webpackLib.webpackMod.MultiCompiler = js.native
  def webpack(
    options: js.Array[webpackLib.webpackMod.Configuration],
    handler: webpackLib.webpackMod.MultiCompilerNs.Handler
  ): webpackLib.webpackMod.MultiWatching | webpackLib.webpackMod.MultiCompiler = js.native
  def webpack(options: webpackLib.webpackMod.Configuration): webpackLib.webpackMod.Compiler = js.native
  def webpack(options: webpackLib.webpackMod.Configuration, handler: webpackLib.webpackMod.CompilerNs.Handler): webpackLib.webpackMod.CompilerNs.Watching | webpackLib.webpackMod.Compiler = js.native
}

