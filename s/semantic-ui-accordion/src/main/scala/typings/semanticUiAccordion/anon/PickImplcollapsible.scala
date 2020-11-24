package typings.semanticUiAccordion.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-accordion.SemanticUI.AccordionSettings._Impl, 'collapsible'> */
@js.native
trait PickImplcollapsible extends js.Object {
  
  var collapsible: Boolean = js.native
}
object PickImplcollapsible {
  
  @scala.inline
  def apply(collapsible: Boolean): PickImplcollapsible = {
    val __obj = js.Dynamic.literal(collapsible = collapsible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcollapsible]
  }
  
  @scala.inline
  implicit class PickImplcollapsibleOps[Self <: PickImplcollapsible] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCollapsible(value: Boolean): Self = this.set("collapsible", value.asInstanceOf[js.Any])
  }
}
