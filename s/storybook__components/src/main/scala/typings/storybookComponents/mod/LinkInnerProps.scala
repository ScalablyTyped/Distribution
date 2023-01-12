package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkInnerProps extends StObject {
  
  var containsIcon: js.UndefOr[Boolean] = js.undefined
  
  var withArrow: js.UndefOr[Boolean] = js.undefined
}
object LinkInnerProps {
  
  inline def apply(): LinkInnerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkInnerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkInnerProps] (val x: Self) extends AnyVal {
    
    inline def setContainsIcon(value: Boolean): Self = StObject.set(x, "containsIcon", value.asInstanceOf[js.Any])
    
    inline def setContainsIconUndefined: Self = StObject.set(x, "containsIcon", js.undefined)
    
    inline def setWithArrow(value: Boolean): Self = StObject.set(x, "withArrow", value.asInstanceOf[js.Any])
    
    inline def setWithArrowUndefined: Self = StObject.set(x, "withArrow", js.undefined)
  }
}
