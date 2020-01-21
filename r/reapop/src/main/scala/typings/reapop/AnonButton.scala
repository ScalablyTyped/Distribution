package typings.reapop

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButton extends js.Object {
  var button: js.UndefOr[String] = js.undefined
  var buttonText: js.UndefOr[String] = js.undefined
  var buttons: js.UndefOr[js.Function0[String]] = js.undefined
  var closeButton: js.UndefOr[js.Function0[String]] = js.undefined
  var closeButtonContainer: js.UndefOr[js.Function0[String]] = js.undefined
  var dismissible: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var image: js.UndefOr[String] = js.undefined
  var imageContainer: js.UndefOr[String] = js.undefined
  var main: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var meta: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[js.Function1[/* status */ String, String]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var wrapper: js.UndefOr[String] = js.undefined
}

object AnonButton {
  @scala.inline
  def apply(
    button: String = null,
    buttonText: String = null,
    buttons: () => String = null,
    closeButton: () => String = null,
    closeButtonContainer: () => String = null,
    dismissible: String = null,
    icon: String = null,
    image: String = null,
    imageContainer: String = null,
    main: String = null,
    message: String = null,
    meta: String = null,
    status: /* status */ String => String = null,
    title: String = null,
    wrapper: String = null
  ): AnonButton = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(js.Any.fromFunction0(buttons))
    if (closeButton != null) __obj.updateDynamic("closeButton")(js.Any.fromFunction0(closeButton))
    if (closeButtonContainer != null) __obj.updateDynamic("closeButtonContainer")(js.Any.fromFunction0(closeButtonContainer))
    if (dismissible != null) __obj.updateDynamic("dismissible")(dismissible.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (imageContainer != null) __obj.updateDynamic("imageContainer")(imageContainer.asInstanceOf[js.Any])
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(js.Any.fromFunction1(status))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonButton]
  }
}

