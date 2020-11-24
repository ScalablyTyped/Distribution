package typings.storybookApi.modulesStoriesMod

import typings.std.Error
import typings.storybookApi.anon.DictparameterName
import typings.storybookApi.anon.RefId
import typings.storybookApi.mod.Args
import typings.storybookApi.storiesMod.Group
import typings.storybookApi.storiesMod.Root
import typings.storybookApi.storiesMod.StoriesHash
import typings.storybookApi.storiesMod.StoriesRaw
import typings.storybookApi.storiesMod.Story
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubAPI extends js.Object {
  
  def findLeafStoryId(
    StoriesHash: StoriesHash,
    storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ js.Any
  ): js.Any = js.native
  
  def getCurrentParameter[S](): S = js.native
  def getCurrentParameter[S](parameterName: ParameterName): S = js.native
  
  def getCurrentStoryData(): Story | Group = js.native
  
  def getData(
    storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ js.Any
  ): Story | Group = js.native
  def getData(
    storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ js.Any,
    refId: String
  ): Story | Group = js.native
  
  def getParameters(
    storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ js.Any
  ): js.UndefOr[DictparameterName | js.Any] = js.native
  def getParameters(
    storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ js.Any,
    parameterName: ParameterName
  ): js.UndefOr[DictparameterName | js.Any] = js.native
  def getParameters(storyId: RefId): js.UndefOr[DictparameterName | js.Any] = js.native
  def getParameters(storyId: RefId, parameterName: ParameterName): js.UndefOr[DictparameterName | js.Any] = js.native
  
  def jumpToComponent(direction: Direction): Unit = js.native
  
  def jumpToStory(direction: Direction): Unit = js.native
  
  def resetStoryArgs(story: Story): Unit = js.native
  def resetStoryArgs(story: Story, argNames: js.Array[String]): Unit = js.native
  
  def resolveStory(
    storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ js.Any
  ): Story | Group | Root = js.native
  def resolveStory(
    storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ js.Any,
    refsId: String
  ): Story | Group | Root = js.native
  
  def selectFirstStory(): Unit = js.native
  
  def selectStory(kindOrId: String): Unit = js.native
  def selectStory(kindOrId: String, story: js.UndefOr[scala.Nothing], obj: typings.storybookApi.anon.ViewMode): Unit = js.native
  def selectStory(kindOrId: String, story: String): Unit = js.native
  def selectStory(kindOrId: String, story: String, obj: typings.storybookApi.anon.ViewMode): Unit = js.native
  
  def setStories(stories: StoriesRaw): js.Promise[Unit] = js.native
  def setStories(stories: StoriesRaw, failed: Error): js.Promise[Unit] = js.native
  
  var storyId: js.Function2[/* kind */ String, /* name */ String, String] = js.native
  
  def updateStoryArgs(story: Story, newArgs: Args): Unit = js.native
}
