package typings.snykGradlePlugin.mod

import typings.snykCliInterface.pluginMod.MultiProjectResult
import typings.snykCliInterface.pluginMod.MultiSubprojectInspectOptions
import typings.snykCliInterface.pluginMod.SinglePackageResult
import typings.snykCliInterface.pluginMod.SingleSubprojectInspectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-gradle-plugin/dist", "inspect")
@js.native
object inspect extends js.Object {
  def apply(root: String, targetFile: String): js.Promise[SinglePackageResult] = js.native
  def apply(root: String, targetFile: String, options: MultiSubprojectInspectOptions with GradleInspectOptions): js.Promise[MultiProjectResult] = js.native
  def apply(
    root: String,
    targetFile: String,
    options: SingleSubprojectInspectOptions with GradleInspectOptions
  ): js.Promise[SinglePackageResult] = js.native
}

