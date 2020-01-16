package typings.atStorybookAddonDashStoryshots

import typings.atStorybookAddonDashStoryshots.distFrameworksLoaderMod.RenderTree
import typings.atStorybookAddonDashStoryshots.distStories2SnapsConverterMod.Stories2SnapsConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextRenderTree extends js.Object {
  var context: js.Any
  var renderTree: RenderTree
  var stories2snapsConverter: Stories2SnapsConverter
  var story: js.Any
}

object Anon_ContextRenderTree {
  @scala.inline
  def apply(
    context: js.Any,
    renderTree: (/* story */ js.Any, /* context */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => js.Any,
    stories2snapsConverter: Stories2SnapsConverter,
    story: js.Any
  ): Anon_ContextRenderTree = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], renderTree = js.Any.fromFunction3(renderTree), stories2snapsConverter = stories2snapsConverter.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ContextRenderTree]
  }
}

