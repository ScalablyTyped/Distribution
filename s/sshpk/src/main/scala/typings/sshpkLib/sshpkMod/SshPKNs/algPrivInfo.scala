package typings
package sshpkLib.sshpkMod.SshPKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait algPrivInfo extends js.Object {
  var curve25519: Algo
  var dsa: Algo
  var ecdsa: Algo
  var ed25519: Algo
  var rsa: Algo
}

object algPrivInfo {
  @scala.inline
  def apply(curve25519: Algo, dsa: Algo, ecdsa: Algo, ed25519: Algo, rsa: Algo): algPrivInfo = {
    val __obj = js.Dynamic.literal(curve25519 = curve25519, dsa = dsa, ecdsa = ecdsa, ed25519 = ed25519, rsa = rsa)
  
    __obj.asInstanceOf[algPrivInfo]
  }
}

