package typings.atStorybookApi.distModulesStoriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubAPI extends js.Object {
  var storyId: js.Function2[/* kind */ String, /* name */ String, String] = js.native
  def getCurrentParameter[S](): S = js.native
  def getCurrentParameter[S](parameterName: ParameterName): S = js.native
  def getCurrentStoryData(): Story | Group = js.native
  def getData(storyId: StoryId): Story | Group = js.native
  def getParameters(storyId: StoryId): /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api/dist/modules/stories.Story['parameters'] */ js.Any = js.native
  def getParameters(storyId: StoryId, parameterName: ParameterName): /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api/dist/modules/stories.Story['parameters'] */ js.Any = js.native
  def jumpToComponent(direction: Direction): Unit = js.native
  def jumpToStory(direction: Direction): Unit = js.native
  def selectStory(kindOrId: String): Unit = js.native
  def selectStory(kindOrId: String, story: String): Unit = js.native
  def selectStory(kindOrId: String, story: String, obj: js.Any): Unit = js.native
  def setStories(stories: StoriesRaw): Unit = js.native
}

