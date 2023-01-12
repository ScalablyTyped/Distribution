package typings.reactWidgets.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateButton extends StObject {
  
  var dateButton: js.UndefOr[String] = js.undefined
}
object DateButton {
  
  inline def apply(): DateButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateButton] (val x: Self) extends AnyVal {
    
    inline def setDateButton(value: String): Self = StObject.set(x, "dateButton", value.asInstanceOf[js.Any])
    
    inline def setDateButtonUndefined: Self = StObject.set(x, "dateButton", js.undefined)
  }
}
