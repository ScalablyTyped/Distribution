package typings.storybookCoreServer

import typings.storybookCoreServer.anon.InitializedStoryIndexGenerator
import typings.storybookCoreServer.distTs3Dot9UtilsStoryIndexGeneratorMod.StoryIndexGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9UtilsStoriesJsonMod {
  
  @JSImport("@storybook/core-server/dist/ts3.9/utils/stories-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/core-server/dist/ts3.9/utils/stories-json", "DEBOUNCE")
  @js.native
  val DEBOUNCE: /* 100 */ Double = js.native
  
  inline def extractStoriesJson(outputFile: String, initializedStoryIndexGenerator: js.Promise[StoryIndexGenerator]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractStoriesJson")(outputFile.asInstanceOf[js.Any], initializedStoryIndexGenerator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def useStoriesJson(
    hasRouterInitializedStoryIndexGeneratorWorkingDirServerChannelNormalizedStories: InitializedStoryIndexGenerator
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useStoriesJson")(hasRouterInitializedStoryIndexGeneratorWorkingDirServerChannelNormalizedStories.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
