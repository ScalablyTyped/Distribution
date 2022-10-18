package typings.storybookClientApi

import typings.node.NodeModule
import typings.std.Parameters
import typings.std.Record
import typings.storybookAddons.distTs3Dot9TypesMod.StoryApi
import typings.storybookClientApi.anon.GlobalTypes
import typings.storybookClientApi.anon.ImportFn
import typings.storybookClientApi.anon.Stories
import typings.storybookClientApi.anon.StoryStore
import typings.storybookClientApi.distTs3Dot9StoryStoreFacadeMod.StoryStoreFacade
import typings.storybookStore.distTs3Dot9TypesMod.BoundStory
import typings.storybookStore.distTs3Dot9TypesMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ClientApiMod {
  
  @JSImport("@storybook/client-api/dist/ts3.9/ClientApi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/client-api/dist/ts3.9/ClientApi", "ClientApi")
  @js.native
  open class ClientApi[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] () extends StObject {
    def this(hasStoryStore: StoryStore[TFramework]) = this()
    
    def _storyStore: typings.storybookStore.mod.StoryStore[TFramework] = js.native
    
    def addArgTypes(
      argTypes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArgTypes */ Any
    ): Unit = js.native
    
    def addArgTypesEnhancer(
      enhancer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArgTypesEnhancer<TFramework> */ Any
    ): Unit = js.native
    
    def addArgs(
      args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
    ): Unit = js.native
    
    def addArgsEnhancer(
      enhancer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArgsEnhancer<TFramework> */ Any
    ): Unit = js.native
    
    def addDecorator(
      decorator: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DecoratorFunction<TFramework> */ Any
    ): Unit = js.native
    
    def addLoader(
      loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LoaderFunction<TFramework> */ Any
    ): Unit = js.native
    
    def addParameters(hasGlobalsGlobalTypesParameters: (Parameters[js.Function1[/* args */ Any, Any]]) & GlobalTypes): Unit = js.native
    
    /* private */ var addons: Any = js.native
    
    def clearDecorators(): Unit = js.native
    
    var facade: StoryStoreFacade[TFramework] = js.native
    
    def getStoryIndex(): Stories = js.native
    
    def getStorybook(): js.Array[GetStorybookKind[TFramework]] = js.native
    
    def importFn(path: Path): js.Promise[Record[String, Any]] = js.native
    
    /* private */ var lastFileName: Any = js.native
    
    var onImportFnChanged: js.UndefOr[js.Function1[/* hasImportFn */ ImportFn, Unit]] = js.native
    
    def raw(): js.Array[BoundStory[TFramework]] = js.native
    
    def setAddon(addon: Any): Unit = js.native
    
    def storiesOf(kind: String): StoryApi[
        /* import warning: importer.ImportType#apply Failed type conversion: TFramework['storyResult'] */ js.Any
      ] = js.native
    def storiesOf(kind: String, m: NodeModule): StoryApi[
        /* import warning: importer.ImportType#apply Failed type conversion: TFramework['storyResult'] */ js.Any
      ] = js.native
    
    var storyStore: js.UndefOr[typings.storybookStore.mod.StoryStore[TFramework]] = js.native
  }
  
  inline def addArgTypes(
    argTypes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArgTypes */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addArgTypes")(argTypes.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addArgTypesEnhancer(
    enhancer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArgTypesEnhancer<AnyFramework> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addArgTypesEnhancer")(enhancer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addArgs(
    args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addArgs")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addArgsEnhancer(
    enhancer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArgsEnhancer<AnyFramework> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addArgsEnhancer")(enhancer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addDecorator(
    decorator: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DecoratorFunction<AnyFramework> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addDecorator")(decorator.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addDecorator(
    decorator: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DecoratorFunction<AnyFramework> */ Any,
    deprecationWarning: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addDecorator")(decorator.asInstanceOf[js.Any], deprecationWarning.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addLoader(
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LoaderFunction<AnyFramework> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addLoader")(loader.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addLoader(
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LoaderFunction<AnyFramework> */ Any,
    deprecationWarning: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addLoader")(loader.asInstanceOf[js.Any], deprecationWarning.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addParameters(parameters: Parameters[js.Function1[/* args */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addParameters")(parameters.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addParameters(parameters: Parameters[js.Function1[/* args */ Any, Any]], deprecationWarning: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addParameters")(parameters.asInstanceOf[js.Any], deprecationWarning.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getGlobalRender(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalRender")().asInstanceOf[Any]
  
  inline def setGlobalRender(
    render: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryFn<AnyFramework> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalRender")(render.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
    
    var render: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryFn<TFramework> */ Any
  }
  object GetStorybookStory {
    
    inline def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
      name: String,
      render: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryFn<TFramework> */ Any
    ): GetStorybookStory[TFramework] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetStorybookStory[TFramework]]
    }
    
    extension [Self <: GetStorybookStory[?], TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](x: Self & GetStorybookStory[TFramework]) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRender(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryFn<TFramework> */ Any
      ): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    }
  }
}
