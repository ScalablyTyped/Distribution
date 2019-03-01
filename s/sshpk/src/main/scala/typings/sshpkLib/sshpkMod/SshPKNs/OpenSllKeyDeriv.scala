package typings
package sshpkLib.sshpkMod.SshPKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenSllKeyDeriv extends js.Object {
  var iv: nodeLib.Buffer
  var key: nodeLib.Buffer
}

object OpenSllKeyDeriv {
  @scala.inline
  def apply(iv: nodeLib.Buffer, key: nodeLib.Buffer): OpenSllKeyDeriv = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("iv")(iv)
    __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[OpenSllKeyDeriv]
  }
}

