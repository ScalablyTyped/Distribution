package typings.reactSketchapp.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentProps extends StObject {
  
  var children: js.UndefOr[js.Array[ReactElement] | ReactElement] = js.undefined
}
object DocumentProps {
  
  inline def apply(): DocumentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentProps]
  }
  
  extension [Self <: DocumentProps](x: Self) {
    
    inline def setChildren(value: js.Array[ReactElement] | ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
  }
}
