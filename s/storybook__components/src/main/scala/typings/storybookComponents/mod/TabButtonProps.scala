package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabButtonProps extends StObject {
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var textColor: js.UndefOr[String] = js.undefined
}
object TabButtonProps {
  
  inline def apply(): TabButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabButtonProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabButtonProps] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
  }
}
