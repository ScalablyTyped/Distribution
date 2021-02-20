package typings.psl

import typings.psl.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("psl", "get")
  @js.native
  def get(): Null = js.native
  @JSImport("psl", "get")
  @js.native
  def get(domain: String): String | Null = js.native
  
  @JSImport("psl", "isValid")
  @js.native
  def isValid(domain: String): Boolean = js.native
  
  @JSImport("psl", "parse")
  @js.native
  def parse(domain: String): ParsedDomain | ParseError = js.native
  
  @js.native
  trait ParseError extends StObject {
    
    var error: Code = js.native
    
    var input: String = js.native
  }
  object ParseError {
    
    @scala.inline
    def apply(error: Code, input: String): ParseError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseError]
    }
    
    @scala.inline
    implicit class ParseErrorMutableBuilder[Self <: ParseError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Code): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParsedDomain extends StObject {
    
    var domain: String | Null = js.native
    
    var error: js.UndefOr[scala.Nothing] = js.native
    
    var input: String = js.native
    
    var listed: Boolean = js.native
    
    var sld: String | Null = js.native
    
    var subdomain: String | Null = js.native
    
    var tld: String | Null = js.native
  }
  object ParsedDomain {
    
    @scala.inline
    def apply(input: String, listed: Boolean): ParsedDomain = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], listed = listed.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedDomain]
    }
    
    @scala.inline
    implicit class ParsedDomainMutableBuilder[Self <: ParsedDomain] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNull: Self = StObject.set(x, "domain", null)
      
      @scala.inline
      def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListed(value: Boolean): Self = StObject.set(x, "listed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSld(value: String): Self = StObject.set(x, "sld", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSldNull: Self = StObject.set(x, "sld", null)
      
      @scala.inline
      def setSubdomain(value: String): Self = StObject.set(x, "subdomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubdomainNull: Self = StObject.set(x, "subdomain", null)
      
      @scala.inline
      def setTld(value: String): Self = StObject.set(x, "tld", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTldNull: Self = StObject.set(x, "tld", null)
    }
  }
}
