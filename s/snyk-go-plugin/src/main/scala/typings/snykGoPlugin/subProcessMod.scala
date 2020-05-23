package typings.snykGoPlugin

import typings.snykGoPlugin.anon.Cwd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-go-plugin/dist/sub-process", JSImport.Namespace)
@js.native
object subProcessMod extends js.Object {
  def execute(command: String, args: js.Array[String]): js.Promise[String] = js.native
  def execute(command: String, args: js.Array[String], options: Cwd): js.Promise[String] = js.native
}

