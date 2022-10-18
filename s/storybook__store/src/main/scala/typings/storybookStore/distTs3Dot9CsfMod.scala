package typings.storybookStore

import typings.storybookStore.anon.Call
import typings.storybookStore.distTs3Dot9CsfTestingUtilsMod.ComposeStory_
import typings.storybookStore.distTs3Dot9CsfTestingUtilsTypesMod.CSFExports
import typings.storybookStore.distTs3Dot9TypesMod.CSFFile
import typings.storybookStore.distTs3Dot9TypesMod.ModuleExports
import typings.storybookStore.distTs3Dot9TypesMod.NormalizedComponentAnnotations
import typings.storybookStore.distTs3Dot9TypesMod.NormalizedProjectAnnotations
import typings.storybookStore.distTs3Dot9TypesMod.NormalizedStoryAnnotations
import typings.storybookStore.distTs3Dot9TypesMod.Path
import typings.storybookStore.distTs3Dot9TypesMod.Story
import typings.storybookStore.distTs3Dot9TypesMod.WebProjectAnnotations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9CsfMod {
  
  @JSImport("@storybook/store/dist/ts3.9/csf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    storyAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<TFramework, TArgs> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryAnnotations<TFramework, TArgs> */ Any,
    componentAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, TArgs> */ Any
  ): Call[TArgs, TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(storyAnnotations.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs, TFramework]]
  inline def composeStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any */](
    storyAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<TFramework, TArgs> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryAnnotations<TFramework, TArgs> */ Any,
    componentAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, TArgs> */ Any,
    projectAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
  ): Call[TArgs, TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(storyAnnotations.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any], projectAnnotations.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs, TFramework]]
  inline def composeStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any */](
    storyAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<TFramework, TArgs> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryAnnotations<TFramework, TArgs> */ Any,
    componentAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, TArgs> */ Any,
    projectAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any,
    defaultConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
  ): Call[TArgs, TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(storyAnnotations.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any], projectAnnotations.asInstanceOf[js.Any], defaultConfig.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs, TFramework]]
  inline def composeStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any */](
    storyAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<TFramework, TArgs> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryAnnotations<TFramework, TArgs> */ Any,
    componentAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, TArgs> */ Any,
    projectAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any,
    defaultConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any,
    exportsName: String
  ): Call[TArgs, TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(storyAnnotations.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any], projectAnnotations.asInstanceOf[js.Any], defaultConfig.asInstanceOf[js.Any], exportsName.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs, TFramework]]
  inline def composeStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any */](
    storyAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<TFramework, TArgs> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryAnnotations<TFramework, TArgs> */ Any,
    componentAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, TArgs> */ Any,
    projectAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any,
    defaultConfig: Unit,
    exportsName: String
  ): Call[TArgs, TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(storyAnnotations.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any], projectAnnotations.asInstanceOf[js.Any], defaultConfig.asInstanceOf[js.Any], exportsName.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs, TFramework]]
  inline def composeStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any */](
    storyAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<TFramework, TArgs> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryAnnotations<TFramework, TArgs> */ Any,
    componentAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, TArgs> */ Any,
    projectAnnotations: Unit,
    defaultConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
  ): Call[TArgs, TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(storyAnnotations.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any], projectAnnotations.asInstanceOf[js.Any], defaultConfig.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs, TFramework]]
  inline def composeStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any */](
    storyAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<TFramework, TArgs> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryAnnotations<TFramework, TArgs> */ Any,
    componentAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, TArgs> */ Any,
    projectAnnotations: Unit,
    defaultConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any,
    exportsName: String
  ): Call[TArgs, TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(storyAnnotations.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any], projectAnnotations.asInstanceOf[js.Any], defaultConfig.asInstanceOf[js.Any], exportsName.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs, TFramework]]
  inline def composeStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */, TArgs /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any */](
    storyAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<TFramework, TArgs> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryAnnotations<TFramework, TArgs> */ Any,
    componentAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<TFramework, TArgs> */ Any,
    projectAnnotations: Unit,
    defaultConfig: Unit,
    exportsName: String
  ): Call[TArgs, TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeStory")(storyAnnotations.asInstanceOf[js.Any], componentAnnotations.asInstanceOf[js.Any], projectAnnotations.asInstanceOf[js.Any], defaultConfig.asInstanceOf[js.Any], exportsName.asInstanceOf[js.Any])).asInstanceOf[Call[TArgs, TFramework]]
  
  inline def getArrayField[TFieldType](moduleExportList: js.Array[ModuleExports], field: String): js.Array[TFieldType] = (^.asInstanceOf[js.Dynamic].applyDynamic("getArrayField")(moduleExportList.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[js.Array[TFieldType]]
  
  inline def getField[TFieldType](moduleExportList: js.Array[ModuleExports], field: String): TFieldType | js.Array[TFieldType] = (^.asInstanceOf[js.Dynamic].applyDynamic("getField")(moduleExportList.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[TFieldType | js.Array[TFieldType]]
  
  inline def getObjectField[TFieldType](moduleExportList: js.Array[ModuleExports], field: String): TFieldType = (^.asInstanceOf[js.Dynamic].applyDynamic("getObjectField")(moduleExportList.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[TFieldType]
  
  inline def getSingletonField[TFieldType](moduleExportList: js.Array[ModuleExports], field: String): TFieldType = (^.asInstanceOf[js.Dynamic].applyDynamic("getSingletonField")(moduleExportList.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[TFieldType]
  
  inline def getValuesFromArgTypes(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getValuesFromArgTypes")().asInstanceOf[Any]
  inline def getValuesFromArgTypes(
    argTypes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArgTypes */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getValuesFromArgTypes")(argTypes.asInstanceOf[js.Any]).asInstanceOf[Any]
  
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
    inputTypes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArgTypes */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalTypes */ Any
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
  
  inline def setProjectAnnotations[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    projectAnnotations: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setProjectAnnotations")(projectAnnotations.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setProjectAnnotations[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    projectAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setProjectAnnotations")(projectAnnotations.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
