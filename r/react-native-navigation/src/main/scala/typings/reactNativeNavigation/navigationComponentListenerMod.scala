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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationComponentListenerMod {
  
  @js.native
  trait NavigationComponentListener extends StObject {
    
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
    implicit class NavigationComponentListenerMutableBuilder[Self <: NavigationComponentListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentDidAppear(value: /* _event */ ComponentDidAppearEvent => Unit): Self = StObject.set(x, "componentDidAppear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentDidAppearUndefined: Self = StObject.set(x, "componentDidAppear", js.undefined)
      
      @scala.inline
      def setComponentDidDisappear(value: /* _event */ ComponentDidDisappearEvent => Unit): Self = StObject.set(x, "componentDidDisappear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentDidDisappearUndefined: Self = StObject.set(x, "componentDidDisappear", js.undefined)
      
      @scala.inline
      def setModalAttemptedToDismiss(value: /* _event */ ModalAttemptedToDismissEvent => Unit): Self = StObject.set(x, "modalAttemptedToDismiss", js.Any.fromFunction1(value))
      
      @scala.inline
      def setModalAttemptedToDismissUndefined: Self = StObject.set(x, "modalAttemptedToDismiss", js.undefined)
      
      @scala.inline
      def setModalDismissed(value: /* _event */ ModalDismissedEvent => Unit): Self = StObject.set(x, "modalDismissed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setModalDismissedUndefined: Self = StObject.set(x, "modalDismissed", js.undefined)
      
      @scala.inline
      def setNavigationButtonPressed(value: /* _event */ NavigationButtonPressedEvent => Unit): Self = StObject.set(x, "navigationButtonPressed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNavigationButtonPressedUndefined: Self = StObject.set(x, "navigationButtonPressed", js.undefined)
      
      @scala.inline
      def setPreviewCompleted(value: /* _event */ PreviewCompletedEvent => Unit): Self = StObject.set(x, "previewCompleted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreviewCompletedUndefined: Self = StObject.set(x, "previewCompleted", js.undefined)
      
      @scala.inline
      def setScreenPopped(value: /* _event */ ScreenPoppedEvent => Unit): Self = StObject.set(x, "screenPopped", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScreenPoppedUndefined: Self = StObject.set(x, "screenPopped", js.undefined)
      
      @scala.inline
      def setSearchBarCancelPressed(value: /* _event */ SearchBarCancelPressedEvent => Unit): Self = StObject.set(x, "searchBarCancelPressed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSearchBarCancelPressedUndefined: Self = StObject.set(x, "searchBarCancelPressed", js.undefined)
      
      @scala.inline
      def setSearchBarUpdated(value: /* _event */ SearchBarUpdatedEvent => Unit): Self = StObject.set(x, "searchBarUpdated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSearchBarUpdatedUndefined: Self = StObject.set(x, "searchBarUpdated", js.undefined)
    }
  }
}
