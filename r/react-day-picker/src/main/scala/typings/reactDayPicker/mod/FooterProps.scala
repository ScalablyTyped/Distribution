package typings.reactDayPicker.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FooterProps extends StObject {
  
  /** The month where the footer is displayed. */
  var displayMonth: js.UndefOr[js.Date] = js.undefined
}
object FooterProps {
  
  inline def apply(): FooterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FooterProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FooterProps] (val x: Self) extends AnyVal {
    
    inline def setDisplayMonth(value: js.Date): Self = StObject.set(x, "displayMonth", value.asInstanceOf[js.Any])
    
    inline def setDisplayMonthUndefined: Self = StObject.set(x, "displayMonth", js.undefined)
  }
}
