package typings.reactChatWidget

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Autofocus extends StObject {
    
    var autofocus: js.UndefOr[Boolean] = js.undefined
    
    var badge: js.UndefOr[Double] = js.undefined
    
    var customLauncher: js.UndefOr[ComponentType[js.Function0[Unit]]] = js.undefined
    
    var fullScreenMode: js.UndefOr[Boolean] = js.undefined
    
    def handleNewUserMessage(userInput: String): Unit
    
    var handleQuickButtonClicked: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var profileAvatar: js.UndefOr[String] = js.undefined
    
    var senderPlaceHolder: js.UndefOr[String] = js.undefined
    
    var showCloseButton: js.UndefOr[Boolean] = js.undefined
    
    var subtitle: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var titleAvatar: js.UndefOr[String] = js.undefined
  }
  object Autofocus {
    
    inline def apply(handleNewUserMessage: String => Unit): Autofocus = {
      val __obj = js.Dynamic.literal(handleNewUserMessage = js.Any.fromFunction1(handleNewUserMessage))
      __obj.asInstanceOf[Autofocus]
    }
    
    extension [Self <: Autofocus](x: Self) {
      
      inline def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
      
      inline def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
      
      inline def setBadge(value: Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      inline def setCustomLauncher(value: ComponentType[js.Function0[Unit]]): Self = StObject.set(x, "customLauncher", value.asInstanceOf[js.Any])
      
      inline def setCustomLauncherUndefined: Self = StObject.set(x, "customLauncher", js.undefined)
      
      inline def setFullScreenMode(value: Boolean): Self = StObject.set(x, "fullScreenMode", value.asInstanceOf[js.Any])
      
      inline def setFullScreenModeUndefined: Self = StObject.set(x, "fullScreenMode", js.undefined)
      
      inline def setHandleNewUserMessage(value: String => Unit): Self = StObject.set(x, "handleNewUserMessage", js.Any.fromFunction1(value))
      
      inline def setHandleQuickButtonClicked(value: /* value */ String => Unit): Self = StObject.set(x, "handleQuickButtonClicked", js.Any.fromFunction1(value))
      
      inline def setHandleQuickButtonClickedUndefined: Self = StObject.set(x, "handleQuickButtonClicked", js.undefined)
      
      inline def setProfileAvatar(value: String): Self = StObject.set(x, "profileAvatar", value.asInstanceOf[js.Any])
      
      inline def setProfileAvatarUndefined: Self = StObject.set(x, "profileAvatar", js.undefined)
      
      inline def setSenderPlaceHolder(value: String): Self = StObject.set(x, "senderPlaceHolder", value.asInstanceOf[js.Any])
      
      inline def setSenderPlaceHolderUndefined: Self = StObject.set(x, "senderPlaceHolder", js.undefined)
      
      inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleAvatar(value: String): Self = StObject.set(x, "titleAvatar", value.asInstanceOf[js.Any])
      
      inline def setTitleAvatarUndefined: Self = StObject.set(x, "titleAvatar", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait Label extends StObject {
    
    var label: String
    
    var value: String
  }
  object Label {
    
    inline def apply(label: String, value: String): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    extension [Self <: Label](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
