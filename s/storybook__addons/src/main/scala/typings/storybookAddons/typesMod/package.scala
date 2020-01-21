package typings.storybookAddons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ClientApiAddons[StoryFnReturnType] = org.scalablytyped.runtime.StringDictionary[typings.storybookAddons.typesMod.ClientApiAddon[StoryFnReturnType]]
  type ClientApiReturnFn[StoryFnReturnType] = js.Function1[
    /* repeated */ js.Any, 
    typings.storybookAddons.typesMod.StoryApi[StoryFnReturnType]
  ]
  type DecoratorFunction[StoryFnReturnType] = js.Function2[
    /* fn */ typings.storybookAddons.typesMod.StoryFn[StoryFnReturnType], 
    /* c */ typings.storybookAddons.typesMod.StoryContext, 
    typings.std.ReturnType[typings.storybookAddons.typesMod.StoryFn[StoryFnReturnType]]
  ]
  type LoadFn = js.Function0[js.Any]
  type Loadable = typings.storybookAddons.typesMod.RequireContext | js.Array[typings.storybookAddons.typesMod.RequireContext] | typings.storybookAddons.typesMod.LoadFn
  type MakeDecoratorResult = js.Function1[/* args */ js.Any, js.Any]
  type RequireContext = js.Any
  type StoryFn[ReturnType] = js.Function1[/* p */ js.UndefOr[typings.storybookAddons.typesMod.StoryContext], ReturnType]
  type StoryGetter = js.Function1[/* context */ typings.storybookAddons.typesMod.StoryContext, js.Any]
  type StoryWrapper = js.Function3[
    /* getStory */ typings.storybookAddons.typesMod.StoryGetter, 
    /* context */ typings.storybookAddons.typesMod.StoryContext, 
    /* settings */ typings.storybookAddons.typesMod.WrapperSettings, 
    js.Any
  ]
  type Types_ = typings.storybookAddons.typesMod.types | java.lang.String
}
