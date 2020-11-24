package typings.reactabularTable.mod

import typings.reactabularTable.anon.PartialCSSStyleDeclaratio
import typings.reactabularTable.anon.RowIndexNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var onRow: js.UndefOr[js.Function2[/* row */ js.Any, /* props */ RowIndexNumber, _]] = js.native
  
  var rowKey: String = js.native
  
  var rows: js.Array[_] = js.native
  
  var style: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
}
object BodyProps {
  
  @scala.inline
  def apply(rowKey: String, rows: js.Array[_]): BodyProps = {
    val __obj = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyProps]
  }
  
  @scala.inline
  implicit class BodyPropsOps[Self <: BodyProps] (val x: Self) extends AnyVal {
    
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
    def setRowKey(value: String): Self = this.set("rowKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: js.Any*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[_]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setOnRow(value: (/* row */ js.Any, /* props */ RowIndexNumber) => _): Self = this.set("onRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRow: Self = this.set("onRow", js.undefined)
    
    @scala.inline
    def setStyle(value: PartialCSSStyleDeclaratio): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
