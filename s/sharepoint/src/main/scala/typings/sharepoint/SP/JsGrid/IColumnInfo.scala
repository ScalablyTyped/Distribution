package typings.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait IColumnInfo extends js.Object {
  /** Column identifier */
  var columnKey: String = js.native
  /** Column identifier */
  var fieldKey: String = js.native
  /** Field keys of the fields, that are displayed in this column */
  var fieldKeys: js.Array[String] = js.native
  /** Column image URL.
    If not null, the column header cell will show the image instead of title text.
    If the title is defined at the same time as the imgSrc, the title will be shown as a tooltip. */
  var imgSrc: js.UndefOr[String] = js.native
  /** true by default */
  var isAutoFilterable: js.UndefOr[Boolean] = js.native
  /** false by default */
  var isFooter: js.UndefOr[Boolean] = js.native
  /** true by default */
  var isHidable: js.UndefOr[Boolean] = js.native
  /** true by default */
  var isResizable: js.UndefOr[Boolean] = js.native
  /** true by default */
  var isSortable: js.UndefOr[Boolean] = js.native
  /** true by default */
  var isVisible: js.UndefOr[Boolean] = js.native
  /** Column title */
  var name: String = js.native
  /** Width of the column */
  var width: Double = js.native
}

object IColumnInfo {
  @scala.inline
  def apply(columnKey: String, fieldKey: String, fieldKeys: js.Array[String], name: String, width: Double): IColumnInfo = {
    val __obj = js.Dynamic.literal(columnKey = columnKey.asInstanceOf[js.Any], fieldKey = fieldKey.asInstanceOf[js.Any], fieldKeys = fieldKeys.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnInfo]
  }
  @scala.inline
  implicit class IColumnInfoOps[Self <: IColumnInfo] (val x: Self) extends AnyVal {
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
    def setColumnKey(value: String): Self = this.set("columnKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldKey(value: String): Self = this.set("fieldKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldKeysVarargs(value: String*): Self = this.set("fieldKeys", js.Array(value :_*))
    @scala.inline
    def setFieldKeys(value: js.Array[String]): Self = this.set("fieldKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setImgSrc(value: String): Self = this.set("imgSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImgSrc: Self = this.set("imgSrc", js.undefined)
    @scala.inline
    def setIsAutoFilterable(value: Boolean): Self = this.set("isAutoFilterable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAutoFilterable: Self = this.set("isAutoFilterable", js.undefined)
    @scala.inline
    def setIsFooter(value: Boolean): Self = this.set("isFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFooter: Self = this.set("isFooter", js.undefined)
    @scala.inline
    def setIsHidable(value: Boolean): Self = this.set("isHidable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHidable: Self = this.set("isHidable", js.undefined)
    @scala.inline
    def setIsResizable(value: Boolean): Self = this.set("isResizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsResizable: Self = this.set("isResizable", js.undefined)
    @scala.inline
    def setIsSortable(value: Boolean): Self = this.set("isSortable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSortable: Self = this.set("isSortable", js.undefined)
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsVisible: Self = this.set("isVisible", js.undefined)
  }
  
}

