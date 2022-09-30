package typings.storybookStore.ts39TypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selection extends StObject {
  
  var storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
  
  var viewMode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewMode */ Any
}
object Selection {
  
  inline def apply(
    storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
    viewMode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewMode */ Any
  ): Selection = {
    val __obj = js.Dynamic.literal(storyId = storyId.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
  
  extension [Self <: Selection](x: Self) {
    
    inline def setStoryId(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    ): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
    
    inline def setViewMode(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewMode */ Any
    ): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
  }
}
