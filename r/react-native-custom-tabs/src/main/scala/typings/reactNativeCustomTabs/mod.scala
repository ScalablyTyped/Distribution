package typings.reactNativeCustomTabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object CustomTabs {
    
    @JSImport("react-native-custom-tabs", "CustomTabs.openURL")
    @js.native
    def openURL(url: String): js.Promise[Boolean] = js.native
    @JSImport("react-native-custom-tabs", "CustomTabs.openURL")
    @js.native
    def openURL(url: String, options: CustomTabsOptions): js.Promise[Boolean] = js.native
  }
  
  @js.native
  trait Animations extends StObject {
    
    var endEnter: String = js.native
    
    var endExit: String = js.native
    
    var startEnter: String = js.native
    
    var startExit: String = js.native
  }
  object Animations {
    
    @scala.inline
    def apply(endEnter: String, endExit: String, startEnter: String, startExit: String): Animations = {
      val __obj = js.Dynamic.literal(endEnter = endEnter.asInstanceOf[js.Any], endExit = endExit.asInstanceOf[js.Any], startEnter = startEnter.asInstanceOf[js.Any], startExit = startExit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Animations]
    }
    
    @scala.inline
    implicit class AnimationsMutableBuilder[Self <: Animations] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndEnter(value: String): Self = StObject.set(x, "endEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndExit(value: String): Self = StObject.set(x, "endExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartEnter(value: String): Self = StObject.set(x, "startEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartExit(value: String): Self = StObject.set(x, "startExit", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CustomTabsOptions extends StObject {
    
    var animations: js.UndefOr[Animations] = js.native
    
    var enableDefaultShare: js.UndefOr[Boolean] = js.native
    
    var enableUrlBarHiding: js.UndefOr[Boolean] = js.native
    
    var headers: js.UndefOr[js.Any] = js.native
    
    var showPageTitle: js.UndefOr[Boolean] = js.native
    
    var toolbarColor: js.UndefOr[String] = js.native
  }
  object CustomTabsOptions {
    
    @scala.inline
    def apply(): CustomTabsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomTabsOptions]
    }
    
    @scala.inline
    implicit class CustomTabsOptionsMutableBuilder[Self <: CustomTabsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimations(value: Animations): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationsUndefined: Self = StObject.set(x, "animations", js.undefined)
      
      @scala.inline
      def setEnableDefaultShare(value: Boolean): Self = StObject.set(x, "enableDefaultShare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableDefaultShareUndefined: Self = StObject.set(x, "enableDefaultShare", js.undefined)
      
      @scala.inline
      def setEnableUrlBarHiding(value: Boolean): Self = StObject.set(x, "enableUrlBarHiding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUrlBarHidingUndefined: Self = StObject.set(x, "enableUrlBarHiding", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setShowPageTitle(value: Boolean): Self = StObject.set(x, "showPageTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPageTitleUndefined: Self = StObject.set(x, "showPageTitle", js.undefined)
      
      @scala.inline
      def setToolbarColor(value: String): Self = StObject.set(x, "toolbarColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarColorUndefined: Self = StObject.set(x, "toolbarColor", js.undefined)
    }
  }
}
