package typings.storybookUi.anon

import typings.history.mod.LocationState
import typings.reachRouter.mod.WindowLocation
import typings.storybookApi.modulesStoriesMod.ViewMode
import typings.storybookApi.storiesMod.Group
import typings.storybookApi.storiesMod.Story
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
  var location: WindowLocation[LocationState]
  
  var path: String
  
  var story: Group | Story
  
  var viewMode: ViewMode & js.UndefOr[String]
}
object Location {
  
  inline def apply(
    location: WindowLocation[LocationState],
    path: String,
    story: Group | Story,
    viewMode: ViewMode & js.UndefOr[String]
  ): Location = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  
  extension [Self <: Location](x: Self) {
    
    inline def setLocation(value: WindowLocation[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setStory(value: Group | Story): Self = StObject.set(x, "story", value.asInstanceOf[js.Any])
    
    inline def setViewMode(value: ViewMode & js.UndefOr[String]): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
  }
}
