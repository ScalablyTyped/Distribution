package typings.storybookAddonStoryshots.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var context: js.Any
  var renderTree: typings.storybookAddonStoryshots.frameworksLoaderMod.RenderTree
  var snapshotFileName: String
  var story: js.Any
}

object Context {
  @scala.inline
  def apply(
    context: js.Any,
    renderTree: (/* story */ js.Any, /* context */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => js.Any,
    snapshotFileName: String,
    story: js.Any
  ): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], renderTree = js.Any.fromFunction3(renderTree), snapshotFileName = snapshotFileName.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

