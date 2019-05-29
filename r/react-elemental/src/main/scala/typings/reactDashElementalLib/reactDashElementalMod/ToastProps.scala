package typings
package reactDashElementalLib.reactDashElementalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastProps extends js.Object {
  val accent: js.UndefOr[java.lang.String] = js.undefined
  val children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  val color: js.UndefOr[java.lang.String] = js.undefined
  val style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object ToastProps {
  @scala.inline
  def apply(
    accent: java.lang.String = null,
    children: reactLib.reactMod.ReactNode = null,
    color: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null
  ): ToastProps = {
    val __obj = js.Dynamic.literal()
    if (accent != null) __obj.updateDynamic("accent")(accent)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ToastProps]
  }
}

