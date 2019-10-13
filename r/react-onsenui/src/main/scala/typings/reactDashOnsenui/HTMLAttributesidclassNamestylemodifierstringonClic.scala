package typings.reactDashOnsenui

import typings.react.reactMod.CSSProperties
import typings.reactDashOnsenui.reactDashOnsenuiMod.Navigator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  modifier ? :string,   onClick ? :(navigator : react-onsenui.react-onsenui.Navigator): void} */
trait HTMLAttributesidclassNamestylemodifierstringonClic extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* navigator */ Navigator, Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object HTMLAttributesidclassNamestylemodifierstringonClic {
  @scala.inline
  def apply(
    className: String = null,
    id: String = null,
    modifier: String = null,
    onClick: /* navigator */ Navigator => Unit = null,
    style: CSSProperties = null
  ): HTMLAttributesidclassNamestylemodifierstringonClic = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[HTMLAttributesidclassNamestylemodifierstringonClic]
  }
}

