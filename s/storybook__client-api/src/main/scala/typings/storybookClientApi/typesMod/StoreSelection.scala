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
  
  @scala.inline
  def apply(storyId: StoryId, viewMode: ViewMode): StoreSelection = {
    val __obj = js.Dynamic.literal(storyId = storyId.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreSelection]
  }
  
  @scala.inline
  implicit class StoreSelectionMutableBuilder[Self <: StoreSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStoryId(value: StoryId): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMode(value: ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
  }
}
