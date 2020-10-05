package typings.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object storiesMod {
  type GroupsList = js.Array[typings.storybookApi.storiesMod.Group]
  type ParameterName = java.lang.String
  type StoriesHash = org.scalablytyped.runtime.StringDictionary[typings.storybookApi.storiesMod.Group | typings.storybookApi.storiesMod.Story]
  type StoriesList = js.Array[typings.storybookApi.storiesMod.Group | typings.storybookApi.storiesMod.Story]
  type StoriesRaw = org.scalablytyped.runtime.StringDictionary[typings.storybookApi.storiesMod.StoryInput]
  type Story = typings.storybookApi.storiesMod.StoryInput with typings.storybookApi.storiesMod.Group
  type StoryId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.storybookApi.storybookApiStrings.story
    - typings.storybookApi.storybookApiStrings.info
    - typings.storybookApi.storybookApiStrings.settings
    - js.UndefOr[scala.Nothing]
  */
  type ViewMode = js.UndefOr[typings.storybookApi.storiesMod._ViewMode]
}
