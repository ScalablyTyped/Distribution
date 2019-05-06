package typings
package reactDashDevDashUtilsLib.webpackDevServerUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dev-utils/WebpackDevServerUtils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def choosePort(host: java.lang.String, defaultPort: scala.Double): js.Promise[scala.Double | scala.Null] = js.native
  def createCompiler(opts: reactDashDevDashUtilsLib.Anon_AppName): webpackLib.webpackMod.Compiler = js.native
  def prepareProxy(proxySetting: js.Any, appPublicFolder: java.lang.String): webpackDashDevDashServerLib.webpackDashDevDashServerMod.ProxyConfigArray = js.native
  def prepareUrls(protocol: java.lang.String, host: java.lang.String, port: scala.Double): Urls = js.native
}

