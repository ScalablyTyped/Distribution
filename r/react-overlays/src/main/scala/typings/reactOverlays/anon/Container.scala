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
  var container: Requireable[js.Any]
  
  var onRendered: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]
}
object Container {
  
  inline def apply(
    container: Requireable[js.Any],
    onRendered: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]
  ): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], onRendered = onRendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  extension [Self <: Container](x: Self) {
    
    inline def setContainer(value: Requireable[js.Any]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setOnRendered(value: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]): Self = StObject.set(x, "onRendered", value.asInstanceOf[js.Any])
  }
}
