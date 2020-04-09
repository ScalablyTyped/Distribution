package typings.reactSplitPane.mod

import typings.react.mod.CSSProperties
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var eleRef: js.UndefOr[js.Function1[/* el */ HTMLDivElement, Unit]] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
  var split: js.UndefOr[Split] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object PaneProps {
  @scala.inline
  def apply(
    className: String = null,
    eleRef: /* el */ HTMLDivElement => Unit = null,
    size: Size = null,
    split: Split = null,
    style: CSSProperties = null
  ): PaneProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (eleRef != null) __obj.updateDynamic("eleRef")(js.Any.fromFunction1(eleRef))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (split != null) __obj.updateDynamic("split")(split.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaneProps]
  }
}

