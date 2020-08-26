package typings.senchaTouch.Ext.device.sqlite

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISQLResultSetRowList extends IBase {
  /** [Method] Returns the number of rows returned by the SQL statement
    * @returns Number The number of rows.
    */
  var getLength: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns a row at specified index returned by the SQL statement
    * @param index Number This is required. The index of a row.
    * @returns Object The row.
    */
  var item: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], _]] = js.native
}

object ISQLResultSetRowList {
  @scala.inline
  def apply(): ISQLResultSetRowList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISQLResultSetRowList]
  }
  @scala.inline
  implicit class ISQLResultSetRowListOps[Self <: ISQLResultSetRowList] (val x: Self) extends AnyVal {
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
    def setGetLength(value: () => Double): Self = this.set("getLength", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLength: Self = this.set("getLength", js.undefined)
    @scala.inline
    def setItem(value: /* index */ js.UndefOr[Double] => _): Self = this.set("item", js.Any.fromFunction1(value))
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
  }
  
}

