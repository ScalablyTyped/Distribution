package typings.storybookClientApi.anon

import typings.storybookAddons.typesMod.StoryContext
import typings.storybookAddons.typesMod.StoryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Kind extends js.Object {
  var kind: String = js.native
  var name: String = js.native
  var parameters: typings.storybookAddons.typesMod.Parameters = js.native
  var storyFn: StoryFn[_] = js.native
}

object Kind {
  @scala.inline
  def apply(
    kind: String,
    name: String,
    parameters: typings.storybookAddons.typesMod.Parameters,
    storyFn: /* p */ js.UndefOr[StoryContext] => _
  ): Kind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], storyFn = js.Any.fromFunction1(storyFn))
    __obj.asInstanceOf[Kind]
  }
  @scala.inline
  implicit class KindOps[Self <: Kind] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameters(value: typings.storybookAddons.typesMod.Parameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoryFn(value: /* p */ js.UndefOr[StoryContext] => _): Self = this.set("storyFn", js.Any.fromFunction1(value))
  }
  
}

