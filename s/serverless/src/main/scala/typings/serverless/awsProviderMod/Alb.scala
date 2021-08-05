package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alb extends StObject {
  
  var authorizers: js.UndefOr[Authorizers] = js.undefined
  
  var targetGroupPrefix: js.UndefOr[String] = js.undefined
}
object Alb {
  
  inline def apply(): Alb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alb]
  }
  
  extension [Self <: Alb](x: Self) {
    
    inline def setAuthorizers(value: Authorizers): Self = StObject.set(x, "authorizers", value.asInstanceOf[js.Any])
    
    inline def setAuthorizersUndefined: Self = StObject.set(x, "authorizers", js.undefined)
    
    inline def setTargetGroupPrefix(value: String): Self = StObject.set(x, "targetGroupPrefix", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupPrefixUndefined: Self = StObject.set(x, "targetGroupPrefix", js.undefined)
  }
}
