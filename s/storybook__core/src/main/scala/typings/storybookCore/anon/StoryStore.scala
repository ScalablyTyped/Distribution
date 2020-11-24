package typings.storybookCore.anon

import typings.storybookClientApi.typesMod.RenderContextWithoutStoryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryStore extends js.Object {
  
  var context: RenderContextWithoutStoryContext = js.native
  
  var storyStore: typings.storybookClientApi.mod.StoryStore = js.native
}
object StoryStore {
  
  @scala.inline
  def apply(context: RenderContextWithoutStoryContext, storyStore: typings.storybookClientApi.mod.StoryStore): StoryStore = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], storyStore = storyStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryStore]
  }
  
  @scala.inline
  implicit class StoryStoreOps[Self <: StoryStore] (val x: Self) extends AnyVal {
    
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
    def setContext(value: RenderContextWithoutStoryContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoryStore(value: typings.storybookClientApi.mod.StoryStore): Self = this.set("storyStore", value.asInstanceOf[js.Any])
  }
}
