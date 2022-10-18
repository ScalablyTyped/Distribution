package typings.reactNativeNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcInterfacesComponentEventsMod {
  
  trait ComponentDidAppearEvent
    extends StObject
       with ComponentEvent {
    
    var componentName: String
    
    var componentType: ComponentType
    
    var passProps: js.UndefOr[js.Object] = js.undefined
  }
  object ComponentDidAppearEvent {
    
    inline def apply(componentId: String, componentName: String, componentType: ComponentType): ComponentDidAppearEvent = {
      val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], componentName = componentName.asInstanceOf[js.Any], componentType = componentType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentDidAppearEvent]
    }
    
    extension [Self <: ComponentDidAppearEvent](x: Self) {
      
      inline def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      inline def setComponentType(value: ComponentType): Self = StObject.set(x, "componentType", value.asInstanceOf[js.Any])
      
      inline def setPassProps(value: js.Object): Self = StObject.set(x, "passProps", value.asInstanceOf[js.Any])
      
      inline def setPassPropsUndefined: Self = StObject.set(x, "passProps", js.undefined)
    }
  }
  
  trait ComponentDidDisappearEvent
    extends StObject
       with ComponentEvent {
    
    var componentName: String
    
    var componentType: ComponentType
  }
  object ComponentDidDisappearEvent {
    
    inline def apply(componentId: String, componentName: String, componentType: ComponentType): ComponentDidDisappearEvent = {
      val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], componentName = componentName.asInstanceOf[js.Any], componentType = componentType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentDidDisappearEvent]
    }
    
    extension [Self <: ComponentDidDisappearEvent](x: Self) {
      
      inline def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      inline def setComponentType(value: ComponentType): Self = StObject.set(x, "componentType", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComponentEvent extends StObject {
    
    var componentId: String
  }
  object ComponentEvent {
    
    inline def apply(componentId: String): ComponentEvent = {
      val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentEvent]
    }
    
    extension [Self <: ComponentEvent](x: Self) {
      
      inline def setComponentId(value: String): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
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
    
    inline def Component: typings.reactNativeNavigation.reactNativeNavigationStrings.Component = "Component".asInstanceOf[typings.reactNativeNavigation.reactNativeNavigationStrings.Component]
    
    inline def TopBarBackground: typings.reactNativeNavigation.reactNativeNavigationStrings.TopBarBackground = "TopBarBackground".asInstanceOf[typings.reactNativeNavigation.reactNativeNavigationStrings.TopBarBackground]
    
    inline def TopBarButton: typings.reactNativeNavigation.reactNativeNavigationStrings.TopBarButton = "TopBarButton".asInstanceOf[typings.reactNativeNavigation.reactNativeNavigationStrings.TopBarButton]
    
    inline def TopBarTitle: typings.reactNativeNavigation.reactNativeNavigationStrings.TopBarTitle = "TopBarTitle".asInstanceOf[typings.reactNativeNavigation.reactNativeNavigationStrings.TopBarTitle]
  }
  
  trait ComponentWillAppearEvent
    extends StObject
       with ComponentEvent {
    
    var componentName: String
    
    var componentType: ComponentType
    
    var passProps: js.UndefOr[js.Object] = js.undefined
  }
  object ComponentWillAppearEvent {
    
    inline def apply(componentId: String, componentName: String, componentType: ComponentType): ComponentWillAppearEvent = {
      val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], componentName = componentName.asInstanceOf[js.Any], componentType = componentType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentWillAppearEvent]
    }
    
    extension [Self <: ComponentWillAppearEvent](x: Self) {
      
      inline def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      inline def setComponentType(value: ComponentType): Self = StObject.set(x, "componentType", value.asInstanceOf[js.Any])
      
      inline def setPassProps(value: js.Object): Self = StObject.set(x, "passProps", value.asInstanceOf[js.Any])
      
      inline def setPassPropsUndefined: Self = StObject.set(x, "passProps", js.undefined)
    }
  }
  
  trait ModalAttemptedToDismissEvent
    extends StObject
       with ComponentEvent
  object ModalAttemptedToDismissEvent {
    
    inline def apply(componentId: String): ModalAttemptedToDismissEvent = {
      val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalAttemptedToDismissEvent]
    }
  }
  
  trait ModalDismissedEvent
    extends StObject
       with ComponentEvent {
    
    var componentName: String
    
    var modalsDismissed: Double
  }
  object ModalDismissedEvent {
    
    inline def apply(componentId: String, componentName: String, modalsDismissed: Double): ModalDismissedEvent = {
      val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], componentName = componentName.asInstanceOf[js.Any], modalsDismissed = modalsDismissed.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalDismissedEvent]
    }
    
    extension [Self <: ModalDismissedEvent](x: Self) {
      
      inline def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      inline def setModalsDismissed(value: Double): Self = StObject.set(x, "modalsDismissed", value.asInstanceOf[js.Any])
    }
  }
  
  trait NavigationButtonPressedEvent
    extends StObject
       with ComponentEvent {
    
    var buttonId: String
  }
  object NavigationButtonPressedEvent {
    
    inline def apply(buttonId: String, componentId: String): NavigationButtonPressedEvent = {
      val __obj = js.Dynamic.literal(buttonId = buttonId.asInstanceOf[js.Any], componentId = componentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationButtonPressedEvent]
    }
    
    extension [Self <: NavigationButtonPressedEvent](x: Self) {
      
      inline def setButtonId(value: String): Self = StObject.set(x, "buttonId", value.asInstanceOf[js.Any])
    }
  }
  
  trait PreviewCompletedEvent
    extends StObject
       with ComponentEvent {
    
    var componentName: js.UndefOr[String] = js.undefined
    
    var previewComponentId: js.UndefOr[String] = js.undefined
  }
  object PreviewCompletedEvent {
    
    inline def apply(componentId: String): PreviewCompletedEvent = {
      val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviewCompletedEvent]
    }
    
    extension [Self <: PreviewCompletedEvent](x: Self) {
      
      inline def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
      
      inline def setPreviewComponentId(value: String): Self = StObject.set(x, "previewComponentId", value.asInstanceOf[js.Any])
      
      inline def setPreviewComponentIdUndefined: Self = StObject.set(x, "previewComponentId", js.undefined)
    }
  }
  
  trait ScreenPoppedEvent
    extends StObject
       with ComponentEvent
  object ScreenPoppedEvent {
    
    inline def apply(componentId: String): ScreenPoppedEvent = {
      val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScreenPoppedEvent]
    }
  }
  
  trait SearchBarCancelPressedEvent
    extends StObject
       with ComponentEvent {
    
    var componentName: js.UndefOr[String] = js.undefined
  }
  object SearchBarCancelPressedEvent {
    
    inline def apply(componentId: String): SearchBarCancelPressedEvent = {
      val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchBarCancelPressedEvent]
    }
    
    extension [Self <: SearchBarCancelPressedEvent](x: Self) {
      
      inline def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
    }
  }
  
  trait SearchBarUpdatedEvent
    extends StObject
       with ComponentEvent {
    
    var isFocused: Boolean
    
    var text: String
  }
  object SearchBarUpdatedEvent {
    
    inline def apply(componentId: String, isFocused: Boolean, text: String): SearchBarUpdatedEvent = {
      val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchBarUpdatedEvent]
    }
    
    extension [Self <: SearchBarUpdatedEvent](x: Self) {
      
      inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
