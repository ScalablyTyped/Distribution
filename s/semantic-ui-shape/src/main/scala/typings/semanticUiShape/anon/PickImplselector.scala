package typings.semanticUiShape.anon

import typings.semanticUiShape.SemanticUI.Shape.SelectorSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-shape.SemanticUI.ShapeSettings._Impl, 'selector'> */
trait PickImplselector extends StObject {
  
  var selector: SelectorSettings
}
object PickImplselector {
  
  @scala.inline
  def apply(selector: SelectorSettings): PickImplselector = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplselector]
  }
  
  @scala.inline
  implicit class PickImplselectorMutableBuilder[Self <: PickImplselector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
  }
}
