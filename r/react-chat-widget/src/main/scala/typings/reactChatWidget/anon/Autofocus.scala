package typings.reactChatWidget.anon

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Autofocus extends js.Object {
  var autofocus: js.UndefOr[Boolean] = js.undefined
  var badge: js.UndefOr[Double] = js.undefined
  var customLauncher: js.UndefOr[ComponentType[js.Function0[Unit]]] = js.undefined
  var fullScreenMode: js.UndefOr[Boolean] = js.undefined
  var handleQuickButtonClicked: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var profileAvatar: js.UndefOr[String] = js.undefined
  var senderPlaceHolder: js.UndefOr[String] = js.undefined
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  var subtitle: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleAvatar: js.UndefOr[String] = js.undefined
  def handleNewUserMessage(userInput: String): Unit
}

object Autofocus {
  @scala.inline
  def apply(
    handleNewUserMessage: String => Unit,
    autofocus: js.UndefOr[Boolean] = js.undefined,
    badge: js.UndefOr[Double] = js.undefined,
    customLauncher: ComponentType[js.Function0[Unit]] = null,
    fullScreenMode: js.UndefOr[Boolean] = js.undefined,
    handleQuickButtonClicked: /* value */ String => Unit = null,
    profileAvatar: String = null,
    senderPlaceHolder: String = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    subtitle: String = null,
    title: String = null,
    titleAvatar: String = null
  ): Autofocus = {
    val __obj = js.Dynamic.literal(handleNewUserMessage = js.Any.fromFunction1(handleNewUserMessage))
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(badge)) __obj.updateDynamic("badge")(badge.get.asInstanceOf[js.Any])
    if (customLauncher != null) __obj.updateDynamic("customLauncher")(customLauncher.asInstanceOf[js.Any])
    if (!js.isUndefined(fullScreenMode)) __obj.updateDynamic("fullScreenMode")(fullScreenMode.get.asInstanceOf[js.Any])
    if (handleQuickButtonClicked != null) __obj.updateDynamic("handleQuickButtonClicked")(js.Any.fromFunction1(handleQuickButtonClicked))
    if (profileAvatar != null) __obj.updateDynamic("profileAvatar")(profileAvatar.asInstanceOf[js.Any])
    if (senderPlaceHolder != null) __obj.updateDynamic("senderPlaceHolder")(senderPlaceHolder.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.get.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleAvatar != null) __obj.updateDynamic("titleAvatar")(titleAvatar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autofocus]
  }
}

