package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path extends StObject {
  
  var params: js.UndefOr[NavigationParams] = js.undefined
  
  var path: String
}
object Path {
  
  inline def apply(path: String): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  
  extension [Self <: Path](x: Self) {
    
    inline def setParams(value: NavigationParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
