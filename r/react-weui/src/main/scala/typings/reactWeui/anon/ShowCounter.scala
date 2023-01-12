package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowCounter extends StObject {
  
  var defaultValue: Any
  
  var showCounter: Boolean
}
object ShowCounter {
  
  inline def apply(defaultValue: Any, showCounter: Boolean): ShowCounter = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], showCounter = showCounter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowCounter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShowCounter] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setShowCounter(value: Boolean): Self = StObject.set(x, "showCounter", value.asInstanceOf[js.Any])
  }
}
