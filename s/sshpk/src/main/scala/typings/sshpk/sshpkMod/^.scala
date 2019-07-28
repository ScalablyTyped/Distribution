package typings.sshpk.sshpkMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", JSImport.Namespace)
@js.native
class ^ () extends SshPK

@JSImport("sshpk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addRSAMissing(key: PrivateKey): Unit = js.native
  def assertCompatible(obj: js.Any, klass: js.Any, needVer: String, name: String): Unit = js.native
  def bufferSplit(buf: Buffer, chr: String): js.Array[Buffer] = js.native
  def calculateDSAPublic(g: Buffer, p: Buffer, x: Buffer): Buffer = js.native
  def countZeros(buf: Buffer): Double = js.native
  def createCertificate(subjectOrSubjects: String, key: Key, issuer: String, issuerKey: PrivateKey): Certificate = js.native
  def createCertificate(subjectOrSubjects: String, key: Key, issuer: String, issuerKey: PrivateKey, options: js.Any): Certificate = js.native
  def createSelfSignedCertificate(subjectOrSubjects: String, key: Key): Certificate = js.native
  def createSelfSignedCertificate(subjectOrSubjects: String, key: Key, options: js.Any): Certificate = js.native
  def ecNormalize(buf: Buffer, addZero: Boolean): Buffer = js.native
  def identityForEmail(email: String): Identity = js.native
  def identityForHost(hostname: String): Identity = js.native
  def identityForUser(uid: String): Identity = js.native
  def identityFromDN(dn: String): Identity = js.native
  def isCompatible(obj: js.Any, klass: js.Any, needVer: String): Boolean = js.native
  def mpNormalize(buf: Buffer): Buffer = js.native
  def opensshCipherInfo(cipber: String): OpensshCipherInfo = js.native
  def opensslKeyDeriv(cipher: String, salt: String, passphrase: String, count: Double): OpenSllKeyDeriv = js.native
  def parseCertificate(data: String, format: String): Certificate = js.native
  def parseCertificate(data: String, format: String, options: js.Any): Certificate = js.native
  def parseCertificate(data: Buffer, format: String): Certificate = js.native
  def parseCertificate(data: Buffer, format: String, options: js.Any): Certificate = js.native
  def parseFingerprint(fp: String): Fingerprint = js.native
  def parseFingerprint(fp: String, options: js.Any): Fingerprint = js.native
  def parseKey(data: String, format: String): Key = js.native
  def parseKey(data: String, format: String, options: js.Any): Key = js.native
  def parseKey(data: Buffer, format: String): Key = js.native
  def parseKey(data: Buffer, format: String, options: js.Any): Key = js.native
  def parsePrivateKey(data: String, format: String): PrivateKey = js.native
  def parsePrivateKey(data: String, format: String, options: js.Any): PrivateKey = js.native
  def parsePrivateKey(data: Buffer, format: String): PrivateKey = js.native
  def parsePrivateKey(data: Buffer, format: String, options: js.Any): PrivateKey = js.native
  def parseSignature(data: String, `type`: String, format: String): Signature = js.native
  def parseSignature(data: Buffer, `type`: String, format: String): Signature = js.native
}

