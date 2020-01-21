package typings.prettier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prettier", "resolveConfigFile")
@js.native
object resolveConfigFile extends js.Object {
  def apply(): js.Promise[Null | String] = js.native
  def apply(filePath: String): js.Promise[Null | String] = js.native
  def sync(): Null | String = js.native
  def sync(filePath: String): Null | String = js.native
}

