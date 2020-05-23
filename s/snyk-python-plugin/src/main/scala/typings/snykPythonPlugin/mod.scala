package typings.snykPythonPlugin

import typings.snykCliInterface.pluginMod.SinglePackageResult
import typings.snykPythonPlugin.dependenciesMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-python-plugin/dist", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def inspect(root: String, targetFile: String): js.Promise[SinglePackageResult] = js.native
  def inspect(root: String, targetFile: String, options: Options): js.Promise[SinglePackageResult] = js.native
}

