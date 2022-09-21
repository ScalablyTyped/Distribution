package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleData extends StObject {
  
  var style: js.UndefOr[String] = js.undefined
  
  var stylePaths: js.UndefOr[js.Array[String]] = js.undefined
}
object StyleData {
  
  inline def apply(): StyleData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleData]
  }
  
  extension [Self <: StyleData](x: Self) {
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStylePaths(value: js.Array[String]): Self = StObject.set(x, "stylePaths", value.asInstanceOf[js.Any])
    
    inline def setStylePathsUndefined: Self = StObject.set(x, "stylePaths", js.undefined)
    
    inline def setStylePathsVarargs(value: String*): Self = StObject.set(x, "stylePaths", js.Array(value*))
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
