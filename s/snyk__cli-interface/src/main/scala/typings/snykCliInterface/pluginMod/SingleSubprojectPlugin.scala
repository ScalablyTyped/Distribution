package typings.snykCliInterface.pluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleSubprojectPlugin extends js.Object {
  var pluginName: js.UndefOr[js.Function0[String]] = js.native
  def inspect(root: String): js.Promise[SinglePackageResult] = js.native
  def inspect(root: String, targetFile: String): js.Promise[SinglePackageResult] = js.native
  def inspect(root: String, targetFile: String, options: SingleSubprojectInspectOptions): js.Promise[SinglePackageResult] = js.native
}

