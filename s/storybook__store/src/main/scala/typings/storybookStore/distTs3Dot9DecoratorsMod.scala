package typings.storybookStore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9DecoratorsMod {
  
  @JSImport("@storybook/store/dist/ts3.9/decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decorateStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    storyFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryFn<TFramework> */ Any,
    decorator: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DecoratorFunction<TFramework> */ Any,
    bindWithContext: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryFn<TFramework> */ /* storyFn */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialStoryFn<TFramework> */ Any
    ]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decorateStory")(storyFn.asInstanceOf[js.Any], decorator.asInstanceOf[js.Any], bindWithContext.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def defaultDecorateStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    storyFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryFn<TFramework> */ Any,
    decorators: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DecoratorFunction<TFramework> */ Any
    ]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultDecorateStory")(storyFn.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def sanitizeStoryContextUpdate(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeStoryContextUpdate")().asInstanceOf[Any]
  inline def sanitizeStoryContextUpdate(
    param0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContextUpdate */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeStoryContextUpdate")(param0.asInstanceOf[js.Any]).asInstanceOf[Any]
}
