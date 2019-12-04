package typings.reactDashDom.reactDashDomMod

import typings.std.Comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// enableSuspenseServerRenderer feature
trait HydrationOptions extends js.Object {
  var onDeleted: js.UndefOr[js.Function1[/* suspenseInstance */ Comment, Unit]] = js.undefined
  var onHydrated: js.UndefOr[js.Function1[/* suspenseInstance */ Comment, Unit]] = js.undefined
}

object HydrationOptions {
  @scala.inline
  def apply(
    onDeleted: /* suspenseInstance */ Comment => Unit = null,
    onHydrated: /* suspenseInstance */ Comment => Unit = null
  ): HydrationOptions = {
    val __obj = js.Dynamic.literal()
    if (onDeleted != null) __obj.updateDynamic("onDeleted")(js.Any.fromFunction1(onDeleted))
    if (onHydrated != null) __obj.updateDynamic("onHydrated")(js.Any.fromFunction1(onHydrated))
    __obj.asInstanceOf[HydrationOptions]
  }
}

