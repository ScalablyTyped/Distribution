package typings.sshpk.mod

import typings.asn1.mod.BerReader
import typings.asn1.mod.BerWriter
import typings.node.bufferMod.global.Buffer
import typings.node.cryptoMod.BinaryLike
import typings.sshpk.anon.ReadOptionsfilenamestring
import typings.sshpk.mod.Format.SshPrivateCipher
import typings.sshpk.sshpkStrings.`aes-128-cbc`
import typings.sshpk.sshpkStrings.`aes-256-cbc`
import typings.sshpk.sshpkStrings.`des-ede3-cbc`
import typings.sshpk.sshpkStrings.ecdsa_
import typings.sshpk.sshpkStrings.ed25519
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def addRSAMissing(key: PrivateKey): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addRSAMissing")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def assertCompatible(obj: js.Object, klass: Any, needVer: Version): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertCompatible")(obj.asInstanceOf[js.Any], klass.asInstanceOf[js.Any], needVer.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assertCompatible(obj: js.Object, klass: Any, needVer: Version, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertCompatible")(obj.asInstanceOf[js.Any], klass.asInstanceOf[js.Any], needVer.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def bufferSplit(buf: Buffer, chr: String): js.Array[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferSplit")(buf.asInstanceOf[js.Any], chr.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer]]

inline def calculateDSAPublic(g: Buffer, p: Buffer, x: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateDSAPublic")(g.asInstanceOf[js.Any], p.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Buffer]

inline def calculateED25519Public(k: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateED25519Public")(k.asInstanceOf[js.Any]).asInstanceOf[Buffer]

inline def calculateX25519Public(k: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateX25519Public")(k.asInstanceOf[js.Any]).asInstanceOf[Buffer]

inline def countZeros(buf: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("countZeros")(buf.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def createCertificate(subjectOrSubjects: js.Array[Identity], key: Key, issuer: Identity, issuerKey: PrivateKey): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("createCertificate")(subjectOrSubjects.asInstanceOf[js.Any], key.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], issuerKey.asInstanceOf[js.Any])).asInstanceOf[Certificate]
inline def createCertificate(
  subjectOrSubjects: js.Array[Identity],
  key: Key,
  issuer: Identity,
  issuerKey: PrivateKey,
  options: CertificateCreateOptions
): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("createCertificate")(subjectOrSubjects.asInstanceOf[js.Any], key.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], issuerKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Certificate]
inline def createCertificate(subjectOrSubjects: js.Array[Identity], key: PrivateKey, issuer: Identity, issuerKey: PrivateKey): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("createCertificate")(subjectOrSubjects.asInstanceOf[js.Any], key.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], issuerKey.asInstanceOf[js.Any])).asInstanceOf[Certificate]
inline def createCertificate(
  subjectOrSubjects: js.Array[Identity],
  key: PrivateKey,
  issuer: Identity,
  issuerKey: PrivateKey,
  options: CertificateCreateOptions
): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("createCertificate")(subjectOrSubjects.asInstanceOf[js.Any], key.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], issuerKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Certificate]
inline def createCertificate(subjectOrSubjects: Identity, key: Key, issuer: Identity, issuerKey: PrivateKey): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("createCertificate")(subjectOrSubjects.asInstanceOf[js.Any], key.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], issuerKey.asInstanceOf[js.Any])).asInstanceOf[Certificate]
inline def createCertificate(
  subjectOrSubjects: Identity,
  key: Key,
  issuer: Identity,
  issuerKey: PrivateKey,
  options: CertificateCreateOptions
): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("createCertificate")(subjectOrSubjects.asInstanceOf[js.Any], key.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], issuerKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Certificate]
inline def createCertificate(subjectOrSubjects: Identity, key: PrivateKey, issuer: Identity, issuerKey: PrivateKey): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("createCertificate")(subjectOrSubjects.asInstanceOf[js.Any], key.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], issuerKey.asInstanceOf[js.Any])).asInstanceOf[Certificate]
inline def createCertificate(
  subjectOrSubjects: Identity,
  key: PrivateKey,
  issuer: Identity,
  issuerKey: PrivateKey,
  options: CertificateCreateOptions
): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("createCertificate")(subjectOrSubjects.asInstanceOf[js.Any], key.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], issuerKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Certificate]

