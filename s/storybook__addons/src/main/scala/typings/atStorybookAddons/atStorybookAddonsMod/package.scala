package typings.atStorybookAddons

import typings.atStorybookAddons.Anon_Options
import typings.atStorybookReact.atStorybookReactMod.StoryDecorator
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atStorybookAddonsMod {
  type GetStoryFunc = js.Function1[/* context */ Context, ReturnType[StoryDecorator]]
  type Wrapper[Options, Parameters] = js.Function3[
    /* getStory */ GetStoryFunc, 
    /* context */ Context, 
    /* optsAndParams */ Anon_Options[Options, Parameters], 
    ReturnType[StoryDecorator]
  ]
}
