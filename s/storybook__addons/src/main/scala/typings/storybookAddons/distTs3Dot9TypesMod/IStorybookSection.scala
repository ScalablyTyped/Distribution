package typings.storybookAddons.distTs3Dot9TypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStorybookSection extends StObject {
  
  var kind: String
  
  var stories: js.Array[IStorybookStory]
}
object IStorybookSection {
  
  inline def apply(kind: String, stories: js.Array[IStorybookStory]): IStorybookSection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStorybookSection]
  }
  
  extension [Self <: IStorybookSection](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setStories(value: js.Array[IStorybookStory]): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
    
    inline def setStoriesVarargs(value: IStorybookStory*): Self = StObject.set(x, "stories", js.Array(value*))
  }
}
