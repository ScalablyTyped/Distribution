package typings
package sshpkLib.sshpkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "ECPrivate")
@js.native
class ECPrivate protected () extends js.Object {
  def this(params: X9ECParameters, buffer: nodeLib.Buffer) = this()
  def deriveSharedSecret(pk: Key): nodeLib.Buffer = js.native
}

