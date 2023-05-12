package typings.storybookRouter.mod

import typings.storybookRouter.anon.PartialLocation1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@storybook/router.@storybook/router.RouterData, 'location'> & @storybook/router.@storybook/router.Other */
trait RenderData extends StObject {
  
  var location: PartialLocation1
  
  var path: String
  
  var refId: js.UndefOr[String] = js.undefined
  
  var singleStory: js.UndefOr[Boolean] = js.undefined
  
  var storyId: js.UndefOr[String] = js.undefined
  
  var viewMode: js.UndefOr[String] = js.undefined
}
object RenderData {
  
  inline def apply(location: PartialLocation1, path: String): RenderData = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderData] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: PartialLocation1): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
    
    inline def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
    
    inline def setSingleStory(value: Boolean): Self = StObject.set(x, "singleStory", value.asInstanceOf[js.Any])
    
    inline def setSingleStoryUndefined: Self = StObject.set(x, "singleStory", js.undefined)
    
    inline def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
    
    inline def setStoryIdUndefined: Self = StObject.set(x, "storyId", js.undefined)
    
    inline def setViewMode(value: String): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    
    inline def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
  }
}
