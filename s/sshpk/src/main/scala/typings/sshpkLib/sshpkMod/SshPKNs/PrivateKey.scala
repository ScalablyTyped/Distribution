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
    createSign: js.Function1[java.lang.String, Signer],
    createVerify: js.Function1[java.lang.String, Key],
    derive: js.Function2[java.lang.String, scala.Double, PrivateKey],
    hash: js.Function1[java.lang.String, nodeLib.Buffer],
    toBuffer: js.Function2[java.lang.String, js.Any, nodeLib.Buffer],
    toPublic: js.Function0[Key]
  ): PrivateKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createSign")(createSign)
    __obj.updateDynamic("createVerify")(createVerify)
    __obj.updateDynamic("derive")(derive)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("toBuffer")(toBuffer)
    __obj.updateDynamic("toPublic")(toPublic)
    __obj.asInstanceOf[PrivateKey]
  }
}

