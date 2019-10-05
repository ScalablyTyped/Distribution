package typings.reactDashOnsenui

import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataSource extends js.Object {
  var dataSource: js.UndefOr[js.Array[_]] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var renderFooter: js.UndefOr[js.Function0[js.UndefOr[Element]]] = js.undefined
  var renderHeader: js.UndefOr[js.Function0[js.UndefOr[Element]]] = js.undefined
  var renderRow: js.UndefOr[
    js.Function2[/* row */ js.Any, /* index */ js.UndefOr[Double], js.UndefOr[Element]]
  ] = js.undefined
}

object Anon_DataSource {
  @scala.inline
  def apply(
    dataSource: js.Array[_] = null,
    modifier: String = null,
    renderFooter: () => js.UndefOr[Element] = null,
    renderHeader: () => js.UndefOr[Element] = null,
    renderRow: (/* row */ js.Any, /* index */ js.UndefOr[Double]) => js.UndefOr[Element] = null
  ): Anon_DataSource = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(js.Any.fromFunction0(renderFooter))
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(js.Any.fromFunction0(renderHeader))
    if (renderRow != null) __obj.updateDynamic("renderRow")(js.Any.fromFunction2(renderRow))
    __obj.asInstanceOf[Anon_DataSource]
  }
}

