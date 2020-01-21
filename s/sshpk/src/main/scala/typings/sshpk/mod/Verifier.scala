package typings.sshpk.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "Verifier")
@js.native
class Verifier protected () extends js.Object {
  def this(key: Key, hashAlgo: String) = this()
  def update(chunk: String): Unit = js.native
  def update(chunk: Buffer): Unit = js.native
  def verify(signature: String): Boolean = js.native
}

