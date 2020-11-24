package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnMetadata[T /* <: SlickData */] extends js.Object {
  
  /**
    * Number of columns this cell will span. Can also contain "*" to indicate that the cell should span the rest of the row.
    */
  var colspan: js.UndefOr[Double | String] = js.native
  
  /**
    * A custom cell editor.
    */
  var editor: js.UndefOr[js.Any] = js.native
  
  /**
    * Whether or not a cell can be set as "active".
    */
  var focusable: js.UndefOr[Boolean] = js.native
  
  /**
    * A custom cell formatter.
    */
  var formatter: js.UndefOr[Formatter[T]] = js.native
  
  /**
    * Whether or not a cell can be selected.
    */
  var selectable: js.UndefOr[Boolean] = js.native
}
object ColumnMetadata {
  
  @scala.inline
  def apply[T /* <: SlickData */](): ColumnMetadata[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnMetadata[T]]
  }
  
  @scala.inline
  implicit class ColumnMetadataOps[Self <: ColumnMetadata[_], T /* <: SlickData */] (val x: Self with ColumnMetadata[T]) extends AnyVal {
    
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
    def setColspan(value: Double | String): Self = this.set("colspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColspan: Self = this.set("colspan", js.undefined)
    
    @scala.inline
    def setEditor(value: js.Any): Self = this.set("editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditor: Self = this.set("editor", js.undefined)
    
    @scala.inline
    def setFocusable(value: Boolean): Self = this.set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusable: Self = this.set("focusable", js.undefined)
    
    @scala.inline
    def setFormatter(
      value: (/* row */ Double, /* cell */ Double, /* value */ js.Any, /* columnDef */ Column[T], /* dataContext */ SlickData) => String
    ): Self = this.set("formatter", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
  }
}
