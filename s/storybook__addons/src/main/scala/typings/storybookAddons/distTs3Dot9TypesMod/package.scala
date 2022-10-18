package typings.storybookAddons.distTs3Dot9TypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.storybookAddons.distTs3Dot9TypesMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def isSupportedType(`type`: Types_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

type ArgsStoryFn[ReturnType] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArgsStoryFnForFramework<ReturnTypeFramework<ReturnType>> */ Any

type BaseDecorators[StoryFnReturnType] = js.Array[
js.Function2[
  /* story */ js.Function0[StoryFnReturnType], 
  /* context */ StoryContext, 
  StoryFnReturnType
]]

type BaseStory[Args, StoryFnReturnType] = (BaseStoryFn[Args, StoryFnReturnType]) | (BaseStoryObject[Args, StoryFnReturnType])

type BaseStoryFn[Args, StoryFnReturnType] = (js.Function2[/* args */ Args, /* context */ StoryContext, StoryFnReturnType]) & (BaseStoryObject[Args, StoryFnReturnType])

type ClientApiAddons[StoryFnReturnType] = StringDictionary[ClientApiAddon[StoryFnReturnType]]

type Comparator[T] = js.Function2[/* a */ T, /* b */ T, Boolean | Double]

type DecoratorFunction[StoryFnReturnType] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DecoratorFunctionForFramework<ReturnTypeFramework<StoryFnReturnType>> */ Any

type LegacyStoryFn[ReturnType] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryFnForFramework<ReturnTypeFramework<ReturnType>> */ Any

type LoadFn = js.Function0[Any]

type Loadable = RequireContext | js.Array[RequireContext] | LoadFn

type LoaderFunction = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LoaderFunctionForFramework<ReturnTypeFramework<unknown>> */ Any

type MakeDecoratorResult = js.Function1[/* args */ Any, Any]

type PartialStoryFn[ReturnType] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialStoryFnForFramework<ReturnTypeFramework<ReturnType>> */ Any

type RequireContext = Any

type StoryContext = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContextForFramework<AnyFramework> */ Any

type StoryContextUpdate = Partial[StoryContext]

type StoryFn[ReturnType] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryFnForFramework<ReturnTypeFramework<ReturnType>> */ Any

type StorySortComparator = Comparator[
js.Tuple4[
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any, 
  Any, 
  Parameters, 
  Parameters
]]

type StorySortComparatorV7 = Comparator[StoryIndexEntry]

type StorySortParameter = StorySortComparator | StorySortObjectParameter

type StorySortParameterV7 = StorySortComparatorV7 | StorySortObjectParameter

type StoryWrapper = js.Function3[
/* storyFn */ LegacyStoryFn[Any], 
/* context */ StoryContext, 
/* settings */ WrapperSettings, 
Any]

type Types_ = types | String
