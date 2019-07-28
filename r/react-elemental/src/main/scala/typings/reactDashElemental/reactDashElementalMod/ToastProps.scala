package typings.reactDashElemental.reactDashElementalMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastProps extends js.Object {
  val accent: js.UndefOr[String] = js.undefined
  val children: js.UndefOr[ReactNode] = js.undefined
  val color: js.UndefOr[String] = js.undefined
  val style: js.UndefOr[CSSProperties] = js.undefined
}

object ToastProps {
  @scala.inline
  def apply(
    accent: String = null,
    children: ReactNode = null,
    color: String = null,
    style: CSSProperties = null
  ): ToastProps = {
    val __obj = js.Dynamic.literal()
    if (accent != null) __obj.updateDynamic("accent")(accent)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ToastProps]
  }
}

