package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait json extends StObject {
  
  var conditions: js.UndefOr[js.Object] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String | Double | Boolean] = js.undefined
}
object json {
  
  @scala.inline
  def apply(): json = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[json]
  }
  
  @scala.inline
  implicit class jsonMutableBuilder[Self <: json] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditions(value: js.Object): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
