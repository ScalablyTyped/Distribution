package typings.rcCollapse.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accordion extends js.Object {
  
  var accordion: Boolean = js.native
  
  var destroyInactivePanel: Boolean = js.native
  
  def onChange(): Unit = js.native
  
  var prefixCls: String = js.native
}
object Accordion {
  
  @scala.inline
  def apply(accordion: Boolean, destroyInactivePanel: Boolean, onChange: () => Unit, prefixCls: String): Accordion = {
    val __obj = js.Dynamic.literal(accordion = accordion.asInstanceOf[js.Any], destroyInactivePanel = destroyInactivePanel.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accordion]
  }
  
  @scala.inline
  implicit class AccordionOps[Self <: Accordion] (val x: Self) extends AnyVal {
    
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
    def setAccordion(value: Boolean): Self = this.set("accordion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyInactivePanel(value: Boolean): Self = this.set("destroyInactivePanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: () => Unit): Self = this.set("onChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
  }
}
