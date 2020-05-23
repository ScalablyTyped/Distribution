package typings.snykGradlePlugin

import typings.snykGradlePlugin.anon.Cwd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-gradle-plugin/dist/sub-process", JSImport.Namespace)
@js.native
object subProcessMod extends js.Object {
  def execute(command: String, args: js.Array[String], options: Cwd): js.Promise[String] = js.native
  def execute(
    command: String,
    args: js.Array[String],
    options: Cwd,
    perLineCallback: js.Function1[/* s */ String, js.Promise[Unit]]
  ): js.Promise[String] = js.native
}

