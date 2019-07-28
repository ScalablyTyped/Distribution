package typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertModalColumnDescription[TRow /* <: js.Object */] extends js.Object {
   // children.props.keyValidator
  /**
  	 * Flag to indicate that the field should be auto-generated rather than edited. It is only present if there is more
  	 * than one column in the table.
  	 * Comes from TableHeader.autoValue.
  	 */
  var autoValue: js.UndefOr[Boolean] = js.undefined
   // children.props.dataField,
  /**
  	 * Flag to indicate whether this column is editable.
  	 * Comes from TableHeader.editable.
  	 */
  var editable: Boolean | (Editable[TRow, String]) | (js.Function4[
    /* import warning: ImportType.apply Failed type conversion: TRow[keyof TRow] */ /* cell */ js.Any, 
    /* row */ TRow, 
    /* rowIndex */ Double, 
    /* columnIndex */ Double, 
    Boolean | String | EditValidatorObject
  ])
  /**
  	 * Field name for the column data.
  	 * Comes from TableHeader.dataField.
  	 */
  var field: String
  /**
  	 * Format function for the field. It is only present if there is more than one column in the table. Value is either
  	 * 'false', meaning that there is no format function present, or a wrapper function that returns the formatted string
  	 * content for the field using the TableHeader.dataFormat function to generate that string.
  	 *
  	 * Based on from TableHeader.dataFormat, but is applied as a wrapper function around that function.
  	 */
  var format: js.UndefOr[
    Boolean | (js.Function1[
      /* import warning: ImportType.apply Failed type conversion: TRow[keyof TRow] */ /* cell */ js.Any, 
      String
    ])
  ] = js.undefined
  /**
  	 * Flag to indicate whether this column should be hidden on the Insert Modal page.
  	 * Comes from TableHeader.hiddenOnInsert.
  	 */
  var hiddenOnInsert: Boolean
  /**
  	 * Flag to indicate that this is the key field for the column. It is only present if there is more than
  	 * one column in the table.
  	 * Comes from TableHeader.isKey field.
  	 */
  var isKey: js.UndefOr[Boolean] = js.undefined
   // children.props.hiddenOnInsert,
  /**
  	 * Flag to indicate whether the table should check that a key does not already exist.
  	 * Comes from TableHeader.keyValidator.
  	 */
  var keyValidator: Boolean
  /**
  	 * Header text/element for the column.
  	 * Comes from TableHeader.headerText or TableHeader.children.
  	 */
  var name: String | ReactElement
  /**
  	 * Custom element to use for the Insert field element.
  	 * Comes from TableHeader.customInsertEditor.
  	 */
  def customInsertEditor(
    column: InsertModalColumnDescription[TRow],
    attr: EditableAttrs,
    editorClass: String,
    ignoreEditable: Boolean,
    defaultValue: /* import warning: ImportType.apply Failed type conversion: TRow[keyof TRow] */ js.Any
  ): ReactElement | Boolean
}

object InsertModalColumnDescription {
  @scala.inline
  def apply[TRow /* <: js.Object */](
    customInsertEditor: (InsertModalColumnDescription[TRow], EditableAttrs, String, Boolean, /* import warning: ImportType.apply Failed type conversion: TRow[keyof TRow] */ js.Any) => ReactElement | Boolean,
    editable: Boolean | (Editable[TRow, String]) | (js.Function4[
      /* import warning: ImportType.apply Failed type conversion: TRow[keyof TRow] */ /* cell */ js.Any, 
      /* row */ TRow, 
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      Boolean | String | EditValidatorObject
    ]),
    field: String,
    hiddenOnInsert: Boolean,
    keyValidator: Boolean,
    name: String | ReactElement,
    autoValue: js.UndefOr[Boolean] = js.undefined,
    format: Boolean | (js.Function1[
      /* import warning: ImportType.apply Failed type conversion: TRow[keyof TRow] */ /* cell */ js.Any, 
      String
    ]) = null,
    isKey: js.UndefOr[Boolean] = js.undefined
  ): InsertModalColumnDescription[TRow] = {
    val __obj = js.Dynamic.literal(customInsertEditor = js.Any.fromFunction5(customInsertEditor), editable = editable.asInstanceOf[js.Any], field = field, hiddenOnInsert = hiddenOnInsert, keyValidator = keyValidator, name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(autoValue)) __obj.updateDynamic("autoValue")(autoValue)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(isKey)) __obj.updateDynamic("isKey")(isKey)
    __obj.asInstanceOf[InsertModalColumnDescription[TRow]]
  }
}

