package typings.semanticUiAccordion.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-accordion.SemanticUI.AccordionSettings._Impl, 'animateChildren'> */
@js.native
trait PickImplanimateChildren extends StObject {
  
  var animateChildren: Boolean = js.native
}
object PickImplanimateChildren {
  
  @scala.inline
  def apply(animateChildren: Boolean): PickImplanimateChildren = {
    val __obj = js.Dynamic.literal(animateChildren = animateChildren.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplanimateChildren]
  }
  
  @scala.inline
  implicit class PickImplanimateChildrenMutableBuilder[Self <: PickImplanimateChildren] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimateChildren(value: Boolean): Self = StObject.set(x, "animateChildren", value.asInstanceOf[js.Any])
  }
}
