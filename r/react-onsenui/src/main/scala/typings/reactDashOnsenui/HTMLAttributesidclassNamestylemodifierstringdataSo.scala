package typings.reactDashOnsenui

import typings.react.reactMod.CSSProperties
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  modifier ? :string,   dataSource ? :std.Array<any>,   renderRow ? :(row : any, index ? : number): react.react._Global_.JSX.Element | undefined,   renderFooter ? :(): react.react._Global_.JSX.Element | undefined,   renderHeader ? :(): react.react._Global_.JSX.Element | undefined} */
trait HTMLAttributesidclassNamestylemodifierstringdataSo extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var dataSource: js.UndefOr[js.Array[_]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var renderFooter: js.UndefOr[js.Function0[js.UndefOr[Element]]] = js.undefined
  var renderHeader: js.UndefOr[js.Function0[js.UndefOr[Element]]] = js.undefined
  var renderRow: js.UndefOr[
    js.Function2[/* row */ js.Any, /* index */ js.UndefOr[Double], js.UndefOr[Element]]
  ] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object HTMLAttributesidclassNamestylemodifierstringdataSo {
  @scala.inline
  def apply(
    className: String = null,
    dataSource: js.Array[_] = null,
    id: String = null,
    modifier: String = null,
    renderFooter: () => js.UndefOr[Element] = null,
    renderHeader: () => js.UndefOr[Element] = null,
    renderRow: (/* row */ js.Any, /* index */ js.UndefOr[Double]) => js.UndefOr[Element] = null,
    style: CSSProperties = null
  ): HTMLAttributesidclassNamestylemodifierstringdataSo = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(js.Any.fromFunction0(renderFooter))
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(js.Any.fromFunction0(renderHeader))
    if (renderRow != null) __obj.updateDynamic("renderRow")(js.Any.fromFunction2(renderRow))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[HTMLAttributesidclassNamestylemodifierstringdataSo]
  }
}

