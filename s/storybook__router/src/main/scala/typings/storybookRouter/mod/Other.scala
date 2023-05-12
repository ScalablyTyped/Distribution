package typings.storybookRouter.mod

import typings.storybookRouter.distUtilsMod.StoryData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Other
  extends StObject
     with StoryData {
  
  var path: String
  
  var singleStory: js.UndefOr[Boolean] = js.undefined
}
object Other {
  
  inline def apply(path: String): Other = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Other]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Other] (val x: Self) extends AnyVal {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSingleStory(value: Boolean): Self = StObject.set(x, "singleStory", value.asInstanceOf[js.Any])
    
    inline def setSingleStoryUndefined: Self = StObject.set(x, "singleStory", js.undefined)
  }
}
