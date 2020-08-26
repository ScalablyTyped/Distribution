package typings.storybookClientApi.typesMod

import typings.storybookClientApi.storyStoreMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientApiParams extends js.Object {
  var decorateStory: js.UndefOr[js.Function2[/* storyFn */ js.Any, /* decorators */ js.Any, _]] = js.native
  var storyStore: default = js.native
}

object ClientApiParams {
  @scala.inline
  def apply(storyStore: default): ClientApiParams = {
    val __obj = js.Dynamic.literal(storyStore = storyStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientApiParams]
  }
  @scala.inline
  implicit class ClientApiParamsOps[Self <: ClientApiParams] (val x: Self) extends AnyVal {
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
    def setStoryStore(value: default): Self = this.set("storyStore", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecorateStory(value: (/* storyFn */ js.Any, /* decorators */ js.Any) => _): Self = this.set("decorateStory", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDecorateStory: Self = this.set("decorateStory", js.undefined)
  }
  
}

