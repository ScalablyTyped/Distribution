package typings.storybookReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryId extends StObject {
  
  var storyId: String = js.native
}
object StoryId {
  
  @scala.inline
  def apply(storyId: String): StoryId = {
    val __obj = js.Dynamic.literal(storyId = storyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryId]
  }
  
  @scala.inline
  implicit class StoryIdMutableBuilder[Self <: StoryId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
  }
}
