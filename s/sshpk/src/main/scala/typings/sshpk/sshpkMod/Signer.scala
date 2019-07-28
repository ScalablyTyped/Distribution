package typings.sshpk.sshpkMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "Signer")
@js.native
class Signer protected () extends js.Object {
  def this(key: Key, hashAlgo: String) = this()
  def sign(): Signature = js.native
  def update(chunk: String): Unit = js.native
  def update(chunk: Buffer): Unit = js.native
}

