package typings.sshpk.sshpkMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "Format")
@js.native
class Format () extends js.Object {
  def read(buf: Buffer): Buffer = js.native
  def read(buf: Buffer, options: js.Any): Buffer = js.native
  def write(key: Key): Buffer = js.native
  def write(key: Key, options: js.Any): Buffer = js.native
}

