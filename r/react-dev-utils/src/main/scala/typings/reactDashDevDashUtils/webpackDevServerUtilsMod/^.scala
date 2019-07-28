package typings.reactDashDevDashUtils.webpackDevServerUtilsMod

import typings.webpack.webpackMod.Compiler
import typings.webpackDashDevDashServer.webpackDashDevDashServerMod.ProxyConfigArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dev-utils/WebpackDevServerUtils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def choosePort(host: String, defaultPort: Double): js.Promise[Double | Null] = js.native
  def createCompiler(opts: CreateCompilerOptions): Compiler = js.native
  def createCompiler(opts: CreateCompilerOptionsTypescript): Compiler = js.native
  def prepareProxy(proxySetting: js.UndefOr[scala.Nothing], appPublicFolder: String): ProxyConfigArray = js.native
  def prepareProxy(proxySetting: String, appPublicFolder: String): ProxyConfigArray = js.native
  def prepareUrls(protocol: String, host: String, port: Double): Urls = js.native
}

