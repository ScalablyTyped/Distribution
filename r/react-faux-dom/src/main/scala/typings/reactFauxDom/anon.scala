package typings.reactFauxDom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait GetPropertyValue extends StObject {
    
    def getPropertyValue(name: String): String
  }
  object GetPropertyValue {
    
    inline def apply(getPropertyValue: String => String): GetPropertyValue = {
      val __obj = js.Dynamic.literal(getPropertyValue = js.Any.fromFunction1(getPropertyValue))
      __obj.asInstanceOf[GetPropertyValue]
    }
    
    extension [Self <: GetPropertyValue](x: Self) {
      
      inline def setGetPropertyValue(value: String => String): Self = StObject.set(x, "getPropertyValue", js.Any.fromFunction1(value))
    }
  }
}
