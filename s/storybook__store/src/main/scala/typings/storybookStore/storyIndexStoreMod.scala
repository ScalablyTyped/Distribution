package typings.storybookStore

import typings.std.Record
import typings.storybookAddons.mod.Channel
import typings.storybookStore.ts39TypesMod.StoryIndex
import typings.storybookStore.ts39TypesMod.StoryIndexEntry
import typings.storybookStore.ts39TypesMod.StorySpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storyIndexStoreMod {
  
  @JSImport("@storybook/store/dist/ts3.9/StoryIndexStore", "StoryIndexStore")
  @js.native
  open class StoryIndexStore () extends StObject {
    def this(hasStories: StoryIndex) = this()
    
    var channel: Channel = js.native
    
    var stories: Record[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any, 
        StoryIndexEntry
      ] = js.native
    
    def storyIdFromSpecifier(specifier: StorySpecifier): String = js.native
    
    def storyIdToEntry(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    ): StoryIndexEntry = js.native
  }
}
