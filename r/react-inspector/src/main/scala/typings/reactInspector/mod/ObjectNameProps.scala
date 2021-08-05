package typings.reactInspector.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectNameProps extends StObject {
  
  var dimmed: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var styles: js.UndefOr[js.Object] = js.undefined
}
object ObjectNameProps {
  
  inline def apply(): ObjectNameProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectNameProps]
  }
  
  extension [Self <: ObjectNameProps](x: Self) {
    
    inline def setDimmed(value: Boolean): Self = StObject.set(x, "dimmed", value.asInstanceOf[js.Any])
    
    inline def setDimmedUndefined: Self = StObject.set(x, "dimmed", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStyles(value: js.Object): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
