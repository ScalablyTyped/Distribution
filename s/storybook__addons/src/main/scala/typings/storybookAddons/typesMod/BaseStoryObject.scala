package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseStoryObject[Args, StoryFnReturnType] extends StObject {
  
  /**
    * Override the display name in the UI
    */
  var storyName: js.UndefOr[String] = js.undefined
}
object BaseStoryObject {
  
  inline def apply[Args, StoryFnReturnType](): BaseStoryObject[Args, StoryFnReturnType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseStoryObject[Args, StoryFnReturnType]]
  }
  
  extension [Self <: BaseStoryObject[?, ?], Args, StoryFnReturnType](x: Self & (BaseStoryObject[Args, StoryFnReturnType])) {
    
    inline def setStoryName(value: String): Self = StObject.set(x, "storyName", value.asInstanceOf[js.Any])
    
    inline def setStoryNameUndefined: Self = StObject.set(x, "storyName", js.undefined)
  }
}
