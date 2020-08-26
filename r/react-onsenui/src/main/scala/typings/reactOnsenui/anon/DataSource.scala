package typings.reactOnsenui.anon

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSource[T] extends js.Object {
  var dataSource: js.UndefOr[js.Array[T]] = js.native
  var modifier: js.UndefOr[String] = js.native
  var renderFooter: js.UndefOr[js.Function0[js.UndefOr[Element]]] = js.native
  var renderHeader: js.UndefOr[js.Function0[js.UndefOr[Element]]] = js.native
  var renderRow: js.UndefOr[js.Function2[/* row */ T, /* index */ js.UndefOr[Double], js.UndefOr[Element]]] = js.native
}

object DataSource {
  @scala.inline
  def apply[T](): DataSource[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource[T]]
  }
  @scala.inline
  implicit class DataSourceOps[Self <: DataSource[_], T] (val x: Self with DataSource[T]) extends AnyVal {
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
    def setDataSourceVarargs(value: T*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: js.Array[T]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setModifier(value: String): Self = this.set("modifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifier: Self = this.set("modifier", js.undefined)
    @scala.inline
    def setRenderFooter(value: () => js.UndefOr[Element]): Self = this.set("renderFooter", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRenderFooter: Self = this.set("renderFooter", js.undefined)
    @scala.inline
    def setRenderHeader(value: () => js.UndefOr[Element]): Self = this.set("renderHeader", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRenderHeader: Self = this.set("renderHeader", js.undefined)
    @scala.inline
    def setRenderRow(value: (/* row */ T, /* index */ js.UndefOr[Double]) => js.UndefOr[Element]): Self = this.set("renderRow", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRenderRow: Self = this.set("renderRow", js.undefined)
  }
  
}

