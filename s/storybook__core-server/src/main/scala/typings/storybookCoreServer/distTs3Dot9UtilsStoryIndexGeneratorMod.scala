package typings.storybookCoreServer

import typings.std.Record
import typings.storybookCoreCommon.distTs3Dot9TypesMod.NormalizedStoriesSpecifier
import typings.storybookCoreServer.anon.ConfigDir
import typings.storybookStore.distTs3Dot9TypesMod.Path
import typings.storybookStore.distTs3Dot9TypesMod.StoryIndex
import typings.storybookStore.distTs3Dot9TypesMod.StoryIndexEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9UtilsStoryIndexGeneratorMod {
  
  @JSImport("@storybook/core-server/dist/ts3.9/utils/StoryIndexGenerator", "StoryIndexGenerator")
  @js.native
  open class StoryIndexGenerator protected () extends StObject {
    def this(specifiers: js.Array[NormalizedStoriesSpecifier], options: ConfigDir) = this()
    
    def ensureExtracted(): js.Promise[
        js.Array[
          Record[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any, 
            StoryIndexEntry
          ]
        ]
      ] = js.native
    
    def extractStories(specifier: NormalizedStoriesSpecifier, absolutePath: Path): js.Promise[Record[String, StoryIndexEntry]] = js.native
    
    def getIndex(): js.Promise[StoryIndex] = js.native
    
    def getStorySortParameter(): js.Promise[Any] = js.native
    
    def initialize(): js.Promise[Unit] = js.native
    
    def invalidate(specifier: NormalizedStoriesSpecifier, importPath: Path, removed: Boolean): Unit = js.native
    
    /* private */ var lastIndex: Any = js.native
    
    val options: ConfigDir = js.native
    
    def sortStories(
      storiesList: js.Array[
          Record[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any, 
            StoryIndexEntry
          ]
        ]
    ): js.Promise[Record[String, StoryIndexEntry]] = js.native
    
    val specifiers: js.Array[NormalizedStoriesSpecifier] = js.native
    
    def storyFileNames(): js.Array[String] = js.native
    
    /* private */ var storyIndexEntries: Any = js.native
  }
}
