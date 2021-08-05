package typings.reactNativeSafariView

import typings.reactNative.mod.EmitterSubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-safari-view", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def addEventListener(event: String, listener: js.Function0[Unit]): EmitterSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[EmitterSubscription]
    
    /**
      * Dismisses the currently active Safari View
      */
    inline def dismiss(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")().asInstanceOf[Unit]
    
    /**
      * Checks if Safari View is available on the device
      */
    inline def isAvailable(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[js.Promise[Boolean]]
    
    inline def removeEventListener(event: String, listener: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Displays a Safari View with the provided URL
      *
      */
    inline def show(options: SafariViewOptions): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  }
  
  trait SafariViewOptions extends StObject {
    
    /**
      * A String containing a hex or rgba color to use for the background of the browser controls (only available on iOS 10 and higher)
      *
      */
    var barTintColor: js.UndefOr[String] = js.undefined
    
    /**
      * A Boolean indicating to open the Safari View from the bottom
      *
      */
    var fromBottom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A Boolean indicating to use Safari's Reader Mode if available
      *
      */
    var readerMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A String containing a hex or rgba color to use for the browser controls
      *
      */
    var tintColor: js.UndefOr[String] = js.undefined
    
    /**
      * A String containing the url you want to load in the Safari View
      *
      */
    var url: String
  }
  object SafariViewOptions {
    
    inline def apply(url: String): SafariViewOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SafariViewOptions]
    }
    
    extension [Self <: SafariViewOptions](x: Self) {
      
      inline def setBarTintColor(value: String): Self = StObject.set(x, "barTintColor", value.asInstanceOf[js.Any])
      
      inline def setBarTintColorUndefined: Self = StObject.set(x, "barTintColor", js.undefined)
      
      inline def setFromBottom(value: Boolean): Self = StObject.set(x, "fromBottom", value.asInstanceOf[js.Any])
      
      inline def setFromBottomUndefined: Self = StObject.set(x, "fromBottom", js.undefined)
      
      inline def setReaderMode(value: Boolean): Self = StObject.set(x, "readerMode", value.asInstanceOf[js.Any])
      
      inline def setReaderModeUndefined: Self = StObject.set(x, "readerMode", js.undefined)
      
      inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
