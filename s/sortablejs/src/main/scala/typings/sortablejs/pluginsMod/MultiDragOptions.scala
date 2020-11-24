package typings.sortablejs.pluginsMod

import typings.sortablejs.mod.SortableEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiDragOptions extends js.Object {
  
  /**
    * Enable the plugin
    */
  var multiDrag: js.UndefOr[Boolean] = js.native
  
  /**
    * Key that must be down for items to be selected
    */
  // todo: create a type
  // todo: check source code for type
  var multiDragKey: js.UndefOr[Null] = js.native
  
  /**
    * Called when an item is deselected
    */
  var onDeselect: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  
  /**
    * Called when an item is selected
    */
  var onSelect: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  
  /**
    * Class name for selected item
    */
  var selectedClass: js.UndefOr[String] = js.native
}
object MultiDragOptions {
  
  @scala.inline
  def apply(): MultiDragOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiDragOptions]
  }
  
  @scala.inline
  implicit class MultiDragOptionsOps[Self <: MultiDragOptions] (val x: Self) extends AnyVal {
    
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
    def setMultiDrag(value: Boolean): Self = this.set("multiDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiDrag: Self = this.set("multiDrag", js.undefined)
    
    @scala.inline
    def setOnDeselect(value: /* event */ SortableEvent => Unit): Self = this.set("onDeselect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDeselect: Self = this.set("onDeselect", js.undefined)
    
    @scala.inline
    def setOnSelect(value: /* event */ SortableEvent => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setSelectedClass(value: String): Self = this.set("selectedClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedClass: Self = this.set("selectedClass", js.undefined)
  }
}
