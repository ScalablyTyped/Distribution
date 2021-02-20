package typings.reactNativeSafariView

import typings.reactNative.mod.EmitterSubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-safari-view", "default.addEventListener")
    @js.native
    def addEventListener(event: String, listener: js.Function0[Unit]): EmitterSubscription = js.native
    
    /**
      * Dismisses the currently active Safari View
      */
    @JSImport("react-native-safari-view", "default.dismiss")
    @js.native
    def dismiss(): Unit = js.native
    
    /**
      * Checks if Safari View is available on the device
      */
    @JSImport("react-native-safari-view", "default.isAvailable")
    @js.native
    def isAvailable(): js.Promise[Boolean] = js.native
    
    @JSImport("react-native-safari-view", "default.removeEventListener")
    @js.native
    def removeEventListener(event: String, listener: js.Function0[Unit]): Unit = js.native
    
    /**
      * Displays a Safari View with the provided URL
      *
      */
    @JSImport("react-native-safari-view", "default.show")
    @js.native
    def show(options: SafariViewOptions): js.Promise[Boolean] = js.native
  }
  
  @js.native
  trait SafariViewOptions extends StObject {
    
    /**
      * A String containing a hex or rgba color to use for the background of the browser controls (only available on iOS 10 and higher)
      *
      */
    var barTintColor: js.UndefOr[String] = js.native
    
    /**
      * A Boolean indicating to open the Safari View from the bottom
      *
      */
    var fromBottom: js.UndefOr[Boolean] = js.native
    
    /**
      * A Boolean indicating to use Safari's Reader Mode if available
      *
      */
    var readerMode: js.UndefOr[Boolean] = js.native
    
    /**
      * A String containing a hex or rgba color to use for the browser controls
      *
      */
    var tintColor: js.UndefOr[String] = js.native
    
    /**
      * A String containing the url you want to load in the Safari View
      *
      */
    var url: String = js.native
  }
  object SafariViewOptions {
    
    @scala.inline
    def apply(url: String): SafariViewOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SafariViewOptions]
    }
    
    @scala.inline
    implicit class SafariViewOptionsMutableBuilder[Self <: SafariViewOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBarTintColor(value: String): Self = StObject.set(x, "barTintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarTintColorUndefined: Self = StObject.set(x, "barTintColor", js.undefined)
      
      @scala.inline
      def setFromBottom(value: Boolean): Self = StObject.set(x, "fromBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromBottomUndefined: Self = StObject.set(x, "fromBottom", js.undefined)
      
      @scala.inline
      def setReaderMode(value: Boolean): Self = StObject.set(x, "readerMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReaderModeUndefined: Self = StObject.set(x, "readerMode", js.undefined)
      
      @scala.inline
      def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
