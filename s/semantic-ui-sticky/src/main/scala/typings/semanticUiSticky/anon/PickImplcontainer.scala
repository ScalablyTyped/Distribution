package typings.semanticUiSticky.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ErrorSettings._Impl, 'container'> */
trait PickImplcontainer extends StObject {
  
  var container: String
}
object PickImplcontainer {
  
  @scala.inline
  def apply(container: String): PickImplcontainer = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcontainer]
  }
  
  @scala.inline
  implicit class PickImplcontainerMutableBuilder[Self <: PickImplcontainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
  }
}
