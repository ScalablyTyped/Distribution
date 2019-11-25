package typings.atStorybookAddons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distHooksMod {
  import org.scalablytyped.runtime.StringDictionary

  type AbstractFunction = js.Function1[/* repeated */ js.Any, js.Any]
  type Decorator = js.Function2[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StoryGetter */ /* getStory */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StoryContext */ /* context */ js.Any, 
    js.Any
  ]
  type EventMap = StringDictionary[Listener]
}
