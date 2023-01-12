package typings.storybookStore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgTypes extends StObject {
  
  var argTypes: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StrictArgTypes */ Any
  ] = js.undefined
  
  var id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
  
  var userStoryFn: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryFn<TFramework> */ Any
  ] = js.undefined
}
object ArgTypes {
  
  inline def apply(
    id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
  ): ArgTypes = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgTypes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArgTypes] (val x: Self) extends AnyVal {
    
    inline def setArgTypes(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StrictArgTypes */ Any
    ): Self = StObject.set(x, "argTypes", value.asInstanceOf[js.Any])
    
    inline def setArgTypesUndefined: Self = StObject.set(x, "argTypes", js.undefined)
    
    inline def setId(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setUserStoryFn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryFn<TFramework> */ Any
    ): Self = StObject.set(x, "userStoryFn", value.asInstanceOf[js.Any])
    
    inline def setUserStoryFnUndefined: Self = StObject.set(x, "userStoryFn", js.undefined)
  }
}
