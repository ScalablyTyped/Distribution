package typings
package atStorybookApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Direction extends js.Object {
  def getCurrentStoryData(): atStorybookApiLib.distModulesStoriesMod.Group | atStorybookApiLib.distModulesStoriesMod.Story = js.native
  def getData(storyId: java.lang.String): atStorybookApiLib.distModulesStoriesMod.Group | atStorybookApiLib.distModulesStoriesMod.Story = js.native
  def getParameters(storyId: java.lang.String): js.Any = js.native
  def getParameters(storyId: java.lang.String, parameterName: java.lang.String): js.Any = js.native
  def jumpToComponent(direction: atStorybookApiLib.distModulesStoriesMod.Direction): scala.Unit = js.native
  def jumpToStory(direction: atStorybookApiLib.distModulesStoriesMod.Direction): scala.Unit = js.native
  def selectStory(kindOrId: java.lang.String): scala.Unit = js.native
  def selectStory(kindOrId: java.lang.String, story: java.lang.String): scala.Unit = js.native
  def setStories(input: atStorybookApiLib.distModulesStoriesMod.StoriesRaw): scala.Unit = js.native
  def storyId(kind: java.lang.String, name: java.lang.String): java.lang.String = js.native
}

