package typings.storybookApi.modulesStoriesMod

import typings.std.Error
import typings.storybookApi.storiesMod.StoriesHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubState extends js.Object {
  
  var storiesConfigured: Boolean = js.native
  
  var storiesFailed: js.UndefOr[Error] = js.native
  
  var storiesHash: StoriesHash = js.native
  
  var storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ js.Any = js.native
  
  var viewMode: ViewMode = js.native
}
object SubState {
  
  @scala.inline
  def apply(
    storiesConfigured: Boolean,
    storiesHash: StoriesHash,
    storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ js.Any
  ): SubState = {
    val __obj = js.Dynamic.literal(storiesConfigured = storiesConfigured.asInstanceOf[js.Any], storiesHash = storiesHash.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubState]
  }
  
  @scala.inline
  implicit class SubStateOps[Self <: SubState] (val x: Self) extends AnyVal {
    
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
    def setStoriesConfigured(value: Boolean): Self = this.set("storiesConfigured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoriesHash(value: StoriesHash): Self = this.set("storiesHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoryId(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ js.Any
    ): Self = this.set("storyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoriesFailed(value: Error): Self = this.set("storiesFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoriesFailed: Self = this.set("storiesFailed", js.undefined)
    
    @scala.inline
    def setViewMode(value: ViewMode): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewMode: Self = this.set("viewMode", js.undefined)
  }
}
