package typings.reactBootstrapTypeahead.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighligherProps extends StObject {
  
  var children: ReactNode
  
  var search: js.UndefOr[String] = js.undefined
}
object HighligherProps {
  
  inline def apply(): HighligherProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighligherProps]
  }
  
  extension [Self <: HighligherProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
  }
}
