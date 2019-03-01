package typings
package sshpkLib.sshpkMod.SshPKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hashAlgs extends js.Object {
  var md5: scala.Boolean
  var sha1: scala.Boolean
  var sha256: scala.Boolean
  var sha384: scala.Boolean
  var sha512: scala.Boolean
}

object hashAlgs {
  @scala.inline
  def apply(
    md5: scala.Boolean,
    sha1: scala.Boolean,
    sha256: scala.Boolean,
    sha384: scala.Boolean,
    sha512: scala.Boolean
  ): hashAlgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("md5")(md5)
    __obj.updateDynamic("sha1")(sha1)
    __obj.updateDynamic("sha256")(sha256)
    __obj.updateDynamic("sha384")(sha384)
    __obj.updateDynamic("sha512")(sha512)
    __obj.asInstanceOf[hashAlgs]
  }
}

