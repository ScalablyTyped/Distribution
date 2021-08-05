package typings.restangular

import typings.angular.mod.IRequestShortcutConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Element extends StObject {
    
    var element: js.Any
    
    var headers: js.Any
    
    var httpConfig: IRequestShortcutConfig
    
    var params: js.Any
  }
  object Element {
    
    inline def apply(element: js.Any, headers: js.Any, httpConfig: IRequestShortcutConfig, params: js.Any): Element = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], httpConfig = httpConfig.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    extension [Self <: Element](x: Self) {
      
      inline def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHttpConfig(value: IRequestShortcutConfig): Self = StObject.set(x, "httpConfig", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  trait Method extends StObject {
    
    var method: String
    
    var params: js.Any
    
    var url: String
  }
  object Method {
    
    inline def apply(method: String, params: js.Any, url: String): Method = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method]
    }
    
    extension [Self <: Method](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
