package typings.storybookPreviewWeb

import typings.std.HTMLElement
import typings.std.Record
import typings.storybookStore.ts39TypesMod.Story
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait DocsContextProps[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] extends StObject {
    
    /** @deprecated */
    var args: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
      ] = js.undefined
    
    def componentStories(): js.Array[Story[TFramework]]
    
    def getStoryContext(story: Story[TFramework]): Any
    
    /** @deprecated */
    var globals: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Globals */ Any
      ] = js.undefined
    
    var id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    
    /** @deprecated */
    var kind: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentTitle */ Any
      ] = js.undefined
    
    def loadStory(
      id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    ): js.Promise[Story[TFramework]]
    
    var mdxComponentAnnotations: js.UndefOr[Any] = js.undefined
    
    /**
      * mdxStoryNameToKey is an MDX-compiler-generated mapping of an MDX story's
      * display name to its story key for ID generation. It's used internally by the `<Story>`
      * and `Preview` doc blocks.
      */
    var mdxStoryNameToKey: js.UndefOr[Record[String, String]] = js.undefined
    
    var name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryName */ Any
    
    /** @deprecated */
    var parameters: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Globals */ Any
      ] = js.undefined
    
    var renderStoryToElement: js.Function2[
        /* story */ Story[TFramework], 
        /* element */ HTMLElement, 
        js.Function0[js.Promise[Unit]]
      ]
    
    /** @deprecated */
    var story: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryName */ Any
      ] = js.undefined
    
    def storyById(
      id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    ): Story[TFramework]
    
    var title: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentTitle */ Any
  }
  object DocsContextProps {
    
    inline def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
      componentStories: () => js.Array[Story[TFramework]],
      getStoryContext: Story[TFramework] => Any,
      id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
      loadStory: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any => js.Promise[Story[TFramework]],
      name: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryName */ Any,
      renderStoryToElement: (/* story */ Story[TFramework], /* element */ HTMLElement) => js.Function0[js.Promise[Unit]],
      storyById: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any => Story[TFramework],
      title: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentTitle */ Any
    ): DocsContextProps[TFramework] = {
      val __obj = js.Dynamic.literal(componentStories = js.Any.fromFunction0(componentStories), getStoryContext = js.Any.fromFunction1(getStoryContext), id = id.asInstanceOf[js.Any], loadStory = js.Any.fromFunction1(loadStory), name = name.asInstanceOf[js.Any], renderStoryToElement = js.Any.fromFunction2(renderStoryToElement), storyById = js.Any.fromFunction1(storyById), title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocsContextProps[TFramework]]
    }
    
    extension [Self <: DocsContextProps[?], TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](x: Self & DocsContextProps[TFramework]) {
      
      inline def setArgs(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
      ): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setComponentStories(value: () => js.Array[Story[TFramework]]): Self = StObject.set(x, "componentStories", js.Any.fromFunction0(value))
      
      inline def setGetStoryContext(value: Story[TFramework] => Any): Self = StObject.set(x, "getStoryContext", js.Any.fromFunction1(value))
      
      inline def setGlobals(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Globals */ Any
      ): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
      
      inline def setId(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
      ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKind(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentTitle */ Any
      ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setLoadStory(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any => js.Promise[Story[TFramework]]
      ): Self = StObject.set(x, "loadStory", js.Any.fromFunction1(value))
      
      inline def setMdxComponentAnnotations(value: Any): Self = StObject.set(x, "mdxComponentAnnotations", value.asInstanceOf[js.Any])
      
      inline def setMdxComponentAnnotationsUndefined: Self = StObject.set(x, "mdxComponentAnnotations", js.undefined)
      
      inline def setMdxStoryNameToKey(value: Record[String, String]): Self = StObject.set(x, "mdxStoryNameToKey", value.asInstanceOf[js.Any])
      
      inline def setMdxStoryNameToKeyUndefined: Self = StObject.set(x, "mdxStoryNameToKey", js.undefined)
      
      inline def setName(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryName */ Any
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParameters(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Globals */ Any
      ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setRenderStoryToElement(
        value: (/* story */ Story[TFramework], /* element */ HTMLElement) => js.Function0[js.Promise[Unit]]
      ): Self = StObject.set(x, "renderStoryToElement", js.Any.fromFunction2(value))
      
      inline def setStory(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryName */ Any
      ): Self = StObject.set(x, "story", value.asInstanceOf[js.Any])
      
      inline def setStoryById(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any => Story[TFramework]
      ): Self = StObject.set(x, "storyById", js.Any.fromFunction1(value))
      
      inline def setStoryUndefined: Self = StObject.set(x, "story", js.undefined)
      
      inline def setTitle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentTitle */ Any
      ): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
