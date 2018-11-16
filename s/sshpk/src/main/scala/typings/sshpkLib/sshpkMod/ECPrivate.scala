package typings
package sshpkLib.sshpkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "ECPrivate")
@js.native
class ECPrivate protected ()
  extends sshpkLib.sshpkMod.SshPKNs.ECPrivate {
  def this(params: sshpkLib.sshpkMod.SshPKNs.X9ECParameters, buffer: nodeLib.Buffer) = this()
  /* CompleteClass */
  override def deriveSharedSecret(pk: sshpkLib.sshpkMod.SshPKNs.Key): nodeLib.Buffer = js.native
}

