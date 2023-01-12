package typings.storybookStore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoryFn extends StObject {
  
  var storyFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialStoryFn<TFramework> */ Any
}
object StoryFn {
  
  inline def apply(
    storyFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialStoryFn<TFramework> */ Any
  ): StoryFn = {
    val __obj = js.Dynamic.literal(storyFn = storyFn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryFn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StoryFn] (val x: Self) extends AnyVal {
    
    inline def setStoryFn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialStoryFn<TFramework> */ Any
    ): Self = StObject.set(x, "storyFn", value.asInstanceOf[js.Any])
  }
}
