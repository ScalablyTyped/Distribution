package typings.storybookClientApi

import typings.qs.mod.ParsedQs
import typings.std.Parameters
import typings.std.Partial
import typings.std.Record
import typings.storybookAddons.anon.Current
import typings.storybookAddons.hooksMod.EventMap
import typings.storybookAddons.typesMod.StorySortParameter
import typings.storybookAddons.typesMod.StorySortParameterV7
import typings.storybookStore.anon.Call
import typings.storybookStore.autoTitleMod.NormalizedStoriesSpecifier
import typings.storybookStore.filterArgTypesMod.PropDescriptor
import typings.storybookStore.testingUtilsMod.ComposeStory_
import typings.storybookStore.ts39TypesMod.CSFFile
import typings.storybookStore.ts39TypesMod.ModuleExports
import typings.storybookStore.ts39TypesMod.NormalizedComponentAnnotations
import typings.storybookStore.ts39TypesMod.NormalizedProjectAnnotations
import typings.storybookStore.ts39TypesMod.NormalizedStoryAnnotations
import typings.storybookStore.ts39TypesMod.Path
import typings.storybookStore.ts39TypesMod.Story
import typings.storybookStore.ts39TypesMod.StoryIndexEntry
import typings.storybookStore.ts39TypesMod.WebProjectAnnotations
import typings.storybookStore.typesMod.CSFExports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/client-api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/client-api", "ClientApi")
  @js.native
  open class ClientApi[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] ()
    extends typings.storybookClientApi.clientApiMod.ClientApi[TFramework] {
    def this(hasStoryStore: typings.storybookClientApi.anon.StoryStore[TFramework]) = this()
  }
  
  @JSImport("@storybook/client-api", "DEEPLY_EQUAL")
  @js.native
  val DEEPLY_EQUAL: js.Symbol = js.native
  
  @JSImport("@storybook/client-api", "HooksContext")
  @js.native
  open class HooksContext[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] ()
    extends typings.storybookStore.mod.HooksContext[TFramework]
  
  @JSImport("@storybook/client-api", "NO_TARGET_NAME")
  @js.native
  val NO_TARGET_NAME: /* "" */ String = js.native
  
  @JSImport("@storybook/client-api", "StoryStore")
  @js.native
  open class StoryStore[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] ()
    extends typings.storybookStore.mod.StoryStore[TFramework]
  
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
  
  inline def applyHooks[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    applyDecorators: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DecoratorApplicator<TFramework, Args> */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("applyHooks")(applyDecorators.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def combineArgs(value: Any, update: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("combineArgs")(value.asInstanceOf[js.Any], update.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def combineParameters(parameterSets: js.UndefOr[typings.storybookAddons.typesMod.Parameters]*): typings.storybookAddons.typesMod.Parameters = ^.asInstanceOf[js.Dynamic].applyDynamic("combineParameters")(parameterSets.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.storybookAddons.typesMod.Parameters]
  
  inline def composeConfigs[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](moduleExportList: js.Array[ModuleExports]): WebProjectAnnotations[TFramework] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeConfigs")(moduleExportList.asInstanceOf[js.Any]).asInstanceOf[WebProjectAnnotations[TFramework]]
  
  inline def composeStories[TModule /* <: CSFExports[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any
  ] */](
    storiesImport: TModule,
    globalConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<AnyFramework> */ Any,
    composeStoryFn: ComposeStory_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
    ]
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStories")(storiesImport.asInstanceOf[js.Any], globalConfig.asInstanceOf[js.Any], composeStoryFn.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def composeStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any */](
    storyAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<TFramework, TArgs> */ Any,
    componentAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, TArgs> */ Any
  ): Call[TArgs, TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(storyAnnotations.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs, TFramework]]
  inline def composeStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any */](
    storyAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<TFramework, TArgs> */ Any,
    componentAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, TArgs> */ Any,
    projectAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
  ): Call[TArgs, TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(storyAnnotations.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any], projectAnnotations.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs, TFramework]]
  inline def composeStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any */](
    storyAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<TFramework, TArgs> */ Any,
    componentAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, TArgs> */ Any,
    projectAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any,
    defaultConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
  ): Call[TArgs, TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(storyAnnotations.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any], projectAnnotations.asInstanceOf[js.Any], defaultConfig.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs, TFramework]]
  inline def composeStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any */](
    storyAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<TFramework, TArgs> */ Any,
    componentAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, TArgs> */ Any,
    projectAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any,
    defaultConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any,
    exportsName: String
  ): Call[TArgs, TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(storyAnnotations.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any], projectAnnotations.asInstanceOf[js.Any], defaultConfig.asInstanceOf[js.Any], exportsName.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs, TFramework]]
  inline def composeStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any */](
    storyAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<TFramework, TArgs> */ Any,
    componentAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, TArgs> */ Any,
    projectAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any,
    defaultConfig: Unit,
    exportsName: String
  ): Call[TArgs, TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(storyAnnotations.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any], projectAnnotations.asInstanceOf[js.Any], defaultConfig.asInstanceOf[js.Any], exportsName.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs, TFramework]]
  inline def composeStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any */](
    storyAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<TFramework, TArgs> */ Any,
    componentAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, TArgs> */ Any,
    projectAnnotations: Unit,
    defaultConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
  ): Call[TArgs, TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(storyAnnotations.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any], projectAnnotations.asInstanceOf[js.Any], defaultConfig.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs, TFramework]]
  inline def composeStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any */](
    storyAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<TFramework, TArgs> */ Any,
    componentAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, TArgs> */ Any,
    projectAnnotations: Unit,
    defaultConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any,
    exportsName: String
  ): Call[TArgs, TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(storyAnnotations.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any], projectAnnotations.asInstanceOf[js.Any], defaultConfig.asInstanceOf[js.Any], exportsName.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs, TFramework]]
  inline def composeStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any */](
    storyAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<TFramework, TArgs> */ Any,
    componentAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, TArgs> */ Any,
    projectAnnotations: Unit,
    defaultConfig: Unit,
    exportsName: String
  ): Call[TArgs, TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(storyAnnotations.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any], projectAnnotations.asInstanceOf[js.Any], defaultConfig.asInstanceOf[js.Any], exportsName.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs, TFramework]]
  
  inline def decorateStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    storyFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryFn<TFramework> */ Any,
    decorator: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DecoratorFunction<TFramework> */ Any,
    bindWithContext: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryFn<TFramework> */ /* storyFn */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialStoryFn<TFramework> */ Any
    ]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decorateStory")(storyFn.asInstanceOf[js.Any], decorator.asInstanceOf[js.Any], bindWithContext.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def deepDiff(value: Any, update: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deepDiff")(value.asInstanceOf[js.Any], update.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def defaultDecorateStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    storyFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryFn<TFramework> */ Any,
    decorators: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DecoratorFunction<TFramework> */ Any
    ]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultDecorateStory")(storyFn.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def filterArgTypes(
    argTypes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StrictArgTypes */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterArgTypes")(argTypes.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def filterArgTypes(
    argTypes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StrictArgTypes */ Any,
    include: Unit,
    exclude: PropDescriptor
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("filterArgTypes")(argTypes.asInstanceOf[js.Any], include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def filterArgTypes(
    argTypes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StrictArgTypes */ Any,
    include: PropDescriptor
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("filterArgTypes")(argTypes.asInstanceOf[js.Any], include.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def filterArgTypes(
    argTypes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StrictArgTypes */ Any,
    include: PropDescriptor,
    exclude: PropDescriptor
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("filterArgTypes")(argTypes.asInstanceOf[js.Any], include.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getArrayField[TFieldType](moduleExportList: js.Array[ModuleExports], field: String): js.Array[TFieldType] = (^.asInstanceOf[js.Dynamic].applyDynamic("getArrayField")(moduleExportList.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[js.Array[TFieldType]]
  
  inline def getField[TFieldType](moduleExportList: js.Array[ModuleExports], field: String): TFieldType | js.Array[TFieldType] = (^.asInstanceOf[js.Dynamic].applyDynamic("getField")(moduleExportList.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[TFieldType | js.Array[TFieldType]]
  
  inline def getObjectField[TFieldType](moduleExportList: js.Array[ModuleExports], field: String): TFieldType = (^.asInstanceOf[js.Dynamic].applyDynamic("getObjectField")(moduleExportList.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[TFieldType]
  
  inline def getQueryParam(key: String): String | (js.Array[ParsedQs | String]) | ParsedQs = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueryParam")(key.asInstanceOf[js.Any]).asInstanceOf[String | (js.Array[ParsedQs | String]) | ParsedQs]
  
  inline def getQueryParams(): ParsedQs = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueryParams")().asInstanceOf[ParsedQs]
  
  inline def getSingletonField[TFieldType](moduleExportList: js.Array[ModuleExports], field: String): TFieldType = (^.asInstanceOf[js.Dynamic].applyDynamic("getSingletonField")(moduleExportList.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[TFieldType]
  
  inline def getValuesFromArgTypes(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getValuesFromArgTypes")().asInstanceOf[Any]
  inline def getValuesFromArgTypes(
    argTypes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArgTypes */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getValuesFromArgTypes")(argTypes.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def groupArgsByTarget[TArgs](
    hasArgsArgTypes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContext<AnyFramework, TArgs> */ Any
  ): Record[String, Partial[TArgs]] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupArgsByTarget")(hasArgsArgTypes.asInstanceOf[js.Any]).asInstanceOf[Record[String, Partial[TArgs]]]
  
  @JSImport("@storybook/client-api", "inferControls")
  @js.native
  val inferControls: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArgTypesEnhancer<AnyFramework> */ Any = js.native
  
  inline def mapArgsToTypes(
    args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any,
    argTypes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArgTypes */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mapArgsToTypes")(args.asInstanceOf[js.Any], argTypes.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def noTargetArgs[TArgs](
    context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContext<AnyFramework, TArgs> */ Any
  ): Partial[TArgs] = ^.asInstanceOf[js.Dynamic].applyDynamic("noTargetArgs")(context.asInstanceOf[js.Any]).asInstanceOf[Partial[TArgs]]
  
  inline def normalizeComponentAnnotations_default[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    defaultExport: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/store.@storybook/store/dist/ts3.9/types.ModuleExports['default'] */ js.Any
  ): NormalizedComponentAnnotations[TFramework] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeComponentAnnotations")(defaultExport.asInstanceOf[js.Any]).asInstanceOf[NormalizedComponentAnnotations[TFramework]]
  inline def normalizeComponentAnnotations_default[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    defaultExport: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/store.@storybook/store/dist/ts3.9/types.ModuleExports['default'] */ js.Any,
    title: String
  ): NormalizedComponentAnnotations[TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeComponentAnnotations")(defaultExport.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[NormalizedComponentAnnotations[TFramework]]
  inline def normalizeComponentAnnotations_default[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    defaultExport: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/store.@storybook/store/dist/ts3.9/types.ModuleExports['default'] */ js.Any,
    title: String,
    importPath: String
  ): NormalizedComponentAnnotations[TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeComponentAnnotations")(defaultExport.asInstanceOf[js.Any], title.asInstanceOf[js.Any], importPath.asInstanceOf[js.Any])).asInstanceOf[NormalizedComponentAnnotations[TFramework]]
  inline def normalizeComponentAnnotations_default[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    defaultExport: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/store.@storybook/store/dist/ts3.9/types.ModuleExports['default'] */ js.Any,
    title: Unit,
    importPath: String
  ): NormalizedComponentAnnotations[TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeComponentAnnotations")(defaultExport.asInstanceOf[js.Any], title.asInstanceOf[js.Any], importPath.asInstanceOf[js.Any])).asInstanceOf[NormalizedComponentAnnotations[TFramework]]
  
  inline def normalizeInputType(
    inputType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InputType */ Any,
    key: String
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeInputType")(inputType.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def normalizeInputTypes(
    inputTypes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArgTypes */ Any
  ): /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StrictArgTypes */ Any = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeInputTypes")(inputTypes.asInstanceOf[js.Any]).asInstanceOf[/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StrictArgTypes */ Any]
  
  inline def normalizeProjectAnnotations[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    hasArgTypesGlobalTypesArgTypesEnhancersAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
  ): NormalizedProjectAnnotations[TFramework] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeProjectAnnotations")(hasArgTypesGlobalTypesArgTypesEnhancersAnnotations.asInstanceOf[js.Any]).asInstanceOf[NormalizedProjectAnnotations[TFramework]]
  
  inline def normalizeStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
    storyAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryAnnotationsOrFn<TFramework> */ Any,
    meta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework> */ Any
  ): NormalizedStoryAnnotations[TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeStory")(key.asInstanceOf[js.Any], storyAnnotations.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[NormalizedStoryAnnotations[TFramework]]
  
  inline def prepareStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    storyAnnotations: NormalizedStoryAnnotations[TFramework],
    componentAnnotations: NormalizedComponentAnnotations[TFramework],
    projectAnnotations: NormalizedProjectAnnotations[TFramework]
  ): Story[TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareStory")(storyAnnotations.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any], projectAnnotations.asInstanceOf[js.Any])).asInstanceOf[Story[TFramework]]
  
  inline def processCSFFile[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    moduleExports: ModuleExports,
    importPath: Path,
    title: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentTitle */ Any
  ): CSFFile[TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("processCSFFile")(moduleExports.asInstanceOf[js.Any], importPath.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[CSFFile[TFramework]]
  
  inline def sanitizeStoryContextUpdate(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeStoryContextUpdate")().asInstanceOf[Any]
  inline def sanitizeStoryContextUpdate(
    hasComponentIdTitleKindIdNameStoryParametersInitialArgsArgTypesUpdate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContextUpdate */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeStoryContextUpdate")(hasComponentIdTitleKindIdNameStoryParametersInitialArgsArgTypesUpdate.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def setGlobalRender(
    render: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryFn<AnyFramework> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalRender")(render.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setProjectAnnotations[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    projectAnnotations: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setProjectAnnotations")(projectAnnotations.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setProjectAnnotations[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    projectAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setProjectAnnotations")(projectAnnotations.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sortStoriesV6(
    stories: js.Array[
      js.Tuple4[
        String, 
        Story[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any
        ], 
        Parameters[js.Function1[/* args */ Any, Any]], 
        Parameters[js.Function1[/* args */ Any, Any]]
      ]
    ],
    storySortParameter: StorySortParameter,
    fileNameOrder: js.Array[Path]
  ): js.Array[StoryIndexEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortStoriesV6")(stories.asInstanceOf[js.Any], storySortParameter.asInstanceOf[js.Any], fileNameOrder.asInstanceOf[js.Any])).asInstanceOf[js.Array[StoryIndexEntry]]
  
  inline def sortStoriesV7(
    stories: js.Array[StoryIndexEntry],
    storySortParameter: StorySortParameterV7,
    fileNameOrder: js.Array[Path]
  ): js.Array[StoryIndexEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortStoriesV7")(stories.asInstanceOf[js.Any], storySortParameter.asInstanceOf[js.Any], fileNameOrder.asInstanceOf[js.Any])).asInstanceOf[js.Array[StoryIndexEntry]]
  
  inline def useAddonState[S](addonId: String): js.Tuple2[S, js.Function1[/* s */ S, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAddonState")(addonId.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, js.Function1[/* s */ S, Unit]]]
  inline def useAddonState[S](addonId: String, defaultState: S): js.Tuple2[S, js.Function1[/* s */ S, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAddonState")(addonId.asInstanceOf[js.Any], defaultState.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, js.Function1[/* s */ S, Unit]]]
  
  inline def useArgs(): js.Tuple3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ /* newArgs */ Any, 
      Unit
    ], 
    js.Function1[/* argNames */ js.UndefOr[js.Array[String]], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useArgs")().asInstanceOf[js.Tuple3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ /* newArgs */ Any, 
      Unit
    ], 
    js.Function1[/* argNames */ js.UndefOr[js.Array[String]], Unit]
  ]]
  
  inline def useCallback[T](callback: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useCallback[T](callback: T, deps: js.Array[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useChannel(eventMap: EventMap): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useChannel")(eventMap.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def useChannel(eventMap: EventMap, deps: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useChannel")(eventMap.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def useEffect(create: js.Function0[js.Function0[Unit] | Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(create.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useEffect(create: js.Function0[js.Function0[Unit] | Unit], deps: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(create.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobals(): js.Tuple2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ /* newGlobals */ Any, 
      Unit
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useGlobals")().asInstanceOf[js.Tuple2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ /* newGlobals */ Any, 
      Unit
    ]
  ]]
  
  inline def useMemo[T](nextCreate: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(nextCreate.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useMemo[T](nextCreate: js.Function0[T], deps: js.Array[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(nextCreate.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useParameter[S](parameterKey: String): js.UndefOr[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("useParameter")(parameterKey.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[S]]
  inline def useParameter[S](parameterKey: String, defaultValue: S): js.UndefOr[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("useParameter")(parameterKey.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[S]]
  
  inline def useReducer[S, A](reducer: js.Function2[/* state */ S, /* action */ A, S], initialState: S): js.Tuple2[S, js.Function1[/* action */ A, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, js.Function1[/* action */ A, Unit]]]
  inline def useReducer[S, I, A](
    reducer: js.Function2[/* state */ S, /* action */ A, S],
    initialArg: I,
    init: js.Function1[/* initialArg */ I, S]
  ): js.Tuple2[S, js.Function1[/* action */ A, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initialArg.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, js.Function1[/* action */ A, Unit]]]
  
  inline def useRef[T](initialValue: T): Current[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[Current[T]]
  
  inline def useSharedState[S](sharedId: String): js.Tuple2[S, js.Function1[/* s */ S, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSharedState")(sharedId.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, js.Function1[/* s */ S, Unit]]]
  inline def useSharedState[S](sharedId: String, defaultState: S): js.Tuple2[S, js.Function1[/* s */ S, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSharedState")(sharedId.asInstanceOf[js.Any], defaultState.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, js.Function1[/* s */ S, Unit]]]
  
  inline def useState[S](initialState: S): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]]]
  inline def useState[S](initialState: js.Function0[S]): js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, js.Function1[/* update */ (js.Function1[/* prevState */ S, S]) | S, Unit]]]
  
  inline def useStoryContext[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useStoryContext")().asInstanceOf[Any]
  
  inline def userOrAutoTitle(fileName: String, storiesEntries: js.Array[NormalizedStoriesSpecifier]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("userOrAutoTitle")(fileName.asInstanceOf[js.Any], storiesEntries.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def userOrAutoTitle(fileName: String, storiesEntries: js.Array[NormalizedStoriesSpecifier], userTitle: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("userOrAutoTitle")(fileName.asInstanceOf[js.Any], storiesEntries.asInstanceOf[js.Any], userTitle.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def userOrAutoTitleFromSpecifier(fileName: String, entry: NormalizedStoriesSpecifier): String = (^.asInstanceOf[js.Dynamic].applyDynamic("userOrAutoTitleFromSpecifier")(fileName.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def userOrAutoTitleFromSpecifier(fileName: String, entry: NormalizedStoriesSpecifier, userTitle: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("userOrAutoTitleFromSpecifier")(fileName.asInstanceOf[js.Any], entry.asInstanceOf[js.Any], userTitle.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def userOrAutoTitleFromSpecifier(fileName: Double, entry: NormalizedStoriesSpecifier): String = (^.asInstanceOf[js.Dynamic].applyDynamic("userOrAutoTitleFromSpecifier")(fileName.asInstanceOf[js.Any], entry.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def userOrAutoTitleFromSpecifier(fileName: Double, entry: NormalizedStoriesSpecifier, userTitle: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("userOrAutoTitleFromSpecifier")(fileName.asInstanceOf[js.Any], entry.asInstanceOf[js.Any], userTitle.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def validateOptions(
    args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any,
    argTypes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArgTypes */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("validateOptions")(args.asInstanceOf[js.Any], argTypes.asInstanceOf[js.Any])).asInstanceOf[Any]
}
