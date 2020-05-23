package typings.storybookAddonStoryshots.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Story extends js.Object {
  var context: js.Any
  var renderTree: typings.storybookAddonStoryshots.frameworksLoaderMod.RenderTree
  var story: js.Any
}

object Story {
  @scala.inline
  def apply(
    context: js.Any,
    renderTree: (/* story */ js.Any, /* context */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => js.Any,
    story: js.Any
  ): Story = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], renderTree = js.Any.fromFunction3(renderTree), story = story.asInstanceOf[js.Any])
    __obj.asInstanceOf[Story]
  }
}

