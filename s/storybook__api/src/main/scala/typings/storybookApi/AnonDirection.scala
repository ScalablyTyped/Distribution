package typings.storybookApi

import typings.storybookApi.storiesMod.Direction
import typings.storybookApi.storiesMod.Group
import typings.storybookApi.storiesMod.StoriesRaw
import typings.storybookApi.storiesMod.Story
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDirection extends js.Object {
  def getCurrentParameter[S](parameterName: String): S = js.native
  def getCurrentStoryData(): Group | Story = js.native
  def getData(storyId: String): Group | Story = js.native
  def getParameters(storyId: String): js.Any = js.native
  def getParameters(storyId: String, parameterName: String): js.Any = js.native
  def jumpToComponent(direction: Direction): Unit = js.native
  def jumpToStory(direction: Direction): Unit = js.native
  def selectStory(kindOrId: String): Unit = js.native
  def selectStory(kindOrId: String, story: String): Unit = js.native
  def setStories(input: StoriesRaw): Unit = js.native
  def storyId(kind: String, name: String): String = js.native
}

