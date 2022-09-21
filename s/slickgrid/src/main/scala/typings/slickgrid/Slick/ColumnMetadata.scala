package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnMetadata[T /* <: SlickData */] extends StObject {
  
  /**
    * Number of columns this cell will span. Can also contain "*" to indicate that the cell should span the rest of the row.
    */
  var colspan: js.UndefOr[Double | String] = js.undefined
  
  /**
    * A custom cell editor.
    */
  var editor: js.UndefOr[Any] = js.undefined
  
  /**
    * Whether or not a cell can be set as "active".
    */
  var focusable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A custom cell formatter.
    */
  var formatter: js.UndefOr[Formatter[T]] = js.undefined
  
  /**
    * Whether or not a cell can be selected.
    */
  var selectable: js.UndefOr[Boolean] = js.undefined
}
object ColumnMetadata {
  
  inline def apply[T /* <: SlickData */](): ColumnMetadata[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnMetadata[T]]
  }
  
  extension [Self <: ColumnMetadata[?], T /* <: SlickData */](x: Self & ColumnMetadata[T]) {
    
    inline def setColspan(value: Double | String): Self = StObject.set(x, "colspan", value.asInstanceOf[js.Any])
    
    inline def setColspanUndefined: Self = StObject.set(x, "colspan", js.undefined)
    
    inline def setEditor(value: Any): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    inline def setFormatter(
      value: (/* row */ Double, /* cell */ Double, /* value */ Any, /* columnDef */ Column[T], /* dataContext */ SlickData) => String
    ): Self = StObject.set(x, "formatter", js.Any.fromFunction5(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
  }
}
