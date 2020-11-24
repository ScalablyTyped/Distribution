package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomEditorProps[TRow /* <: js.Object */, K /* <: /* keyof TRow */ String */]
  extends EditableAttrs
     with /**
  * Contents of the customEditorParameters object.
  */
/* parameterName */ StringDictionary[js.Any] {
  
  /**
    * Default value for the editor cell.
    */
  var defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ js.Any = js.native
  
  /**
    * The row data for the cell being edited.
    */
  var row: TRow = js.native
}
object CustomEditorProps {
  
  @scala.inline
  def apply[TRow /* <: js.Object */, K /* <: /* keyof TRow */ String */](
    defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ js.Any,
    row: TRow
  ): CustomEditorProps[TRow, K] = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomEditorProps[TRow, K]]
  }
  
  @scala.inline
  implicit class CustomEditorPropsOps[Self <: CustomEditorProps[_, _], TRow /* <: js.Object */, K /* <: /* keyof TRow */ String */] (val x: Self with (CustomEditorProps[TRow, K])) extends AnyVal {
    
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
    def setDefaultValue(value: /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: TRow): Self = this.set("row", value.asInstanceOf[js.Any])
  }
}
