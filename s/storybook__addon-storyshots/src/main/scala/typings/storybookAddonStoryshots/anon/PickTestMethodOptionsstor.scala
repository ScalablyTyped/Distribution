package typings.storybookAddonStoryshots.anon

import typings.storybookAddonStoryshots.frameworksLoaderMod.RenderTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@storybook/addon-storyshots.@storybook/addon-storyshots/dist/api/StoryshotsOptions.TestMethodOptions, 'story' | 'context' | 'renderTree' | 'snapshotFileName'> */
@js.native
trait PickTestMethodOptionsstor extends js.Object {
  
  var context: js.Any = js.native
  
  var renderTree: RenderTree = js.native
  
  var snapshotFileName: String = js.native
  
  var story: js.Any = js.native
}
object PickTestMethodOptionsstor {
  
  @scala.inline
  def apply(
    context: js.Any,
    renderTree: (/* story */ js.Any, /* context */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => js.Any,
    snapshotFileName: String,
    story: js.Any
  ): PickTestMethodOptionsstor = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], renderTree = js.Any.fromFunction3(renderTree), snapshotFileName = snapshotFileName.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickTestMethodOptionsstor]
  }
  
  @scala.inline
  implicit class PickTestMethodOptionsstorOps[Self <: PickTestMethodOptionsstor] (val x: Self) extends AnyVal {
    
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
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderTree(
      value: (/* story */ js.Any, /* context */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => js.Any
    ): Self = this.set("renderTree", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSnapshotFileName(value: String): Self = this.set("snapshotFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory(value: js.Any): Self = this.set("story", value.asInstanceOf[js.Any])
  }
}
