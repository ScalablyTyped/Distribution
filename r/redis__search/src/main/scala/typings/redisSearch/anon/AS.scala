package typings.redisSearch.anon

import typings.redisSearch.distCommandsMod.PropertyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AS extends StObject {
  
  var AS: js.UndefOr[String] = js.undefined
  
  var identifier: PropertyName
}
object AS {
  
  inline def apply(identifier: PropertyName): AS = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AS] (val x: Self) extends AnyVal {
    
    inline def setAS(value: String): Self = StObject.set(x, "AS", value.asInstanceOf[js.Any])
    
    inline def setASUndefined: Self = StObject.set(x, "AS", js.undefined)
    
    inline def setIdentifier(value: PropertyName): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
  }
}
