package typings.sshpk.sshpkMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "Identity")
@js.native
class Identity protected () extends js.Object {
  def this(opts: js.Any) = this()
  var cn: String = js.native
  var componentLookup: js.Any = js.native
  var components: js.Array[String] = js.native
  var email: String = js.native
  var hostname: String = js.native
  var `type`: String = js.native
  var uid: String = js.native
  def equals(other: Identity): Boolean = js.native
  def toAsn1(der: String, tag: String): Unit = js.native
  def toAsn1(der: Buffer, tag: String): Unit = js.native
}

/* static members */
@JSImport("sshpk", "Identity")
@js.native
object Identity extends js.Object {
  def forEmail(email: String): Identity = js.native
  def forHost(hostname: String): Identity = js.native
  def forUser(uid: String): Identity = js.native
  def isIdentity(dn: String, ver: String): Boolean = js.native
  def isIdentity(dn: Buffer, ver: String): Boolean = js.native
  def parseAsn1(dn: String, top: String): Identity = js.native
  def parseAsn1(dn: Buffer, top: String): Identity = js.native
  def parseDN(dn: String): Identity = js.native
}

