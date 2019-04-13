package typings
package sshpkLib.sshpkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "Identity")
@js.native
class Identity protected () extends js.Object {
  def this(opts: js.Any) = this()
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

/* static members */
@JSImport("sshpk", "Identity")
@js.native
object Identity extends js.Object {
  def forEmail(email: java.lang.String): sshpkLib.sshpkMod.Identity = js.native
  def forHost(hostname: java.lang.String): sshpkLib.sshpkMod.Identity = js.native
  def forUser(uid: java.lang.String): sshpkLib.sshpkMod.Identity = js.native
  def isIdentity(dn: java.lang.String, ver: java.lang.String): scala.Boolean = js.native
  def isIdentity(dn: nodeLib.Buffer, ver: java.lang.String): scala.Boolean = js.native
  def parseAsn1(dn: java.lang.String, top: java.lang.String): sshpkLib.sshpkMod.Identity = js.native
  def parseAsn1(dn: nodeLib.Buffer, top: java.lang.String): sshpkLib.sshpkMod.Identity = js.native
  def parseDN(dn: java.lang.String): sshpkLib.sshpkMod.Identity = js.native
}

