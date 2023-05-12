package typings.storybookCsf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Renderer extends StObject {
  
  var T: js.UndefOr[Any] = js.undefined
  
  /** What type of element does this renderer render to? */
  var canvasElement: Any
  
  /** What is the type of the `component` annotation in this renderer? */
  var component: Any
  
  /** What does the story function return in this renderer? */
  var storyResult: Any
}
object Renderer {
  
  inline def apply(canvasElement: Any, component: Any, storyResult: Any): Renderer = {
    val __obj = js.Dynamic.literal(canvasElement = canvasElement.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], storyResult = storyResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[Renderer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Renderer] (val x: Self) extends AnyVal {
    
    inline def setCanvasElement(value: Any): Self = StObject.set(x, "canvasElement", value.asInstanceOf[js.Any])
    
    inline def setComponent(value: Any): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setStoryResult(value: Any): Self = StObject.set(x, "storyResult", value.asInstanceOf[js.Any])
    
    inline def setT(value: Any): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
    
    inline def setTUndefined: Self = StObject.set(x, "T", js.undefined)
  }
}
