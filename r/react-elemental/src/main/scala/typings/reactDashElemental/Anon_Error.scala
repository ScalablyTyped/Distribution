package typings.reactDashElemental

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  val error: js.UndefOr[String] = js.undefined
  val secondary: js.UndefOr[Boolean] = js.undefined
  val style: js.UndefOr[CSSProperties] = js.undefined
}

object Anon_Error {
  @scala.inline
  def apply(error: String = null, secondary: js.UndefOr[Boolean] = js.undefined, style: CSSProperties = null): Anon_Error = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[Anon_Error]
  }
}

