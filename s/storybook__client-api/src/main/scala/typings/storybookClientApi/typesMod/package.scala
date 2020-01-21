package typings.storybookClientApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ClientApiAddons[StoryFnReturnType] = org.scalablytyped.runtime.StringDictionary[typings.storybookClientApi.typesMod.ClientApiAddon[StoryFnReturnType]]
  type ClientApiReturnFn[StoryFnReturnType] = js.Function1[
    /* repeated */ js.Any, 
    typings.storybookAddons.typesMod.StoryApi[StoryFnReturnType]
  ]
  type LegacyData = org.scalablytyped.runtime.StringDictionary[typings.storybookClientApi.typesMod.LegacyItem]
  type StoreData = org.scalablytyped.runtime.StringDictionary[typings.storybookClientApi.typesMod.StoreItem]
}
