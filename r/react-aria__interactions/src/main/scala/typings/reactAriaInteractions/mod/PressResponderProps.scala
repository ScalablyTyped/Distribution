package typings.reactAriaInteractions.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PressResponderProps
  extends StObject
     with PressProps {
  
  var children: ReactNode
}
object PressResponderProps {
  
  inline def apply(): PressResponderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PressResponderProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PressResponderProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
