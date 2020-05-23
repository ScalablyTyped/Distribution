package typings.snykCliInterface.pluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin extends SingleSubprojectPlugin {
  def inspect(root: String, targetFile: js.UndefOr[String], options: MultiSubprojectInspectOptions): js.Promise[MultiProjectResult] = js.native
  def inspect(root: String, targetFile: String, options: InspectOptions): js.Promise[InspectResult] = js.native
}

