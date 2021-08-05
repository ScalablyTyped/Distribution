package typings.storybookApi.anon

import typings.storybookApi.urlMod.QueryParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path extends StObject {
  
  var path: String
  
  var queryParams: QueryParams
  
  var storyId: js.UndefOr[String] = js.undefined
  
  var url: String
  
  var viewMode: js.UndefOr[String] = js.undefined
}
object Path {
  
  inline def apply(path: String, queryParams: QueryParams, url: String): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], queryParams = queryParams.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  
  extension [Self <: Path](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQueryParams(value: QueryParams): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    inline def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
    
    inline def setStoryIdUndefined: Self = StObject.set(x, "storyId", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setViewMode(value: String): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    
    inline def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
  }
}
