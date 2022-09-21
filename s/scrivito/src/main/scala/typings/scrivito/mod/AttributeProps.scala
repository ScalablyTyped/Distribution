package typings.scrivito.mod

import typings.scrivito.anon.Toolbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeProps extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[Toolbar] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var values: js.UndefOr[js.Array[AttributeValue]] = js.undefined
}
object AttributeProps {
  
  inline def apply(): AttributeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeProps]
  }
  
  extension [Self <: AttributeProps](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setOptions(value: Toolbar): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setValues(value: js.Array[AttributeValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: AttributeValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
