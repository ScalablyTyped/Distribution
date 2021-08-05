package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddStoryArgs[StoryFnReturnType] extends StObject {
  
  var id: StoryId
  
  var kind: StoryKind
  
  var name: StoryName
  
  var parameters: Parameters
  
  var storyFn: StoryFn[StoryFnReturnType]
}
object AddStoryArgs {
  
  inline def apply[StoryFnReturnType](
    id: StoryId,
    kind: StoryKind,
    name: StoryName,
    parameters: Parameters,
    storyFn: StoryFn[StoryFnReturnType]
  ): AddStoryArgs[StoryFnReturnType] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], storyFn = storyFn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddStoryArgs[StoryFnReturnType]]
  }
  
  extension [Self <: AddStoryArgs[?], StoryFnReturnType](x: Self & AddStoryArgs[StoryFnReturnType]) {
    
    inline def setId(value: StoryId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: StoryKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: StoryName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setStoryFn(value: StoryFn[StoryFnReturnType]): Self = StObject.set(x, "storyFn", value.asInstanceOf[js.Any])
    
    inline def setStoryFnFunction1(value: /* p */ js.UndefOr[StoryContext] => StoryFnReturnType): Self = StObject.set(x, "storyFn", js.Any.fromFunction1(value))
    
    inline def setStoryFnFunction2(value: (/* a */ js.UndefOr[Args], /* p */ js.UndefOr[StoryContext]) => StoryFnReturnType): Self = StObject.set(x, "storyFn", js.Any.fromFunction2(value))
  }
}
