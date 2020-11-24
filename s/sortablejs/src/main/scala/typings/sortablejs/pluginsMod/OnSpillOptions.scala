package typings.sortablejs.pluginsMod

import typings.sortablejs.mod.SortableEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnSpillOptions extends js.Object {
  
  /**
    * Called when either `revertOnSpill` or `RemoveOnSpill` plugins are enabled.
    */
  var onSpill: js.UndefOr[js.Function1[/* evt */ SortableEvent, Unit]] = js.native
  
  /**
    * This plugin, when enabled,
    * will cause the dragged item to be removed from the DOM if it is *spilled*
    * (ie. it is dropped outside of a valid Sortable drop target)
    */
  var removeOnSpill: js.UndefOr[Boolean] = js.native
  
  /**
    * This plugin, when enabled,
    * will cause the dragged item to be reverted to it's original position if it is *spilled*
    * (ie. it is dropped outside of a valid Sortable drop target)
    */
  var revertOnSpill: js.UndefOr[Boolean] = js.native
}
object OnSpillOptions {
  
  @scala.inline
  def apply(): OnSpillOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnSpillOptions]
  }
  
  @scala.inline
  implicit class OnSpillOptionsOps[Self <: OnSpillOptions] (val x: Self) extends AnyVal {
    
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
    def setOnSpill(value: /* evt */ SortableEvent => Unit): Self = this.set("onSpill", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSpill: Self = this.set("onSpill", js.undefined)
    
    @scala.inline
    def setRemoveOnSpill(value: Boolean): Self = this.set("removeOnSpill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveOnSpill: Self = this.set("removeOnSpill", js.undefined)
    
    @scala.inline
    def setRevertOnSpill(value: Boolean): Self = this.set("revertOnSpill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevertOnSpill: Self = this.set("revertOnSpill", js.undefined)
  }
}
