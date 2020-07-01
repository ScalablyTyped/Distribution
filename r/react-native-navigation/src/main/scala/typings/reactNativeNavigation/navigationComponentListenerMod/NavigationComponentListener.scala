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

trait NavigationComponentListener extends js.Object {
  var componentDidAppear: js.UndefOr[js.Function1[/* _event */ ComponentDidAppearEvent, Unit]] = js.undefined
  var componentDidDisappear: js.UndefOr[js.Function1[/* _event */ ComponentDidDisappearEvent, Unit]] = js.undefined
  var modalAttemptedToDismiss: js.UndefOr[js.Function1[/* _event */ ModalAttemptedToDismissEvent, Unit]] = js.undefined
  var modalDismissed: js.UndefOr[js.Function1[/* _event */ ModalDismissedEvent, Unit]] = js.undefined
  var navigationButtonPressed: js.UndefOr[js.Function1[/* _event */ NavigationButtonPressedEvent, Unit]] = js.undefined
  var previewCompleted: js.UndefOr[js.Function1[/* _event */ PreviewCompletedEvent, Unit]] = js.undefined
  var screenPopped: js.UndefOr[js.Function1[/* _event */ ScreenPoppedEvent, Unit]] = js.undefined
  var searchBarCancelPressed: js.UndefOr[js.Function1[/* _event */ SearchBarCancelPressedEvent, Unit]] = js.undefined
  var searchBarUpdated: js.UndefOr[js.Function1[/* _event */ SearchBarUpdatedEvent, Unit]] = js.undefined
}

object NavigationComponentListener {
  @scala.inline
  def apply(
    componentDidAppear: /* _event */ ComponentDidAppearEvent => Unit = null,
    componentDidDisappear: /* _event */ ComponentDidDisappearEvent => Unit = null,
    modalAttemptedToDismiss: /* _event */ ModalAttemptedToDismissEvent => Unit = null,
    modalDismissed: /* _event */ ModalDismissedEvent => Unit = null,
    navigationButtonPressed: /* _event */ NavigationButtonPressedEvent => Unit = null,
    previewCompleted: /* _event */ PreviewCompletedEvent => Unit = null,
    screenPopped: /* _event */ ScreenPoppedEvent => Unit = null,
    searchBarCancelPressed: /* _event */ SearchBarCancelPressedEvent => Unit = null,
    searchBarUpdated: /* _event */ SearchBarUpdatedEvent => Unit = null
  ): NavigationComponentListener = {
    val __obj = js.Dynamic.literal()
    if (componentDidAppear != null) __obj.updateDynamic("componentDidAppear")(js.Any.fromFunction1(componentDidAppear))
    if (componentDidDisappear != null) __obj.updateDynamic("componentDidDisappear")(js.Any.fromFunction1(componentDidDisappear))
    if (modalAttemptedToDismiss != null) __obj.updateDynamic("modalAttemptedToDismiss")(js.Any.fromFunction1(modalAttemptedToDismiss))
    if (modalDismissed != null) __obj.updateDynamic("modalDismissed")(js.Any.fromFunction1(modalDismissed))
    if (navigationButtonPressed != null) __obj.updateDynamic("navigationButtonPressed")(js.Any.fromFunction1(navigationButtonPressed))
    if (previewCompleted != null) __obj.updateDynamic("previewCompleted")(js.Any.fromFunction1(previewCompleted))
    if (screenPopped != null) __obj.updateDynamic("screenPopped")(js.Any.fromFunction1(screenPopped))
    if (searchBarCancelPressed != null) __obj.updateDynamic("searchBarCancelPressed")(js.Any.fromFunction1(searchBarCancelPressed))
    if (searchBarUpdated != null) __obj.updateDynamic("searchBarUpdated")(js.Any.fromFunction1(searchBarUpdated))
    __obj.asInstanceOf[NavigationComponentListener]
  }
}

