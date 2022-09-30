package typings.storybookClientApi

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import typings.storybookAddons.ts39Mod.Addon
import typings.storybookAddons.ts39Mod.RenderOptions
import typings.storybookAddons.typesMod.ArgTypes
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.LoaderFunction
import typings.storybookAddons.typesMod.Parameters
import typings.storybookAddons.typesMod.StoryApi
import typings.storybookAddons.typesMod.StoryContext
import typings.storybookAddons.typesMod.StoryFn
import typings.storybookClientApi.anon.Globals
import typings.storybookStore.anon.Description
import typings.storybookStore.mod.HooksContext
import typings.storybookStore.mod.StoryStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryIdentifier * / any */ trait AddStoryArgs extends StObject {
    
    var decorators: js.UndefOr[js.Array[DecoratorFunction[Any]]] = js.undefined
    
    var loaders: js.UndefOr[js.Array[LoaderFunction]] = js.undefined
    
    var parameters: js.UndefOr[Parameters] = js.undefined
    
    var storyFn: StoryFn[Any]
  }
  object AddStoryArgs {
    
    inline def apply(storyFn: StoryFn[Any]): AddStoryArgs = {
      val __obj = js.Dynamic.literal(storyFn = storyFn.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddStoryArgs]
    }
    
    extension [Self <: AddStoryArgs](x: Self) {
      
      inline def setDecorators(value: js.Array[DecoratorFunction[Any]]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
      
      inline def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
      
      inline def setDecoratorsVarargs(value: DecoratorFunction[Any]*): Self = StObject.set(x, "decorators", js.Array(value*))
      
      inline def setLoaders(value: js.Array[LoaderFunction]): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
      
      inline def setLoadersUndefined: Self = StObject.set(x, "loaders", js.undefined)
      
      inline def setLoadersVarargs(value: LoaderFunction*): Self = StObject.set(x, "loaders", js.Array(value*))
      
      inline def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setStoryFn(value: StoryFn[Any]): Self = StObject.set(x, "storyFn", value.asInstanceOf[js.Any])
    }
  }
  
  type ArgTypesEnhancer = js.Function1[
    /* context */ StoryContext, 
    ArgTypes[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
    ]
  ]
  
  type ArgsEnhancer = js.Function1[
    /* context */ StoryContext, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
  ]
  
  trait ClientApiAddon[StoryFnReturnType]
    extends StObject
       with Addon {
    
    @JSName("apply")
    def apply(a: StoryApi[StoryFnReturnType], b: js.Array[Any]): Any
  }
  object ClientApiAddon {
    
    inline def apply[StoryFnReturnType](
      apply: (StoryApi[StoryFnReturnType], js.Array[Any]) => Any,
      render: RenderOptions => ReactElement,
      title: js.Function0[String] | String
    ): ClientApiAddon[StoryFnReturnType] = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), render = js.Any.fromFunction1(render), title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientApiAddon[StoryFnReturnType]]
    }
    
    extension [Self <: ClientApiAddon[?], StoryFnReturnType](x: Self & ClientApiAddon[StoryFnReturnType]) {
      
      inline def setApply(value: (StoryApi[StoryFnReturnType], js.Array[Any]) => Any): Self = StObject.set(x, "apply", js.Any.fromFunction2(value))
    }
  }
  
  type ClientApiAddons[StoryFnReturnType] = StringDictionary[ClientApiAddon[StoryFnReturnType]]
  
  trait ClientApiParams extends StObject {
    
    var decorateStory: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<AnyFramework> * / any['applyDecorators'] */ js.Any
      ] = js.undefined
    
    var noStoryModuleAddMethodHotDispose: js.UndefOr[Boolean] = js.undefined
    
    var storyStore: StoryStore[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any
      ]
  }
  object ClientApiParams {
    
    inline def apply(
      storyStore: StoryStore[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any
        ]
    ): ClientApiParams = {
      val __obj = js.Dynamic.literal(storyStore = storyStore.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientApiParams]
    }
    
    extension [Self <: ClientApiParams](x: Self) {
      
      inline def setDecorateStory(
        value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<AnyFramework> * / any['applyDecorators'] */ js.Any
      ): Self = StObject.set(x, "decorateStory", value.asInstanceOf[js.Any])
      
      inline def setDecorateStoryUndefined: Self = StObject.set(x, "decorateStory", js.undefined)
      
      inline def setNoStoryModuleAddMethodHotDispose(value: Boolean): Self = StObject.set(x, "noStoryModuleAddMethodHotDispose", value.asInstanceOf[js.Any])
      
      inline def setNoStoryModuleAddMethodHotDisposeUndefined: Self = StObject.set(x, "noStoryModuleAddMethodHotDispose", js.undefined)
      
      inline def setStoryStore(
        value: StoryStore[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any
            ]
      ): Self = StObject.set(x, "storyStore", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ClientApiReturnFn[StoryFnReturnType] extends StObject {
    
    def apply(args: Any*): StoryApi[StoryFnReturnType] = js.native
  }
  
  trait ErrorLike extends StObject {
    
    var message: String
    
    var stack: String
  }
  object ErrorLike {
    
    inline def apply(message: String, stack: String): ErrorLike = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorLike]
    }
    
    extension [Self <: ErrorLike](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetStorybookKind extends StObject {
    
    var fileName: String
    
    var kind: String
    
    var stories: js.Array[GetStorybookStory]
  }
  object GetStorybookKind {
    
    inline def apply(fileName: String, kind: String, stories: js.Array[GetStorybookStory]): GetStorybookKind = {
      val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetStorybookKind]
    }
    
    extension [Self <: GetStorybookKind](x: Self) {
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setStories(value: js.Array[GetStorybookStory]): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
      
      inline def setStoriesVarargs(value: GetStorybookStory*): Self = StObject.set(x, "stories", js.Array(value*))
    }
  }
  
  trait GetStorybookStory extends StObject {
    
    var name: String
    
    var render: StoryFn[Any]
  }
  object GetStorybookStory {
    
    inline def apply(name: String, render: StoryFn[Any]): GetStorybookStory = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetStorybookStory]
    }
    
    extension [Self <: GetStorybookStory](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRender(value: StoryFn[Any]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    }
  }
  
  type PublishedStoreItem = StoreItem & Globals
  
  /* Inlined std.Omit<@storybook/store.@storybook/store.RenderContext</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework * / any>, 'storyContext'> */
  trait RenderContextWithoutStoryContext extends StObject {
    
    var forceRemount: Boolean
    
    var showError: js.Function1[/* error */ Description, Unit]
    
    var showException: js.Function1[/* err */ js.Error, Unit]
    
    var showMain: js.Function0[Unit]
    
    var storyFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialStoryFn<TFramework> */ Any
    
    var unboundStoryFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryFn<TFramework> */ Any
  }
  object RenderContextWithoutStoryContext {
    
    inline def apply(
      forceRemount: Boolean,
      showError: /* error */ Description => Unit,
      showException: /* err */ js.Error => Unit,
      showMain: () => Unit,
      storyFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialStoryFn<TFramework> */ Any,
      unboundStoryFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryFn<TFramework> */ Any
    ): RenderContextWithoutStoryContext = {
      val __obj = js.Dynamic.literal(forceRemount = forceRemount.asInstanceOf[js.Any], showError = js.Any.fromFunction1(showError), showException = js.Any.fromFunction1(showException), showMain = js.Any.fromFunction0(showMain), storyFn = storyFn.asInstanceOf[js.Any], unboundStoryFn = unboundStoryFn.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderContextWithoutStoryContext]
    }
    
    extension [Self <: RenderContextWithoutStoryContext](x: Self) {
      
      inline def setForceRemount(value: Boolean): Self = StObject.set(x, "forceRemount", value.asInstanceOf[js.Any])
      
      inline def setShowError(value: /* error */ Description => Unit): Self = StObject.set(x, "showError", js.Any.fromFunction1(value))
      
      inline def setShowException(value: /* err */ js.Error => Unit): Self = StObject.set(x, "showException", js.Any.fromFunction1(value))
      
      inline def setShowMain(value: () => Unit): Self = StObject.set(x, "showMain", js.Any.fromFunction0(value))
      
      inline def setStoryFn(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialStoryFn<TFramework> */ Any
      ): Self = StObject.set(x, "storyFn", value.asInstanceOf[js.Any])
      
      inline def setUnboundStoryFn(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryFn<TFramework> */ Any
      ): Self = StObject.set(x, "unboundStoryFn", value.asInstanceOf[js.Any])
    }
  }
  
  type StoreData = StringDictionary[StoreItem]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryIdentifier * / any */ trait StoreItem extends StObject {
    
    def applyLoaders(): js.Promise[StoryContext]
    
    var argTypes: ArgTypes[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
      ]
    
    var args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
    
    def getDecorated(): StoryFn[Any]
    
    def getOriginal(): StoryFn[Any]
    
    var hooks: HooksContext[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any
      ]
    
    var initialArgs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
    
    var parameters: Parameters
    
    def playFunction(context: StoryContext): js.Promise[Unit] | Unit
    
    var storyFn: StoryFn[Any]
    
    var unboundStoryFn: StoryFn[Any]
  }
  object StoreItem {
    
    inline def apply(
      applyLoaders: () => js.Promise[StoryContext],
      argTypes: ArgTypes[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
        ],
      args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any,
      getDecorated: () => StoryFn[Any],
      getOriginal: () => StoryFn[Any],
      hooks: HooksContext[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any
        ],
      initialArgs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any,
      parameters: Parameters,
      playFunction: StoryContext => js.Promise[Unit] | Unit,
      storyFn: StoryFn[Any],
      unboundStoryFn: StoryFn[Any]
    ): StoreItem = {
      val __obj = js.Dynamic.literal(applyLoaders = js.Any.fromFunction0(applyLoaders), argTypes = argTypes.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], getDecorated = js.Any.fromFunction0(getDecorated), getOriginal = js.Any.fromFunction0(getOriginal), hooks = hooks.asInstanceOf[js.Any], initialArgs = initialArgs.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], playFunction = js.Any.fromFunction1(playFunction), storyFn = storyFn.asInstanceOf[js.Any], unboundStoryFn = unboundStoryFn.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoreItem]
    }
    
    extension [Self <: StoreItem](x: Self) {
      
      inline def setApplyLoaders(value: () => js.Promise[StoryContext]): Self = StObject.set(x, "applyLoaders", js.Any.fromFunction0(value))
      
      inline def setArgTypes(
        value: ArgTypes[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
            ]
      ): Self = StObject.set(x, "argTypes", value.asInstanceOf[js.Any])
      
      inline def setArgs(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
      ): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setGetDecorated(value: () => StoryFn[Any]): Self = StObject.set(x, "getDecorated", js.Any.fromFunction0(value))
      
      inline def setGetOriginal(value: () => StoryFn[Any]): Self = StObject.set(x, "getOriginal", js.Any.fromFunction0(value))
      
      inline def setHooks(
        value: HooksContext[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any
            ]
      ): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setInitialArgs(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
      ): Self = StObject.set(x, "initialArgs", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setPlayFunction(value: StoryContext => js.Promise[Unit] | Unit): Self = StObject.set(x, "playFunction", js.Any.fromFunction1(value))
      
      inline def setStoryFn(value: StoryFn[Any]): Self = StObject.set(x, "storyFn", value.asInstanceOf[js.Any])
      
      inline def setUnboundStoryFn(value: StoryFn[Any]): Self = StObject.set(x, "unboundStoryFn", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoreSelection extends StObject {
    
    var storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    
    var viewMode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewMode */ Any
  }
  object StoreSelection {
    
    inline def apply(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
      viewMode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewMode */ Any
    ): StoreSelection = {
      val __obj = js.Dynamic.literal(storyId = storyId.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoreSelection]
    }
    
    extension [Self <: StoreSelection](x: Self) {
      
      inline def setStoryId(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
      ): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
      
      inline def setViewMode(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewMode */ Any
      ): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoreSelectionSpecifier extends StObject {
    
    var args: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
      ] = js.undefined
    
    var globals: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
      ] = js.undefined
    
    var singleStory: js.UndefOr[Boolean] = js.undefined
    
    var storySpecifier: StorySpecifier
    
    var viewMode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewMode */ Any
  }
  object StoreSelectionSpecifier {
    
    inline def apply(
      storySpecifier: StorySpecifier,
      viewMode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewMode */ Any
    ): StoreSelectionSpecifier = {
      val __obj = js.Dynamic.literal(storySpecifier = storySpecifier.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoreSelectionSpecifier]
    }
    
    extension [Self <: StoreSelectionSpecifier](x: Self) {
      
      inline def setArgs(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
      ): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setGlobals(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
      ): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
      
      inline def setSingleStory(value: Boolean): Self = StObject.set(x, "singleStory", value.asInstanceOf[js.Any])
      
      inline def setSingleStoryUndefined: Self = StObject.set(x, "singleStory", js.undefined)
      
      inline def setStorySpecifier(value: StorySpecifier): Self = StObject.set(x, "storySpecifier", value.asInstanceOf[js.Any])
      
      inline def setViewMode(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewMode */ Any
      ): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoryMetadata extends StObject {
    
    var decorators: js.UndefOr[js.Array[DecoratorFunction[Any]]] = js.undefined
    
    var loaders: js.UndefOr[js.Array[LoaderFunction]] = js.undefined
    
    var parameters: js.UndefOr[Parameters] = js.undefined
  }
  object StoryMetadata {
    
    inline def apply(): StoryMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StoryMetadata]
    }
    
    extension [Self <: StoryMetadata](x: Self) {
      
      inline def setDecorators(value: js.Array[DecoratorFunction[Any]]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
      
      inline def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
      
      inline def setDecoratorsVarargs(value: DecoratorFunction[Any]*): Self = StObject.set(x, "decorators", js.Array(value*))
      
      inline def setLoaders(value: js.Array[LoaderFunction]): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
      
      inline def setLoadersUndefined: Self = StObject.set(x, "loaders", js.undefined)
      
      inline def setLoadersVarargs(value: LoaderFunction*): Self = StObject.set(x, "loaders", js.Array(value*))
      
      inline def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId * / scala.Any
    - typings.storybookClientApi.anon.Kind
    - typings.storybookClientApi.storybookClientApiStrings.Asterisk
  */
  type StorySpecifier = _StorySpecifier | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any)
  
  trait _StorySpecifier extends StObject
}
