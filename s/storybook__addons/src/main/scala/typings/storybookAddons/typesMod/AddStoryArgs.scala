package typings.storybookAddons.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddStoryArgs[StoryFnReturnType] extends js.Object {
  
  var id: StoryId = js.native
  
  var kind: StoryKind = js.native
  
  var name: StoryName = js.native
  
  var parameters: Parameters = js.native
  
  var storyFn: StoryFn[StoryFnReturnType] = js.native
}
object AddStoryArgs {
  
  @scala.inline
  def apply[StoryFnReturnType](
    id: StoryId,
    kind: StoryKind,
    name: StoryName,
    parameters: Parameters,
    storyFn: StoryFn[StoryFnReturnType]
  ): AddStoryArgs[StoryFnReturnType] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], storyFn = storyFn.asInstanceOf[js.Any])
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
    def setId(value: StoryId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: StoryKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: StoryName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: Parameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoryFnFunction2(value: (/* a */ js.UndefOr[Args], /* p */ js.UndefOr[StoryContext]) => StoryFnReturnType): Self = this.set("storyFn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStoryFnFunction1(value: /* p */ js.UndefOr[StoryContext] => StoryFnReturnType): Self = this.set("storyFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStoryFn(value: StoryFn[StoryFnReturnType]): Self = this.set("storyFn", value.asInstanceOf[js.Any])
  }
}
