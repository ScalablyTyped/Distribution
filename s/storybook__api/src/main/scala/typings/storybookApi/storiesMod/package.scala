package typings.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object storiesMod {
  
  type GroupsList = js.Array[typings.storybookApi.storiesMod.Root | typings.storybookApi.storiesMod.Group]
  
  type SetStoriesPayload = typings.storybookApi.anon.Error | (typings.storybookApi.anon.Stories with (typings.std.Record[java.lang.String, scala.Nothing]))
  
  type StoriesHash = org.scalablytyped.runtime.StringDictionary[
    typings.storybookApi.storiesMod.Root | typings.storybookApi.storiesMod.Group | typings.storybookApi.storiesMod.Story
  ]
  
  type StoriesList = js.Array[typings.storybookApi.storiesMod.Group | typings.storybookApi.storiesMod.Story]
  
  type StoriesRaw = org.scalablytyped.runtime.StringDictionary[typings.storybookApi.storiesMod.StoryInput]
}
