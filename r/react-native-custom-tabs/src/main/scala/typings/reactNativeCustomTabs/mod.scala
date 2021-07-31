package typings.reactNativeCustomTabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object CustomTabs {
    
    @JSImport("react-native-custom-tabs", "CustomTabs")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def openURL(url: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    @scala.inline
    def openURL(url: String, options: CustomTabsOptions): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  }
  
  trait Animations extends StObject {
    
    var endEnter: String
    
    var endExit: String
    
    var startEnter: String
    
    var startExit: String
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
  
  trait CustomTabsOptions extends StObject {
    
    var animations: js.UndefOr[Animations] = js.undefined
    
    var enableDefaultShare: js.UndefOr[Boolean] = js.undefined
    
    var enableUrlBarHiding: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[js.Any] = js.undefined
    
    var showPageTitle: js.UndefOr[Boolean] = js.undefined
    
    var toolbarColor: js.UndefOr[String] = js.undefined
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
