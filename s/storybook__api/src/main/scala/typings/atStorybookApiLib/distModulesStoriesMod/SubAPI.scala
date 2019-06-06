package typings
package atStorybookApiLib.distModulesStoriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubAPI extends js.Object {
  var storyId: js.Function2[/* kind */ java.lang.String, /* name */ java.lang.String, java.lang.String] = js.native
  def getCurrentStoryData(): Story | Group = js.native
  def getData(storyId: StoryId): Story | Group = js.native
  def getParameters(storyId: StoryId): /* import warning: ImportType.apply Failed type conversion: @storybook/api.@storybook/api/dist/modules/stories.Story['parameters'] */ js.Any = js.native
  def getParameters(storyId: StoryId, parameterName: ParameterName): /* import warning: ImportType.apply Failed type conversion: @storybook/api.@storybook/api/dist/modules/stories.Story['parameters'] */ js.Any = js.native
  def jumpToComponent(direction: Direction): scala.Unit = js.native
  def jumpToStory(direction: Direction): scala.Unit = js.native
  def selectStory(kindOrId: java.lang.String): scala.Unit = js.native
  def selectStory(kindOrId: java.lang.String, story: java.lang.String): scala.Unit = js.native
  def selectStory(kindOrId: java.lang.String, story: java.lang.String, obj: js.Any): scala.Unit = js.native
  def setStories(stories: StoriesRaw): scala.Unit = js.native
}

