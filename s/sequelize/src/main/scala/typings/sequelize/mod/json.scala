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
  
  inline def apply(): json = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[json]
  }
  
  extension [Self <: json](x: Self) {
    
    inline def setConditions(value: js.Object): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setValue(value: String | Double | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
