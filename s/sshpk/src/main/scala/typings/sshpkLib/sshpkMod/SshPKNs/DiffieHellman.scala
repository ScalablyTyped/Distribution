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
    computeSecret: js.Function1[PrivateKey, nodeLib.Buffer],
    generateKey: js.Function0[PrivateKey],
    generateKeys: js.Function0[PrivateKey],
    getKey: js.Function0[PrivateKey],
    getPrivateKey: js.Function0[PrivateKey],
    getPublicKey: js.Function0[Key],
    setKey: js.Function1[PrivateKey, scala.Unit],
    setPrivateKey: js.Function1[PrivateKey, scala.Unit]
  ): DiffieHellman = {
    val __obj = js.Dynamic.literal(computeSecret = computeSecret, generateKey = generateKey, generateKeys = generateKeys, getKey = getKey, getPrivateKey = getPrivateKey, getPublicKey = getPublicKey, setKey = setKey, setPrivateKey = setPrivateKey)
  
    __obj.asInstanceOf[DiffieHellman]
  }
}

