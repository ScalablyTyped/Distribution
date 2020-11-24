package typings.storybookClientApi.typesMod

import typings.storybookAddons.typesMod.DecorateStoryFunction
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.StoryFn
import typings.storybookClientApi.storyStoreMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientApiParams extends js.Object {
  
  var decorateStory: js.UndefOr[DecorateStoryFunction[_]] = js.native
  
  var noStoryModuleAddMethodHotDispose: js.UndefOr[Boolean] = js.native
  
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
    def setDecorateStory(value: (/* storyFn */ StoryFn[_], /* decorators */ js.Array[DecoratorFunction[_]]) => StoryFn[_]): Self = this.set("decorateStory", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDecorateStory: Self = this.set("decorateStory", js.undefined)
    
    @scala.inline
    def setNoStoryModuleAddMethodHotDispose(value: Boolean): Self = this.set("noStoryModuleAddMethodHotDispose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoStoryModuleAddMethodHotDispose: Self = this.set("noStoryModuleAddMethodHotDispose", js.undefined)
  }
}
