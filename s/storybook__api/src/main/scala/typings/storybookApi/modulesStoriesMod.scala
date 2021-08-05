package typings.storybookApi

import typings.std.Error
import typings.storybookApi.anon.DictparameterName
import typings.storybookApi.anon.RefId
import typings.storybookApi.mod.Args
import typings.storybookApi.mod.ModuleFn
import typings.storybookApi.storiesMod.Group
import typings.storybookApi.storiesMod.Root
import typings.storybookApi.storiesMod.StoriesHash
import typings.storybookApi.storiesMod.StoriesRaw
import typings.storybookApi.storiesMod.Story
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesStoriesMod {
  
  @JSImport("@storybook/api/dist/modules/stories", "init")
  @js.native
  val init: ModuleFn = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookApi.storybookApiNumbers.`-1`
    - typings.storybookApi.storybookApiNumbers.`1`
  */
  trait Direction extends StObject
  object Direction {
    
    inline def `-1`: typings.storybookApi.storybookApiNumbers.`-1` = -1.asInstanceOf[typings.storybookApi.storybookApiNumbers.`-1`]
    
    inline def `1`: typings.storybookApi.storybookApiNumbers.`1` = 1.asInstanceOf[typings.storybookApi.storybookApiNumbers.`1`]
  }
  
  type ParameterName = String
  
  @js.native
  trait SubAPI extends StObject {
    
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
    def selectStory(kindOrId: String, story: String): Unit = js.native
    def selectStory(kindOrId: String, story: String, obj: typings.storybookApi.anon.ViewMode): Unit = js.native
    def selectStory(kindOrId: String, story: Unit, obj: typings.storybookApi.anon.ViewMode): Unit = js.native
    
    def setStories(stories: StoriesRaw): js.Promise[Unit] = js.native
    def setStories(stories: StoriesRaw, failed: Error): js.Promise[Unit] = js.native
    
    var storyId: js.Function2[/* kind */ String, /* name */ String, String] = js.native
    
    def updateStoryArgs(story: Story, newArgs: Args): Unit = js.native
  }
  
  trait SubState extends StObject {
    
    var storiesConfigured: Boolean
    
    var storiesFailed: js.UndefOr[Error] = js.undefined
    
    var storiesHash: StoriesHash
    
    var storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ js.Any
    
    var viewMode: ViewMode
  }
  object SubState {
    
    inline def apply(
      storiesConfigured: Boolean,
      storiesHash: StoriesHash,
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ js.Any
    ): SubState = {
      val __obj = js.Dynamic.literal(storiesConfigured = storiesConfigured.asInstanceOf[js.Any], storiesHash = storiesHash.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubState]
    }
    
    extension [Self <: SubState](x: Self) {
      
      inline def setStoriesConfigured(value: Boolean): Self = StObject.set(x, "storiesConfigured", value.asInstanceOf[js.Any])
      
      inline def setStoriesFailed(value: Error): Self = StObject.set(x, "storiesFailed", value.asInstanceOf[js.Any])
      
      inline def setStoriesFailedUndefined: Self = StObject.set(x, "storiesFailed", js.undefined)
      
      inline def setStoriesHash(value: StoriesHash): Self = StObject.set(x, "storiesHash", value.asInstanceOf[js.Any])
      
      inline def setStoryId(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ js.Any
      ): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
      
      inline def setViewMode(value: ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      inline def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookApi.storybookApiStrings.story
    - typings.storybookApi.storybookApiStrings.info
    - typings.storybookApi.storybookApiStrings.settings
    - java.lang.String
    - scala.Unit
  */
  type ViewMode = js.UndefOr[_ViewMode | String]
  
  trait _ViewMode extends StObject
}
