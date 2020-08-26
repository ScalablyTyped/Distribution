package typings.reactNativeNavigation.navigationComponentListenerMod

import typings.reactNativeNavigation.componentEventsMod.ComponentDidAppearEvent
import typings.reactNativeNavigation.componentEventsMod.ComponentDidDisappearEvent
import typings.reactNativeNavigation.componentEventsMod.ModalAttemptedToDismissEvent
import typings.reactNativeNavigation.componentEventsMod.ModalDismissedEvent
import typings.reactNativeNavigation.componentEventsMod.NavigationButtonPressedEvent
import typings.reactNativeNavigation.componentEventsMod.PreviewCompletedEvent
import typings.reactNativeNavigation.componentEventsMod.ScreenPoppedEvent
import typings.reactNativeNavigation.componentEventsMod.SearchBarCancelPressedEvent
import typings.reactNativeNavigation.componentEventsMod.SearchBarUpdatedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationComponentListener extends js.Object {
  var componentDidAppear: js.UndefOr[js.Function1[/* _event */ ComponentDidAppearEvent, Unit]] = js.native
  var componentDidDisappear: js.UndefOr[js.Function1[/* _event */ ComponentDidDisappearEvent, Unit]] = js.native
  var modalAttemptedToDismiss: js.UndefOr[js.Function1[/* _event */ ModalAttemptedToDismissEvent, Unit]] = js.native
  var modalDismissed: js.UndefOr[js.Function1[/* _event */ ModalDismissedEvent, Unit]] = js.native
  var navigationButtonPressed: js.UndefOr[js.Function1[/* _event */ NavigationButtonPressedEvent, Unit]] = js.native
  var previewCompleted: js.UndefOr[js.Function1[/* _event */ PreviewCompletedEvent, Unit]] = js.native
  var screenPopped: js.UndefOr[js.Function1[/* _event */ ScreenPoppedEvent, Unit]] = js.native
  var searchBarCancelPressed: js.UndefOr[js.Function1[/* _event */ SearchBarCancelPressedEvent, Unit]] = js.native
  var searchBarUpdated: js.UndefOr[js.Function1[/* _event */ SearchBarUpdatedEvent, Unit]] = js.native
}

object NavigationComponentListener {
  @scala.inline
  def apply(): NavigationComponentListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationComponentListener]
  }
  @scala.inline
  implicit class NavigationComponentListenerOps[Self <: NavigationComponentListener] (val x: Self) extends AnyVal {
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
    def setComponentDidAppear(value: /* _event */ ComponentDidAppearEvent => Unit): Self = this.set("componentDidAppear", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComponentDidAppear: Self = this.set("componentDidAppear", js.undefined)
    @scala.inline
    def setComponentDidDisappear(value: /* _event */ ComponentDidDisappearEvent => Unit): Self = this.set("componentDidDisappear", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComponentDidDisappear: Self = this.set("componentDidDisappear", js.undefined)
    @scala.inline
    def setModalAttemptedToDismiss(value: /* _event */ ModalAttemptedToDismissEvent => Unit): Self = this.set("modalAttemptedToDismiss", js.Any.fromFunction1(value))
    @scala.inline
    def deleteModalAttemptedToDismiss: Self = this.set("modalAttemptedToDismiss", js.undefined)
    @scala.inline
    def setModalDismissed(value: /* _event */ ModalDismissedEvent => Unit): Self = this.set("modalDismissed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteModalDismissed: Self = this.set("modalDismissed", js.undefined)
    @scala.inline
    def setNavigationButtonPressed(value: /* _event */ NavigationButtonPressedEvent => Unit): Self = this.set("navigationButtonPressed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNavigationButtonPressed: Self = this.set("navigationButtonPressed", js.undefined)
    @scala.inline
    def setPreviewCompleted(value: /* _event */ PreviewCompletedEvent => Unit): Self = this.set("previewCompleted", js.Any.fromFunction1(value))
    @scala.inline
    def deletePreviewCompleted: Self = this.set("previewCompleted", js.undefined)
    @scala.inline
    def setScreenPopped(value: /* _event */ ScreenPoppedEvent => Unit): Self = this.set("screenPopped", js.Any.fromFunction1(value))
    @scala.inline
    def deleteScreenPopped: Self = this.set("screenPopped", js.undefined)
    @scala.inline
    def setSearchBarCancelPressed(value: /* _event */ SearchBarCancelPressedEvent => Unit): Self = this.set("searchBarCancelPressed", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSearchBarCancelPressed: Self = this.set("searchBarCancelPressed", js.undefined)
    @scala.inline
    def setSearchBarUpdated(value: /* _event */ SearchBarUpdatedEvent => Unit): Self = this.set("searchBarUpdated", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSearchBarUpdated: Self = this.set("searchBarUpdated", js.undefined)
  }
  
}

