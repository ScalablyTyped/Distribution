package typings
package sshpkLib.sshpkMod.SshPKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffieHellman extends js.Object {
  def computeSecret(otherpk: PrivateKey): nodeLib.Buffer
  def generateKey(): PrivateKey
  def generateKeys(): PrivateKey
  def getKey(): PrivateKey
  def getPrivateKey(): PrivateKey
  def getPublicKey(): Key
  def setKey(key: PrivateKey): scala.Unit
  def setPrivateKey(key: PrivateKey): scala.Unit
}

object DiffieHellman {
  @scala.inline
  def apply(
    computeSecret: PrivateKey => nodeLib.Buffer,
    generateKey: () => PrivateKey,
    generateKeys: () => PrivateKey,
    getKey: () => PrivateKey,
    getPrivateKey: () => PrivateKey,
    getPublicKey: () => Key,
    setKey: PrivateKey => scala.Unit,
    setPrivateKey: PrivateKey => scala.Unit
  ): DiffieHellman = {
    val __obj = js.Dynamic.literal(computeSecret = js.Any.fromFunction1(computeSecret), generateKey = js.Any.fromFunction0(generateKey), generateKeys = js.Any.fromFunction0(generateKeys), getKey = js.Any.fromFunction0(getKey), getPrivateKey = js.Any.fromFunction0(getPrivateKey), getPublicKey = js.Any.fromFunction0(getPublicKey), setKey = js.Any.fromFunction1(setKey), setPrivateKey = js.Any.fromFunction1(setPrivateKey))
  
    __obj.asInstanceOf[DiffieHellman]
  }
}

