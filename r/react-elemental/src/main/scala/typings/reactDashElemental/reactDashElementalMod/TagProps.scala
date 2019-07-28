package typings.reactDashElemental.reactDashElementalMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagProps extends js.Object {
  val backgroundColor: js.UndefOr[String] = js.undefined
  val dismissible: js.UndefOr[Boolean] = js.undefined
  val onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  val outlineColor: js.UndefOr[String] = js.undefined
  val size: js.UndefOr[TagSize] = js.undefined
  val style: js.UndefOr[CSSProperties] = js.undefined
  val text: String
}

object TagProps {
  @scala.inline
  def apply(
    text: String,
    backgroundColor: String = null,
    dismissible: js.UndefOr[Boolean] = js.undefined,
    onDismiss: () => Unit = null,
    outlineColor: String = null,
    size: TagSize = null,
    style: CSSProperties = null
  ): TagProps = {
    val __obj = js.Dynamic.literal(text = text)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (!js.isUndefined(dismissible)) __obj.updateDynamic("dismissible")(dismissible)
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor)
    if (size != null) __obj.updateDynamic("size")(size)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TagProps]
  }
}

