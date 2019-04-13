package typings
package sshpkLib.sshpkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "Verifier")
@js.native
class Verifier protected () extends js.Object {
  def this(key: Key, hashAlgo: java.lang.String) = this()
  def update(chunk: java.lang.String): scala.Unit = js.native
  def update(chunk: nodeLib.Buffer): scala.Unit = js.native
  def verify(signature: java.lang.String): scala.Boolean = js.native
}

