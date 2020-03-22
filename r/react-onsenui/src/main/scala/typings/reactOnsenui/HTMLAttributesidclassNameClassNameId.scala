package typings.reactOnsenui

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  modifier ? :string,   onClick ? :react.react.MouseEventHandler<any>} */
trait HTMLAttributesidclassNameClassNameId extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object HTMLAttributesidclassNameClassNameId {
  @scala.inline
  def apply(
    className: String = null,
    id: String = null,
    modifier: String = null,
    onClick: MouseEvent[_, NativeMouseEvent] => Unit = null,
    style: CSSProperties = null
  ): HTMLAttributesidclassNameClassNameId = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributesidclassNameClassNameId]
  }
}

