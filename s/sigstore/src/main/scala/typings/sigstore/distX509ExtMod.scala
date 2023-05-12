package typings.sigstore

import typings.node.bufferMod.global.Buffer
import typings.sigstore.distX509Asn1ObjMod.ASN1Obj
import typings.sigstore.distX509SctMod.SignedCertificateTimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distX509ExtMod {
  
  @JSImport("sigstore/dist/x509/ext", "x509AuthorityKeyIDExtension")
  @js.native
  open class x509AuthorityKeyIDExtension protected () extends x509Extension {
    def this(asn1: ASN1Obj) = this()
    
    /* private */ var findSequenceMember: Any = js.native
    
    def keyIdentifier: js.UndefOr[Buffer] = js.native
    
    /* private */ def sequence: Any = js.native
  }
  
  @JSImport("sigstore/dist/x509/ext", "x509BasicConstraintsExtension")
  @js.native
  open class x509BasicConstraintsExtension protected () extends x509Extension {
    def this(asn1: ASN1Obj) = this()
    
    def isCA: Boolean = js.native
    
    def pathLenConstraint: js.UndefOr[js.BigInt] = js.native
    
    /* private */ def sequence: Any = js.native
  }
  
  @JSImport("sigstore/dist/x509/ext", "x509Extension")
  @js.native
  open class x509Extension protected () extends StObject {
    def this(asn1: ASN1Obj) = this()
    
    def critical: Boolean = js.native
    
    /* protected */ def extnValueObj: ASN1Obj = js.native
    
    def oid: String = js.native
    
    /* protected */ var root: ASN1Obj = js.native
    
    def value: Buffer = js.native
    
    def valueObj: ASN1Obj = js.native
  }
  
  @JSImport("sigstore/dist/x509/ext", "x509KeyUsageExtension")
  @js.native
  open class x509KeyUsageExtension protected () extends x509Extension {
    def this(asn1: ASN1Obj) = this()
    
    /* private */ def bitString: Any = js.native
    
    def crlSign: Boolean = js.native
    
    def digitalSignature: Boolean = js.native
    
    def keyCertSign: Boolean = js.native
  }
  
  @JSImport("sigstore/dist/x509/ext", "x509SCTExtension")
  @js.native
  open class x509SCTExtension protected () extends x509Extension {
    def this(asn1: ASN1Obj) = this()
    
    def signedCertificateTimestamps: js.Array[SignedCertificateTimestamp] = js.native
  }
  
  @JSImport("sigstore/dist/x509/ext", "x509SubjectAlternativeNameExtension")
  @js.native
  open class x509SubjectAlternativeNameExtension protected () extends x509Extension {
    def this(asn1: ASN1Obj) = this()
    
    /* private */ var findGeneralName: Any = js.native
    
    /* private */ def generalNames: Any = js.native
    
    def otherName(oid: String): js.UndefOr[String] = js.native
    
    def rfc822Name: js.UndefOr[String] = js.native
    
    def uri: js.UndefOr[String] = js.native
  }
  
  @JSImport("sigstore/dist/x509/ext", "x509SubjectKeyIDExtension")
  @js.native
  open class x509SubjectKeyIDExtension protected () extends x509Extension {
    def this(asn1: ASN1Obj) = this()
    
    def keyIdentifier: Buffer = js.native
  }
}
