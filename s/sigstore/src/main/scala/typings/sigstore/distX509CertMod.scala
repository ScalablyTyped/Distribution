package typings.sigstore

import typings.node.bufferMod.global.Buffer
import typings.sigstore.distX509Asn1ObjMod.ASN1Obj
import typings.sigstore.distX509ExtMod.x509AuthorityKeyIDExtension
import typings.sigstore.distX509ExtMod.x509BasicConstraintsExtension
import typings.sigstore.distX509ExtMod.x509Extension
import typings.sigstore.distX509ExtMod.x509KeyUsageExtension
import typings.sigstore.distX509ExtMod.x509SCTExtension
import typings.sigstore.distX509ExtMod.x509SubjectAlternativeNameExtension
import typings.sigstore.distX509ExtMod.x509SubjectKeyIDExtension
import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreTrustrootMod`.TransparencyLogInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distX509CertMod {
  
  @JSImport("sigstore/dist/x509/cert", "x509Certificate")
  @js.native
  open class x509Certificate protected () extends StObject {
    def this(asn1: ASN1Obj) = this()
    
    /* private */ var checkRecognizedExtensions: Any = js.native
    
    /* private */ @JSName("clone")
    var clone_Fx509Certificate: Any = js.native
    
    def equals(other: x509Certificate): Boolean = js.native
    
    def extAuthorityKeyID: js.UndefOr[x509AuthorityKeyIDExtension] = js.native
    
    def extBasicConstraints: js.UndefOr[x509BasicConstraintsExtension] = js.native
    
    def extKeyUsage: js.UndefOr[x509KeyUsageExtension] = js.native
    
    def extSCT: js.UndefOr[x509SCTExtension] = js.native
    
    def extSubjectAltName: js.UndefOr[x509SubjectAlternativeNameExtension] = js.native
    
    def extSubjectKeyID: js.UndefOr[x509SubjectKeyIDExtension] = js.native
    
    def `extension`(oid: String): js.UndefOr[x509Extension] = js.native
    
    def extensions: js.Array[ASN1Obj] = js.native
    
    /* private */ def extensionsObj: Any = js.native
    
    /* private */ var findExtension: Any = js.native
    
    def isCA: Boolean = js.native
    
    def issuer: Buffer = js.native
    
    /* private */ def issuerObj: Any = js.native
    
    def notAfter: js.Date = js.native
    
    def notBefore: js.Date = js.native
    
    def publicKey: Buffer = js.native
    
    var root: ASN1Obj = js.native
    
    def signatureAlgorithm: String = js.native
    
    /* private */ def signatureAlgorithmObj: Any = js.native
    
    def signatureValue: Buffer = js.native
    
    /* private */ def signatureValueObj: Any = js.native
    
    def subject: Buffer = js.native
    
    /* private */ def subjectObj: Any = js.native
    
    /* private */ def subjectPublicKeyInfoObj: Any = js.native
    
    def tbsCertificate: ASN1Obj = js.native
    
    /* private */ def tbsCertificateObj: Any = js.native
    
    def validForDate(date: js.Date): Boolean = js.native
    
    /* private */ def validityObj: Any = js.native
    
    def verify(): Boolean = js.native
    def verify(issuerCertificate: x509Certificate): Boolean = js.native
    
    def verifySCTs(issuer: x509Certificate, logs: js.Array[TransparencyLogInstance]): js.Array[SCTVerificationResult] = js.native
    
    def version: String = js.native
    
    /* private */ def versionObj: Any = js.native
  }
  /* static members */
  object x509Certificate {
    
    @JSImport("sigstore/dist/x509/cert", "x509Certificate")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(cert: String): x509Certificate = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(cert.asInstanceOf[js.Any]).asInstanceOf[x509Certificate]
    inline def parse(cert: Buffer): x509Certificate = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(cert.asInstanceOf[js.Any]).asInstanceOf[x509Certificate]
  }
  
  trait SCTVerificationResult extends StObject {
    
    var logID: Buffer
    
    var verified: Boolean
  }
  object SCTVerificationResult {
    
    inline def apply(logID: Buffer, verified: Boolean): SCTVerificationResult = {
      val __obj = js.Dynamic.literal(logID = logID.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
      __obj.asInstanceOf[SCTVerificationResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SCTVerificationResult] (val x: Self) extends AnyVal {
      
      inline def setLogID(value: Buffer): Self = StObject.set(x, "logID", value.asInstanceOf[js.Any])
      
      inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    }
  }
}
