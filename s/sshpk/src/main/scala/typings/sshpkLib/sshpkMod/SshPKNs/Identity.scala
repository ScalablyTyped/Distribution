package typings
package sshpkLib.sshpkMod.SshPKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Identity extends js.Object {
  var cn: java.lang.String = js.native
  var componentLookup: js.Any = js.native
  var components: js.Array[java.lang.String] = js.native
  var email: java.lang.String = js.native
  var hostname: java.lang.String = js.native
  var `type`: java.lang.String = js.native
  var uid: java.lang.String = js.native
  def equals(other: Identity): scala.Boolean = js.native
  def toAsn1(der: java.lang.String, tag: java.lang.String): scala.Unit = js.native
  def toAsn1(der: nodeLib.Buffer, tag: java.lang.String): scala.Unit = js.native
}

