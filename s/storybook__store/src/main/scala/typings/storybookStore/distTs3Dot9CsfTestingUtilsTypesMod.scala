package typings.storybookStore

import typings.std.Partial
import typings.storybookStore.anon.PickanycanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9CsfTestingUtilsTypesMod {
  
  trait CSFExports[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] extends StObject {
    
    var default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, Args> */ Any
    
    var __esModule: js.UndefOr[Boolean] = js.undefined
    
    var __namedExportsOrder: js.UndefOr[js.Array[String]] = js.undefined
  }
  object CSFExports {
    
    inline def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
      default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, Args> */ Any
    ): CSFExports[TFramework] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSFExports[TFramework]]
    }
    
    extension [Self <: CSFExports[?], TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](x: Self & CSFExports[TFramework]) {
      
      inline def setDefault(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, Args> */ Any
      ): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def set__esModule(value: Boolean): Self = StObject.set(x, "__esModule", value.asInstanceOf[js.Any])
      
      inline def set__esModuleUndefined: Self = StObject.set(x, "__esModule", js.undefined)
      
      inline def set__namedExportsOrder(value: js.Array[String]): Self = StObject.set(x, "__namedExportsOrder", value.asInstanceOf[js.Any])
      
      inline def set__namedExportsOrderUndefined: Self = StObject.set(x, "__namedExportsOrder", js.undefined)
      
      inline def set__namedExportsOrderVarargs(value: String*): Self = StObject.set(x, "__namedExportsOrder", js.Array(value*))
    }
  }
  
  type ComposedStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs] = (StoryFn[TFramework, TArgs]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryAnnotations<TFramework, TArgs> */ Any)
  
  type ComposedStoryPlayContext = (Partial[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContext */ Any
  ]) & PickanycanvasElement
  
  type ComposedStoryPlayFn = js.Function1[/* context */ ComposedStoryPlayContext, js.Promise[Unit] | Unit]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof TModule ]: TModule[K] extends @storybook/store.@storybook/store/dist/ts3.9/csf/testing-utils/types.ComposedStory<infer _, infer TProps>? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<TFramework, Partial<TProps>> * / any : unknown}
    }}}
    */
  @js.native
  trait StoriesWithPartialProps[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TModule] extends StObject
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<TFramework, TArgs> * / any */ trait StoryFn[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs] extends StObject {
    
    var play: ComposedStoryPlayFn
  }
  object StoryFn {
    
    inline def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs](play: /* context */ ComposedStoryPlayContext => js.Promise[Unit] | Unit): StoryFn[TFramework, TArgs] = {
      val __obj = js.Dynamic.literal(play = js.Any.fromFunction1(play))
      __obj.asInstanceOf[StoryFn[TFramework, TArgs]]
    }
    
    extension [Self <: StoryFn[?, ?], TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs](x: Self & (StoryFn[TFramework, TArgs])) {
      
      inline def setPlay(value: /* context */ ComposedStoryPlayContext => js.Promise[Unit] | Unit): Self = StObject.set(x, "play", js.Any.fromFunction1(value))
    }
  }
}
