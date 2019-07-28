package typings.reactDashElemental

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorSecondary extends js.Object {
  val error: js.UndefOr[String] = js.undefined
  val secondary: js.UndefOr[Boolean] = js.undefined
  val style: js.UndefOr[CSSProperties] = js.undefined
  val textarea: js.UndefOr[Boolean] = js.undefined
}

object Anon_ErrorSecondary {
  @scala.inline
  def apply(
    error: String = null,
    secondary: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    textarea: js.UndefOr[Boolean] = js.undefined
  ): Anon_ErrorSecondary = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(textarea)) __obj.updateDynamic("textarea")(textarea)
    __obj.asInstanceOf[Anon_ErrorSecondary]
  }
}

