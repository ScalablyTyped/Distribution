package typings.storybookUi.anon

import typings.storybookApi.storiesMod.Group
import typings.storybookApi.storiesMod.Story
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Location extends StObject {
  
  var location: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['location'] */ js.Any = js.native
  
  var path: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['path'] */ js.Any = js.native
  
  var story: Group | Story = js.native
  
  var viewMode: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any = js.native
}
object Location {
  
  @scala.inline
  def apply(
    location: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['location'] */ js.Any,
    path: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['path'] */ js.Any,
    story: Group | Story,
    viewMode: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any
  ): Location = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['location'] */ js.Any
    ): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['path'] */ js.Any
    ): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory(value: Group | Story): Self = StObject.set(x, "story", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMode(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any
    ): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
  }
}
