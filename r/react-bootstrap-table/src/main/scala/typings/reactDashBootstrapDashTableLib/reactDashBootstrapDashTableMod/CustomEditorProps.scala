package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CustomEditorProps[TRow /* <: js.Object */, K /* <: java.lang.String */]
  extends EditableAttrs
     with /**
	 * Contents of the customEditorParameters object.
	 */
/* parameterName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Default value for the editor cell.
  	 */
  var defaultValue: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(TRow))),List()),Left(TsIdentSimple(K))) */js.Any
  /**
  	 * The row data for the cell being edited.
  	 */
  var row: TRow
}

