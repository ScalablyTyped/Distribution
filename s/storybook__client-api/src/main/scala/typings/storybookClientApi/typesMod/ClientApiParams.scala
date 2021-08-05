package typings.storybookClientApi.typesMod

import typings.storybookAddons.typesMod.DecorateStoryFunction
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.StoryFn
import typings.storybookClientApi.storyStoreMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientApiParams extends StObject {
  
  var decorateStory: js.UndefOr[DecorateStoryFunction[js.Any]] = js.undefined
  
  var noStoryModuleAddMethodHotDispose: js.UndefOr[Boolean] = js.undefined
  
  var storyStore: default
}
object ClientApiParams {
  
  inline def apply(storyStore: default): ClientApiParams = {
    val __obj = js.Dynamic.literal(storyStore = storyStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientApiParams]
  }
  
  extension [Self <: ClientApiParams](x: Self) {
    
    inline def setDecorateStory(
      value: (/* storyFn */ StoryFn[js.Any], /* decorators */ js.Array[DecoratorFunction[js.Any]]) => StoryFn[js.Any]
    ): Self = StObject.set(x, "decorateStory", js.Any.fromFunction2(value))
    
    inline def setDecorateStoryUndefined: Self = StObject.set(x, "decorateStory", js.undefined)
    
    inline def setNoStoryModuleAddMethodHotDispose(value: Boolean): Self = StObject.set(x, "noStoryModuleAddMethodHotDispose", value.asInstanceOf[js.Any])
    
    inline def setNoStoryModuleAddMethodHotDisposeUndefined: Self = StObject.set(x, "noStoryModuleAddMethodHotDispose", js.undefined)
    
    inline def setStoryStore(value: default): Self = StObject.set(x, "storyStore", value.asInstanceOf[js.Any])
  }
}
