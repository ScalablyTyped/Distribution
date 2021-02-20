package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
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
  implicit class CustomEditorPropsMutableBuilder[Self <: CustomEditorProps[_, _], TRow /* <: js.Object */, K /* <: /* keyof TRow */ String */] (val x: Self with (CustomEditorProps[TRow, K])) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: TRow): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
