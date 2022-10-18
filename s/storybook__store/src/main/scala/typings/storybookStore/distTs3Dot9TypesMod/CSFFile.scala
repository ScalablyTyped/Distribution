package typings.storybookStore.distTs3Dot9TypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSFFile[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] extends StObject {
  
  var meta: NormalizedComponentAnnotations[TFramework]
  
  var stories: Record[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any, 
    NormalizedStoryAnnotations[TFramework]
  ]
}
object CSFFile {
  
  inline def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    meta: NormalizedComponentAnnotations[TFramework],
    stories: Record[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any, 
      NormalizedStoryAnnotations[TFramework]
    ]
  ): CSFFile[TFramework] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSFFile[TFramework]]
  }
  
  extension [Self <: CSFFile[?], TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](x: Self & CSFFile[TFramework]) {
    
    inline def setMeta(value: NormalizedComponentAnnotations[TFramework]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setStories(
      value: Record[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any, 
          NormalizedStoryAnnotations[TFramework]
        ]
    ): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
  }
}
