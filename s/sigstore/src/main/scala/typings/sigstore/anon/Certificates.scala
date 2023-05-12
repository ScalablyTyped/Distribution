package typings.sigstore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Certificates extends StObject {
  
  var certificates: js.Array[String]
}
object Certificates {
  
  inline def apply(certificates: js.Array[String]): Certificates = {
    val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certificates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Certificates] (val x: Self) extends AnyVal {
    
    inline def setCertificates(value: js.Array[String]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesVarargs(value: String*): Self = StObject.set(x, "certificates", js.Array(value*))
  }
}
