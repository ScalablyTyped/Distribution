package typings.storybookCore.storyRendererMod

import typings.storybookAddons.typesMod.StoryFn
import typings.storybookAddons.typesMod.StoryId
import typings.storybookAddons.typesMod.StoryKind
import typings.storybookAddons.typesMod.ViewMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderMetadata extends js.Object {
  
  def getDecorated(): StoryFn[_] = js.native
  
  var id: StoryId = js.native
  
  var kind: StoryKind = js.native
  
  var viewMode: ViewMode = js.native
}
object RenderMetadata {
  
  @scala.inline
  def apply(getDecorated: () => StoryFn[_], id: StoryId, kind: StoryKind, viewMode: ViewMode): RenderMetadata = {
    val __obj = js.Dynamic.literal(getDecorated = js.Any.fromFunction0(getDecorated), id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderMetadata]
  }
  
  @scala.inline
  implicit class RenderMetadataOps[Self <: RenderMetadata] (val x: Self) extends AnyVal {
    
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
    def setGetDecorated(value: () => StoryFn[_]): Self = this.set("getDecorated", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: StoryId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: StoryKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMode(value: ViewMode): Self = this.set("viewMode", value.asInstanceOf[js.Any])
  }
}
