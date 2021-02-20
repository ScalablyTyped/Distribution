package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityDetails extends StObject {
  
  /** A string with the name of issuer of the certificate. (e.g. "Let's Encrypt Authority X3"). */
  def issuer(): String = js.native
  
  /** String with the security protocol (e.g. TLS 1.2). */
  def protocol(): String = js.native
  
  /** Name of the subject to which the certificate was issued to (e.g. "www.example.com"). */
  def subjectName(): String = js.native
  
  /** Timestamp stating the start of validity of the certificate. */
  def validFrom(): Double = js.native
  
  /** Timestamp stating the end of validity of the certificate. */
  def validTo(): Double = js.native
}
object SecurityDetails {
  
  @scala.inline
  def apply(
    issuer: () => String,
    protocol: () => String,
    subjectName: () => String,
    validFrom: () => Double,
    validTo: () => Double
  ): SecurityDetails = {
    val __obj = js.Dynamic.literal(issuer = js.Any.fromFunction0(issuer), protocol = js.Any.fromFunction0(protocol), subjectName = js.Any.fromFunction0(subjectName), validFrom = js.Any.fromFunction0(validFrom), validTo = js.Any.fromFunction0(validTo))
    __obj.asInstanceOf[SecurityDetails]
  }
  
  @scala.inline
  implicit class SecurityDetailsMutableBuilder[Self <: SecurityDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIssuer(value: () => String): Self = StObject.set(x, "issuer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProtocol(value: () => String): Self = StObject.set(x, "protocol", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSubjectName(value: () => String): Self = StObject.set(x, "subjectName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValidFrom(value: () => Double): Self = StObject.set(x, "validFrom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValidTo(value: () => Double): Self = StObject.set(x, "validTo", js.Any.fromFunction0(value))
  }
}
