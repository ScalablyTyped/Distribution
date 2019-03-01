package typings
package reapopLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Button extends js.Object {
  var button: js.UndefOr[java.lang.String] = js.undefined
  var buttonText: js.UndefOr[java.lang.String] = js.undefined
  var buttons: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var closeButton: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var closeButtonContainer: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var dismissible: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var image: js.UndefOr[java.lang.String] = js.undefined
  var imageContainer: js.UndefOr[java.lang.String] = js.undefined
  var main: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var meta: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[js.Function1[/* status */ java.lang.String, java.lang.String]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var wrapper: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Button {
  @scala.inline
  def apply(
    button: java.lang.String = null,
    buttonText: java.lang.String = null,
    buttons: js.Function0[java.lang.String] = null,
    closeButton: js.Function0[java.lang.String] = null,
    closeButtonContainer: js.Function0[java.lang.String] = null,
    dismissible: java.lang.String = null,
    icon: java.lang.String = null,
    image: java.lang.String = null,
    imageContainer: java.lang.String = null,
    main: java.lang.String = null,
    message: java.lang.String = null,
    meta: java.lang.String = null,
    status: js.Function1[/* status */ java.lang.String, java.lang.String] = null,
    title: java.lang.String = null,
    wrapper: java.lang.String = null
  ): Anon_Button = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button)
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (closeButton != null) __obj.updateDynamic("closeButton")(closeButton)
    if (closeButtonContainer != null) __obj.updateDynamic("closeButtonContainer")(closeButtonContainer)
    if (dismissible != null) __obj.updateDynamic("dismissible")(dismissible)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (image != null) __obj.updateDynamic("image")(image)
    if (imageContainer != null) __obj.updateDynamic("imageContainer")(imageContainer)
    if (main != null) __obj.updateDynamic("main")(main)
    if (message != null) __obj.updateDynamic("message")(message)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (status != null) __obj.updateDynamic("status")(status)
    if (title != null) __obj.updateDynamic("title")(title)
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper)
    __obj.asInstanceOf[Anon_Button]
  }
}

