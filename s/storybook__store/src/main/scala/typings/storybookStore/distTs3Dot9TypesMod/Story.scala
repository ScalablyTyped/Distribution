package typings.storybookStore.distTs3Dot9TypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContextForEnhancers<TFramework> * / any */ trait Story[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] extends StObject {
  
  def applyLoaders(
    context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContextForLoaders<TFramework> */ Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContext<TFramework> */ Any
  ]
  
  var originalStoryFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryFn<TFramework> */ Any
  
  def playFunction(
    context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContext<TFramework> */ Any
  ): js.Promise[Unit] | Unit
  
  var unboundStoryFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryFn<TFramework> */ Any
  
  var undecoratedStoryFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryFn<TFramework> */ Any
}
object Story {
  
  inline def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    applyLoaders: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContextForLoaders<TFramework> */ Any => js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContext<TFramework> */ Any
    ],
    originalStoryFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryFn<TFramework> */ Any,
    playFunction: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContext<TFramework> */ Any => js.Promise[Unit] | Unit,
    unboundStoryFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryFn<TFramework> */ Any,
    undecoratedStoryFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryFn<TFramework> */ Any
  ): Story[TFramework] = {
    val __obj = js.Dynamic.literal(applyLoaders = js.Any.fromFunction1(applyLoaders), originalStoryFn = originalStoryFn.asInstanceOf[js.Any], playFunction = js.Any.fromFunction1(playFunction), unboundStoryFn = unboundStoryFn.asInstanceOf[js.Any], undecoratedStoryFn = undecoratedStoryFn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Story[TFramework]]
  }
  
  extension [Self <: Story[?], TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](x: Self & Story[TFramework]) {
    
    inline def setApplyLoaders(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContextForLoaders<TFramework> */ Any => js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContext<TFramework> */ Any
        ]
    ): Self = StObject.set(x, "applyLoaders", js.Any.fromFunction1(value))
    
    inline def setOriginalStoryFn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryFn<TFramework> */ Any
    ): Self = StObject.set(x, "originalStoryFn", value.asInstanceOf[js.Any])
    
    inline def setPlayFunction(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContext<TFramework> */ Any => js.Promise[Unit] | Unit
    ): Self = StObject.set(x, "playFunction", js.Any.fromFunction1(value))
    
    inline def setUnboundStoryFn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryFn<TFramework> */ Any
    ): Self = StObject.set(x, "unboundStoryFn", value.asInstanceOf[js.Any])
    
    inline def setUndecoratedStoryFn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryFn<TFramework> */ Any
    ): Self = StObject.set(x, "undecoratedStoryFn", value.asInstanceOf[js.Any])
  }
}
