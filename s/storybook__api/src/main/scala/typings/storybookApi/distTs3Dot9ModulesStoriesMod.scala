package typings.storybookApi

import typings.storybookApi.anon.DictparameterName
import typings.storybookApi.anon.RefId
import typings.storybookApi.distTs3Dot9LibStoriesMod.Group
import typings.storybookApi.distTs3Dot9LibStoriesMod.Root
import typings.storybookApi.distTs3Dot9LibStoriesMod.StoriesHash
import typings.storybookApi.distTs3Dot9LibStoriesMod.StoriesRaw
import typings.storybookApi.distTs3Dot9LibStoriesMod.Story
import typings.storybookApi.distTs3Dot9LibStoriesMod.StoryIndex
import typings.storybookApi.distTs3Dot9ModulesRefsMod.ComposedRef
import typings.storybookApi.mod.Args
import typings.storybookApi.mod.ModuleFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ModulesStoriesMod {
  
  @JSImport("@storybook/api/dist/ts3.9/modules/stories", "init")
  @js.native
  val init: ModuleFn = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookApi.storybookApiInts.`-1`
    - typings.storybookApi.storybookApiInts.`1`
  */
  trait Direction extends StObject
  object Direction {
    
    inline def `-1`: typings.storybookApi.storybookApiInts.`-1` = -1.asInstanceOf[typings.storybookApi.storybookApiInts.`-1`]
    
    inline def `1`: typings.storybookApi.storybookApiInts.`1` = 1.asInstanceOf[typings.storybookApi.storybookApiInts.`1`]
  }
  
  type ParameterName = String
  
  /* Inlined std.Pick<@storybook/api.@storybook/api/dist/ts3.9/lib/stories.Story, 'parameters' | 'initialArgs' | 'argTypes' | 'args'> */
  trait StoryUpdate extends StObject {
    
    var argTypes: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArgTypes */ Any
      ] = js.undefined
    
    var args: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
      ] = js.undefined
    
    var initialArgs: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
      ] = js.undefined
    
    var parameters: js.UndefOr[DictparameterName] = js.undefined
  }
  object StoryUpdate {
    
    inline def apply(): StoryUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StoryUpdate]
    }
    
    extension [Self <: StoryUpdate](x: Self) {
      
      inline def setArgTypes(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArgTypes */ Any
      ): Self = StObject.set(x, "argTypes", value.asInstanceOf[js.Any])
      
      inline def setArgTypesUndefined: Self = StObject.set(x, "argTypes", js.undefined)
      
      inline def setArgs(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
      ): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setInitialArgs(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
      ): Self = StObject.set(x, "initialArgs", value.asInstanceOf[js.Any])
      
      inline def setInitialArgsUndefined: Self = StObject.set(x, "initialArgs", js.undefined)
      
      inline def setParameters(value: DictparameterName): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    }
  }
  
  @js.native
  trait SubAPI extends StObject {
    
    def fetchStoryList(): js.Promise[Unit] = js.native
    
    def findLeafStoryId(
      StoriesHash: StoriesHash,
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    ): Any = js.native
    
    def findSiblingStoryId(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
      hash: StoriesHash,
      direction: Direction,
      toSiblingGroup: Boolean
    ): Any = js.native
    
    def getCurrentParameter[S](): S = js.native
    def getCurrentParameter[S](parameterName: ParameterName): S = js.native
    
    def getCurrentStoryData(): Story | Group = js.native
    
    def getData(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    ): Story | Group = js.native
    def getData(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
      refId: String
    ): Story | Group = js.native
    
    def getParameters(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    ): js.UndefOr[DictparameterName | Any] = js.native
    def getParameters(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
      parameterName: ParameterName
    ): js.UndefOr[DictparameterName | Any] = js.native
    def getParameters(storyId: RefId): js.UndefOr[DictparameterName | Any] = js.native
    def getParameters(storyId: RefId, parameterName: ParameterName): js.UndefOr[DictparameterName | Any] = js.native
    
    def isPrepared(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    ): Boolean = js.native
    def isPrepared(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
      refId: String
    ): Boolean = js.native
    
    def jumpToComponent(direction: Direction): Unit = js.native
    
    def jumpToStory(direction: Direction): Unit = js.native
    
    def resetStoryArgs(story: Story): Unit = js.native
    def resetStoryArgs(story: Story, argNames: js.Array[String]): Unit = js.native
    
    def resolveStory(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    ): Story | Group | Root = js.native
    def resolveStory(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
      refsId: String
    ): Story | Group | Root = js.native
    
    def selectFirstStory(): Unit = js.native
    
    def selectStory(kindOrId: String): Unit = js.native
    def selectStory(kindOrId: String, story: String): Unit = js.native
    def selectStory(kindOrId: String, story: String, obj: typings.storybookApi.anon.ViewMode): Unit = js.native
    def selectStory(kindOrId: String, story: Unit, obj: typings.storybookApi.anon.ViewMode): Unit = js.native
    
    def setStories(stories: StoriesRaw): js.Promise[Unit] = js.native
    def setStories(stories: StoriesRaw, failed: js.Error): js.Promise[Unit] = js.native
    
    def setStoryList(storyList: StoryIndex): js.Promise[Unit] = js.native
    
    var storyId: js.Function2[/* kind */ String, /* name */ String, String] = js.native
    
    def updateStory(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
      update: StoryUpdate
    ): js.Promise[Unit] = js.native
    def updateStory(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
      update: StoryUpdate,
      ref: ComposedRef
    ): js.Promise[Unit] = js.native
    
    def updateStoryArgs(story: Story, newArgs: Args): Unit = js.native
  }
  
  trait SubState extends StObject {
    
    var storiesConfigured: Boolean
    
    var storiesFailed: js.UndefOr[js.Error] = js.undefined
    
    var storiesHash: StoriesHash
    
    var storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    
    var viewMode: ViewMode
  }
  object SubState {
    
    inline def apply(
      storiesConfigured: Boolean,
      storiesHash: StoriesHash,
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    ): SubState = {
      val __obj = js.Dynamic.literal(storiesConfigured = storiesConfigured.asInstanceOf[js.Any], storiesHash = storiesHash.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubState]
    }
    
    extension [Self <: SubState](x: Self) {
      
      inline def setStoriesConfigured(value: Boolean): Self = StObject.set(x, "storiesConfigured", value.asInstanceOf[js.Any])
      
      inline def setStoriesFailed(value: js.Error): Self = StObject.set(x, "storiesFailed", value.asInstanceOf[js.Any])
      
      inline def setStoriesFailedUndefined: Self = StObject.set(x, "storiesFailed", js.undefined)
      
      inline def setStoriesHash(value: StoriesHash): Self = StObject.set(x, "storiesHash", value.asInstanceOf[js.Any])
      
      inline def setStoryId(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
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
