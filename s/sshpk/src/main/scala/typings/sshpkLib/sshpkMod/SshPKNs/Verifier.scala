package typings
package sshpkLib.sshpkMod.SshPKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Verifier extends js.Object {
  def update(chunk: java.lang.String): scala.Unit = js.native
  def update(chunk: nodeLib.Buffer): scala.Unit = js.native
  def verify(signature: java.lang.String): scala.Boolean = js.native
}

