package typings.storybookStore.ts39TypesMod

import typings.storybookStore.anon.Description
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryIdentifier * / any */ trait RenderContext[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] extends StObject {
  
  var forceRemount: Boolean
  
  def showError(error: Description): Unit
  
  def showException(err: js.Error): Unit
  
  def showMain(): Unit
  
  var storyContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContext<TFramework> */ Any
  
  var storyFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialStoryFn<TFramework> */ Any
  
  var unboundStoryFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryFn<TFramework> */ Any
}
object RenderContext {
  
  inline def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    forceRemount: Boolean,
    showError: Description => Unit,
    showException: js.Error => Unit,
    showMain: () => Unit,
    storyContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContext<TFramework> */ Any,
    storyFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialStoryFn<TFramework> */ Any,
    unboundStoryFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryFn<TFramework> */ Any
  ): RenderContext[TFramework] = {
    val __obj = js.Dynamic.literal(forceRemount = forceRemount.asInstanceOf[js.Any], showError = js.Any.fromFunction1(showError), showException = js.Any.fromFunction1(showException), showMain = js.Any.fromFunction0(showMain), storyContext = storyContext.asInstanceOf[js.Any], storyFn = storyFn.asInstanceOf[js.Any], unboundStoryFn = unboundStoryFn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderContext[TFramework]]
  }
  
  extension [Self <: RenderContext[?], TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](x: Self & RenderContext[TFramework]) {
    
    inline def setForceRemount(value: Boolean): Self = StObject.set(x, "forceRemount", value.asInstanceOf[js.Any])
    
    inline def setShowError(value: Description => Unit): Self = StObject.set(x, "showError", js.Any.fromFunction1(value))
    
    inline def setShowException(value: js.Error => Unit): Self = StObject.set(x, "showException", js.Any.fromFunction1(value))
    
    inline def setShowMain(value: () => Unit): Self = StObject.set(x, "showMain", js.Any.fromFunction0(value))
    
    inline def setStoryContext(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContext<TFramework> */ Any
    ): Self = StObject.set(x, "storyContext", value.asInstanceOf[js.Any])
    
    inline def setStoryFn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialStoryFn<TFramework> */ Any
    ): Self = StObject.set(x, "storyFn", value.asInstanceOf[js.Any])
    
    inline def setUnboundStoryFn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryFn<TFramework> */ Any
    ): Self = StObject.set(x, "unboundStoryFn", value.asInstanceOf[js.Any])
  }
}
