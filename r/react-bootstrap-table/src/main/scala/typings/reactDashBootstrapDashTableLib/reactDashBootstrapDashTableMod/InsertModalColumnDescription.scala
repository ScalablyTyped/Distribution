package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

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
  var autoValue: js.UndefOr[scala.Boolean] = js.undefined
   // children.props.dataField,
  /**
  	 * Flag to indicate whether this column is editable.
  	 * Comes from TableHeader.editable.
  	 */
  var editable: scala.Boolean | (Editable[TRow, java.lang.String]) | (js.Function4[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(TRow))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(TRow))),List())))) *//* cell */ js.Any, 
    /* row */ TRow, 
    /* rowIndex */ scala.Double, 
    /* columnIndex */ scala.Double, 
    scala.Boolean | java.lang.String | EditValidatorObject
  ])
  /**
  	 * Field name for the column data.
  	 * Comes from TableHeader.dataField.
  	 */
  var field: java.lang.String
  /**
  	 * Format function for the field. It is only present if there is more than one column in the table. Value is either
  	 * 'false', meaning that there is no format function present, or a wrapper function that returns the formatted string
  	 * content for the field using the TableHeader.dataFormat function to generate that string.
  	 *
  	 * Based on from TableHeader.dataFormat, but is applied as a wrapper function around that function.
  	 */
  var format: js.UndefOr[
    scala.Boolean | (js.Function1[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(TRow))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(TRow))),List())))) *//* cell */ js.Any, 
      java.lang.String
    ])
  ] = js.undefined
  /**
  	 * Flag to indicate whether this column should be hidden on the Insert Modal page.
  	 * Comes from TableHeader.hiddenOnInsert.
  	 */
  var hiddenOnInsert: scala.Boolean
  /**
  	 * Flag to indicate that this is the key field for the column. It is only present if there is more than
  	 * one column in the table.
  	 * Comes from TableHeader.isKey field.
  	 */
  var isKey: js.UndefOr[scala.Boolean] = js.undefined
   // children.props.hiddenOnInsert,
  /**
  	 * Flag to indicate whether the table should check that a key does not already exist.
  	 * Comes from TableHeader.keyValidator.
  	 */
  var keyValidator: scala.Boolean
  /**
  	 * Header text/element for the column.
  	 * Comes from TableHeader.headerText or TableHeader.children.
  	 */
  var name: java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_]
  /**
  	 * Custom element to use for the Insert field element.
  	 * Comes from TableHeader.customInsertEditor.
  	 */
  def customInsertEditor(
    column: InsertModalColumnDescription[TRow],
    attr: EditableAttrs,
    editorClass: java.lang.String,
    ignoreEditable: scala.Boolean,
    defaultValue: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(TRow))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(TRow))),List())))) */js.Any
  ): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Boolean
}

