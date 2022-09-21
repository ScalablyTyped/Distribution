package typings.storybookComponents.mod

import typings.react.mod.ElementType
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineStoryProps
  extends StObject
     with CommonProps {
  
  var parameters: Parameters[js.Function1[/* args */ Any, Any]]
  
  var storyFn: ElementType[Any]
}
object InlineStoryProps {
  
  inline def apply(id: String, parameters: Parameters[js.Function1[/* args */ Any, Any]], storyFn: ElementType[Any]): InlineStoryProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], storyFn = storyFn.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineStoryProps]
  }
  
  extension [Self <: InlineStoryProps](x: Self) {
    
    inline def setParameters(value: Parameters[js.Function1[/* args */ Any, Any]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setStoryFn(value: ElementType[Any]): Self = StObject.set(x, "storyFn", value.asInstanceOf[js.Any])
  }
}
