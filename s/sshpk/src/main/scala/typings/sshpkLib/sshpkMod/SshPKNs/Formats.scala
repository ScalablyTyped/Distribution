package typings
package sshpkLib.sshpkMod.SshPKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formats extends js.Object {
  var auto: Format
  var openssh: Format
  var pem: Format
  var pkcs1: Format
  var pkcs8: Format
  var rfc4253: Format
  var ssh: Format
  var `ssh-private`: Format
}

object Formats {
  @scala.inline
  def apply(
    auto: Format,
    openssh: Format,
    pem: Format,
    pkcs1: Format,
    pkcs8: Format,
    rfc4253: Format,
    ssh: Format,
    `ssh-private`: Format
  ): Formats = {
    val __obj = js.Dynamic.literal(`ssh-private` = `ssh-private`)
    __obj.updateDynamic("auto")(auto)
    __obj.updateDynamic("openssh")(openssh)
    __obj.updateDynamic("pem")(pem)
    __obj.updateDynamic("pkcs1")(pkcs1)
    __obj.updateDynamic("pkcs8")(pkcs8)
    __obj.updateDynamic("rfc4253")(rfc4253)
    __obj.updateDynamic("ssh")(ssh)
    __obj.asInstanceOf[Formats]
  }
}

