package typings.reactDashFloater.reactDashFloaterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var arrow: js.UndefOr[js.Object] = js.undefined
  var computeStyle: js.UndefOr[js.Object] = js.undefined
  var flip: js.UndefOr[js.Object] = js.undefined
  var hide: js.UndefOr[js.Object] = js.undefined
  var inner: js.UndefOr[js.Object] = js.undefined
  var keepTogether: js.UndefOr[js.Object] = js.undefined
  var offset: js.UndefOr[js.Object] = js.undefined
  var preventOverflow: js.UndefOr[js.Object] = js.undefined
  var shift: js.UndefOr[js.Object] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    arrow: js.Object = null,
    computeStyle: js.Object = null,
    flip: js.Object = null,
    hide: js.Object = null,
    inner: js.Object = null,
    keepTogether: js.Object = null,
    offset: js.Object = null,
    preventOverflow: js.Object = null,
    shift: js.Object = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (arrow != null) __obj.updateDynamic("arrow")(arrow)
    if (computeStyle != null) __obj.updateDynamic("computeStyle")(computeStyle)
    if (flip != null) __obj.updateDynamic("flip")(flip)
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (inner != null) __obj.updateDynamic("inner")(inner)
    if (keepTogether != null) __obj.updateDynamic("keepTogether")(keepTogether)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (preventOverflow != null) __obj.updateDynamic("preventOverflow")(preventOverflow)
    if (shift != null) __obj.updateDynamic("shift")(shift)
    __obj.asInstanceOf[Options]
  }
}

