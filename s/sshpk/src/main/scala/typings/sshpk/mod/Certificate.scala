package typings.sshpk.mod

import typings.node.bufferMod.global.Buffer
import typings.sshpk.anon.Openssh
import typings.sshpk.mod.Format.OpenSshSignatureExt
import typings.sshpk.mod.Format.WriteOptions
import typings.sshpk.mod.Format.x509SignatureExt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sshpk", "Certificate")
@js.native
open class Certificate protected () extends StObject {
  def this(opts: CertificateOptions) = this()
  
  def fingerprint(): Fingerprint = js.native
  def fingerprint(algo: AlgorithmHashType): Fingerprint = js.native
  
  def getExtension(keyOrOid: String): js.UndefOr[OpenSshSignatureExt | x509SignatureExt] = js.native
  
  def getExtensions(): js.Array[OpenSshSignatureExt | x509SignatureExt] = js.native
  
  def hash(algo: AlgorithmHashType): String = js.native
  
  def isExpired(): Boolean = js.native
  def isExpired(when: js.Date): Boolean = js.native
  
  def isSignedBy(issuerCert: Certificate): Boolean = js.native
  
  def isSignedByKey(issuerKey: Key): Boolean = js.native
  
  var issuer: Identity = js.native
  
  var issuerKey: js.UndefOr[Key] = js.native
  
  var purposes: js.UndefOr[js.Array[String]] = js.native
  
  var serial: Buffer = js.native
  
  def signWith(key: PrivateKey): Unit = js.native
  
  var signatures: Openssh = js.native
  
  var subjectKey: Key = js.native
  
  var subjects: js.Array[Identity] = js.native
  
  def toBuffer(format: CertificateFormat): Buffer = js.native
  def toBuffer(format: CertificateFormat, options: WriteOptions): Buffer = js.native
  
  def toString(format: CertificateFormat): String = js.native
  def toString(format: CertificateFormat, options: WriteOptions): String = js.native
  
  var validFrom: js.Date = js.native
  
  var validUntil: js.Date = js.native
}
object Certificate {
  
  @JSImport("sshpk", "Certificate")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(subjectOrSubjects: js.Array[Identity], key: Key, issuer: Identity, issuerKey: PrivateKey): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(subjectOrSubjects.asInstanceOf[js.Any], key.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], issuerKey.asInstanceOf[js.Any])).asInstanceOf[Certificate]
  inline def create(
    subjectOrSubjects: js.Array[Identity],
    key: Key,
    issuer: Identity,
    issuerKey: PrivateKey,
    options: CertificateCreateOptions
  ): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(subjectOrSubjects.asInstanceOf[js.Any], key.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], issuerKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Certificate]
  inline def create(subjectOrSubjects: js.Array[Identity], key: PrivateKey, issuer: Identity, issuerKey: PrivateKey): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(subjectOrSubjects.asInstanceOf[js.Any], key.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], issuerKey.asInstanceOf[js.Any])).asInstanceOf[Certificate]
  inline def create(
    subjectOrSubjects: js.Array[Identity],
    key: PrivateKey,
    issuer: Identity,
    issuerKey: PrivateKey,
    options: CertificateCreateOptions
  ): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(subjectOrSubjects.asInstanceOf[js.Any], key.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], issuerKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Certificate]
  /* static member */
  inline def create(subjectOrSubjects: Identity, key: Key, issuer: Identity, issuerKey: PrivateKey): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(subjectOrSubjects.asInstanceOf[js.Any], key.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], issuerKey.asInstanceOf[js.Any])).asInstanceOf[Certificate]
  inline def create(
    subjectOrSubjects: Identity,
    key: Key,
    issuer: Identity,
    issuerKey: PrivateKey,
    options: CertificateCreateOptions
  ): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(subjectOrSubjects.asInstanceOf[js.Any], key.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], issuerKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Certificate]
  inline def create(subjectOrSubjects: Identity, key: PrivateKey, issuer: Identity, issuerKey: PrivateKey): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(subjectOrSubjects.asInstanceOf[js.Any], key.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], issuerKey.asInstanceOf[js.Any])).asInstanceOf[Certificate]
  inline def create(
    subjectOrSubjects: Identity,
    key: PrivateKey,
    issuer: Identity,
    issuerKey: PrivateKey,
    options: CertificateCreateOptions
  ): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(subjectOrSubjects.asInstanceOf[js.Any], key.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], issuerKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Certificate]
  
  inline def createSelfSigned(subjectOrSubjects: js.Array[Identity], key: PrivateKey): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("createSelfSigned")(subjectOrSubjects.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Certificate]
  inline def createSelfSigned(subjectOrSubjects: js.Array[Identity], key: PrivateKey, options: CertificateCreateOptions): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("createSelfSigned")(subjectOrSubjects.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Certificate]
  /* static member */
  inline def createSelfSigned(subjectOrSubjects: Identity, key: PrivateKey): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("createSelfSigned")(subjectOrSubjects.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Certificate]
  inline def createSelfSigned(subjectOrSubjects: Identity, key: PrivateKey, options: CertificateCreateOptions): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("createSelfSigned")(subjectOrSubjects.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Certificate]
  
  /* static member */
  /* Inlined {[ key in sshpk.sshpk.CertificateFormat ]: sshpk.sshpk.Format} */
  object formats {
    
    @JSImport("sshpk", "Certificate.formats")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sshpk", "Certificate.formats.openssh")
    @js.native
    def openssh: Format = js.native
    inline def openssh_=(x: Format): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openssh")(x.asInstanceOf[js.Any])
    
    @JSImport("sshpk", "Certificate.formats.pem")
    @js.native
    def pem: Format = js.native
    inline def pem_=(x: Format): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pem")(x.asInstanceOf[js.Any])
    
    @JSImport("sshpk", "Certificate.formats.x509")
    @js.native
    def x509: Format = js.native
    inline def x509_=(x: Format): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x509")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  inline def isCertificate(data: String, ver: Version): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCertificate")(data.asInstanceOf[js.Any], ver.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isCertificate(data: Buffer, ver: Version): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCertificate")(data.asInstanceOf[js.Any], ver.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def parse(data: String, format: CertificateFormat): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Certificate]
  inline def parse(data: String, format: CertificateFormat, options: String): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Certificate]
  inline def parse(data: String, format: CertificateFormat, options: KeyParseOptions): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Certificate]
  inline def parse(data: Buffer, format: CertificateFormat): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Certificate]
  inline def parse(data: Buffer, format: CertificateFormat, options: String): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Certificate]
  inline def parse(data: Buffer, format: CertificateFormat, options: KeyParseOptions): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Certificate]
}
