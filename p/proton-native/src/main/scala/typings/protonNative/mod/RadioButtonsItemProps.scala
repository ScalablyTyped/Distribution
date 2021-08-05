package typings.protonNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadioButtonsItemProps extends StObject {
  
  var children: String
}
object RadioButtonsItemProps {
  
  inline def apply(children: String): RadioButtonsItemProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioButtonsItemProps]
  }
  
  extension [Self <: RadioButtonsItemProps](x: Self) {
    
    inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
