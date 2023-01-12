package typings.sshpk.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateCreateOptions extends StObject {
  
  var ca: js.UndefOr[Boolean] = js.undefined
  
  var lifetime: js.UndefOr[Double] = js.undefined
  
  var purposes: js.UndefOr[js.Array[String]] = js.undefined
  
  var serial: js.UndefOr[Buffer] = js.undefined
  
  var validFrom: js.UndefOr[js.Date] = js.undefined
  
  var validUntil: js.UndefOr[js.Date] = js.undefined
}
object CertificateCreateOptions {
  
  inline def apply(): CertificateCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateCreateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertificateCreateOptions] (val x: Self) extends AnyVal {
    
    inline def setCa(value: Boolean): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
    
    inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
    
    inline def setLifetime(value: Double): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
    
    inline def setLifetimeUndefined: Self = StObject.set(x, "lifetime", js.undefined)
    
    inline def setPurposes(value: js.Array[String]): Self = StObject.set(x, "purposes", value.asInstanceOf[js.Any])
    
    inline def setPurposesUndefined: Self = StObject.set(x, "purposes", js.undefined)
    
    inline def setPurposesVarargs(value: String*): Self = StObject.set(x, "purposes", js.Array(value*))
    
    inline def setSerial(value: Buffer): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    
    inline def setSerialUndefined: Self = StObject.set(x, "serial", js.undefined)
    
    inline def setValidFrom(value: js.Date): Self = StObject.set(x, "validFrom", value.asInstanceOf[js.Any])
    
    inline def setValidFromUndefined: Self = StObject.set(x, "validFrom", js.undefined)
    
    inline def setValidUntil(value: js.Date): Self = StObject.set(x, "validUntil", value.asInstanceOf[js.Any])
    
    inline def setValidUntilUndefined: Self = StObject.set(x, "validUntil", js.undefined)
  }
}
