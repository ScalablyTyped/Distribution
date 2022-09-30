package typings.storybookClientApi

import typings.std.Record
import typings.storybookClientApi.anon.Stories
import typings.storybookStore.mod.StoryStore
import typings.storybookStore.ts39TypesMod.ModuleExports
import typings.storybookStore.ts39TypesMod.NormalizedProjectAnnotations
import typings.storybookStore.ts39TypesMod.Path
import typings.storybookStore.ts39TypesMod.StoryIndexEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storyStoreFacadeMod {
  
  @JSImport("@storybook/client-api/dist/ts3.9/StoryStoreFacade", "StoryStoreFacade")
  @js.native
  open class StoryStoreFacade[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] () extends StObject {
    
    def addStoriesFromExports(fileName: Path, fileExports: ModuleExports): Unit = js.native
    
    def clearFilenameExports(fileName: Path): Unit = js.native
    
    var csfExports: Record[Path, ModuleExports] = js.native
    
    def getStoryIndex(store: StoryStore[TFramework]): Stories = js.native
    
    def importFn(path: Path): js.Promise[Record[String, Any]] = js.native
    
    var projectAnnotations: NormalizedProjectAnnotations[TFramework] = js.native
    
    var stories: Record[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any, 
        StoryIndexEntry
      ] = js.native
  }
  
  trait GetStorybookKind[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] extends StObject {
    
    var fileName: String
    
    var kind: String
    
    var stories: js.Array[GetStorybookStory[TFramework]]
  }
  object GetStorybookKind {
    
    inline def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](fileName: String, kind: String, stories: js.Array[GetStorybookStory[TFramework]]): GetStorybookKind[TFramework] = {
      val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetStorybookKind[TFramework]]
    }
    
    extension [Self <: GetStorybookKind[?], TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](x: Self & GetStorybookKind[TFramework]) {
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setStories(value: js.Array[GetStorybookStory[TFramework]]): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
      
      inline def setStoriesVarargs(value: GetStorybookStory[TFramework]*): Self = StObject.set(x, "stories", js.Array(value*))
    }
  }
  
  trait GetStorybookStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] extends StObject {
    
    var name: String
    
    var render: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryFn<TFramework> */ Any
  }
  object GetStorybookStory {
    
    inline def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
      name: String,
      render: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryFn<TFramework> */ Any
    ): GetStorybookStory[TFramework] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetStorybookStory[TFramework]]
    }
    
    extension [Self <: GetStorybookStory[?], TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](x: Self & GetStorybookStory[TFramework]) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRender(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryFn<TFramework> */ Any
      ): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    }
  }
}
