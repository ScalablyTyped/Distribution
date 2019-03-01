package typings
package sshpkLib.sshpkMod.SshPKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X9ECParameters extends js.Object {
  var G: js.Any
  var g: js.Any
  var h: js.Any
  var n: js.Any
}

object X9ECParameters {
  @scala.inline
  def apply(G: js.Any, g: js.Any, h: js.Any, n: js.Any): X9ECParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("G")(G)
    __obj.updateDynamic("g")(g)
    __obj.updateDynamic("h")(h)
    __obj.updateDynamic("n")(n)
    __obj.asInstanceOf[X9ECParameters]
  }
}

