package typings.sshpk.mod

import typings.node.bufferMod.global.Buffer
import typings.sshpk.anon.Openssh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// == certificate.js == //
trait CertificateOptions extends StObject {
  
  var issuer: Identity
  
  var issuerKey: js.UndefOr[Key] = js.undefined
  
  var purposes: js.UndefOr[js.Array[String]] = js.undefined
  
  var serial: Buffer
  
  var signatures: Openssh
  
  var subjectKey: Key
  
  var subjects: js.Array[Identity]
  
  var validFrom: js.Date
  
  var validUntil: js.Date
}
object CertificateOptions {
  
  inline def apply(
    issuer: Identity,
    serial: Buffer,
    signatures: Openssh,
    subjectKey: Key,
    subjects: js.Array[Identity],
    validFrom: js.Date,
    validUntil: js.Date
  ): CertificateOptions = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any], subjectKey = subjectKey.asInstanceOf[js.Any], subjects = subjects.asInstanceOf[js.Any], validFrom = validFrom.asInstanceOf[js.Any], validUntil = validUntil.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateOptions]
  }
  
  extension [Self <: CertificateOptions](x: Self) {
    
    inline def setIssuer(value: Identity): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerKey(value: Key): Self = StObject.set(x, "issuerKey", value.asInstanceOf[js.Any])
    
    inline def setIssuerKeyUndefined: Self = StObject.set(x, "issuerKey", js.undefined)
    
    inline def setPurposes(value: js.Array[String]): Self = StObject.set(x, "purposes", value.asInstanceOf[js.Any])
    
    inline def setPurposesUndefined: Self = StObject.set(x, "purposes", js.undefined)
    
    inline def setPurposesVarargs(value: String*): Self = StObject.set(x, "purposes", js.Array(value*))
    
    inline def setSerial(value: Buffer): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    
    inline def setSignatures(value: Openssh): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    inline def setSubjectKey(value: Key): Self = StObject.set(x, "subjectKey", value.asInstanceOf[js.Any])
    
    inline def setSubjects(value: js.Array[Identity]): Self = StObject.set(x, "subjects", value.asInstanceOf[js.Any])
    
    inline def setSubjectsVarargs(value: Identity*): Self = StObject.set(x, "subjects", js.Array(value*))
    
    inline def setValidFrom(value: js.Date): Self = StObject.set(x, "validFrom", value.asInstanceOf[js.Any])
    
    inline def setValidUntil(value: js.Date): Self = StObject.set(x, "validUntil", value.asInstanceOf[js.Any])
  }
}
