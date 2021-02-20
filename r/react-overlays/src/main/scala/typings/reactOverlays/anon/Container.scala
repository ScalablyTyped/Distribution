package typings.reactOverlays.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Container extends StObject {
  
  /**
    * A DOM element, Ref to an element, or function that returns either. The `container` will have the Portal children
    * appended to it.
    */
  var container: Requireable[_] = js.native
  
  var onRendered: Requireable[js.Function1[/* repeated */ _, _]] = js.native
}
object Container {
  
  @scala.inline
  def apply(container: Requireable[_], onRendered: Requireable[js.Function1[/* repeated */ _, _]]): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], onRendered = onRendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit class ContainerMutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: Requireable[_]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRendered(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = StObject.set(x, "onRendered", value.asInstanceOf[js.Any])
  }
}
