package typings.storybookStore.anon

import typings.storybookStore.distTs3Dot9TypesMod.CSFFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CsfFile[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] extends StObject {
  
  var csfFile: CSFFile[TFramework]
  
  var storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
}
object CsfFile {
  
  inline def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    csfFile: CSFFile[TFramework],
    storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
  ): CsfFile[TFramework] = {
    val __obj = js.Dynamic.literal(csfFile = csfFile.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CsfFile[TFramework]]
  }
  
  extension [Self <: CsfFile[?], TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](x: Self & CsfFile[TFramework]) {
    
    inline def setCsfFile(value: CSFFile[TFramework]): Self = StObject.set(x, "csfFile", value.asInstanceOf[js.Any])
    
    inline def setStoryId(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    ): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
  }
}
