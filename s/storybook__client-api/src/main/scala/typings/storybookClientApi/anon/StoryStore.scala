package typings.storybookClientApi.anon

import typings.storybookClientApi.storyStoreMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryStore extends js.Object {
  
  var storyStore: default = js.native
}
object StoryStore {
  
  @scala.inline
  def apply(storyStore: default): StoryStore = {
    val __obj = js.Dynamic.literal(storyStore = storyStore.asInstanceOf[js.Any])
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
    def setStoryStore(value: default): Self = this.set("storyStore", value.asInstanceOf[js.Any])
  }
}
