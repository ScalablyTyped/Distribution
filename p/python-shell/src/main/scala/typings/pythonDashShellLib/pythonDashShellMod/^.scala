package typings
package pythonDashShellLib.pythonDashShellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("python-shell", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def run(
    scriptName: java.lang.String,
    RunOptions: RunOptions,
    callback: js.Function2[/* err */ stdLib.Error, /* results */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def run(
    scriptName: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* results */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
}

