package typings.ramlDefinitionSystem

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("know-your-http-well", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("know-your-http-well", "headers")
  @js.native
  def headers: js.Array[Header] = js.native
  inline def headers_=(x: js.Array[Header]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headers")(x.asInstanceOf[js.Any])
  
  @JSImport("know-your-http-well", "methods")
  @js.native
  def methods: js.Array[Method] = js.native
  inline def methods_=(x: js.Array[Method]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("methods")(x.asInstanceOf[js.Any])
  
  @JSImport("know-your-http-well", "statusCodes")
  @js.native
  def statusCodes: js.Array[StatusCode] = js.native
  inline def statusCodes_=(x: js.Array[StatusCode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("statusCodes")(x.asInstanceOf[js.Any])
  
  trait Header extends StObject {
    
    var description: String
    
    var header: String
    
    var spec_href: String
    
    var spec_title: String
  }
  object Header {
    
    inline def apply(description: String, header: String, spec_href: String, spec_title: String): Header = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], spec_href = spec_href.asInstanceOf[js.Any], spec_title = spec_title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    extension [Self <: Header](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setSpec_href(value: String): Self = StObject.set(x, "spec_href", value.asInstanceOf[js.Any])
      
      inline def setSpec_title(value: String): Self = StObject.set(x, "spec_title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Method extends StObject {
    
    var cacheable: Boolean
    
    var description: String
    
    var idempotent: Boolean
    
    var method: String
    
    var safe: Boolean
    
    var spec_href: String
    
    var spec_title: String
  }
  object Method {
    
    inline def apply(
      cacheable: Boolean,
      description: String,
      idempotent: Boolean,
      method: String,
      safe: Boolean,
      spec_href: String,
      spec_title: String
    ): Method = {
      val __obj = js.Dynamic.literal(cacheable = cacheable.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], idempotent = idempotent.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], safe = safe.asInstanceOf[js.Any], spec_href = spec_href.asInstanceOf[js.Any], spec_title = spec_title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method]
    }
    
    extension [Self <: Method](x: Self) {
      
      inline def setCacheable(value: Boolean): Self = StObject.set(x, "cacheable", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setIdempotent(value: Boolean): Self = StObject.set(x, "idempotent", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
      
      inline def setSpec_href(value: String): Self = StObject.set(x, "spec_href", value.asInstanceOf[js.Any])
      
      inline def setSpec_title(value: String): Self = StObject.set(x, "spec_title", value.asInstanceOf[js.Any])
    }
  }
  
  trait StatusCode extends StObject {
    
    var code: String
    
    var description: String
    
    var phrase: String
    
    var spec_href: String
    
    var spec_title: String
  }
  object StatusCode {
    
    inline def apply(code: String, description: String, phrase: String, spec_href: String, spec_title: String): StatusCode = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], phrase = phrase.asInstanceOf[js.Any], spec_href = spec_href.asInstanceOf[js.Any], spec_title = spec_title.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatusCode]
    }
    
    extension [Self <: StatusCode](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setPhrase(value: String): Self = StObject.set(x, "phrase", value.asInstanceOf[js.Any])
      
      inline def setSpec_href(value: String): Self = StObject.set(x, "spec_href", value.asInstanceOf[js.Any])
      
      inline def setSpec_title(value: String): Self = StObject.set(x, "spec_title", value.asInstanceOf[js.Any])
    }
  }
}
