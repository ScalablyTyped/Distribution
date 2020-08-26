package typings.reactChatWidget.anon

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Autofocus extends js.Object {
  var autofocus: js.UndefOr[Boolean] = js.native
  var badge: js.UndefOr[Double] = js.native
  var customLauncher: js.UndefOr[ComponentType[js.Function0[Unit]]] = js.native
  var fullScreenMode: js.UndefOr[Boolean] = js.native
  var handleQuickButtonClicked: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  var profileAvatar: js.UndefOr[String] = js.native
  var senderPlaceHolder: js.UndefOr[String] = js.native
  var showCloseButton: js.UndefOr[Boolean] = js.native
  var subtitle: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var titleAvatar: js.UndefOr[String] = js.native
  def handleNewUserMessage(userInput: String): Unit = js.native
}

object Autofocus {
  @scala.inline
  def apply(handleNewUserMessage: String => Unit): Autofocus = {
    val __obj = js.Dynamic.literal(handleNewUserMessage = js.Any.fromFunction1(handleNewUserMessage))
    __obj.asInstanceOf[Autofocus]
  }
  @scala.inline
  implicit class AutofocusOps[Self <: Autofocus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHandleNewUserMessage(value: String => Unit): Self = this.set("handleNewUserMessage", js.Any.fromFunction1(value))
    @scala.inline
    def setAutofocus(value: Boolean): Self = this.set("autofocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutofocus: Self = this.set("autofocus", js.undefined)
    @scala.inline
    def setBadge(value: Double): Self = this.set("badge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    @scala.inline
    def setCustomLauncher(value: ComponentType[js.Function0[Unit]]): Self = this.set("customLauncher", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomLauncher: Self = this.set("customLauncher", js.undefined)
    @scala.inline
    def setFullScreenMode(value: Boolean): Self = this.set("fullScreenMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullScreenMode: Self = this.set("fullScreenMode", js.undefined)
    @scala.inline
    def setHandleQuickButtonClicked(value: /* value */ String => Unit): Self = this.set("handleQuickButtonClicked", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHandleQuickButtonClicked: Self = this.set("handleQuickButtonClicked", js.undefined)
    @scala.inline
    def setProfileAvatar(value: String): Self = this.set("profileAvatar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileAvatar: Self = this.set("profileAvatar", js.undefined)
    @scala.inline
    def setSenderPlaceHolder(value: String): Self = this.set("senderPlaceHolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSenderPlaceHolder: Self = this.set("senderPlaceHolder", js.undefined)
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = this.set("showCloseButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCloseButton: Self = this.set("showCloseButton", js.undefined)
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleAvatar(value: String): Self = this.set("titleAvatar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleAvatar: Self = this.set("titleAvatar", js.undefined)
  }
  
}

