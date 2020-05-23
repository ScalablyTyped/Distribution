package typings.snykPythonPlugin.dependenciesMod

import typings.snykCliInterface.pluginMod.SinglePackageResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-python-plugin/dist/dependencies", "getDependencies")
@js.native
object getDependencies extends js.Object {
  def apply(root: String, targetFile: String): js.Promise[SinglePackageResult] = js.native
  def apply(root: String, targetFile: String, options: Options): js.Promise[SinglePackageResult] = js.native
}

