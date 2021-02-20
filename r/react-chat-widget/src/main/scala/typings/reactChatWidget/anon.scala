package typings.reactChatWidget

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Autofocus extends StObject {
    
    var autofocus: js.UndefOr[Boolean] = js.native
    
    var badge: js.UndefOr[Double] = js.native
    
    var customLauncher: js.UndefOr[ComponentType[js.Function0[Unit]]] = js.native
    
    var fullScreenMode: js.UndefOr[Boolean] = js.native
    
    def handleNewUserMessage(userInput: String): Unit = js.native
    
    var handleQuickButtonClicked: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
    
    var profileAvatar: js.UndefOr[String] = js.native
    
    var senderPlaceHolder: js.UndefOr[String] = js.native
    
    var showCloseButton: js.UndefOr[Boolean] = js.native
    
    var subtitle: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var titleAvatar: js.UndefOr[String] = js.native
  }
  object Autofocus {
    
    @scala.inline
    def apply(handleNewUserMessage: String => Unit): Autofocus = {
      val __obj = js.Dynamic.literal(handleNewUserMessage = js.Any.fromFunction1(handleNewUserMessage))
      __obj.asInstanceOf[Autofocus]
    }
    
    @scala.inline
    implicit class AutofocusMutableBuilder[Self <: Autofocus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
      
      @scala.inline
      def setBadge(value: Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      @scala.inline
      def setCustomLauncher(value: ComponentType[js.Function0[Unit]]): Self = StObject.set(x, "customLauncher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomLauncherUndefined: Self = StObject.set(x, "customLauncher", js.undefined)
      
      @scala.inline
      def setFullScreenMode(value: Boolean): Self = StObject.set(x, "fullScreenMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullScreenModeUndefined: Self = StObject.set(x, "fullScreenMode", js.undefined)
      
      @scala.inline
      def setHandleNewUserMessage(value: String => Unit): Self = StObject.set(x, "handleNewUserMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleQuickButtonClicked(value: /* value */ String => Unit): Self = StObject.set(x, "handleQuickButtonClicked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleQuickButtonClickedUndefined: Self = StObject.set(x, "handleQuickButtonClicked", js.undefined)
      
      @scala.inline
      def setProfileAvatar(value: String): Self = StObject.set(x, "profileAvatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileAvatarUndefined: Self = StObject.set(x, "profileAvatar", js.undefined)
      
      @scala.inline
      def setSenderPlaceHolder(value: String): Self = StObject.set(x, "senderPlaceHolder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSenderPlaceHolderUndefined: Self = StObject.set(x, "senderPlaceHolder", js.undefined)
      
      @scala.inline
      def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      @scala.inline
      def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAvatar(value: String): Self = StObject.set(x, "titleAvatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAvatarUndefined: Self = StObject.set(x, "titleAvatar", js.undefined)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait Label extends StObject {
    
    var label: String = js.native
    
    var value: String = js.native
  }
  object Label {
    
    @scala.inline
    def apply(label: String, value: String): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
