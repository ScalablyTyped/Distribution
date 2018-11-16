package typings
package sshpkLib.sshpkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "PrivateKey")
@js.native
class PrivateKey protected ()
  extends sshpkLib.sshpkMod.SshPKNs.PrivateKey {
  def this(opts: js.Any) = this()
  /* CompleteClass */
  override def createSign(hashAlgo: java.lang.String): sshpkLib.sshpkMod.SshPKNs.Signer = js.native
  /* CompleteClass */
  override def createVerify(hashAlgo: java.lang.String): sshpkLib.sshpkMod.SshPKNs.Key = js.native
  /* CompleteClass */
  override def derive(newType: java.lang.String, newSize: scala.Double): sshpkLib.sshpkMod.SshPKNs.PrivateKey = js.native
  /* CompleteClass */
  override def hash(algo: java.lang.String): nodeLib.Buffer = js.native
  /* CompleteClass */
  override def toBuffer(format: java.lang.String, options: js.Any): nodeLib.Buffer = js.native
  /* CompleteClass */
  override def toPublic(): sshpkLib.sshpkMod.SshPKNs.Key = js.native
}

@JSImport("sshpk", "PrivateKey")
@js.native
object PrivateKey extends js.Object {
  var formats: sshpkLib.sshpkMod.SshPKNs.Formats = js.native
  def isPrivateKey(data: java.lang.String, ver: java.lang.String): scala.Boolean = js.native
  def isPrivateKey(data: nodeLib.Buffer, ver: java.lang.String): scala.Boolean = js.native
  def parse(data: java.lang.String, format: java.lang.String, options: js.Any): sshpkLib.sshpkMod.SshPKNs.PrivateKey = js.native
  def parse(data: nodeLib.Buffer, format: java.lang.String, options: js.Any): sshpkLib.sshpkMod.SshPKNs.PrivateKey = js.native
}

