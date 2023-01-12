package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRenderedFeaturesParams extends StObject {
  
  var filter: js.UndefOr[js.Array[Any]] = js.undefined
  
  var layers: js.UndefOr[js.Array[String]] = js.undefined
}
object QueryRenderedFeaturesParams {
  
  inline def apply(): QueryRenderedFeaturesParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRenderedFeaturesParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryRenderedFeaturesParams] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: js.Array[Any]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: Any*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value*))
  }
}
