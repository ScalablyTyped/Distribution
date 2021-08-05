package typings.storybookClientApi.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStorybookKind extends StObject {
  
  var fileName: String
  
  var kind: String
  
  var stories: js.Array[GetStorybookStory]
}
object GetStorybookKind {
  
  inline def apply(fileName: String, kind: String, stories: js.Array[GetStorybookStory]): GetStorybookKind = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStorybookKind]
  }
  
  extension [Self <: GetStorybookKind](x: Self) {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setStories(value: js.Array[GetStorybookStory]): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
    
    inline def setStoriesVarargs(value: GetStorybookStory*): Self = StObject.set(x, "stories", js.Array(value :_*))
  }
}
