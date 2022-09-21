package typings.propertyExpr

import org.scalablytyped.runtime.Instantiable1
import typings.propertyExpr.mod.Cache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ContentSecurityPolicy extends StObject {
    
    var contentSecurityPolicy: Boolean
  }
  object ContentSecurityPolicy {
    
    inline def apply(contentSecurityPolicy: Boolean): ContentSecurityPolicy = {
      val __obj = js.Dynamic.literal(contentSecurityPolicy = contentSecurityPolicy.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentSecurityPolicy]
    }
    
    extension [Self <: ContentSecurityPolicy](x: Self) {
      
      inline def setContentSecurityPolicy(value: Boolean): Self = StObject.set(x, "contentSecurityPolicy", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* maxSize */ Double, Cache]
}
