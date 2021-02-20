package typings.reactFauxDom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait GetPropertyValue extends StObject {
    
    def getPropertyValue(name: String): String = js.native
  }
  object GetPropertyValue {
    
    @scala.inline
    def apply(getPropertyValue: String => String): GetPropertyValue = {
      val __obj = js.Dynamic.literal(getPropertyValue = js.Any.fromFunction1(getPropertyValue))
      __obj.asInstanceOf[GetPropertyValue]
    }
    
    @scala.inline
    implicit class GetPropertyValueMutableBuilder[Self <: GetPropertyValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetPropertyValue(value: String => String): Self = StObject.set(x, "getPropertyValue", js.Any.fromFunction1(value))
    }
  }
}
