package typings.storybookReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoryId extends StObject {
  
  var storyId: String
}
object StoryId {
  
  inline def apply(storyId: String): StoryId = {
    val __obj = js.Dynamic.literal(storyId = storyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryId]
  }
  
  extension [Self <: StoryId](x: Self) {
    
    inline def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
  }
}
