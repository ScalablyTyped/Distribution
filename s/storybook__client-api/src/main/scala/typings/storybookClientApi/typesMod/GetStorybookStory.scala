package typings.storybookClientApi.typesMod

import typings.storybookAddons.typesMod.Args
import typings.storybookAddons.typesMod.StoryContext
import typings.storybookAddons.typesMod.StoryFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStorybookStory extends StObject {
  
  var name: String = js.native
  
  var render: StoryFn[_] = js.native
}
object GetStorybookStory {
  
  @scala.inline
  def apply(name: String, render: StoryFn[_]): GetStorybookStory = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStorybookStory]
  }
  
  @scala.inline
  implicit class GetStorybookStoryMutableBuilder[Self <: GetStorybookStory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRender(value: StoryFn[_]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderFunction1(value: /* p */ js.UndefOr[StoryContext] => _): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderFunction2(value: (/* a */ js.UndefOr[Args], /* p */ js.UndefOr[StoryContext]) => _): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
  }
}
