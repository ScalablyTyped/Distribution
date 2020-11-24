package typings.storybookAddonStoryshots.storyshotsOptionsMod

import typings.storybookAddonStoryshots.frameworksLoaderMod.RenderTree
import typings.storybookAddonStoryshots.stories2SnapsConverterMod.Stories2SnapsConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestMethodOptions extends js.Object {
  
  var context: js.Any = js.native
  
  var options: js.Any = js.native
  
  var renderShallowTree: RenderTree = js.native
  
  var renderTree: RenderTree = js.native
  
  var snapshotFileName: String = js.native
  
  var stories2snapsConverter: Stories2SnapsConverter = js.native
  
  var story: js.Any = js.native
}
object TestMethodOptions {
  
  @scala.inline
  def apply(
    context: js.Any,
    options: js.Any,
    renderShallowTree: (/* story */ js.Any, /* context */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => js.Any,
    renderTree: (/* story */ js.Any, /* context */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => js.Any,
    snapshotFileName: String,
    stories2snapsConverter: Stories2SnapsConverter,
    story: js.Any
  ): TestMethodOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], renderShallowTree = js.Any.fromFunction3(renderShallowTree), renderTree = js.Any.fromFunction3(renderTree), snapshotFileName = snapshotFileName.asInstanceOf[js.Any], stories2snapsConverter = stories2snapsConverter.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestMethodOptions]
  }
  
  @scala.inline
  implicit class TestMethodOptionsOps[Self <: TestMethodOptions] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderShallowTree(
      value: (/* story */ js.Any, /* context */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => js.Any
    ): Self = this.set("renderShallowTree", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRenderTree(
      value: (/* story */ js.Any, /* context */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => js.Any
    ): Self = this.set("renderTree", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSnapshotFileName(value: String): Self = this.set("snapshotFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStories2snapsConverter(value: Stories2SnapsConverter): Self = this.set("stories2snapsConverter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory(value: js.Any): Self = this.set("story", value.asInstanceOf[js.Any])
  }
}
