package typings.reactBootstrapTable.mod

import typings.react.mod.CSSProperties
import typings.reactBootstrapTable.anon.Values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Editable[TRow /* <: js.Object */, K /* <: /* keyof TRow */ String */] extends js.Object {
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
  def apply[/* <: js.Object */ TRow, /* <: / * keyof TRow * / java.lang.String */ K](): Editable[TRow, K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Editable[TRow, K]]
  }
  @scala.inline
  implicit class EditableOps[Self <: Editable[_, _], /* <: js.Object */ TRow, /* <: / * keyof TRow * / java.lang.String */ K] (val x: Self with (Editable[TRow, K])) extends AnyVal {
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
    def setAttrs(value: EditableAttrs): Self = this.set("attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttrs: Self = this.set("attrs", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    @scala.inline
    def setDefaultValue(value: /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setOptions(value: Values[TRow]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setType(value: EditCellType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValidator(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ /* cell */ js.Any, /* row */ TRow) => Boolean | String | EditValidatorObject
    ): Self = this.set("validator", js.Any.fromFunction2(value))
    @scala.inline
    def deleteValidator: Self = this.set("validator", js.undefined)
  }
  
}

