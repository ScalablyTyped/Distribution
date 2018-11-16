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

