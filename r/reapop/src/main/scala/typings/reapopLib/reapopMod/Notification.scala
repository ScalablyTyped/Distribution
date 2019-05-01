package typings
package reapopLib.reapopMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  var allowHTML: js.UndefOr[scala.Boolean] = js.undefined
  var buttons: js.UndefOr[js.Array[Button]] = js.undefined
  var closeButton: js.UndefOr[scala.Boolean] = js.undefined
  var dismissAfter: js.UndefOr[scala.Double] = js.undefined
  var dismissible: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var image: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var onAdd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onRemove: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var position: js.UndefOr[java.lang.String | POSITION] = js.undefined
  var status: js.UndefOr[java.lang.String | scala.Double | STATUSES] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Notification {
  @scala.inline
  def apply(
    allowHTML: js.UndefOr[scala.Boolean] = js.undefined,
    buttons: js.Array[Button] = null,
    closeButton: js.UndefOr[scala.Boolean] = js.undefined,
    dismissAfter: scala.Int | scala.Double = null,
    dismissible: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String | scala.Double = null,
    image: java.lang.String = null,
    message: java.lang.String = null,
    onAdd: () => scala.Unit = null,
    onRemove: () => scala.Unit = null,
    position: java.lang.String | POSITION = null,
    status: java.lang.String | scala.Double | STATUSES = null,
    title: java.lang.String = null
  ): Notification = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHTML)) __obj.updateDynamic("allowHTML")(allowHTML)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton)
    if (dismissAfter != null) __obj.updateDynamic("dismissAfter")(dismissAfter.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissible)) __obj.updateDynamic("dismissible")(dismissible)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image)
    if (message != null) __obj.updateDynamic("message")(message)
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction0(onAdd))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction0(onRemove))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Notification]
  }
}

