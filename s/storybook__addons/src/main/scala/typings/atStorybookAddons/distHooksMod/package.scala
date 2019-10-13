package typings.atStorybookAddons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distHooksMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atStorybookAddons.distTypesMod.StoryContext
  import typings.atStorybookAddons.distTypesMod.StoryGetter

  type AbstractFunction = js.Function1[/* repeated */ js.Any, js.Any]
  type Decorator = js.Function2[/* getStory */ StoryGetter, /* context */ StoryContext, js.Any]
  type EventMap = StringDictionary[Listener]
}
