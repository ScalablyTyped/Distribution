package typings
package sshpkLib.sshpkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "DiffieHellman")
@js.native
class DiffieHellman protected () extends js.Object {
  def this(key: Key) = this()
  def computeSecret(otherpk: PrivateKey): nodeLib.Buffer = js.native
  def generateKey(): PrivateKey = js.native
  def generateKeys(): PrivateKey = js.native
  def getKey(): PrivateKey = js.native
  def getPrivateKey(): PrivateKey = js.native
  def getPublicKey(): Key = js.native
  def setKey(key: PrivateKey): scala.Unit = js.native
  def setPrivateKey(key: PrivateKey): scala.Unit = js.native
}

