package typings.simonwepSelectionJs.mod

import typings.simonwepSelectionJs.anon.Added
import typings.std.Element
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionEvent extends js.Object {
  
  var area: Element = js.native
  
  var changed: Added = js.native
  
  var inst: Selection = js.native
  
  var oe: MouseEvent | TouchEvent = js.native
  
  var selected: js.Array[Element] = js.native
}
object SelectionEvent {
  
  @scala.inline
  def apply(
    area: Element,
    changed: Added,
    inst: Selection,
    oe: MouseEvent | TouchEvent,
    selected: js.Array[Element]
  ): SelectionEvent = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], changed = changed.asInstanceOf[js.Any], inst = inst.asInstanceOf[js.Any], oe = oe.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionEvent]
  }
  
  @scala.inline
  implicit class SelectionEventOps[Self <: SelectionEvent] (val x: Self) extends AnyVal {
    
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
    def setArea(value: Element): Self = this.set("area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChanged(value: Added): Self = this.set("changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInst(value: Selection): Self = this.set("inst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOe(value: MouseEvent | TouchEvent): Self = this.set("oe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedVarargs(value: Element*): Self = this.set("selected", js.Array(value :_*))
    
    @scala.inline
    def setSelected(value: js.Array[Element]): Self = this.set("selected", value.asInstanceOf[js.Any])
  }
}
