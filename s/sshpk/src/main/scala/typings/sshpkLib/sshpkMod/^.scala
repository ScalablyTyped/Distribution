package typings
package sshpkLib.sshpkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addRSAMissing(key: sshpkLib.sshpkMod.SshPKNs.PrivateKey): scala.Unit = js.native
  def assertCompatible(obj: js.Any, klass: js.Any, needVer: java.lang.String, name: java.lang.String): scala.Unit = js.native
  def bufferSplit(buf: nodeLib.Buffer, chr: java.lang.String): js.Array[nodeLib.Buffer] = js.native
  def calculateDSAPublic(g: nodeLib.Buffer, p: nodeLib.Buffer, x: nodeLib.Buffer): nodeLib.Buffer = js.native
  def countZeros(buf: nodeLib.Buffer): scala.Double = js.native
  def createCertificate(
    subjectOrSubjects: java.lang.String,
    key: sshpkLib.sshpkMod.SshPKNs.Key,
    issuer: java.lang.String,
    issuerKey: sshpkLib.sshpkMod.SshPKNs.PrivateKey
  ): sshpkLib.sshpkMod.SshPKNs.Certificate = js.native
  def createCertificate(
    subjectOrSubjects: java.lang.String,
    key: sshpkLib.sshpkMod.SshPKNs.Key,
    issuer: java.lang.String,
    issuerKey: sshpkLib.sshpkMod.SshPKNs.PrivateKey,
    options: js.Any
  ): sshpkLib.sshpkMod.SshPKNs.Certificate = js.native
  def createSelfSignedCertificate(subjectOrSubjects: java.lang.String, key: sshpkLib.sshpkMod.SshPKNs.Key): sshpkLib.sshpkMod.SshPKNs.Certificate = js.native
  def createSelfSignedCertificate(subjectOrSubjects: java.lang.String, key: sshpkLib.sshpkMod.SshPKNs.Key, options: js.Any): sshpkLib.sshpkMod.SshPKNs.Certificate = js.native
  def ecNormalize(buf: nodeLib.Buffer, addZero: scala.Boolean): nodeLib.Buffer = js.native
  def identityForEmail(email: java.lang.String): sshpkLib.sshpkMod.SshPKNs.Identity = js.native
  def identityForHost(hostname: java.lang.String): sshpkLib.sshpkMod.SshPKNs.Identity = js.native
  def identityForUser(uid: java.lang.String): sshpkLib.sshpkMod.SshPKNs.Identity = js.native
  def identityFromDN(dn: java.lang.String): sshpkLib.sshpkMod.SshPKNs.Identity = js.native
  def isCompatible(obj: js.Any, klass: js.Any, needVer: java.lang.String): scala.Boolean = js.native
  def mpNormalize(buf: nodeLib.Buffer): nodeLib.Buffer = js.native
  def opensshCipherInfo(cipber: java.lang.String): sshpkLib.sshpkMod.SshPKNs.OpensshCipherInfo = js.native
  def opensslKeyDeriv(
    cipher: java.lang.String,
    salt: java.lang.String,
    passphrase: java.lang.String,
    count: scala.Double
  ): sshpkLib.sshpkMod.SshPKNs.OpenSllKeyDeriv = js.native
  def parseCertificate(data: java.lang.String, format: java.lang.String): sshpkLib.sshpkMod.SshPKNs.Certificate = js.native
  def parseCertificate(data: java.lang.String, format: java.lang.String, options: js.Any): sshpkLib.sshpkMod.SshPKNs.Certificate = js.native
  def parseCertificate(data: nodeLib.Buffer, format: java.lang.String): sshpkLib.sshpkMod.SshPKNs.Certificate = js.native
  def parseCertificate(data: nodeLib.Buffer, format: java.lang.String, options: js.Any): sshpkLib.sshpkMod.SshPKNs.Certificate = js.native
  def parseFingerprint(fp: java.lang.String): sshpkLib.sshpkMod.SshPKNs.Fingerprint = js.native
  def parseFingerprint(fp: java.lang.String, options: js.Any): sshpkLib.sshpkMod.SshPKNs.Fingerprint = js.native
  def parseKey(data: java.lang.String, format: java.lang.String): sshpkLib.sshpkMod.SshPKNs.Key = js.native
  def parseKey(data: java.lang.String, format: java.lang.String, options: js.Any): sshpkLib.sshpkMod.SshPKNs.Key = js.native
  def parseKey(data: nodeLib.Buffer, format: java.lang.String): sshpkLib.sshpkMod.SshPKNs.Key = js.native
  def parseKey(data: nodeLib.Buffer, format: java.lang.String, options: js.Any): sshpkLib.sshpkMod.SshPKNs.Key = js.native
  def parsePrivateKey(data: java.lang.String, format: java.lang.String): sshpkLib.sshpkMod.SshPKNs.PrivateKey = js.native
  def parsePrivateKey(data: java.lang.String, format: java.lang.String, options: js.Any): sshpkLib.sshpkMod.SshPKNs.PrivateKey = js.native
  def parsePrivateKey(data: nodeLib.Buffer, format: java.lang.String): sshpkLib.sshpkMod.SshPKNs.PrivateKey = js.native
  def parsePrivateKey(data: nodeLib.Buffer, format: java.lang.String, options: js.Any): sshpkLib.sshpkMod.SshPKNs.PrivateKey = js.native
  def parseSignature(data: java.lang.String, `type`: java.lang.String, format: java.lang.String): sshpkLib.sshpkMod.SshPKNs.Signature = js.native
  def parseSignature(data: nodeLib.Buffer, `type`: java.lang.String, format: java.lang.String): sshpkLib.sshpkMod.SshPKNs.Signature = js.native
}

