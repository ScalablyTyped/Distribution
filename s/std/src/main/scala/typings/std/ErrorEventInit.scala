package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorEventInit extends EventInit {
  var colno: js.UndefOr[Double] = js.undefined
  var error: js.UndefOr[js.Any] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var lineno: js.UndefOr[Double] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object ErrorEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    colno: js.UndefOr[Double] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.Any = null,
    filename: java.lang.String = null,
    lineno: js.UndefOr[Double] = js.undefined,
    message: java.lang.String = null
  ): ErrorEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(colno)) __obj.updateDynamic("colno")(colno.get.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(lineno)) __obj.updateDynamic("lineno")(lineno.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEventInit]
  }
}

