package typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomEditorProps[TRow /* <: js.Object */, K /* <: String */]
  extends EditableAttrs
     with /**
	 * Contents of the customEditorParameters object.
	 */
/* parameterName */ StringDictionary[js.Any] {
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
  @scala.inline
  def apply[TRow /* <: js.Object */, K /* <: String */](
    defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ js.Any,
    row: TRow,
    StringDictionary: /**
  	 * Contents of the customEditorParameters object.
  	 */
  /* parameterName */ StringDictionary[js.Any] = null,
    onBlur: () => Unit = null,
    onKeyDown: () => Unit = null,
    placeholder: String = null,
    ref: /* ref */ js.Any => _ = null
  ): CustomEditorProps[TRow, K] = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction0(onKeyDown))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(js.Any.fromFunction1(ref))
    __obj.asInstanceOf[CustomEditorProps[TRow, K]]
  }
}

