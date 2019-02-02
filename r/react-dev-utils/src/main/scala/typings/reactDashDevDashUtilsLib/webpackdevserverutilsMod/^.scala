package typings
package reactDashDevDashUtilsLib.webpackdevserverutilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dev-utils/WebpackDevServerUtils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def choosePort(host: java.lang.String, defaultPort: scala.Double): js.Promise[scala.Double | scala.Null] = js.native
  def createCompiler(
    _webpack: reactDashDevDashUtilsLib.Anon_BannerPluginCompilation,
    config: webpackLib.webpackMod.webpackNs.Configuration,
    appName: java.lang.String,
    urls: reactDashDevDashUtilsLib.webpackdevserverutilsMod.Urls,
    useYarn: scala.Boolean
  ): webpackLib.webpackMod.Compiler = js.native
  def prepareProxy(proxySetting: js.Any, appPublicFolder: java.lang.String): webpackDashDevDashServerLib.webpackDashDevDashServerMod.WebpackDevServerNs.Configuration = js.native
  def prepareUrls(protocol: java.lang.String, host: java.lang.String, port: scala.Double): reactDashDevDashUtilsLib.webpackdevserverutilsMod.Urls = js.native
}

