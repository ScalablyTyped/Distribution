package typings.storybookClientApi.typesMod

import typings.storybookAddons.typesMod.Args
import typings.storybookAddons.typesMod.StoryContext
import typings.storybookAddons.typesMod.StoryFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStorybookStory extends StObject {
  
  var name: String
  
  var render: StoryFn[js.Any]
}
object GetStorybookStory {
  
  @scala.inline
  def apply(name: String, render: StoryFn[js.Any]): GetStorybookStory = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStorybookStory]
  }
  
  @scala.inline
  implicit class GetStorybookStoryMutableBuilder[Self <: GetStorybookStory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRender(value: StoryFn[js.Any]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderFunction1(value: /* p */ js.UndefOr[StoryContext] => js.Any): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderFunction2(value: (/* a */ js.UndefOr[Args], /* p */ js.UndefOr[StoryContext]) => js.Any): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
  }
}
