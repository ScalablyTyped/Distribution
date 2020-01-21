package typings.reactJoyride.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var back: js.UndefOr[ReactNode] = js.undefined
  var close: js.UndefOr[ReactNode] = js.undefined
  var last: js.UndefOr[ReactNode] = js.undefined
  var next: js.UndefOr[ReactNode] = js.undefined
  var open: js.UndefOr[ReactNode] = js.undefined
  var skip: js.UndefOr[ReactNode] = js.undefined
}

object Locale {
  @scala.inline
  def apply(
    back: ReactNode = null,
    close: ReactNode = null,
    last: ReactNode = null,
    next: ReactNode = null,
    open: ReactNode = null,
    skip: ReactNode = null
  ): Locale = {
    val __obj = js.Dynamic.literal()
    if (back != null) __obj.updateDynamic("back")(back.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
}

