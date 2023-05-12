package typings.storybookCsf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.std.Record
import typings.storybookCsf.anon.Groups
import typings.storybookCsf.anon.Name
import typings.storybookCsf.anon.SecondPass
import typings.storybookCsf.mod.^
import typings.typeFest.sourceUnionToIntersectionMod.UnionToIntersection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Helper function to include/exclude an arg based on the value of other other args
  * aka "conditional args"
  */
inline def includeConditionalArg(argType: InputType, args: Args, globals: Globals): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("includeConditionalArg")(argType.asInstanceOf[js.Any], args.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[Any]

/**
  * Does a named export match CSF inclusion/exclusion options?
  */
inline def isExportStory(key: String, param1: IncludeExcludeOptions): Boolean | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("isExportStory")(key.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Boolean | Null]

/**
  * Parse out the component/kind name from a path, using the given separator config.
  */
inline def parseKind(kind: String, param1: SeparatorOptions): Groups = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKind")(kind.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Groups]

/**
  * Remove punctuation and illegal characters from a story ID.
  *
  * See https://gist.github.com/davidjrice/9d2af51100e41c6c4b4a
  */
inline def sanitize(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(string.asInstanceOf[js.Any]).asInstanceOf[String]

/**
  * Transform a CSF named export into a readable story name
  */
inline def storyNameFromExport(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("storyNameFromExport")(key.asInstanceOf[js.Any]).asInstanceOf[String]

/**
  * Generate a storybook ID from a component/kind and story name.
  */
inline def toId(kind: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toId")(kind.asInstanceOf[js.Any]).asInstanceOf[String]
inline def toId(kind: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toId")(kind.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]

type AnnotatedStoryFn[TRenderer /* <: Renderer */, TArgs] = (ArgsStoryFn[TRenderer, TArgs]) & (StoryAnnotations[TRenderer, TArgs, Partial[TArgs]])

/** @deprecated - use `Renderer` */
type AnyFramework = Renderer

type ArgTypesEnhancer[TRenderer /* <: Renderer */, TArgs] = (js.Function1[/* context */ StoryContextForEnhancers[TRenderer, TArgs], StrictArgTypes[TArgs]]) & SecondPass

type Args = StringDictionary[Any]

type ArgsEnhancer[TRenderer /* <: Renderer */, TArgs] = js.Function1[/* context */ StoryContextForEnhancers[TRenderer, TArgs], TArgs]

type ArgsStoryFn[TRenderer /* <: Renderer */, TArgs] = js.Function2[
/* args */ TArgs, 
/* context */ StoryContext[TRenderer, TArgs], 
/* import warning: importer.ImportType#apply Failed type conversion: TRenderer & @storybook/csf.anon.T<TArgs>['storyResult'] */ js.Any]

type ComponentId = String

type ComponentTitle = String

type Conditional = ConditionalValue & ConditionalTest

type DecoratorApplicator[TRenderer /* <: Renderer */, TArgs] = js.Function2[
/* storyFn */ LegacyStoryFn[TRenderer, TArgs], 
/* decorators */ js.Array[DecoratorFunction[TRenderer, TArgs]], 
LegacyStoryFn[TRenderer, TArgs]]

type DecoratorFunction[TRenderer /* <: Renderer */, TArgs] = js.Function2[
/* fn */ PartialStoryFn[TRenderer, TArgs], 
/* c */ StoryContext[TRenderer, TArgs], 
/* import warning: importer.ImportType#apply Failed type conversion: TRenderer['storyResult'] */ js.Any]

type DecoratorsArgs[TRenderer /* <: Renderer */, Decorators] = UnionToIntersection[
/* import warning: importer.ImportType#apply Failed type conversion: Decorators extends @storybook/csf.@storybook/csf.DecoratorFunction<TRenderer, infer TArgs> ? TArgs : unknown */ js.Any]

type GlobalTypes = StringDictionary[InputType]

type Globals = StringDictionary[Any]

type LegacyAnnotatedStoryFn[TRenderer /* <: Renderer */, TArgs] = (StoryFn[TRenderer, TArgs]) & (StoryAnnotations[TRenderer, TArgs, Partial[TArgs]])

type LegacyStoryAnnotationsOrFn[TRenderer /* <: Renderer */, TArgs] = (LegacyAnnotatedStoryFn[TRenderer, TArgs]) | (StoryAnnotations[TRenderer, TArgs, Partial[TArgs]])

type LegacyStoryFn[TRenderer /* <: Renderer */, TArgs] = js.Function1[
/* context */ StoryContext[TRenderer, TArgs], 
/* import warning: importer.ImportType#apply Failed type conversion: TRenderer['storyResult'] */ js.Any]

type LoaderArgs[TRenderer /* <: Renderer */, Loaders] = UnionToIntersection[
/* import warning: importer.ImportType#apply Failed type conversion: Loaders extends @storybook/csf.@storybook/csf.LoaderFunction<TRenderer, infer TArgs> ? TArgs : unknown */ js.Any]

type LoaderFunction[TRenderer /* <: Renderer */, TArgs] = js.Function1[
/* context */ StoryContextForLoaders[TRenderer, TArgs], 
js.Promise[Record[String, Any]]]

type Parameters = StringDictionary[Any]

type PartialStoryFn[TRenderer /* <: Renderer */, TArgs] = js.Function1[
/* update */ js.UndefOr[StoryContextUpdate[Partial[TArgs]]], 
/* import warning: importer.ImportType#apply Failed type conversion: TRenderer['storyResult'] */ js.Any]

type PlayFunction[TRenderer /* <: Renderer */, TArgs] = js.Function1[/* context */ PlayFunctionContext[TRenderer, TArgs], js.Promise[Unit] | Unit]

type StepFunction[TRenderer /* <: Renderer */, TArgs] = js.Function2[
/* label */ StepLabel, 
/* play */ PlayFunction[TRenderer, TArgs], 
js.Promise[Unit] | Unit]

type StepLabel = String

type StepRunner[TRenderer /* <: Renderer */, TArgs] = js.Function3[
/* label */ StepLabel, 
/* play */ PlayFunction[TRenderer, TArgs], 
/* context */ PlayFunctionContext[TRenderer, TArgs], 
js.Promise[Unit]]

type StoryAnnotations[TRenderer /* <: Renderer */, TArgs, TRequiredArgs] = (BaseAnnotations[TRenderer, TArgs]) & (Name[TRenderer, TArgs]) & (/* import warning: importer.ImportType#apply Failed type conversion: {} extends TRequiredArgs ? {  args :TRequiredArgs | undefined} : {  args :TRequiredArgs} */ js.Any)

type StoryAnnotationsOrFn[TRenderer /* <: Renderer */, TArgs] = (AnnotatedStoryFn[TRenderer, TArgs]) | (StoryAnnotations[TRenderer, TArgs, Partial[TArgs]])

type StoryDescriptor = js.Array[String] | js.RegExp

type StoryDescriptor1 = js.Array[String] | js.RegExp

type StoryFn[TRenderer /* <: Renderer */, TArgs] = (LegacyStoryFn[TRenderer, TArgs]) | (ArgsStoryFn[TRenderer, TArgs])

type StoryId = String

/** @deprecated */
type StoryKind = ComponentTitle

type StoryName = String

type StrictArgs = StringDictionary[Any]

type StrictGlobalTypes = StringDictionary[StrictInputType]

type StrictParameters = StringDictionary[Any]

type Tag = String
