package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalWidgetProperties extends StObject {
  
  @JSName("$$widgetType")
  var DollarDollarwidgetType: js.UndefOr[String] = js.undefined
}
object AdditionalWidgetProperties {
  
  inline def apply(): AdditionalWidgetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalWidgetProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdditionalWidgetProperties] (val x: Self) extends AnyVal {
    
    inline def setDollarDollarwidgetType(value: String): Self = StObject.set(x, "$$widgetType", value.asInstanceOf[js.Any])
    
    inline def setDollarDollarwidgetTypeUndefined: Self = StObject.set(x, "$$widgetType", js.undefined)
  }
}
