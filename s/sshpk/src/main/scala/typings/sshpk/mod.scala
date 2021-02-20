package typings.sshpk

import typings.node.Buffer
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sshpk", JSImport.Namespace)
  @js.native
  class ^ () extends SshPK
  
  @JSImport("sshpk", "Algo")
  @js.native
  class Algo () extends StObject {
    
    var normalize: js.UndefOr[Boolean] = js.native
    
    var parts: js.Array[String] = js.native
    
    var sizePart: js.UndefOr[String] = js.native
  }
  
  @JSImport("sshpk", "Certificate")
  @js.native
  class Certificate protected () extends StObject {
    def this(opts: js.Any) = this()
    
    def fingerprint(algo: String): Fingerprint = js.native
    
    def hash(algo: String): String = js.native
    
    def isExpired(when: Date): Boolean = js.native
    
    def isSignedBy(issuerCert: Certificate): Boolean = js.native
    
    def isSignedByKey(issuerKey: Key): Boolean = js.native
    
    var issuer: String = js.native
    
    var issuerKey: String = js.native
    
    var serial: String = js.native
    
    def signWith(key: Key): Unit = js.native
    
    var signatures: String = js.native
    
    var subjectKey: String = js.native
    
    var subjects: js.Array[Identity] = js.native
    
    def toBuffer(format: String): Buffer = js.native
    def toBuffer(format: String, options: js.Any): Buffer = js.native
    
    def toString(format: String): String = js.native
    def toString(format: String, options: js.Any): String = js.native
    
    var validFrom: String = js.native
    
    var validUntil: String = js.native
  }
  object Certificate {
    
    @JSImport("sshpk", "Certificate")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("sshpk", "Certificate.create")
    @js.native
    def create(subjectOrSubjects: String, key: Key, issuer: String, issuerKey: PrivateKey, options: js.Any): Certificate = js.native
    
    /* static member */
    @JSImport("sshpk", "Certificate.createSelfSigned")
    @js.native
    def createSelfSigned(subjectOrSubjects: String, key: Key, options: js.Any): Certificate = js.native
    
    /* static member */
    @JSImport("sshpk", "Certificate.formats")
    @js.native
    def formats: Formats = js.native
    @scala.inline
    def formats_=(x: Formats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formats")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("sshpk", "Certificate.isCertificate")
    @js.native
    def isCertificate(data: String, ver: String): Boolean = js.native
    @JSImport("sshpk", "Certificate.isCertificate")
    @js.native
    def isCertificate(data: Buffer, ver: String): Boolean = js.native
    
    /* static member */
    @JSImport("sshpk", "Certificate.parse")
    @js.native
    def parse(data: String, format: String, options: js.Any): Certificate = js.native
    @JSImport("sshpk", "Certificate.parse")
    @js.native
    def parse(data: Buffer, format: String, options: js.Any): Certificate = js.native
  }
  
  @JSImport("sshpk", "CertificateParseError")
  @js.native
  class CertificateParseError protected () extends Error {
    def this(name: String, format: String, innerErr: js.Any) = this()
  }
  
  @JSImport("sshpk", "Curve")
  @js.native
  class Curve () extends StObject {
    
    var G: Buffer = js.native
    
    var a: Buffer = js.native
    
    var b: Buffer = js.native
    
    var n: Buffer = js.native
    
    var p: Buffer = js.native
    
    var pkcs8oid: String = js.native
    
    var s: Buffer = js.native
    
    var size: Double = js.native
  }
  
  @JSImport("sshpk", "DiffieHellman")
  @js.native
  class DiffieHellman protected () extends StObject {
    def this(key: Key) = this()
    
    def computeSecret(otherpk: PrivateKey): Buffer = js.native
    
    def generateKey(): PrivateKey = js.native
    
    def generateKeys(): PrivateKey = js.native
    
    def getKey(): PrivateKey = js.native
    
    def getPrivateKey(): PrivateKey = js.native
    
    def getPublicKey(): Key = js.native
    
    def setKey(key: PrivateKey): Unit = js.native
    
    def setPrivateKey(key: PrivateKey): Unit = js.native
  }
  
  @JSImport("sshpk", "ECPrivate")
  @js.native
  class ECPrivate protected () extends StObject {
    def this(params: X9ECParameters, buffer: Buffer) = this()
    
    def deriveSharedSecret(pk: Key): Buffer = js.native
  }
  
  @JSImport("sshpk", "ECPublic")
  @js.native
  class ECPublic protected () extends StObject {
    def this(params: X9ECParameters, buffer: Buffer) = this()
  }
  
  @JSImport("sshpk", "Fingerprint")
  @js.native
  class Fingerprint protected () extends StObject {
    def this(opts: js.Any) = this()
    
    def addColons(fp: String): String = js.native
    
    var algorithm: String = js.native
    
    def base64Strip(fp: String): String = js.native
    
    var hash: String = js.native
    
    def isFingerprint(obj: String, ver: String): Boolean = js.native
    def isFingerprint(obj: Buffer, ver: String): Boolean = js.native
    
    def matches(other: Fingerprint): Boolean = js.native
    
    def sshBase64Format(alg: String, h: String): String = js.native
    
    def toString(format: String): String = js.native
    
    var `type`: String = js.native
  }
  object Fingerprint {
    
    /* static member */
    @JSImport("sshpk", "Fingerprint.parse")
    @js.native
    def parse(fp: String, options: js.Any): Fingerprint = js.native
  }
  
  @JSImport("sshpk", "FingerprintFormatError")
  @js.native
  class FingerprintFormatError protected () extends Error {
    def this(fp: Fingerprint, format: String) = this()
  }
  
  @JSImport("sshpk", "Format")
  @js.native
  class Format () extends StObject {
    
    def read(buf: Buffer): Buffer = js.native
    def read(buf: Buffer, options: js.Any): Buffer = js.native
    
    def write(key: Key): Buffer = js.native
    def write(key: Key, options: js.Any): Buffer = js.native
  }
  
  @JSImport("sshpk", "Formats")
  @js.native
  class Formats () extends StObject {
    
    var auto: Format = js.native
    
    var openssh: Format = js.native
    
    var pem: Format = js.native
    
    var pkcs1: Format = js.native
    
    var pkcs8: Format = js.native
    
    var rfc4253: Format = js.native
    
    var ssh: Format = js.native
    
    var `ssh-private`: Format = js.native
  }
  
  @JSImport("sshpk", "Identity")
  @js.native
  class Identity protected () extends StObject {
    def this(opts: js.Any) = this()
    
    var cn: String = js.native
    
    var componentLookup: js.Any = js.native
    
    var components: js.Array[String] = js.native
    
    var email: String = js.native
    
    def equals(other: Identity): Boolean = js.native
    
    var hostname: String = js.native
    
    def toAsn1(der: String, tag: String): Unit = js.native
    def toAsn1(der: Buffer, tag: String): Unit = js.native
    
    var `type`: String = js.native
    
    var uid: String = js.native
  }
  object Identity {
    
    /* static member */
    @JSImport("sshpk", "Identity.forEmail")
    @js.native
    def forEmail(email: String): Identity = js.native
    
    /* static member */
    @JSImport("sshpk", "Identity.forHost")
    @js.native
    def forHost(hostname: String): Identity = js.native
    
    /* static member */
    @JSImport("sshpk", "Identity.forUser")
    @js.native
    def forUser(uid: String): Identity = js.native
    
    @JSImport("sshpk", "Identity.isIdentity")
    @js.native
    def isIdentity(dn: String, ver: String): Boolean = js.native
    /* static member */
    @JSImport("sshpk", "Identity.isIdentity")
    @js.native
    def isIdentity(dn: Buffer, ver: String): Boolean = js.native
    
    @JSImport("sshpk", "Identity.parseAsn1")
    @js.native
    def parseAsn1(dn: String, top: String): Identity = js.native
    /* static member */
    @JSImport("sshpk", "Identity.parseAsn1")
    @js.native
    def parseAsn1(dn: Buffer, top: String): Identity = js.native
    
    /* static member */
    @JSImport("sshpk", "Identity.parseDN")
    @js.native
    def parseDN(dn: String): Identity = js.native
  }
  
  @JSImport("sshpk", "InvalidAlgorithmError")
  @js.native
  class InvalidAlgorithmError protected () extends Error {
    def this(algo: String) = this()
  }
  
  @JSImport("sshpk", "Key")
  @js.native
  class Key protected () extends StObject {
    def this(opts: js.Any) = this()
    
    var comment: js.UndefOr[String] = js.native
    
    def createDH(): DiffieHellman = js.native
    
    def createDiffieHellman(): DiffieHellman = js.native
    
    def createVerify(algo: String): Verify = js.native
    
    var curve: js.UndefOr[String] = js.native
    
    def defaultHashAlgorithm(): String = js.native
    
    def fingerprint(algo: String): Fingerprint = js.native
    
    def hash(algo: String): Buffer = js.native
    
    var part: String = js.native
    
    var parts: String = js.native
    
    var size: Double = js.native
    
    var source: js.UndefOr[String] = js.native
    
    def toBuffer(format: String): Buffer = js.native
    def toBuffer(format: String, options: js.Any): Buffer = js.native
    
    def toString(format: String): String = js.native
    def toString(format: String, options: js.Any): String = js.native
    
    var `type`: String = js.native
  }
  object Key {
    
    @JSImport("sshpk", "Key")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("sshpk", "Key.formats")
    @js.native
    def formats: Formats = js.native
    @scala.inline
    def formats_=(x: Formats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formats")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("sshpk", "Key.isKey")
    @js.native
    def isKey(obj: String, ver: String): Boolean = js.native
    @JSImport("sshpk", "Key.isKey")
    @js.native
    def isKey(obj: Buffer, ver: String): Boolean = js.native
    
    /* static member */
    @JSImport("sshpk", "Key.parse")
    @js.native
    def parse(data: String, format: String, options: js.Any): Key = js.native
    @JSImport("sshpk", "Key.parse")
    @js.native
    def parse(data: Buffer, format: String, options: js.Any): Key = js.native
  }
  
  @JSImport("sshpk", "KeyEncryptedError")
  @js.native
  class KeyEncryptedError protected () extends Error {
    def this(name: String, format: String) = this()
  }
  
  @JSImport("sshpk", "KeyParseError")
  @js.native
  class KeyParseError protected () extends Error {
    def this(name: String, format: String, innerErr: js.Any) = this()
  }
  
  @JSImport("sshpk", "OpenSllKeyDeriv")
  @js.native
  class OpenSllKeyDeriv () extends StObject {
    
    var iv: Buffer = js.native
    
    var key: Buffer = js.native
  }
  
  @JSImport("sshpk", "OpensshCipherInfo")
  @js.native
  class OpensshCipherInfo_ () extends StObject {
    
    var blockSize: Double = js.native
    
    var keySize: Double = js.native
    
    var opensslName: String = js.native
  }
  
  @JSImport("sshpk", "PrivateKey")
  @js.native
  class PrivateKey protected () extends StObject {
    def this(opts: js.Any) = this()
    
    var comment: js.UndefOr[String] = js.native
    
    def createSign(hashAlgo: String): Signer = js.native
    
    def createVerify(hashAlgo: String): Key = js.native
    
    def derive(newType: String, newSize: Double): PrivateKey = js.native
    
    def hash(algo: String): Buffer = js.native
    
    def toBuffer(format: String, options: js.Any): Buffer = js.native
    
    def toPublic(): Key = js.native
  }
  object PrivateKey {
    
    @JSImport("sshpk", "PrivateKey")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("sshpk", "PrivateKey.formats")
    @js.native
    def formats: Formats = js.native
    @scala.inline
    def formats_=(x: Formats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formats")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("sshpk", "PrivateKey.isPrivateKey")
    @js.native
    def isPrivateKey(data: String, ver: String): Boolean = js.native
    @JSImport("sshpk", "PrivateKey.isPrivateKey")
    @js.native
    def isPrivateKey(data: Buffer, ver: String): Boolean = js.native
    
    /* static member */
    @JSImport("sshpk", "PrivateKey.parse")
    @js.native
    def parse(data: String, format: String, options: js.Any): PrivateKey = js.native
    @JSImport("sshpk", "PrivateKey.parse")
    @js.native
    def parse(data: Buffer, format: String, options: js.Any): PrivateKey = js.native
  }
  
  @JSImport("sshpk", "SSHBuffer")
  @js.native
  class SSHBuffer protected () extends StObject {
    def this(opts: js.Any) = this()
    
    def atEnd(): Boolean = js.native
    
    def expand(): Unit = js.native
    
    def readBuffer(): Buffer = js.native
    
    def readChar(): String = js.native
    
    def readInt(): Double = js.native
    
    def readInt64(): Buffer = js.native
    
    def readPart(): SSHPart = js.native
    
    def readString(): String = js.native
    
    def remainder(): Buffer = js.native
    
    def skip(n: Double): Unit = js.native
    
    def toBuffer(): Buffer = js.native
    
    def write(buf: Buffer): Unit = js.native
    
    def writeBuffer(buf: Buffer): Unit = js.native
    
    def writeCString(buf: String): Unit = js.native
    
    def writeChar(buf: String): Unit = js.native
    
    def writeInt(buf: Double): Unit = js.native
    
    def writeInt64(buf: Buffer): Unit = js.native
    
    def writePart(buf: SSHPart): Unit = js.native
    
    def writeString(buf: String): Unit = js.native
  }
  
  @JSImport("sshpk", "SSHPart")
  @js.native
  class SSHPart () extends StObject {
    
    var data: Buffer = js.native
  }
  
  @JSImport("sshpk", "Signature")
  @js.native
  class Signature protected () extends StObject {
    def this(opts: js.Any) = this()
    
    def toBuffer(format: String): Buffer = js.native
    
    def toString(format: String): String = js.native
  }
  object Signature {
    
    /* static member */
    @JSImport("sshpk", "Signature.isSignature")
    @js.native
    def isSignature(obj: String, ver: String): Boolean = js.native
    @JSImport("sshpk", "Signature.isSignature")
    @js.native
    def isSignature(obj: Buffer, ver: String): Boolean = js.native
    
    /* static member */
    @JSImport("sshpk", "Signature.parse")
    @js.native
    def parse(data: String, `type`: String, format: String): Signature = js.native
    @JSImport("sshpk", "Signature.parse")
    @js.native
    def parse(data: Buffer, `type`: String, format: String): Signature = js.native
  }
  
  @JSImport("sshpk", "SignatureParseError")
  @js.native
  class SignatureParseError protected () extends Error {
    def this(`type`: String, format: String, innerErr: js.Any) = this()
  }
  
  @JSImport("sshpk", "Signer")
  @js.native
  class Signer protected () extends StObject {
    def this(key: Key, hashAlgo: String) = this()
    
    def sign(): Signature = js.native
    
    def update(chunk: String): Unit = js.native
    def update(chunk: Buffer): Unit = js.native
  }
  
  @JSImport("sshpk", "Verifier")
  @js.native
  class Verifier protected () extends StObject {
    def this(key: Key, hashAlgo: String) = this()
    
    def update(chunk: String): Unit = js.native
    def update(chunk: Buffer): Unit = js.native
    
    def verify(signature: String): Boolean = js.native
  }
  
  @JSImport("sshpk", "Verify")
  @js.native
  class Verify () extends StObject {
    
    def verify(data: String, fmt: String): Boolean = js.native
  }
  
  @JSImport("sshpk", "X9ECParameters")
  @js.native
  class X9ECParameters () extends StObject {
    
    var G: js.Any = js.native
    
    var g: js.Any = js.native
    
    var h: js.Any = js.native
    
    var n: js.Any = js.native
  }
  
  @JSImport("sshpk", "addRSAMissing")
  @js.native
  def addRSAMissing(key: PrivateKey): Unit = js.native
  
  @JSImport("sshpk", "algInfo")
  @js.native
  class algInfo () extends StObject {
    
    var curve25519: Algo = js.native
    
    var dsa: Algo = js.native
    
    var ecdsa: Algo = js.native
    
    var ed25519: Algo = js.native
    
    var rsa: Algo = js.native
  }
  
  @JSImport("sshpk", "algPrivInfo")
  @js.native
  class algPrivInfo () extends StObject {
    
    var curve25519: Algo = js.native
    
    var dsa: Algo = js.native
    
    var ecdsa: Algo = js.native
    
    var ed25519: Algo = js.native
    
    var rsa: Algo = js.native
  }
  
  @JSImport("sshpk", "algs")
  @js.native
  class algs () extends StObject {
    
    var curves: typings.sshpk.mod.curves = js.native
    
    var hashAlgs: typings.sshpk.mod.hashAlgs = js.native
    
    var info: algInfo = js.native
    
    var privInfo: algPrivInfo = js.native
  }
  
  @JSImport("sshpk", "assertCompatible")
  @js.native
  def assertCompatible(obj: js.Any, klass: js.Any, needVer: String, name: String): Unit = js.native
  
  @JSImport("sshpk", "bufferSplit")
  @js.native
  def bufferSplit(buf: Buffer, chr: String): js.Array[Buffer] = js.native
  
  @JSImport("sshpk", "calculateDSAPublic")
  @js.native
  def calculateDSAPublic(g: Buffer, p: Buffer, x: Buffer): Buffer = js.native
  
  @JSImport("sshpk", "countZeros")
  @js.native
  def countZeros(buf: Buffer): Double = js.native
  
  @JSImport("sshpk", "createCertificate")
  @js.native
  def createCertificate(subjectOrSubjects: String, key: Key, issuer: String, issuerKey: PrivateKey): Certificate = js.native
  @JSImport("sshpk", "createCertificate")
  @js.native
  def createCertificate(subjectOrSubjects: String, key: Key, issuer: String, issuerKey: PrivateKey, options: js.Any): Certificate = js.native
  
  @JSImport("sshpk", "createSelfSignedCertificate")
  @js.native
  def createSelfSignedCertificate(subjectOrSubjects: String, key: Key): Certificate = js.native
  @JSImport("sshpk", "createSelfSignedCertificate")
  @js.native
  def createSelfSignedCertificate(subjectOrSubjects: String, key: Key, options: js.Any): Certificate = js.native
  
  @JSImport("sshpk", "curves")
  @js.native
  class curves () extends StObject {
    
    var nistp256: Curve = js.native
    
    var nistp384: Curve = js.native
    
    var nistp512: Curve = js.native
  }
  
  @JSImport("sshpk", "ecNormalize")
  @js.native
  def ecNormalize(buf: Buffer, addZero: Boolean): Buffer = js.native
  
  @JSImport("sshpk", "hashAlgs")
  @js.native
  class hashAlgs () extends StObject {
    
    var md5: Boolean = js.native
    
    var sha1: Boolean = js.native
    
    var sha256: Boolean = js.native
    
    var sha384: Boolean = js.native
    
    var sha512: Boolean = js.native
  }
  
  @JSImport("sshpk", "identityForEmail")
  @js.native
  def identityForEmail(email: String): Identity = js.native
  
  @JSImport("sshpk", "identityForHost")
  @js.native
  def identityForHost(hostname: String): Identity = js.native
  
  @JSImport("sshpk", "identityForUser")
  @js.native
  def identityForUser(uid: String): Identity = js.native
  
  @JSImport("sshpk", "identityFromDN")
  @js.native
  def identityFromDN(dn: String): Identity = js.native
  
  @JSImport("sshpk", "isCompatible")
  @js.native
  def isCompatible(obj: js.Any, klass: js.Any, needVer: String): Boolean = js.native
  
  @JSImport("sshpk", "mpNormalize")
  @js.native
  def mpNormalize(buf: Buffer): Buffer = js.native
  
  @JSImport("sshpk", "opensshCipherInfo")
  @js.native
  def opensshCipherInfo(cipber: String): OpensshCipherInfo_ = js.native
  
  @JSImport("sshpk", "opensslKeyDeriv")
  @js.native
  def opensslKeyDeriv(cipher: String, salt: String, passphrase: String, count: Double): OpenSllKeyDeriv = js.native
  
  @JSImport("sshpk", "parseCertificate")
  @js.native
  def parseCertificate(data: String, format: String): Certificate = js.native
  @JSImport("sshpk", "parseCertificate")
  @js.native
  def parseCertificate(data: String, format: String, options: js.Any): Certificate = js.native
  @JSImport("sshpk", "parseCertificate")
  @js.native
  def parseCertificate(data: Buffer, format: String): Certificate = js.native
  @JSImport("sshpk", "parseCertificate")
  @js.native
  def parseCertificate(data: Buffer, format: String, options: js.Any): Certificate = js.native
  
  @JSImport("sshpk", "parseFingerprint")
  @js.native
  def parseFingerprint(fp: String): Fingerprint = js.native
  @JSImport("sshpk", "parseFingerprint")
  @js.native
  def parseFingerprint(fp: String, options: js.Any): Fingerprint = js.native
  
  @JSImport("sshpk", "parseKey")
  @js.native
  def parseKey(data: String, format: String): Key = js.native
  @JSImport("sshpk", "parseKey")
  @js.native
  def parseKey(data: String, format: String, options: js.Any): Key = js.native
  @JSImport("sshpk", "parseKey")
  @js.native
  def parseKey(data: Buffer, format: String): Key = js.native
  @JSImport("sshpk", "parseKey")
  @js.native
  def parseKey(data: Buffer, format: String, options: js.Any): Key = js.native
  
  @JSImport("sshpk", "parsePrivateKey")
  @js.native
  def parsePrivateKey(data: String, format: String): PrivateKey = js.native
  @JSImport("sshpk", "parsePrivateKey")
  @js.native
  def parsePrivateKey(data: String, format: String, options: js.Any): PrivateKey = js.native
  @JSImport("sshpk", "parsePrivateKey")
  @js.native
  def parsePrivateKey(data: Buffer, format: String): PrivateKey = js.native
  @JSImport("sshpk", "parsePrivateKey")
  @js.native
  def parsePrivateKey(data: Buffer, format: String, options: js.Any): PrivateKey = js.native
  
  @JSImport("sshpk", "parseSignature")
  @js.native
  def parseSignature(data: String, `type`: String, format: String): Signature = js.native
  @JSImport("sshpk", "parseSignature")
  @js.native
  def parseSignature(data: Buffer, `type`: String, format: String): Signature = js.native
  
  @js.native
  trait SshPK extends StObject
}
