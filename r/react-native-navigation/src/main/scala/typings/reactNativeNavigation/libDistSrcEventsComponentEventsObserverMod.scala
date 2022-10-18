package typings.reactNativeNavigation

import typings.react.mod.Component
import typings.reactNativeNavigation.anon.ComponentId
import typings.reactNativeNavigation.libDistSrcAdaptersNativeEventsReceiverMod.NativeEventsReceiver
import typings.reactNativeNavigation.libDistSrcComponentsStoreMod.Store
import typings.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.ComponentDidAppearEvent
import typings.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.ComponentDidDisappearEvent
import typings.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.ComponentWillAppearEvent
import typings.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.NavigationButtonPressedEvent
import typings.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.PreviewCompletedEvent
import typings.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.ScreenPoppedEvent
import typings.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.SearchBarCancelPressedEvent
import typings.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.SearchBarUpdatedEvent
import typings.reactNativeNavigation.libDistSrcInterfacesEventSubscriptionMod.EventSubscription
import typings.reactNativeNavigation.libDistSrcInterfacesNavigationComponentListenerMod.NavigationComponentListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcEventsComponentEventsObserverMod {
  
  @JSImport("react-native-navigation/lib/dist/src/events/ComponentEventsObserver", "ComponentEventsObserver")
  @js.native
  open class ComponentEventsObserver protected () extends StObject {
    def this(nativeEventsReceiver: NativeEventsReceiver, store: Store) = this()
    
    /* private */ var alreadyRegistered: Any = js.native
    
    def bindComponent(component: Component[ComponentId, js.Object, Any]): EventSubscription = js.native
    def bindComponent(component: Component[ComponentId, js.Object, Any], componentId: String): EventSubscription = js.native
    
    /* private */ var listeners: Any = js.native
    
    /* private */ val nativeEventsReceiver: Any = js.native
    
    def notifyComponentDidAppear(event: ComponentDidAppearEvent): Unit = js.native
    
    def notifyComponentDidDisappear(event: ComponentDidDisappearEvent): Unit = js.native
    
    def notifyComponentWillAppear(event: ComponentWillAppearEvent): Unit = js.native
    
    def notifyNavigationButtonPressed(event: NavigationButtonPressedEvent): Unit = js.native
    
    def notifyPreviewCompleted(event: PreviewCompletedEvent): Unit = js.native
    
    def notifyScreenPopped(event: ScreenPoppedEvent): Unit = js.native
    
    def notifySearchBarCancelPressed(event: SearchBarCancelPressedEvent): Unit = js.native
    
    def notifySearchBarUpdated(event: SearchBarUpdatedEvent): Unit = js.native
    
    def registerComponentListener(listener: NavigationComponentListener, componentId: String): EventSubscription = js.native
    
    def registerOnceForAllComponentEvents(): Unit = js.native
    
    /* private */ val store: Any = js.native
    
    /* private */ var triggerOnAllListenersByComponentId: Any = js.native
    
    def unmounted(componentId: String): Unit = js.native
  }
}
