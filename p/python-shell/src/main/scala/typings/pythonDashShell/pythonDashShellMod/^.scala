package typings.pythonDashShell.pythonDashShellMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("python-shell", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def run(
    scriptName: String,
    RunOptions: RunOptions,
    callback: js.Function2[/* err */ Error, /* results */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  def run(
    scriptName: String,
    callback: js.Function2[/* err */ Error, /* results */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
}

