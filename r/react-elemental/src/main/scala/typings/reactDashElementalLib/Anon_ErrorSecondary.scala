package typings
package reactDashElementalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorSecondary extends js.Object {
  val error: js.UndefOr[java.lang.String] = js.undefined
  val secondary: js.UndefOr[scala.Boolean] = js.undefined
  val style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  val textarea: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ErrorSecondary {
  @scala.inline
  def apply(
    error: java.lang.String = null,
    secondary: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null,
    textarea: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ErrorSecondary = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(textarea)) __obj.updateDynamic("textarea")(textarea)
    __obj.asInstanceOf[Anon_ErrorSecondary]
  }
}

