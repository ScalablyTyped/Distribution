package typings.reactSketchapp.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageProps extends StObject {
  
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object PageProps {
  
  inline def apply(): PageProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageProps]
  }
  
  extension [Self <: PageProps](x: Self) {
    
    inline def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
