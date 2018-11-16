package typings
package sshpkLib.sshpkMod.SshPKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Signer extends js.Object {
  def sign(): Signature = js.native
  def update(chunk: java.lang.String): scala.Unit = js.native
  def update(chunk: nodeLib.Buffer): scala.Unit = js.native
}

