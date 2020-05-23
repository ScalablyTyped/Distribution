package typings.reactOnsenui.anon

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSource[T] extends js.Object {
  var dataSource: js.UndefOr[js.Array[T]] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var renderFooter: js.UndefOr[js.Function0[js.UndefOr[Element]]] = js.undefined
  var renderHeader: js.UndefOr[js.Function0[js.UndefOr[Element]]] = js.undefined
  var renderRow: js.UndefOr[js.Function2[/* row */ T, /* index */ js.UndefOr[Double], js.UndefOr[Element]]] = js.undefined
}

object DataSource {
  @scala.inline
  def apply[T](
    dataSource: js.Array[T] = null,
    modifier: String = null,
    renderFooter: () => js.UndefOr[Element] = null,
    renderHeader: () => js.UndefOr[Element] = null,
    renderRow: (/* row */ T, /* index */ js.UndefOr[Double]) => js.UndefOr[Element] = null
  ): DataSource[T] = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(js.Any.fromFunction0(renderFooter))
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(js.Any.fromFunction0(renderHeader))
    if (renderRow != null) __obj.updateDynamic("renderRow")(js.Any.fromFunction2(renderRow))
    __obj.asInstanceOf[DataSource[T]]
  }
}

