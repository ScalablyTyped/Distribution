package typings.psl

import typings.psl.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("psl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[Null]
  inline def get(domain: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(domain.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def isValid(domain: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(domain.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parse(domain: String): ParsedDomain | ParseError = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(domain.asInstanceOf[js.Any]).asInstanceOf[ParsedDomain | ParseError]
  
  trait ParseError extends StObject {
    
    var error: Code
    
    var input: String
  }
  object ParseError {
    
    inline def apply(error: Code, input: String): ParseError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseError] (val x: Self) extends AnyVal {
      
      inline def setError(value: Code): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParsedDomain extends StObject {
    
    var domain: String | Null
    
    var error: Unit
    
    var input: String
    
    var listed: Boolean
    
    var sld: String | Null
    
    var subdomain: String | Null
    
    var tld: String | Null
  }
  object ParsedDomain {
    
    inline def apply(error: Unit, input: String, listed: Boolean): ParsedDomain = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], listed = listed.asInstanceOf[js.Any], domain = null, sld = null, subdomain = null, tld = null)
      __obj.asInstanceOf[ParsedDomain]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParsedDomain] (val x: Self) extends AnyVal {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainNull: Self = StObject.set(x, "domain", null)
      
      inline def setError(value: Unit): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setListed(value: Boolean): Self = StObject.set(x, "listed", value.asInstanceOf[js.Any])
      
      inline def setSld(value: String): Self = StObject.set(x, "sld", value.asInstanceOf[js.Any])
      
      inline def setSldNull: Self = StObject.set(x, "sld", null)
      
      inline def setSubdomain(value: String): Self = StObject.set(x, "subdomain", value.asInstanceOf[js.Any])
      
      inline def setSubdomainNull: Self = StObject.set(x, "subdomain", null)
      
      inline def setTld(value: String): Self = StObject.set(x, "tld", value.asInstanceOf[js.Any])
      
      inline def setTldNull: Self = StObject.set(x, "tld", null)
    }
  }
}
