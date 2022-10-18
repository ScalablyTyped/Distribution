package typings.storybookCoreServer.anon

import typings.express.mod.Router
import typings.storybookCoreCommon.distTs3Dot9TypesMod.NormalizedStoriesSpecifier
import typings.storybookCoreServer.distTs3Dot9UtilsGetServerChannelMod.ServerChannel
import typings.storybookCoreServer.distTs3Dot9UtilsStoryIndexGeneratorMod.StoryIndexGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitializedStoryIndexGenerator extends StObject {
  
  var initializedStoryIndexGenerator: js.Promise[StoryIndexGenerator]
  
  var normalizedStories: js.Array[NormalizedStoriesSpecifier]
  
  var router: Router
  
  var serverChannel: ServerChannel
  
  var workingDir: js.UndefOr[String] = js.undefined
}
object InitializedStoryIndexGenerator {
  
  inline def apply(
    initializedStoryIndexGenerator: js.Promise[StoryIndexGenerator],
    normalizedStories: js.Array[NormalizedStoriesSpecifier],
    router: Router,
    serverChannel: ServerChannel
  ): InitializedStoryIndexGenerator = {
    val __obj = js.Dynamic.literal(initializedStoryIndexGenerator = initializedStoryIndexGenerator.asInstanceOf[js.Any], normalizedStories = normalizedStories.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any], serverChannel = serverChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializedStoryIndexGenerator]
  }
  
  extension [Self <: InitializedStoryIndexGenerator](x: Self) {
    
    inline def setInitializedStoryIndexGenerator(value: js.Promise[StoryIndexGenerator]): Self = StObject.set(x, "initializedStoryIndexGenerator", value.asInstanceOf[js.Any])
    
    inline def setNormalizedStories(value: js.Array[NormalizedStoriesSpecifier]): Self = StObject.set(x, "normalizedStories", value.asInstanceOf[js.Any])
    
    inline def setNormalizedStoriesVarargs(value: NormalizedStoriesSpecifier*): Self = StObject.set(x, "normalizedStories", js.Array(value*))
    
    inline def setRouter(value: Router): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    
    inline def setServerChannel(value: ServerChannel): Self = StObject.set(x, "serverChannel", value.asInstanceOf[js.Any])
    
    inline def setWorkingDir(value: String): Self = StObject.set(x, "workingDir", value.asInstanceOf[js.Any])
    
    inline def setWorkingDirUndefined: Self = StObject.set(x, "workingDir", js.undefined)
  }
}
