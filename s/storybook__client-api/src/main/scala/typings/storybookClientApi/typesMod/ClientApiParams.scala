package typings.storybookClientApi.typesMod

import typings.storybookAddons.typesMod.DecorateStoryFunction
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.StoryFn
import typings.storybookClientApi.storyStoreMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientApiParams extends StObject {
  
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
  implicit class ClientApiParamsMutableBuilder[Self <: ClientApiParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecorateStory(value: (/* storyFn */ StoryFn[_], /* decorators */ js.Array[DecoratorFunction[_]]) => StoryFn[_]): Self = StObject.set(x, "decorateStory", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDecorateStoryUndefined: Self = StObject.set(x, "decorateStory", js.undefined)
    
    @scala.inline
    def setNoStoryModuleAddMethodHotDispose(value: Boolean): Self = StObject.set(x, "noStoryModuleAddMethodHotDispose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoStoryModuleAddMethodHotDisposeUndefined: Self = StObject.set(x, "noStoryModuleAddMethodHotDispose", js.undefined)
    
    @scala.inline
    def setStoryStore(value: default): Self = StObject.set(x, "storyStore", value.asInstanceOf[js.Any])
  }
}
