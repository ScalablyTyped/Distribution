package typings.atStorybookAddons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.ReturnType

  type ClientApiAddons[StoryFnReturnType] = StringDictionary[ClientApiAddon[StoryFnReturnType]]
  type ClientApiReturnFn[StoryFnReturnType] = js.Function1[/* repeated */ js.Any, StoryApi[StoryFnReturnType]]
  type DecoratorFunction[StoryFnReturnType] = js.Function2[
    /* fn */ StoryFn[StoryFnReturnType], 
    /* c */ StoryContext, 
    ReturnType[StoryFn[StoryFnReturnType]]
  ]
  type LoadFn = js.Function0[js.Any]
  type Loadable = RequireContext | js.Array[RequireContext] | LoadFn
  type MakeDecoratorResult = js.Function1[/* args */ js.Any, js.Any]
  type RequireContext = js.Any
  type StoryFn[ReturnType] = js.Function1[/* p */ js.UndefOr[StoryContext], ReturnType]
  type StoryGetter = js.Function1[/* context */ StoryContext, js.Any]
  type StoryWrapper = js.Function3[
    /* getStory */ StoryGetter, 
    /* context */ StoryContext, 
    /* settings */ WrapperSettings, 
    js.Any
  ]
  type Types = types | String
}
