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

object PrivateKey {
  @scala.inline
  def apply(
    createSign: java.lang.String => Signer,
    createVerify: java.lang.String => Key,
    derive: (java.lang.String, scala.Double) => PrivateKey,
    hash: java.lang.String => nodeLib.Buffer,
    toBuffer: (java.lang.String, js.Any) => nodeLib.Buffer,
    toPublic: () => Key
  ): PrivateKey = {
    val __obj = js.Dynamic.literal(createSign = js.Any.fromFunction1(createSign), createVerify = js.Any.fromFunction1(createVerify), derive = js.Any.fromFunction2(derive), hash = js.Any.fromFunction1(hash), toBuffer = js.Any.fromFunction2(toBuffer), toPublic = js.Any.fromFunction0(toPublic))
  
    __obj.asInstanceOf[PrivateKey]
  }
}

