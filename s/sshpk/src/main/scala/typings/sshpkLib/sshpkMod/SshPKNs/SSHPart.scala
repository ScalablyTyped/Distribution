package typings
package sshpkLib.sshpkMod.SshPKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSHPart extends js.Object {
  var data: nodeLib.Buffer
}

object SSHPart {
  @scala.inline
  def apply(data: nodeLib.Buffer): SSHPart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[SSHPart]
  }
}

