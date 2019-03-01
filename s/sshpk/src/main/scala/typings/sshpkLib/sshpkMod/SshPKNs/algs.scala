package typings
package sshpkLib.sshpkMod.SshPKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait algs extends js.Object {
  var curves: curves
  var hashAlgs: hashAlgs
  var info: algInfo
  var privInfo: algPrivInfo
}

object algs {
  @scala.inline
  def apply(curves: curves, hashAlgs: hashAlgs, info: algInfo, privInfo: algPrivInfo): algs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("curves")(curves)
    __obj.updateDynamic("hashAlgs")(hashAlgs)
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("privInfo")(privInfo)
    __obj.asInstanceOf[algs]
  }
}

