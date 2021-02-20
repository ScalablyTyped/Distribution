package typings.reactBootstrapTable.mod

import typings.react.mod.CSSProperties
import typings.reactBootstrapTable.anon.Values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Editable[TRow /* <: js.Object */, K /* <: /* keyof TRow */ String */] extends StObject {
  
  /**
    * Additional attributes for the editor component.
    */
  var attrs: js.UndefOr[EditableAttrs] = js.native
  
  /**
    * Class name to use for the editor component.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Number of columns to display for a text area component.
    */
  var cols: js.UndefOr[Double] = js.native
  
  /**
    * Default value to show in the edit field in the Insert Modal for this column.
    */
  var defaultValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ js.Any
  ] = js.native
  
  /**
    * Data in a select or checkbox. If a checkbox, use a string with a ':'(colon) to separate the two values, ex: Y:N
    * The callback function can be used to customize the select options based on other field values within the row.
    * If the array is an array of objects, the fields 'text' can be used for the display text and 'value' to specify
    * the option's value.
    */
  var options: js.UndefOr[Values[TRow]] = js.native
  
  /**
    * @deprecated Use placeholder inside the attrs field instead.
    * Text to display as placeholder text in the editor component.
    */
  var placeholder: js.UndefOr[String] = js.native
  
  /**
    * Used to specify a field that can be modified in the insert modal when adding a new row, but cannot be edited
    * inside the table after the row has been inserted.
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Number of rows to display for a text area component.
    */
  var rows: js.UndefOr[Double] = js.native
  
  /**
    * CSS Style to use for the editor component.
    */
  var style: js.UndefOr[CSSProperties] = js.native
  
  /**
    * Edit field type, avaiable value is 'textarea', 'select', 'checkbox' and 'datetime'
    */
  var `type`: js.UndefOr[EditCellType] = js.native
  
  /**
    * Validation function for the column. It takes the new "cell value" as argument. This function should return
    * a boolean true/false for isValid, or an EditValidatorObject (so that an error message can be provided).
    */
  var validator: js.UndefOr[
    js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ /* cell */ js.Any, 
      /* row */ TRow, 
      Boolean | String | EditValidatorObject
    ]
  ] = js.native
}
object Editable {
  
  @scala.inline
  def apply[TRow /* <: js.Object */, K /* <: /* keyof TRow */ String */](): Editable[TRow, K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Editable[TRow, K]]
  }
  
  @scala.inline
  implicit class EditableMutableBuilder[Self <: Editable[_, _], TRow /* <: js.Object */, K /* <: /* keyof TRow */ String */] (val x: Self with (Editable[TRow, K])) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: EditableAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setOptions(value: Values[TRow]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setType(value: EditCellType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValidator(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ /* cell */ js.Any, /* row */ TRow) => Boolean | String | EditValidatorObject
    ): Self = StObject.set(x, "validator", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
  }
}
