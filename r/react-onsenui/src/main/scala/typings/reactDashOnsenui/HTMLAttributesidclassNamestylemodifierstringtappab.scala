package typings.reactDashOnsenui

import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  modifier ? :string,   tappable ? :boolean,   tapBackgroundColor ? :string,   lockOnDrag ? :boolean,   onClick ? :react.react.MouseEventHandler<any>} */
trait HTMLAttributesidclassNamestylemodifierstringtappab extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var lockOnDrag: js.UndefOr[Boolean] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tapBackgroundColor: js.UndefOr[String] = js.undefined
  var tappable: js.UndefOr[Boolean] = js.undefined
}

object HTMLAttributesidclassNamestylemodifierstringtappab {
  @scala.inline
  def apply(
    className: String = null,
    id: String = null,
    lockOnDrag: js.UndefOr[Boolean] = js.undefined,
    modifier: String = null,
    onClick: MouseEvent[_, NativeMouseEvent] => Unit = null,
    style: CSSProperties = null,
    tapBackgroundColor: String = null,
    tappable: js.UndefOr[Boolean] = js.undefined
  ): HTMLAttributesidclassNamestylemodifierstringtappab = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(lockOnDrag)) __obj.updateDynamic("lockOnDrag")(lockOnDrag)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (style != null) __obj.updateDynamic("style")(style)
    if (tapBackgroundColor != null) __obj.updateDynamic("tapBackgroundColor")(tapBackgroundColor)
    if (!js.isUndefined(tappable)) __obj.updateDynamic("tappable")(tappable)
    __obj.asInstanceOf[HTMLAttributesidclassNamestylemodifierstringtappab]
  }
}

