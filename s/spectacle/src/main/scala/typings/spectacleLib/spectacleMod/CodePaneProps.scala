package typings
package spectacleLib.spectacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodePaneProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var contentEditable: js.UndefOr[scala.Boolean] = js.undefined
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var source: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var theme: js.UndefOr[themeType] = js.undefined
}

object CodePaneProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    contentEditable: js.UndefOr[scala.Boolean] = js.undefined,
    lang: java.lang.String = null,
    source: java.lang.String = null,
    style: CSSProperties = null,
    theme: themeType = null
  ): CodePaneProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(contentEditable)) __obj.updateDynamic("contentEditable")(contentEditable)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (source != null) __obj.updateDynamic("source")(source)
    if (style != null) __obj.updateDynamic("style")(style)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[CodePaneProps]
  }
}

