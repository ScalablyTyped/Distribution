package typings.storybookAddons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type ArgTypes = org.scalablytyped.runtime.StringDictionary[typings.storybookAddons.typesMod.ArgType]
  
  type Args = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type ArgsStoryFn[ReturnType] = js.Function2[
    /* a */ js.UndefOr[typings.storybookAddons.typesMod.Args], 
    /* p */ js.UndefOr[typings.storybookAddons.typesMod.StoryContext], 
    ReturnType
  ]
  
  type BaseDecorators[StoryFnReturnType] = js.Array[
    js.Function2[
      /* story */ js.Function0[StoryFnReturnType], 
      /* context */ typings.storybookAddons.typesMod.StoryContext, 
      StoryFnReturnType
    ]
  ]
  
  type ClientApiAddons[StoryFnReturnType] = org.scalablytyped.runtime.StringDictionary[typings.storybookAddons.typesMod.ClientApiAddon[StoryFnReturnType]]
  
  type ClientApiReturnFn[StoryFnReturnType] = js.Function1[
    /* repeated */ js.Any, 
    typings.storybookAddons.typesMod.StoryApi[StoryFnReturnType]
  ]
  
  type Comparator[T] = js.Function2[/* a */ T, /* b */ T, scala.Boolean | scala.Double]
  
  type DecorateStoryFunction[StoryFnReturnType] = js.Function2[
    /* storyFn */ typings.storybookAddons.typesMod.StoryFn[StoryFnReturnType], 
    /* decorators */ js.Array[typings.storybookAddons.typesMod.DecoratorFunction[StoryFnReturnType]], 
    typings.storybookAddons.typesMod.StoryFn[StoryFnReturnType]
  ]
  
  type DecoratorFunction[StoryFnReturnType] = js.Function2[
    /* fn */ typings.storybookAddons.typesMod.StoryFn[StoryFnReturnType], 
    /* c */ typings.storybookAddons.typesMod.StoryContext, 
    typings.std.ReturnType[typings.storybookAddons.typesMod.StoryFn[StoryFnReturnType]]
  ]
  
  type LegacyStoryFn[ReturnType] = js.Function1[/* p */ js.UndefOr[typings.storybookAddons.typesMod.StoryContext], ReturnType]
  
  type LoadFn = js.Function0[js.Any]
  
  type Loadable = typings.storybookAddons.typesMod.RequireContext | js.Array[typings.storybookAddons.typesMod.RequireContext] | typings.storybookAddons.typesMod.LoadFn
  
  type LoaderFunction = js.Function1[
    /* c */ typings.storybookAddons.typesMod.StoryContext, 
    js.Promise[typings.std.Record[java.lang.String, js.Any]]
  ]
  
  type MakeDecoratorResult = js.Function1[/* args */ js.Any, js.Any]
  
  type RequireContext = js.Any
  
  type StoryFn[ReturnType] = typings.storybookAddons.typesMod.LegacyStoryFn[ReturnType] | typings.storybookAddons.typesMod.ArgsStoryFn[ReturnType]
  
  type StoryGetter = js.Function1[/* context */ typings.storybookAddons.typesMod.StoryContext, js.Any]
  
  type StoryId = java.lang.String
  
  type StoryKind = java.lang.String
  
  type StoryName = java.lang.String
  
  type StorySortComparator = typings.storybookAddons.typesMod.Comparator[
    js.Tuple4[
      typings.storybookAddons.typesMod.StoryId, 
      js.Any, 
      typings.storybookAddons.typesMod.Parameters, 
      typings.storybookAddons.typesMod.Parameters
    ]
  ]
  
  type StorySortParameter = typings.storybookAddons.typesMod.StorySortComparator | typings.storybookAddons.typesMod.StorySortObjectParameter
  
  type StoryWrapper = js.Function3[
    /* getStory */ typings.storybookAddons.typesMod.StoryGetter, 
    /* context */ typings.storybookAddons.typesMod.StoryContext, 
    /* settings */ typings.storybookAddons.typesMod.WrapperSettings, 
    js.Any
  ]
  
  type Types_ = typings.storybookAddons.typesMod.types | java.lang.String
}
