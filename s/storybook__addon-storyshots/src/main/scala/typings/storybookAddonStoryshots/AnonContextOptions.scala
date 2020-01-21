package typings.storybookAddonStoryshots

import typings.storybookAddonStoryshots.frameworksLoaderMod.RenderTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextOptions extends js.Object {
  var context: js.Any
  var options: js.Any
  var renderShallowTree: RenderTree
  var story: js.Any
}

object AnonContextOptions {
  @scala.inline
  def apply(
    context: js.Any,
    options: js.Any,
    renderShallowTree: (/* story */ js.Any, /* context */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => js.Any,
    story: js.Any
  ): AnonContextOptions = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], renderShallowTree = js.Any.fromFunction3(renderShallowTree), story = story.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContextOptions]
  }
}

