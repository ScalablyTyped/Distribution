package typings
package sshpkLib.sshpkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", JSImport.Namespace)
@js.native
class ^ () extends SshPK

@JSImport("sshpk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addRSAMissing(key: PrivateKey): scala.Unit = js.native
  def assertCompatible(obj: js.Any, klass: js.Any, needVer: java.lang.String, name: java.lang.String): scala.Unit = js.native
  def bufferSplit(buf: nodeLib.Buffer, chr: java.lang.String): js.Array[nodeLib.Buffer] = js.native
  def calculateDSAPublic(g: nodeLib.Buffer, p: nodeLib.Buffer, x: nodeLib.Buffer): nodeLib.Buffer = js.native
  def countZeros(buf: nodeLib.Buffer): scala.Double = js.native
  def createCertificate(subjectOrSubjects: java.lang.String, key: Key, issuer: java.lang.String, issuerKey: PrivateKey): Certificate = js.native
  def createCertificate(
    subjectOrSubjects: java.lang.String,
    key: Key,
    issuer: java.lang.String,
    issuerKey: PrivateKey,
    options: js.Any
  ): Certificate = js.native
  def createSelfSignedCertificate(subjectOrSubjects: java.lang.String, key: Key): Certificate = js.native
  def createSelfSignedCertificate(subjectOrSubjects: java.lang.String, key: Key, options: js.Any): Certificate = js.native
  def ecNormalize(buf: nodeLib.Buffer, addZero: scala.Boolean): nodeLib.Buffer = js.native
  def identityForEmail(email: java.lang.String): Identity = js.native
  def identityForHost(hostname: java.lang.String): Identity = js.native
  def identityForUser(uid: java.lang.String): Identity = js.native
  def identityFromDN(dn: java.lang.String): Identity = js.native
  def isCompatible(obj: js.Any, klass: js.Any, needVer: java.lang.String): scala.Boolean = js.native
  def mpNormalize(buf: nodeLib.Buffer): nodeLib.Buffer = js.native
  def opensshCipherInfo(cipber: java.lang.String): OpensshCipherInfo = js.native
  def opensslKeyDeriv(
    cipher: java.lang.String,
    salt: java.lang.String,
    passphrase: java.lang.String,
    count: scala.Double
  ): OpenSllKeyDeriv = js.native
  def parseCertificate(data: java.lang.String, format: java.lang.String): Certificate = js.native
  def parseCertificate(data: java.lang.String, format: java.lang.String, options: js.Any): Certificate = js.native
  def parseCertificate(data: nodeLib.Buffer, format: java.lang.String): Certificate = js.native
  def parseCertificate(data: nodeLib.Buffer, format: java.lang.String, options: js.Any): Certificate = js.native
  def parseFingerprint(fp: java.lang.String): Fingerprint = js.native
  def parseFingerprint(fp: java.lang.String, options: js.Any): Fingerprint = js.native
  def parseKey(data: java.lang.String, format: java.lang.String): Key = js.native
  def parseKey(data: java.lang.String, format: java.lang.String, options: js.Any): Key = js.native
  def parseKey(data: nodeLib.Buffer, format: java.lang.String): Key = js.native
  def parseKey(data: nodeLib.Buffer, format: java.lang.String, options: js.Any): Key = js.native
  def parsePrivateKey(data: java.lang.String, format: java.lang.String): PrivateKey = js.native
  def parsePrivateKey(data: java.lang.String, format: java.lang.String, options: js.Any): PrivateKey = js.native
  def parsePrivateKey(data: nodeLib.Buffer, format: java.lang.String): PrivateKey = js.native
  def parsePrivateKey(data: nodeLib.Buffer, format: java.lang.String, options: js.Any): PrivateKey = js.native
  def parseSignature(data: java.lang.String, `type`: java.lang.String, format: java.lang.String): Signature = js.native
  def parseSignature(data: nodeLib.Buffer, `type`: java.lang.String, format: java.lang.String): Signature = js.native
}

