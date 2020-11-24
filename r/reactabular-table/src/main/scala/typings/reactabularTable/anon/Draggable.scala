package typings.reactabularTable.anon

import typings.react.mod.global.JSX.Element
import typings.reactabularTable.mod.ColumnFormatter
import typings.reactabularTable.mod.ColumnTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Draggable extends js.Object {
  
  var draggable: js.UndefOr[Boolean] = js.native
  
  var formatters: js.UndefOr[js.Array[ColumnFormatter]] = js.native
  
  var label: String | Element = js.native
  
  var resizable: js.UndefOr[Boolean] = js.native
  
  var sortable: js.UndefOr[Boolean] = js.native
  
  var transforms: js.UndefOr[js.Array[ColumnTransform]] = js.native
}
object Draggable {
  
  @scala.inline
  def apply(label: String | Element): Draggable = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Draggable]
  }
  
  @scala.inline
  implicit class DraggableOps[Self <: Draggable] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String | Element): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setFormattersVarargs(value: ColumnFormatter*): Self = this.set("formatters", js.Array(value :_*))
    
    @scala.inline
    def setFormatters(value: js.Array[ColumnFormatter]): Self = this.set("formatters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatters: Self = this.set("formatters", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean): Self = this.set("sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
    
    @scala.inline
    def setTransformsVarargs(value: ColumnTransform*): Self = this.set("transforms", js.Array(value :_*))
    
    @scala.inline
    def setTransforms(value: js.Array[ColumnTransform]): Self = this.set("transforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransforms: Self = this.set("transforms", js.undefined)
  }
}
