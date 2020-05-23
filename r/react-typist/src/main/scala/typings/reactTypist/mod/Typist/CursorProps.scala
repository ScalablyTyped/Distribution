package typings.reactTypist.mod.Typist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CursorProps extends js.Object {
  var blink: js.UndefOr[Boolean] = js.undefined
  var element: js.UndefOr[String] = js.undefined
  var hideWhenDone: js.UndefOr[Boolean] = js.undefined
  var hideWhenDoneDelay: js.UndefOr[Double] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
}

object CursorProps {
  @scala.inline
  def apply(
    blink: js.UndefOr[Boolean] = js.undefined,
    element: String = null,
    hideWhenDone: js.UndefOr[Boolean] = js.undefined,
    hideWhenDoneDelay: js.UndefOr[Double] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined
  ): CursorProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blink)) __obj.updateDynamic("blink")(blink.get.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(hideWhenDone)) __obj.updateDynamic("hideWhenDone")(hideWhenDone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideWhenDoneDelay)) __obj.updateDynamic("hideWhenDoneDelay")(hideWhenDoneDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorProps]
  }
}

