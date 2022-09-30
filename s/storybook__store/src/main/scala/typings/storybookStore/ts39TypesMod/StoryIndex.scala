package typings.storybookStore.ts39TypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoryIndex extends StObject {
  
  var stories: Record[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any, 
    StoryIndexEntry
  ]
  
  var v: Double
}
object StoryIndex {
  
  inline def apply(
    stories: Record[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any, 
      StoryIndexEntry
    ],
    v: Double
  ): StoryIndex = {
    val __obj = js.Dynamic.literal(stories = stories.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryIndex]
  }
  
  extension [Self <: StoryIndex](x: Self) {
    
    inline def setStories(
      value: Record[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any, 
          StoryIndexEntry
        ]
    ): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
    
    inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
