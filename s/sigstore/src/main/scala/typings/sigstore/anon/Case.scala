package typings.sigstore.anon

import typings.sigstore.sigstoreStrings.x509CertificateChain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Case extends StObject {
  
  @JSName("$case")
  var $case: x509CertificateChain
}
object Case {
  
  inline def apply(): Case = {
    val __obj = js.Dynamic.literal($case = "x509CertificateChain")
    __obj.asInstanceOf[Case]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Case] (val x: Self) extends AnyVal {
    
    inline def set$case(value: x509CertificateChain): Self = StObject.set(x, "$case", value.asInstanceOf[js.Any])
  }
}
