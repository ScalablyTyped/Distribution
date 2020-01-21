package typings.reapop.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  var allowHTML: js.UndefOr[Boolean] = js.undefined
  var buttons: js.UndefOr[js.Array[Button]] = js.undefined
  var closeButton: js.UndefOr[Boolean] = js.undefined
  var dismissAfter: js.UndefOr[Double] = js.undefined
  var dismissible: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var image: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var onAdd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onRemove: js.UndefOr[js.Function0[Unit]] = js.undefined
  var position: js.UndefOr[String | POSITION] = js.undefined
  var status: js.UndefOr[String | Double | STATUSES] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Notification {
  @scala.inline
  def apply(
    allowHTML: js.UndefOr[Boolean] = js.undefined,
    buttons: js.Array[Button] = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    dismissAfter: Int | Double = null,
    dismissible: js.UndefOr[Boolean] = js.undefined,
    id: String | Double = null,
    image: String = null,
    message: String = null,
    onAdd: () => Unit = null,
    onRemove: () => Unit = null,
    position: String | POSITION = null,
    status: String | Double | STATUSES = null,
    title: String = null
  ): Notification = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHTML)) __obj.updateDynamic("allowHTML")(allowHTML.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (dismissAfter != null) __obj.updateDynamic("dismissAfter")(dismissAfter.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissible)) __obj.updateDynamic("dismissible")(dismissible.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction0(onAdd))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction0(onRemove))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification]
  }
}

