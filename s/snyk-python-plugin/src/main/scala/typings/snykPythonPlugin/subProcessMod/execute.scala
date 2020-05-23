package typings.snykPythonPlugin.subProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-python-plugin/dist/dependencies/sub-process", "execute")
@js.native
object execute extends js.Object {
  def apply(command: String, args: js.Array[String]): js.Promise[String] = js.native
  def apply(command: String, args: js.Array[String], options: ProcessOptions): js.Promise[String] = js.native
}

