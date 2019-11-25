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
    colno: Int | Double = null,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.Any = null,
    filename: java.lang.String = null,
    lineno: Int | Double = null,
    message: java.lang.String = null
  ): ErrorEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (colno != null) __obj.updateDynamic("colno")(colno.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (lineno != null) __obj.updateDynamic("lineno")(lineno.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEventInit]
  }
}

