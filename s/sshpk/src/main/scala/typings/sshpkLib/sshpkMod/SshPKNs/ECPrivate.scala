package typings
package sshpkLib.sshpkMod.SshPKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECPrivate extends js.Object {
  def deriveSharedSecret(pk: Key): nodeLib.Buffer
}

object ECPrivate {
  @scala.inline
  def apply(deriveSharedSecret: js.Function1[Key, nodeLib.Buffer]): ECPrivate = {
    val __obj = js.Dynamic.literal(deriveSharedSecret = deriveSharedSecret)
  
    __obj.asInstanceOf[ECPrivate]
  }
}

