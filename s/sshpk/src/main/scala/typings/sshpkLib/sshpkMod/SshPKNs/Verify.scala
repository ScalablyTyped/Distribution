package typings
package sshpkLib.sshpkMod.SshPKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Verify extends js.Object {
  def verify(data: java.lang.String, fmt: java.lang.String): scala.Boolean
}

object Verify {
  @scala.inline
  def apply(verify: js.Function2[java.lang.String, java.lang.String, scala.Boolean]): Verify = {
    val __obj = js.Dynamic.literal(verify = verify)
  
    __obj.asInstanceOf[Verify]
  }
}