inline def createSelfSignedCertificate(subjectOrSubjects: js.Array[Identity], key: PrivateKey): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("createSelfSignedCertificate")(subjectOrSubjects.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Certificate]
inline def createSelfSignedCertificate(subjectOrSubjects: js.Array[Identity], key: PrivateKey, options: CertificateCreateOptions): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("createSelfSignedCertificate")(subjectOrSubjects.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Certificate]
inline def createSelfSignedCertificate(subjectOrSubjects: Identity, key: PrivateKey): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("createSelfSignedCertificate")(subjectOrSubjects.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Certificate]
inline def createSelfSignedCertificate(subjectOrSubjects: Identity, key: PrivateKey, options: CertificateCreateOptions): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("createSelfSignedCertificate")(subjectOrSubjects.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Certificate]

inline def ecNormalize(buf: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("ecNormalize")(buf.asInstanceOf[js.Any]).asInstanceOf[Buffer]
inline def ecNormalize(buf: Buffer, addZero: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("ecNormalize")(buf.asInstanceOf[js.Any], addZero.asInstanceOf[js.Any])).asInstanceOf[Buffer]

inline def generatePrivateKey_ecdsa(`type`: ecdsa_): PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePrivateKey")(`type`.asInstanceOf[js.Any]).asInstanceOf[PrivateKey]
inline def generatePrivateKey_ecdsa(`type`: ecdsa_, options: typings.sshpk.anon.Curve): PrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePrivateKey")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PrivateKey]

inline def generatePrivateKey_ed25519(`type`: ed25519): PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePrivateKey")(`type`.asInstanceOf[js.Any]).asInstanceOf[PrivateKey]

inline def identityForEmail(email: String): Identity = ^.asInstanceOf[js.Dynamic].applyDynamic("identityForEmail")(email.asInstanceOf[js.Any]).asInstanceOf[Identity]

inline def identityForHost(hostname: String): Identity = ^.asInstanceOf[js.Dynamic].applyDynamic("identityForHost")(hostname.asInstanceOf[js.Any]).asInstanceOf[Identity]

inline def identityForUser(uid: String): Identity = ^.asInstanceOf[js.Dynamic].applyDynamic("identityForUser")(uid.asInstanceOf[js.Any]).asInstanceOf[Identity]

inline def identityFromArray(components: js.Array[IdentityNameComponent]): Identity = ^.asInstanceOf[js.Dynamic].applyDynamic("identityFromArray")(components.asInstanceOf[js.Any]).asInstanceOf[Identity]

inline def identityFromDN(dn: String): Identity = ^.asInstanceOf[js.Dynamic].applyDynamic("identityFromDN")(dn.asInstanceOf[js.Any]).asInstanceOf[Identity]

inline def isCompatible(obj: js.Object, klass: Any, needVer: Version): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCompatible")(obj.asInstanceOf[js.Any], klass.asInstanceOf[js.Any], needVer.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def mpDenormalize(buf: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("mpDenormalize")(buf.asInstanceOf[js.Any]).asInstanceOf[Buffer]

inline def mpNormalize(buf: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("mpNormalize")(buf.asInstanceOf[js.Any]).asInstanceOf[Buffer]

inline def opensshCipherInfo(cipter: SshPrivateCipher): OpenSshCipherInfo_ = ^.asInstanceOf[js.Dynamic].applyDynamic("opensshCipherInfo")(cipter.asInstanceOf[js.Any]).asInstanceOf[OpenSshCipherInfo_]

inline def opensslKeyDeriv(
  cipher: `des-ede3-cbc` | `aes-128-cbc` | `aes-256-cbc`,
  salt: Buffer,
  passphrase: Buffer,
  count: Double
): OpenSslKeyDeriv_ = (^.asInstanceOf[js.Dynamic].applyDynamic("opensslKeyDeriv")(cipher.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[OpenSslKeyDeriv_]

inline def parseCertificate(data: String, format: CertificateFormat): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCertificate")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Certificate]
inline def parseCertificate(data: String, format: CertificateFormat, options: String): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCertificate")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Certificate]
inline def parseCertificate(data: String, format: CertificateFormat, options: KeyParseOptions): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCertificate")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Certificate]
inline def parseCertificate(data: Buffer, format: CertificateFormat): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCertificate")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Certificate]
inline def parseCertificate(data: Buffer, format: CertificateFormat, options: String): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCertificate")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Certificate]
inline def parseCertificate(data: Buffer, format: CertificateFormat, options: KeyParseOptions): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCertificate")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Certificate]

inline def parseFingerprint(fp: String): Fingerprint = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFingerprint")(fp.asInstanceOf[js.Any]).asInstanceOf[Fingerprint]
inline def parseFingerprint(fp: String, options: js.Array[String]): Fingerprint = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFingerprint")(fp.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Fingerprint]
inline def parseFingerprint(fp: String, options: FingerprintParseOptions): Fingerprint = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFingerprint")(fp.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Fingerprint]

inline def parseKey(data: String): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKey")(data.asInstanceOf[js.Any]).asInstanceOf[Key]
inline def parseKey(data: String, format: Unit, options: String): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKey")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Key]
inline def parseKey(data: String, format: Unit, options: ReadOptionsfilenamestring): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKey")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Key]
inline def parseKey(data: String, format: KeyFormatType): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKey")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Key]
inline def parseKey(data: String, format: KeyFormatType, options: String): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKey")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Key]
inline def parseKey(data: String, format: KeyFormatType, options: ReadOptionsfilenamestring): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKey")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Key]
inline def parseKey(data: Buffer): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKey")(data.asInstanceOf[js.Any]).asInstanceOf[Key]
inline def parseKey(data: Buffer, format: Unit, options: String): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKey")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Key]
inline def parseKey(data: Buffer, format: Unit, options: ReadOptionsfilenamestring): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKey")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Key]
inline def parseKey(data: Buffer, format: KeyFormatType): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKey")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Key]
inline def parseKey(data: Buffer, format: KeyFormatType, options: String): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKey")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Key]
inline def parseKey(data: Buffer, format: KeyFormatType, options: ReadOptionsfilenamestring): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKey")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Key]

inline def parsePrivateKey(data: String): PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePrivateKey")(data.asInstanceOf[js.Any]).asInstanceOf[PrivateKey]
inline def parsePrivateKey(data: String, format: Unit, options: String): PrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePrivateKey")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PrivateKey]
inline def parsePrivateKey(data: String, format: Unit, options: KeyParseOptions): PrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePrivateKey")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PrivateKey]
inline def parsePrivateKey(data: String, format: PrivateKeyFormatType): PrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePrivateKey")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[PrivateKey]
inline def parsePrivateKey(data: String, format: PrivateKeyFormatType, options: String): PrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePrivateKey")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PrivateKey]
inline def parsePrivateKey(data: String, format: PrivateKeyFormatType, options: KeyParseOptions): PrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePrivateKey")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PrivateKey]
inline def parsePrivateKey(data: Buffer): PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePrivateKey")(data.asInstanceOf[js.Any]).asInstanceOf[PrivateKey]
inline def parsePrivateKey(data: Buffer, format: Unit, options: String): PrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePrivateKey")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PrivateKey]
inline def parsePrivateKey(data: Buffer, format: Unit, options: KeyParseOptions): PrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePrivateKey")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PrivateKey]
inline def parsePrivateKey(data: Buffer, format: PrivateKeyFormatType): PrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePrivateKey")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[PrivateKey]
inline def parsePrivateKey(data: Buffer, format: PrivateKeyFormatType, options: String): PrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePrivateKey")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PrivateKey]
inline def parsePrivateKey(data: Buffer, format: PrivateKeyFormatType, options: KeyParseOptions): PrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePrivateKey")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PrivateKey]

inline def parseSignature(data: String, `type`: AlgorithmType, format: SignatureFormatType): Signature = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSignature")(data.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Signature]
inline def parseSignature(data: Buffer, `type`: AlgorithmType, format: SignatureFormatType): Signature = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSignature")(data.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Signature]

inline def pbkdf2(hashAlg: String, salt: Buffer, iterations: Double, size: Double, passphrase: BinaryLike): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(hashAlg.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], size.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[Buffer]

inline def publicFromPrivateECDSA(curveName: CurveType, priv: Buffer): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("publicFromPrivateECDSA")(curveName.asInstanceOf[js.Any], priv.asInstanceOf[js.Any])).asInstanceOf[Key]

inline def readBitString(der: BerReader): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readBitString")(der.asInstanceOf[js.Any]).asInstanceOf[Buffer]
inline def readBitString(der: BerReader, tag: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readBitString")(der.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[Buffer]

inline def writeBitString(der: BerWriter, buf: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBitString")(der.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def writeBitString(der: BerWriter, buf: Buffer, tag: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBitString")(der.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def zeroPadToLength(buf: Buffer, len: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("zeroPadToLength")(buf.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Buffer]

// == utils.js == //
type Version = js.Tuple2[Double, Double]
