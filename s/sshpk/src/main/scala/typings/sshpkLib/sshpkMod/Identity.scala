package typings
package sshpkLib.sshpkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "Identity")
@js.native
class Identity protected ()
  extends sshpkLib.sshpkMod.SshPKNs.Identity {
  def this(opts: js.Any) = this()
}

@JSImport("sshpk", "Identity")
@js.native
object Identity extends js.Object {
  def forEmail(email: java.lang.String): sshpkLib.sshpkMod.SshPKNs.Identity = js.native
  def forHost(hostname: java.lang.String): sshpkLib.sshpkMod.SshPKNs.Identity = js.native
  def forUser(uid: java.lang.String): sshpkLib.sshpkMod.SshPKNs.Identity = js.native
  def isIdentity(dn: java.lang.String, ver: java.lang.String): scala.Boolean = js.native
  def isIdentity(dn: nodeLib.Buffer, ver: java.lang.String): scala.Boolean = js.native
  def parseAsn1(dn: java.lang.String, top: java.lang.String): sshpkLib.sshpkMod.SshPKNs.Identity = js.native
  def parseAsn1(dn: nodeLib.Buffer, top: java.lang.String): sshpkLib.sshpkMod.SshPKNs.Identity = js.native
  def parseDN(dn: java.lang.String): sshpkLib.sshpkMod.SshPKNs.Identity = js.native
}

