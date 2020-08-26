package typings.storybookClientApi.typesMod

import typings.storybookAddons.typesMod.Parameters
import typings.storybookAddons.typesMod.StoryContext
import typings.storybookAddons.typesMod.StoryFn
import typings.storybookClientApi.hooksMod.HooksContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreItem extends StoryContext {
  @JSName("hooks")
  var hooks_StoreItem: HooksContext = js.native
  var story: String = js.native
  var storyFn: StoryFn[_] = js.native
  def getDecorated(): StoryFn[_] = js.native
  def getOriginal(): StoryFn[_] = js.native
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
  @scala.inline
  implicit class StoreItemOps[Self <: StoreItem] (val x: Self) extends AnyVal {
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
    def setGetOriginal(value: () => StoryFn[_]): Self = this.set("getOriginal", js.Any.fromFunction0(value))
    @scala.inline
    def setHooks(value: HooksContext): Self = this.set("hooks", value.asInstanceOf[js.Any])
    @scala.inline
    def setStory(value: String): Self = this.set("story", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoryFn(value: /* p */ js.UndefOr[StoryContext] => _): Self = this.set("storyFn", js.Any.fromFunction1(value))
  }
  
}

