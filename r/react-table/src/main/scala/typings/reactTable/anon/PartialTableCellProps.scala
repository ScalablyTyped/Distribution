package typings.reactTable.anon

import typings.react.mod.CSSProperties
import typings.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-table.react-table.TableCellProps> */
@js.native
trait PartialTableCellProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var key: js.UndefOr[Key] = js.native
  var role: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object PartialTableCellProps {
  @scala.inline
  def apply(): PartialTableCellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTableCellProps]
  }
  @scala.inline
  implicit class PartialTableCellPropsOps[Self <: PartialTableCellProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

