package typings.atStorybookClientDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  import org.scalablytyped.runtime.StringDictionary

  type ClientApiAddons[StoryFnReturnType] = StringDictionary[ClientApiAddon[StoryFnReturnType]]
  type ClientApiReturnFn[StoryFnReturnType] = js.Function1[
    /* repeated */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StoryApi<StoryFnReturnType> */ js.Any
  ]
  type LegacyData = StringDictionary[LegacyItem]
  type StoreData = StringDictionary[StoreItem]
}
