package typings.storybookApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefId extends StObject {
  
  var refId: String
  
  var storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
}
object RefId {
  
  inline def apply(
    refId: String,
    storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
  ): RefId = {
    val __obj = js.Dynamic.literal(refId = refId.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefId]
  }
  
  extension [Self <: RefId](x: Self) {
    
    inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
    
    inline def setStoryId(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    ): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
  }
}
