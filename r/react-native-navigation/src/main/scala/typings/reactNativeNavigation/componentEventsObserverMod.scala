package typings.reactNativeNavigation

import typings.react.mod.Component
import typings.reactNativeNavigation.componentEventsMod.ComponentDidAppearEvent
import typings.reactNativeNavigation.componentEventsMod.ComponentDidDisappearEvent
import typings.reactNativeNavigation.componentEventsMod.ModalAttemptedToDismissEvent
import typings.reactNativeNavigation.componentEventsMod.ModalDismissedEvent
import typings.reactNativeNavigation.componentEventsMod.NavigationButtonPressedEvent
import typings.reactNativeNavigation.componentEventsMod.PreviewCompletedEvent
import typings.reactNativeNavigation.componentEventsMod.ScreenPoppedEvent
import typings.reactNativeNavigation.componentEventsMod.SearchBarCancelPressedEvent
import typings.reactNativeNavigation.componentEventsMod.SearchBarUpdatedEvent
import typings.reactNativeNavigation.eventSubscriptionMod.EventSubscription
import typings.reactNativeNavigation.nativeEventsReceiverMod.NativeEventsReceiver
import typings.reactNativeNavigation.storeMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/events/ComponentEventsObserver", JSImport.Namespace)
@js.native
object componentEventsObserverMod extends js.Object {
  @js.native
  class ComponentEventsObserver protected () extends js.Object {
    def this(nativeEventsReceiver: NativeEventsReceiver, store: Store) = this()
    var alreadyRegistered: js.Any = js.native
    var listeners: js.Any = js.native
    val nativeEventsReceiver: js.Any = js.native
    val store: js.Any = js.native
    var triggerOnAllListenersByComponentId: js.Any = js.native
    def bindComponent(component: Component[_, js.Object, _]): EventSubscription = js.native
    def bindComponent(component: Component[_, js.Object, _], componentId: String): EventSubscription = js.native
    def notifyComponentDidAppear(event: ComponentDidAppearEvent): Unit = js.native
    def notifyComponentDidDisappear(event: ComponentDidDisappearEvent): Unit = js.native
    def notifyModalAttemptedToDismiss(event: ModalAttemptedToDismissEvent): Unit = js.native
    def notifyModalDismissed(event: ModalDismissedEvent): Unit = js.native
    def notifyNavigationButtonPressed(event: NavigationButtonPressedEvent): Unit = js.native
    def notifyPreviewCompleted(event: PreviewCompletedEvent): Unit = js.native
    def notifyScreenPopped(event: ScreenPoppedEvent): Unit = js.native
    def notifySearchBarCancelPressed(event: SearchBarCancelPressedEvent): Unit = js.native
    def notifySearchBarUpdated(event: SearchBarUpdatedEvent): Unit = js.native
    def registerOnceForAllComponentEvents(): Unit = js.native
    def unmounted(componentId: String): Unit = js.native
  }
  
}

