package typings.rcMenu.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var defaultActiveFirst: js.UndefOr[Boolean] = js.undefined
  
  var eventKey: js.UndefOr[typings.react.mod.Key] = js.undefined
}
object Children {
  
  inline def apply(): Children = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Children]
  }
  
  extension [Self <: Children](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDefaultActiveFirst(value: Boolean): Self = StObject.set(x, "defaultActiveFirst", value.asInstanceOf[js.Any])
    
    inline def setDefaultActiveFirstUndefined: Self = StObject.set(x, "defaultActiveFirst", js.undefined)
    
    inline def setEventKey(value: typings.react.mod.Key): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
    
    inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
  }
}
