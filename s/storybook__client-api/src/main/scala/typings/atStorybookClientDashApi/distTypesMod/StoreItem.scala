package typings.atStorybookClientDashApi.distTypesMod

import typings.atStorybookAddons.distTypesMod.Parameters
import typings.atStorybookAddons.distTypesMod.StoryContext
import typings.atStorybookAddons.distTypesMod.StoryFn
import typings.atStorybookClientDashApi.distHooksMod.HooksContext
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
    val __obj = js.Dynamic.literal(getDecorated = js.Any.fromFunction0(getDecorated), getOriginal = js.Any.fromFunction0(getOriginal), hooks = hooks, id = id, kind = kind, name = name, parameters = parameters, story = story, storyFn = js.Any.fromFunction1(storyFn))
  
    __obj.asInstanceOf[StoreItem]
  }
}

