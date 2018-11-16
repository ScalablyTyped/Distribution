package typings
package sshpkLib.sshpkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "Certificate")
@js.native
class Certificate protected ()
  extends sshpkLib.sshpkMod.SshPKNs.Certificate {
  def this(opts: js.Any) = this()
}

@JSImport("sshpk", "Certificate")
@js.native
object Certificate extends js.Object {
  var formats: sshpkLib.sshpkMod.SshPKNs.Formats = js.native
  def create(
    subjectOrSubjects: java.lang.String,
    key: sshpkLib.sshpkMod.SshPKNs.Key,
    issuer: java.lang.String,
    issuerKey: sshpkLib.sshpkMod.SshPKNs.PrivateKey,
    options: js.Any
  ): sshpkLib.sshpkMod.SshPKNs.Certificate = js.native
  def createSelfSigned(subjectOrSubjects: java.lang.String, key: sshpkLib.sshpkMod.SshPKNs.Key, options: js.Any): sshpkLib.sshpkMod.SshPKNs.Certificate = js.native
  def isCertificate(data: java.lang.String, ver: java.lang.String): scala.Boolean = js.native
  def isCertificate(data: nodeLib.Buffer, ver: java.lang.String): scala.Boolean = js.native
  def parse(data: java.lang.String, format: java.lang.String, options: js.Any): sshpkLib.sshpkMod.SshPKNs.Certificate = js.native
  def parse(data: nodeLib.Buffer, format: java.lang.String, options: js.Any): sshpkLib.sshpkMod.SshPKNs.Certificate = js.native
}

