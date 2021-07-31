package typings.reactNativeNavbar

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactNative.mod.ViewStyle
import typings.reactNativeNavbar.reactNativeNavbarStrings.`light-content`
import typings.reactNativeNavbar.reactNativeNavbarStrings.clip
import typings.reactNativeNavbar.reactNativeNavbarStrings.fade
import typings.reactNativeNavbar.reactNativeNavbarStrings.head
import typings.reactNativeNavbar.reactNativeNavbarStrings.middle
import typings.reactNativeNavbar.reactNativeNavbarStrings.none
import typings.reactNativeNavbar.reactNativeNavbarStrings.slide
import typings.reactNativeNavbar.reactNativeNavbarStrings.tail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-navbar", JSImport.Default)
  @js.native
  class default ()
    extends Component[NavigationBarProps, js.Object, js.Any]
  
  type NavigationBar = Component[NavigationBarProps, js.Object, js.Any]
  
  trait NavigationBarButton extends StObject {
    
    var disable: js.UndefOr[Boolean] = js.undefined
    
    var handler: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var style: js.UndefOr[ViewStyle] = js.undefined
    
    var title: String
  }
  object NavigationBarButton {
    
    @scala.inline
    def apply(title: String): NavigationBarButton = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationBarButton]
    }
    
    @scala.inline
    implicit class NavigationBarButtonMutableBuilder[Self <: NavigationBarButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      @scala.inline
      def setHandler(value: () => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      @scala.inline
      def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait NavigationBarProps extends StObject {
    
    var leftButton: js.UndefOr[NavigationBarButton | ReactElement | Null] = js.undefined
    
    var rightButton: js.UndefOr[NavigationBarButton | ReactElement | Null] = js.undefined
    
    var statusBar: js.UndefOr[StatusBar] = js.undefined
    
    var style: js.UndefOr[ViewStyle] = js.undefined
    
    var tintColor: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[NavigationBarTitle | ReactElement | Null] = js.undefined
  }
  object NavigationBarProps {
    
    @scala.inline
    def apply(): NavigationBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationBarProps]
    }
    
    @scala.inline
    implicit class NavigationBarPropsMutableBuilder[Self <: NavigationBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeftButton(value: NavigationBarButton | ReactElement): Self = StObject.set(x, "leftButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftButtonNull: Self = StObject.set(x, "leftButton", null)
      
      @scala.inline
      def setLeftButtonUndefined: Self = StObject.set(x, "leftButton", js.undefined)
      
      @scala.inline
      def setRightButton(value: NavigationBarButton | ReactElement): Self = StObject.set(x, "rightButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightButtonNull: Self = StObject.set(x, "rightButton", null)
      
      @scala.inline
      def setRightButtonUndefined: Self = StObject.set(x, "rightButton", js.undefined)
      
      @scala.inline
      def setStatusBar(value: StatusBar): Self = StObject.set(x, "statusBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusBarUndefined: Self = StObject.set(x, "statusBar", js.undefined)
      
      @scala.inline
      def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
      
      @scala.inline
      def setTitle(value: NavigationBarTitle | ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleNull: Self = StObject.set(x, "title", null)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait NavigationBarTitle extends StObject {
    
    var ellipsizeMode: js.UndefOr[head | middle | tail | clip] = js.undefined
    
    var numberOfLines: js.UndefOr[Double] = js.undefined
    
    var tintColor: js.UndefOr[String] = js.undefined
    
    var title: String
  }
  object NavigationBarTitle {
    
    @scala.inline
    def apply(title: String): NavigationBarTitle = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationBarTitle]
    }
    
    @scala.inline
    implicit class NavigationBarTitleMutableBuilder[Self <: NavigationBarTitle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEllipsizeMode(value: head | middle | tail | clip): Self = StObject.set(x, "ellipsizeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsizeModeUndefined: Self = StObject.set(x, "ellipsizeMode", js.undefined)
      
      @scala.inline
      def setNumberOfLines(value: Double): Self = StObject.set(x, "numberOfLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfLinesUndefined: Self = StObject.set(x, "numberOfLines", js.undefined)
      
      @scala.inline
      def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait StatusBar extends StObject {
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var hideAnimation: js.UndefOr[fade | slide | none] = js.undefined
    
    var showAnimation: js.UndefOr[fade | slide | none] = js.undefined
    
    var style: js.UndefOr[`light-content` | typings.reactNativeNavbar.reactNativeNavbarStrings.default] = js.undefined
    
    var tintColor: js.UndefOr[String] = js.undefined
  }
  object StatusBar {
    
    @scala.inline
    def apply(): StatusBar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusBar]
    }
    
    @scala.inline
    implicit class StatusBarMutableBuilder[Self <: StatusBar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setHideAnimation(value: fade | slide | none): Self = StObject.set(x, "hideAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideAnimationUndefined: Self = StObject.set(x, "hideAnimation", js.undefined)
      
      @scala.inline
      def setShowAnimation(value: fade | slide | none): Self = StObject.set(x, "showAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowAnimationUndefined: Self = StObject.set(x, "showAnimation", js.undefined)
      
      @scala.inline
      def setStyle(value: `light-content` | typings.reactNativeNavbar.reactNativeNavbarStrings.default): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    }
  }
}
