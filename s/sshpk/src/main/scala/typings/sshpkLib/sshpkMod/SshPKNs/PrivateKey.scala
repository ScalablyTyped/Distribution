package typings
package sshpkLib.sshpkMod.SshPKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PrivateKey extends js.Object {
  def createSign(hashAlgo: java.lang.String): Signer
  def createVerify(hashAlgo: java.lang.String): Key
  def derive(newType: java.lang.String, newSize: scala.Double): PrivateKey
  def hash(algo: java.lang.String): nodeLib.Buffer
  def toBuffer(format: java.lang.String, options: js.Any): nodeLib.Buffer
  def toPublic(): Key
}

