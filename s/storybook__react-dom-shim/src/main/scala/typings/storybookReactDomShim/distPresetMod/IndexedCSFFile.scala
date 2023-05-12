package typings.storybookReactDomShim.distPresetMod

import typings.storybookReactDomShim.anon.Tags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexedCSFFile extends StObject {
  
  var meta: Tags
  
  var stories: js.Array[IndexedStory]
}
object IndexedCSFFile {
  
  inline def apply(meta: Tags, stories: js.Array[IndexedStory]): IndexedCSFFile = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexedCSFFile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexedCSFFile] (val x: Self) extends AnyVal {
    
    inline def setMeta(value: Tags): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setStories(value: js.Array[IndexedStory]): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
    
    inline def setStoriesVarargs(value: IndexedStory*): Self = StObject.set(x, "stories", js.Array(value*))
  }
}
