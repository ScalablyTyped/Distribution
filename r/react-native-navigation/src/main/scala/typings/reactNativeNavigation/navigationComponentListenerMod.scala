package typings.reactNativeNavigation

import typings.reactNativeNavigation.componentEventsMod.ComponentDidAppearEvent
import typings.reactNativeNavigation.componentEventsMod.ComponentDidDisappearEvent
import typings.reactNativeNavigation.componentEventsMod.ModalAttemptedToDismissEvent
import typings.reactNativeNavigation.componentEventsMod.ModalDismissedEvent
import typings.reactNativeNavigation.componentEventsMod.NavigationButtonPressedEvent
import typings.reactNativeNavigation.componentEventsMod.PreviewCompletedEvent
import typings.reactNativeNavigation.componentEventsMod.ScreenPoppedEvent
import typings.reactNativeNavigation.componentEventsMod.SearchBarCancelPressedEvent
import typings.reactNativeNavigation.componentEventsMod.SearchBarUpdatedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationComponentListenerMod {
  
  trait NavigationComponentListener extends StObject {
    
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
    
    inline def apply(): NavigationComponentListener = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationComponentListener]
    }
    
    extension [Self <: NavigationComponentListener](x: Self) {
      
      inline def setComponentDidAppear(value: /* _event */ ComponentDidAppearEvent => Unit): Self = StObject.set(x, "componentDidAppear", js.Any.fromFunction1(value))
      
      inline def setComponentDidAppearUndefined: Self = StObject.set(x, "componentDidAppear", js.undefined)
      
      inline def setComponentDidDisappear(value: /* _event */ ComponentDidDisappearEvent => Unit): Self = StObject.set(x, "componentDidDisappear", js.Any.fromFunction1(value))
      
      inline def setComponentDidDisappearUndefined: Self = StObject.set(x, "componentDidDisappear", js.undefined)
      
      inline def setModalAttemptedToDismiss(value: /* _event */ ModalAttemptedToDismissEvent => Unit): Self = StObject.set(x, "modalAttemptedToDismiss", js.Any.fromFunction1(value))
      
      inline def setModalAttemptedToDismissUndefined: Self = StObject.set(x, "modalAttemptedToDismiss", js.undefined)
      
      inline def setModalDismissed(value: /* _event */ ModalDismissedEvent => Unit): Self = StObject.set(x, "modalDismissed", js.Any.fromFunction1(value))
      
      inline def setModalDismissedUndefined: Self = StObject.set(x, "modalDismissed", js.undefined)
      
      inline def setNavigationButtonPressed(value: /* _event */ NavigationButtonPressedEvent => Unit): Self = StObject.set(x, "navigationButtonPressed", js.Any.fromFunction1(value))
      
      inline def setNavigationButtonPressedUndefined: Self = StObject.set(x, "navigationButtonPressed", js.undefined)
      
      inline def setPreviewCompleted(value: /* _event */ PreviewCompletedEvent => Unit): Self = StObject.set(x, "previewCompleted", js.Any.fromFunction1(value))
      
      inline def setPreviewCompletedUndefined: Self = StObject.set(x, "previewCompleted", js.undefined)
      
      inline def setScreenPopped(value: /* _event */ ScreenPoppedEvent => Unit): Self = StObject.set(x, "screenPopped", js.Any.fromFunction1(value))
      
      inline def setScreenPoppedUndefined: Self = StObject.set(x, "screenPopped", js.undefined)
      
      inline def setSearchBarCancelPressed(value: /* _event */ SearchBarCancelPressedEvent => Unit): Self = StObject.set(x, "searchBarCancelPressed", js.Any.fromFunction1(value))
      
      inline def setSearchBarCancelPressedUndefined: Self = StObject.set(x, "searchBarCancelPressed", js.undefined)
      
      inline def setSearchBarUpdated(value: /* _event */ SearchBarUpdatedEvent => Unit): Self = StObject.set(x, "searchBarUpdated", js.Any.fromFunction1(value))
      
      inline def setSearchBarUpdatedUndefined: Self = StObject.set(x, "searchBarUpdated", js.undefined)
    }
  }
}
