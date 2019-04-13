package typings
package sshpkLib.sshpkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "Signer")
@js.native
class Signer protected () extends js.Object {
  def this(key: Key, hashAlgo: java.lang.String) = this()
  def sign(): Signature = js.native
  def update(chunk: java.lang.String): scala.Unit = js.native
  def update(chunk: nodeLib.Buffer): scala.Unit = js.native
}

