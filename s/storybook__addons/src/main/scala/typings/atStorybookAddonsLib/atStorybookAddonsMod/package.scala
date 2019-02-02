package typings
package atStorybookAddonsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atStorybookAddonsMod {
  type GetStoryFunc = js.Function1[
    /* context */ Context, 
    stdLib.ReturnType[atStorybookReactLib.atStorybookReactMod.StoryDecorator]
  ]
  type Wrapper[Options, Parameters] = js.Function3[
    /* getStory */ GetStoryFunc, 
    /* context */ Context, 
    /* optsAndParams */ atStorybookAddonsLib.Anon_Options[Options, Parameters], 
    stdLib.ReturnType[atStorybookReactLib.atStorybookReactMod.StoryDecorator]
  ]
}
