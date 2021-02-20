package typings.storybookClientApi.typesMod

import typings.storybookAddons.typesMod.ViewMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreSelectionSpecifier extends StObject {
  
  var storySpecifier: StorySpecifier = js.native
  
  var viewMode: ViewMode = js.native
}
object StoreSelectionSpecifier {
  
  @scala.inline
  def apply(storySpecifier: StorySpecifier, viewMode: ViewMode): StoreSelectionSpecifier = {
    val __obj = js.Dynamic.literal(storySpecifier = storySpecifier.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreSelectionSpecifier]
  }
  
  @scala.inline
  implicit class StoreSelectionSpecifierMutableBuilder[Self <: StoreSelectionSpecifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStorySpecifier(value: StorySpecifier): Self = StObject.set(x, "storySpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMode(value: ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
  }
}
