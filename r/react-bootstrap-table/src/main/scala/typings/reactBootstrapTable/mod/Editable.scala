package typings.reactBootstrapTable.mod

import typings.react.mod.CSSProperties
import typings.reactBootstrapTable.AnonValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Editable[TRow /* <: js.Object */, K /* <: String */] extends js.Object {
  /**
  	 * Additional attributes for the editor component.
  	 */
  var attrs: js.UndefOr[EditableAttrs] = js.undefined
  /**
  	 * Class name to use for the editor component.
  	 */
  var className: js.UndefOr[String] = js.undefined
  /**
  	 * Number of columns to display for a text area component.
  	 */
  var cols: js.UndefOr[Double] = js.undefined
  /**
  	 * Default value to show in the edit field in the Insert Modal for this column.
  	 */
  var defaultValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ js.Any
  ] = js.undefined
  /**
  	 * Data in a select or checkbox. If a checkbox, use a string with a ':'(colon) to separate the two values, ex: Y:N
  	 * The callback function can be used to customize the select options based on other field values within the row.
  	 * If the array is an array of objects, the fields 'text' can be used for the display text and 'value' to specify
  	 * the option's value.
  	 */
  var options: js.UndefOr[AnonValues[TRow]] = js.undefined
  /**
  	 * @deprecated Use placeholder inside the attrs field instead.
  	 * Text to display as placeholder text in the editor component.
  	 */
  var placeholder: js.UndefOr[String] = js.undefined
  /**
  	 * Used to specify a field that can be modified in the insert modal when adding a new row, but cannot be edited
  	 * inside the table after the row has been inserted.
  	 */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Number of rows to display for a text area component.
  	 */
  var rows: js.UndefOr[Double] = js.undefined
  /**
  	 * CSS Style to use for the editor component.
  	 */
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
  	 * Edit field type, avaiable value is 'textarea', 'select', 'checkbox' and 'datetime'
  	 */
  var `type`: js.UndefOr[EditCellType] = js.undefined
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
  ] = js.undefined
}

object Editable {
  @scala.inline
  def apply[TRow /* <: js.Object */, K /* <: String */](
    attrs: EditableAttrs = null,
    className: String = null,
    cols: Int | Double = null,
    defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ js.Any = null,
    options: AnonValues[TRow] = null,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    rows: Int | Double = null,
    style: CSSProperties = null,
    `type`: EditCellType = null,
    validator: (/* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ /* cell */ js.Any, /* row */ TRow) => Boolean | String | EditValidatorObject = null
  ): Editable[TRow, K] = {
    val __obj = js.Dynamic.literal()
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(js.Any.fromFunction2(validator))
    __obj.asInstanceOf[Editable[TRow, K]]
  }
}

