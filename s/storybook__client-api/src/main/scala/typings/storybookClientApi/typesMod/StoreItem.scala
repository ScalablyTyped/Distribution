package typings.storybookClientApi.typesMod

import typings.storybookAddons.typesMod.Parameters
import typings.storybookAddons.typesMod.StoryContext
import typings.storybookAddons.typesMod.StoryFn
import typings.storybookClientApi.hooksMod.HooksContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreItem extends StoryContext {
  @JSName("hooks")
  var hooks_StoreItem: HooksContext
  var story: String
  var storyFn: StoryFn[_]
  def getDecorated(): StoryFn[_]
  def getOriginal(): StoryFn[_]
}

object StoreItem {
  @scala.inline
  def apply(
    getDecorated: () => StoryFn[_],
    getOriginal: () => StoryFn[_],
    hooks: HooksContext,
    id: String,
    kind: String,
    name: String,
    parameters: Parameters,
    story: String,
    storyFn: /* p */ js.UndefOr[StoryContext] => _
  ): StoreItem = {
    val __obj = js.Dynamic.literal(getDecorated = js.Any.fromFunction0(getDecorated), getOriginal = js.Any.fromFunction0(getOriginal), hooks = hooks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any], storyFn = js.Any.fromFunction1(storyFn))
    __obj.asInstanceOf[StoreItem]
  }
}

