package typings.storybookStore

import typings.std.Partial
import typings.std.Record
import typings.storybookStore.ts39TypesMod.Story
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argsStoreMod {
  
  @JSImport("@storybook/store/dist/ts3.9/ArgsStore", "ArgsStore")
  @js.native
  open class ArgsStore () extends StObject {
    
    var argsByStoryId: Record[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
      ] = js.native
    
    def get(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    ): Any = js.native
    
    var initialArgsByStoryId: Record[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
      ] = js.native
    
    def setInitial(story: Story[Any]): Unit = js.native
    
    def update(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
      argsUpdate: Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
        ]
    ): Unit = js.native
    
    def updateFromDelta(
      story: Story[Any],
      delta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
    ): Unit = js.native
    
    def updateFromPersisted(
      story: Story[Any],
      persisted: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Args */ Any
    ): Unit = js.native
  }
}
