package typings.reactDataGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Indexes extends js.Object {
  var indexes: js.UndefOr[js.Array[Double]] = js.native
  var isSelectedKey: js.UndefOr[String] = js.native
  var keys: js.UndefOr[RowKey] = js.native
}

object Indexes {
  @scala.inline
  def apply(): Indexes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Indexes]
  }
  @scala.inline
  implicit class IndexesOps[Self <: Indexes] (val x: Self) extends AnyVal {
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
    def setIndexesVarargs(value: Double*): Self = this.set("indexes", js.Array(value :_*))
    @scala.inline
    def setIndexes(value: js.Array[Double]): Self = this.set("indexes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexes: Self = this.set("indexes", js.undefined)
    @scala.inline
    def setIsSelectedKey(value: String): Self = this.set("isSelectedKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSelectedKey: Self = this.set("isSelectedKey", js.undefined)
    @scala.inline
    def setKeys(value: RowKey): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
  }
  
}

