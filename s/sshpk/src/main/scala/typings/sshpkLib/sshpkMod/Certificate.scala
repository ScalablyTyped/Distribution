package typings
package sshpkLib.sshpkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "Certificate")
@js.native
class Certificate protected () extends js.Object {
  def this(opts: js.Any) = this()
  var issuer: java.lang.String = js.native
  var issuerKey: java.lang.String = js.native
  var serial: java.lang.String = js.native
  var signatures: java.lang.String = js.native
  var subjectKey: java.lang.String = js.native
  var subjects: js.Array[Identity] = js.native
  var validFrom: java.lang.String = js.native
  var validUntil: java.lang.String = js.native
  def fingerprint(algo: java.lang.String): Fingerprint = js.native
  def hash(algo: java.lang.String): java.lang.String = js.native
  def isExpired(when: stdLib.Date): scala.Boolean = js.native
  def isSignedBy(issuerCert: Certificate): scala.Boolean = js.native
  def isSignedByKey(issuerKey: Key): scala.Boolean = js.native
  def signWith(key: Key): scala.Unit = js.native
  def toBuffer(format: java.lang.String): nodeLib.Buffer = js.native
  def toBuffer(format: java.lang.String, options: js.Any): nodeLib.Buffer = js.native
  def toString(format: java.lang.String): java.lang.String = js.native
  def toString(format: java.lang.String, options: js.Any): java.lang.String = js.native
}

/* static members */
@JSImport("sshpk", "Certificate")
@js.native
object Certificate extends js.Object {
  var formats: sshpkLib.sshpkMod.Formats = js.native
  def create(
    subjectOrSubjects: java.lang.String,
    key: sshpkLib.sshpkMod.Key,
    issuer: java.lang.String,
    issuerKey: sshpkLib.sshpkMod.PrivateKey,
    options: js.Any
  ): sshpkLib.sshpkMod.Certificate = js.native
  def createSelfSigned(subjectOrSubjects: java.lang.String, key: sshpkLib.sshpkMod.Key, options: js.Any): sshpkLib.sshpkMod.Certificate = js.native
  def isCertificate(data: java.lang.String, ver: java.lang.String): scala.Boolean = js.native
  def isCertificate(data: nodeLib.Buffer, ver: java.lang.String): scala.Boolean = js.native
  def parse(data: java.lang.String, format: java.lang.String, options: js.Any): sshpkLib.sshpkMod.Certificate = js.native
  def parse(data: nodeLib.Buffer, format: java.lang.String, options: js.Any): sshpkLib.sshpkMod.Certificate = js.native
}

