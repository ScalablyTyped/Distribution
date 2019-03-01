package typings
package sshpkLib.sshpkMod.SshPKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait algInfo extends js.Object {
  var curve25519: Algo
  var dsa: Algo
  var ecdsa: Algo
  var ed25519: Algo
  var rsa: Algo
}

object algInfo {
  @scala.inline
  def apply(curve25519: Algo, dsa: Algo, ecdsa: Algo, ed25519: Algo, rsa: Algo): algInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("curve25519")(curve25519)
    __obj.updateDynamic("dsa")(dsa)
    __obj.updateDynamic("ecdsa")(ecdsa)
    __obj.updateDynamic("ed25519")(ed25519)
    __obj.updateDynamic("rsa")(rsa)
    __obj.asInstanceOf[algInfo]
  }
}

