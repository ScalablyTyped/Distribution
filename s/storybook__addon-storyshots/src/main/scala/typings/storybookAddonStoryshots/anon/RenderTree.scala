package typings.storybookAddonStoryshots.anon

import typings.storybookAddonStoryshots.stories2SnapsConverterMod.Stories2SnapsConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderTree extends js.Object {
  var context: js.Any = js.native
  var renderTree: typings.storybookAddonStoryshots.frameworksLoaderMod.RenderTree = js.native
  var stories2snapsConverter: Stories2SnapsConverter = js.native
  var story: js.Any = js.native
}

object RenderTree {
  @scala.inline
  def apply(
    context: js.Any,
    renderTree: (/* story */ js.Any, /* context */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => js.Any,
    stories2snapsConverter: Stories2SnapsConverter,
    story: js.Any
  ): RenderTree = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], renderTree = js.Any.fromFunction3(renderTree), stories2snapsConverter = stories2snapsConverter.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderTree]
  }
  @scala.inline
  implicit class RenderTreeOps[Self <: RenderTree] (val x: Self) extends AnyVal {
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
    def setStories2snapsConverter(value: Stories2SnapsConverter): Self = this.set("stories2snapsConverter", value.asInstanceOf[js.Any])
    @scala.inline
    def setStory(value: js.Any): Self = this.set("story", value.asInstanceOf[js.Any])
  }
  
}

