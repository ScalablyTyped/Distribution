package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddStoryArgs[StoryFnReturnType] extends StObject {
  
  var id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
  
  var kind: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryKind */ Any
  
  var name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryName */ Any
  
  var parameters: Parameters
  
  var storyFn: StoryFn[StoryFnReturnType]
}
object AddStoryArgs {
  
  inline def apply[StoryFnReturnType](
    id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
    kind: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryKind */ Any,
    name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryName */ Any,
    parameters: Parameters,
    storyFn: StoryFn[StoryFnReturnType]
  ): AddStoryArgs[StoryFnReturnType] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], storyFn = storyFn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddStoryArgs[StoryFnReturnType]]
  }
  
  extension [Self <: AddStoryArgs[?], StoryFnReturnType](x: Self & AddStoryArgs[StoryFnReturnType]) {
    
    inline def setId(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryKind */ Any
    ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryName */ Any
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setStoryFn(value: StoryFn[StoryFnReturnType]): Self = StObject.set(x, "storyFn", value.asInstanceOf[js.Any])
  }
}
