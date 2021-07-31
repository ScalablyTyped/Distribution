package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRenderedFeaturesParams extends StObject {
  
  var filter: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var layers: js.UndefOr[js.Array[String]] = js.undefined
}
object QueryRenderedFeaturesParams {
  
  @scala.inline
  def apply(): QueryRenderedFeaturesParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRenderedFeaturesParams]
  }
  
  @scala.inline
  implicit class QueryRenderedFeaturesParamsMutableBuilder[Self <: QueryRenderedFeaturesParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: js.Array[js.Any]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFilterVarargs(value: js.Any*): Self = StObject.set(x, "filter", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value :_*))
  }
}
