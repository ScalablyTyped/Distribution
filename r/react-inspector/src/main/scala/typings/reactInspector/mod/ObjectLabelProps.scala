package typings.reactInspector.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectLabelProps extends StObject {
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var isNonenumerable: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object ObjectLabelProps {
  
  inline def apply(): ObjectLabelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectLabelProps]
  }
  
  extension [Self <: ObjectLabelProps](x: Self) {
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setIsNonenumerable(value: Boolean): Self = StObject.set(x, "isNonenumerable", value.asInstanceOf[js.Any])
    
    inline def setIsNonenumerableUndefined: Self = StObject.set(x, "isNonenumerable", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
