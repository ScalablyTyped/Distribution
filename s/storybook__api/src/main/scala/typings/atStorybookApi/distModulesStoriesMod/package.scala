package typings.atStorybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distModulesStoriesMod {
  import org.scalablytyped.runtime.StringDictionary

  type GroupsList = js.Array[Group]
  type ParameterName = String
  type StoriesHash = StringDictionary[Group | Story]
  type StoriesList = js.Array[Group | Story]
  type StoriesRaw = StringDictionary[StoryInput]
  type Story = StoryInput with Group
  type StoryId = String
  /* Rewritten from type alias, can be one of: 
    - typings.atStorybookApi.atStorybookApiStrings.story
    - typings.atStorybookApi.atStorybookApiStrings.info
    - typings.atStorybookApi.atStorybookApiStrings.settings
    - `js.undefined`
    - scala.Nothing
  */
  type ViewMode = js.UndefOr[_ViewMode]
}
