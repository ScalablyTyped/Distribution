package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnMetadata[T /* <: SlickData */] extends StObject {
  
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
  implicit class ColumnMetadataMutableBuilder[Self <: ColumnMetadata[_], T /* <: SlickData */] (val x: Self with ColumnMetadata[T]) extends AnyVal {
    
    @scala.inline
    def setColspan(value: Double | String): Self = StObject.set(x, "colspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColspanUndefined: Self = StObject.set(x, "colspan", js.undefined)
    
    @scala.inline
    def setEditor(value: js.Any): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    @scala.inline
    def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    @scala.inline
    def setFormatter(
      value: (/* row */ Double, /* cell */ Double, /* value */ js.Any, /* columnDef */ Column[T], /* dataContext */ SlickData) => String
    ): Self = StObject.set(x, "formatter", js.Any.fromFunction5(value))
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
  }
}
