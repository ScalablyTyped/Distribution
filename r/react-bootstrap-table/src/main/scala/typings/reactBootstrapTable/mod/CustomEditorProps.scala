package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomEditorProps[TRow /* <: js.Object */, K /* <: /* keyof TRow */ String */]
  extends StObject
     with EditableAttrs
     with /**
  * Contents of the customEditorParameters object.
  */
/* parameterName */ StringDictionary[Any] {
  
  /**
    * Default value for the editor cell.
    */
  var defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ js.Any
  
  /**
    * The row data for the cell being edited.
    */
  var row: TRow
}
object CustomEditorProps {
  
  inline def apply[TRow /* <: js.Object */, K /* <: /* keyof TRow */ String */](
    defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ js.Any,
    row: TRow
  ): CustomEditorProps[TRow, K] = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomEditorProps[TRow, K]]
  }
  
  extension [Self <: CustomEditorProps[?, ?], TRow /* <: js.Object */, K /* <: /* keyof TRow */ String */](x: Self & (CustomEditorProps[TRow, K])) {
    
    inline def setDefaultValue(value: /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setRow(value: TRow): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
