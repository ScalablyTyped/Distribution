package typings.reactOverlays.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  /**
    * A DOM element, Ref to an element, or function that returns either. The `container` will have the Portal children
    * appended to it.
    */
  var container: Requireable[Any]
  
  var onRendered: Requireable[js.Function1[/* repeated */ Any, Any]]
}
object Container {
  
  inline def apply(container: Requireable[Any], onRendered: Requireable[js.Function1[/* repeated */ Any, Any]]): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], onRendered = onRendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: Requireable[Any]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setOnRendered(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onRendered", value.asInstanceOf[js.Any])
  }
}
