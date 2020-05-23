package typings.snykDockerPlugin.subProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/sub-process", "execute")
@js.native
object execute extends js.Object {
  def apply(command: String): js.Promise[CmdOutput] = js.native
  def apply(command: String, args: js.Array[String]): js.Promise[CmdOutput] = js.native
  def apply(command: String, args: js.Array[String], options: js.Any): js.Promise[CmdOutput] = js.native
}

