package typings.storybookAddons.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddStoryArgs[StoryFnReturnType] extends js.Object {
  var id: String = js.native
  var kind: String = js.native
  var name: String = js.native
  var parameters: Parameters = js.native
  var storyFn: StoryFn[StoryFnReturnType] = js.native
}

object AddStoryArgs {
  @scala.inline
  def apply[StoryFnReturnType](
    id: String,
    kind: String,
    name: String,
    parameters: Parameters,
    storyFn: /* p */ js.UndefOr[StoryContext] => StoryFnReturnType
  ): AddStoryArgs[StoryFnReturnType] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], storyFn = js.Any.fromFunction1(storyFn))
    __obj.asInstanceOf[AddStoryArgs[StoryFnReturnType]]
  }
  @scala.inline
  implicit class AddStoryArgsOps[Self <: AddStoryArgs[_], StoryFnReturnType] (val x: Self with AddStoryArgs[StoryFnReturnType]) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameters(value: Parameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoryFn(value: /* p */ js.UndefOr[StoryContext] => StoryFnReturnType): Self = this.set("storyFn", js.Any.fromFunction1(value))
  }
  
}

