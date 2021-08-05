package typings.storybookClientApi.typesMod

import typings.storybookAddons.typesMod.StoryId
import typings.storybookAddons.typesMod.ViewMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreSelection extends StObject {
  
  var storyId: StoryId
  
  var viewMode: ViewMode
}
object StoreSelection {
  
  inline def apply(storyId: StoryId, viewMode: ViewMode): StoreSelection = {
    val __obj = js.Dynamic.literal(storyId = storyId.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreSelection]
  }
  
  extension [Self <: StoreSelection](x: Self) {
    
    inline def setStoryId(value: StoryId): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
    
    inline def setViewMode(value: ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
  }
}
