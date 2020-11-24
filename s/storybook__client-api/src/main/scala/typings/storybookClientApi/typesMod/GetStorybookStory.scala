package typings.storybookClientApi.typesMod

import typings.storybookAddons.typesMod.Args
import typings.storybookAddons.typesMod.StoryContext
import typings.storybookAddons.typesMod.StoryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStorybookStory extends js.Object {
  
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
  implicit class GetStorybookStoryOps[Self <: GetStorybookStory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderFunction2(value: (/* a */ js.UndefOr[Args], /* p */ js.UndefOr[StoryContext]) => _): Self = this.set("render", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderFunction1(value: /* p */ js.UndefOr[StoryContext] => _): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRender(value: StoryFn[_]): Self = this.set("render", value.asInstanceOf[js.Any])
  }
}
