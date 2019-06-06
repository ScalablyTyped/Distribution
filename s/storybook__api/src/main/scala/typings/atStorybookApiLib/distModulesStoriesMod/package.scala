package typings
package atStorybookApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distModulesStoriesMod {
  type GroupsList = js.Array[Group]
  type ParameterName = java.lang.String
  type StoriesHash = org.scalablytyped.runtime.StringDictionary[Group | Story]
  type StoriesList = js.Array[Group | Story]
  type StoriesRaw = org.scalablytyped.runtime.StringDictionary[StoryInput]
  type Story = StoryInput with Group
  type StoryId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - atStorybookApiLib.atStorybookApiLibStrings.story
    - atStorybookApiLib.atStorybookApiLibStrings.info
    - `js.undefined`
    - scala.Nothing
  */
  type ViewMode = js.UndefOr[_ViewMode]
}
