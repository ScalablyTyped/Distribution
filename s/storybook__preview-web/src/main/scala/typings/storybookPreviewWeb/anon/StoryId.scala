package typings.storybookPreviewWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoryId extends StObject {
  
  var storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
  
  var updatedArgs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
}
object StoryId {
  
  inline def apply(
    storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
    updatedArgs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
  ): StoryId = {
    val __obj = js.Dynamic.literal(storyId = storyId.asInstanceOf[js.Any], updatedArgs = updatedArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryId]
  }
  
  extension [Self <: StoryId](x: Self) {
    
    inline def setStoryId(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    ): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
    
    inline def setUpdatedArgs(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
    ): Self = StObject.set(x, "updatedArgs", value.asInstanceOf[js.Any])
  }
}
