package typings.sshpk.sshpkMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "parseKey")
@js.native
object parseKey extends js.Object {
  def apply(data: String, format: String): Key = js.native
  def apply(data: String, format: String, options: js.Any): Key = js.native
  def apply(data: Buffer, format: String): Key = js.native
  def apply(data: Buffer, format: String, options: js.Any): Key = js.native
}

