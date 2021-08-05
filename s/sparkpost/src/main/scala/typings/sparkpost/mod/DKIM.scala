package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DKIM extends StObject {
  
  /** Header fields to be included in the DKIM signature. This field is currently ignored. */
  var headers: js.UndefOr[String] = js.undefined
  
  /** DKIM private key. */
  var `private`: js.UndefOr[String] = js.undefined
  
  /** DKIM public key. */
  var public: String
  
  /** DomainKey selector. */
  var selector: String
  
  /** Signing Domain Identifier (SDID). SparkPost Enterprise API only. */
  var signing_domain: js.UndefOr[String] = js.undefined
}
object DKIM {
  
  inline def apply(public: String, selector: String): DKIM = {
    val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DKIM]
  }
  
  extension [Self <: DKIM](x: Self) {
    
    inline def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setPrivate(value: String): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    inline def setPublic(value: String): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSigning_domain(value: String): Self = StObject.set(x, "signing_domain", value.asInstanceOf[js.Any])
    
    inline def setSigning_domainUndefined: Self = StObject.set(x, "signing_domain", js.undefined)
  }
}
