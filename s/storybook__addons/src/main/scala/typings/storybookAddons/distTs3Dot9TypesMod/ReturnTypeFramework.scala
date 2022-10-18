package typings.storybookAddons.distTs3Dot9TypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeFramework[ReturnType] extends StObject {
  
  var component: Any
  
  var storyResult: ReturnType
}
object ReturnTypeFramework {
  
  inline def apply[ReturnType](component: Any, storyResult: ReturnType): ReturnTypeFramework[ReturnType] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], storyResult = storyResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeFramework[ReturnType]]
  }
  
  extension [Self <: ReturnTypeFramework[?], ReturnType](x: Self & ReturnTypeFramework[ReturnType]) {
    
    inline def setComponent(value: Any): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setStoryResult(value: ReturnType): Self = StObject.set(x, "storyResult", value.asInstanceOf[js.Any])
  }
}
