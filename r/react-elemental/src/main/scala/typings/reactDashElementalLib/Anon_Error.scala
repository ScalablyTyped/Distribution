package typings
package reactDashElementalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  val error: js.UndefOr[java.lang.String] = js.undefined
  val secondary: js.UndefOr[scala.Boolean] = js.undefined
  val style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object Anon_Error {
  @scala.inline
  def apply(
    error: java.lang.String = null,
    secondary: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null
  ): Anon_Error = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[Anon_Error]
  }
}

