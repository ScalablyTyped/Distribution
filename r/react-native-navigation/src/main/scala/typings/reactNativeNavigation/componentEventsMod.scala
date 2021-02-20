package typings.reactNativeNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentEventsMod {
  
  @js.native
  trait ComponentDidAppearEvent extends ComponentEvent {
    
    var componentName: String = js.native
    
    var componentType: ComponentType = js.native
    
    var passProps: js.UndefOr[js.Object] = js.native
  }
  object ComponentDidAppearEvent {
    
    @scala.inline
    def apply(componentId: String, componentName: String, componentType: ComponentType): ComponentDidAppearEvent = {
      val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], componentName = componentName.asInstanceOf[js.Any], componentType = componentType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentDidAppearEvent]
    }
    
    @scala.inline
    implicit class ComponentDidAppearEventMutableBuilder[Self <: ComponentDidAppearEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentType(value: ComponentType): Self = StObject.set(x, "componentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassProps(value: js.Object): Self = StObject.set(x, "passProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassPropsUndefined: Self = StObject.set(x, "passProps", js.undefined)
    }
  }
  
  @js.native
  trait ComponentDidDisappearEvent extends ComponentEvent {
    
    var componentName: String = js.native
    
    var componentType: ComponentType = js.native
  }
  object ComponentDidDisappearEvent {
    
    @scala.inline
    def apply(componentId: String, componentName: String, componentType: ComponentType): ComponentDidDisappearEvent = {
      val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], componentName = componentName.asInstanceOf[js.Any], componentType = componentType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentDidDisappearEvent]
    }
    
    @scala.inline
    implicit class ComponentDidDisappearEventMutableBuilder[Self <: ComponentDidDisappearEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentType(value: ComponentType): Self = StObject.set(x, "componentType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ComponentEvent extends StObject {
    
    var componentId: String = js.native
  }
  object ComponentEvent {
    
    @scala.inline
    def apply(componentId: String): ComponentEvent = {
      val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentEvent]
    }
    
    @scala.inline
    implicit class ComponentEventMutableBuilder[Self <: ComponentEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentId(value: String): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeNavigation.reactNativeNavigationStrings.Component
    - typings.reactNativeNavigation.reactNativeNavigationStrings.TopBarTitle
    - typings.reactNativeNavigation.reactNativeNavigationStrings.TopBarBackground
    - typings.reactNativeNavigation.reactNativeNavigationStrings.TopBarButton
  */
  trait ComponentType extends StObject
  object ComponentType {
    
    @scala.inline
    def Component: typings.reactNativeNavigation.reactNativeNavigationStrings.Component = "Component".asInstanceOf[typings.reactNativeNavigation.reactNativeNavigationStrings.Component]
    
    @scala.inline
    def TopBarBackground: typings.reactNativeNavigation.reactNativeNavigationStrings.TopBarBackground = "TopBarBackground".asInstanceOf[typings.reactNativeNavigation.reactNativeNavigationStrings.TopBarBackground]
    
    @scala.inline
    def TopBarButton: typings.reactNativeNavigation.reactNativeNavigationStrings.TopBarButton = "TopBarButton".asInstanceOf[typings.reactNativeNavigation.reactNativeNavigationStrings.TopBarButton]
    
    @scala.inline
    def TopBarTitle: typings.reactNativeNavigation.reactNativeNavigationStrings.TopBarTitle = "TopBarTitle".asInstanceOf[typings.reactNativeNavigation.reactNativeNavigationStrings.TopBarTitle]
  }
  
  @js.native
  trait ModalAttemptedToDismissEvent extends ComponentEvent
  object ModalAttemptedToDismissEvent {
    
    @scala.inline
    def apply(componentId: String): ModalAttemptedToDismissEvent = {
      val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalAttemptedToDismissEvent]
    }
  }
  
  @js.native
  trait ModalDismissedEvent extends ComponentEvent {
    
    var componentName: String = js.native
    
    var modalsDismissed: Double = js.native
  }
  object ModalDismissedEvent {
    
    @scala.inline
    def apply(componentId: String, componentName: String, modalsDismissed: Double): ModalDismissedEvent = {
      val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], componentName = componentName.asInstanceOf[js.Any], modalsDismissed = modalsDismissed.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalDismissedEvent]
    }
    
    @scala.inline
    implicit class ModalDismissedEventMutableBuilder[Self <: ModalDismissedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalsDismissed(value: Double): Self = StObject.set(x, "modalsDismissed", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NavigationButtonPressedEvent extends ComponentEvent {
    
    var buttonId: String = js.native
  }
  object NavigationButtonPressedEvent {
    
    @scala.inline
    def apply(buttonId: String, componentId: String): NavigationButtonPressedEvent = {
      val __obj = js.Dynamic.literal(buttonId = buttonId.asInstanceOf[js.Any], componentId = componentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationButtonPressedEvent]
    }
    
    @scala.inline
    implicit class NavigationButtonPressedEventMutableBuilder[Self <: NavigationButtonPressedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonId(value: String): Self = StObject.set(x, "buttonId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PreviewCompletedEvent extends ComponentEvent {
    
    var componentName: js.UndefOr[String] = js.native
    
    var previewComponentId: js.UndefOr[String] = js.native
  }
  object PreviewCompletedEvent {
    
    @scala.inline
    def apply(componentId: String): PreviewCompletedEvent = {
      val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviewCompletedEvent]
    }
    
    @scala.inline
    implicit class PreviewCompletedEventMutableBuilder[Self <: PreviewCompletedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
      
      @scala.inline
      def setPreviewComponentId(value: String): Self = StObject.set(x, "previewComponentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewComponentIdUndefined: Self = StObject.set(x, "previewComponentId", js.undefined)
    }
  }
  
  @js.native
  trait ScreenPoppedEvent extends ComponentEvent
  object ScreenPoppedEvent {
    
    @scala.inline
    def apply(componentId: String): ScreenPoppedEvent = {
      val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScreenPoppedEvent]
    }
  }
  
  @js.native
  trait SearchBarCancelPressedEvent extends ComponentEvent {
    
    var componentName: js.UndefOr[String] = js.native
  }
  object SearchBarCancelPressedEvent {
    
    @scala.inline
    def apply(componentId: String): SearchBarCancelPressedEvent = {
      val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchBarCancelPressedEvent]
    }
    
    @scala.inline
    implicit class SearchBarCancelPressedEventMutableBuilder[Self <: SearchBarCancelPressedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
    }
  }
  
  @js.native
  trait SearchBarUpdatedEvent extends ComponentEvent {
    
    var isFocused: Boolean = js.native
    
    var text: String = js.native
  }
  object SearchBarUpdatedEvent {
    
    @scala.inline
    def apply(componentId: String, isFocused: Boolean, text: String): SearchBarUpdatedEvent = {
      val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchBarUpdatedEvent]
    }
    
    @scala.inline
    implicit class SearchBarUpdatedEventMutableBuilder[Self <: SearchBarUpdatedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
