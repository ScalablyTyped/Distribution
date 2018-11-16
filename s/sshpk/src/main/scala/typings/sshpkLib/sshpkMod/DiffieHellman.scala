package typings
package sshpkLib.sshpkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "DiffieHellman")
@js.native
class DiffieHellman protected ()
  extends sshpkLib.sshpkMod.SshPKNs.DiffieHellman {
  def this(key: sshpkLib.sshpkMod.SshPKNs.Key) = this()
  /* CompleteClass */
  override def computeSecret(otherpk: sshpkLib.sshpkMod.SshPKNs.PrivateKey): nodeLib.Buffer = js.native
  /* CompleteClass */
  override def generateKey(): sshpkLib.sshpkMod.SshPKNs.PrivateKey = js.native
  /* CompleteClass */
  override def generateKeys(): sshpkLib.sshpkMod.SshPKNs.PrivateKey = js.native
  /* CompleteClass */
  override def getKey(): sshpkLib.sshpkMod.SshPKNs.PrivateKey = js.native
  /* CompleteClass */
  override def getPrivateKey(): sshpkLib.sshpkMod.SshPKNs.PrivateKey = js.native
  /* CompleteClass */
  override def getPublicKey(): sshpkLib.sshpkMod.SshPKNs.Key = js.native
  /* CompleteClass */
  override def setKey(key: sshpkLib.sshpkMod.SshPKNs.PrivateKey): scala.Unit = js.native
  /* CompleteClass */
  override def setPrivateKey(key: sshpkLib.sshpkMod.SshPKNs.PrivateKey): scala.Unit = js.native
}

