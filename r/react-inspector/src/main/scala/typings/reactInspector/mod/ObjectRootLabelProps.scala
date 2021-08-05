package typings.reactInspector.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectRootLabelProps extends StObject {
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object ObjectRootLabelProps {
  
  inline def apply(): ObjectRootLabelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectRootLabelProps]
  }
  
  extension [Self <: ObjectRootLabelProps](x: Self) {
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
