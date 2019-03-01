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
/* parameterName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Default value for the editor cell.
  	 */
  var defaultValue: /* import warning: ImportType.apply Failed type conversion: TRow[K] */ js.Any
  /**
  	 * The row data for the cell being edited.
  	 */
  var row: TRow
}

object CustomEditorProps {
  @scala.inline
  def apply[TRow /* <: js.Object */, K /* <: java.lang.String */](
    defaultValue: /* import warning: ImportType.apply Failed type conversion: TRow[K] */ js.Any,
    row: TRow,
    StringDictionary: /**
  	 * Contents of the customEditorParameters object.
  	 */
  /* parameterName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    onBlur: js.Function0[scala.Unit] = null,
    onKeyDown: js.Function0[scala.Unit] = null,
    placeholder: java.lang.String = null,
    ref: js.Function1[/* ref */ js.Any, _] = null
  ): CustomEditorProps[TRow, K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultValue")(defaultValue)
    __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[CustomEditorProps[TRow, K]]
  }
}

