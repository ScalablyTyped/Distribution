package typings.sshpk.sshpkMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "ECPrivate")
@js.native
class ECPrivate protected () extends js.Object {
  def this(params: X9ECParameters, buffer: Buffer) = this()
  def deriveSharedSecret(pk: Key): Buffer = js.native
}

