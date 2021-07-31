package typings.reactNativeHuaweiProtectedApps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-huawei-protected-apps", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def AlertIfHuaweiDevice(config: HuaweiProtectedAppsConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("AlertIfHuaweiDevice")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait HuaweiProtectedAppsConfig extends StObject {
    
    var doNotShowAgainText: String
    
    var negativeText: String
    
    var positiveText: String
    
    var text: String
    
    var title: String
  }
  object HuaweiProtectedAppsConfig {
    
    @scala.inline
    def apply(
      doNotShowAgainText: String,
      negativeText: String,
      positiveText: String,
      text: String,
      title: String
    ): HuaweiProtectedAppsConfig = {
      val __obj = js.Dynamic.literal(doNotShowAgainText = doNotShowAgainText.asInstanceOf[js.Any], negativeText = negativeText.asInstanceOf[js.Any], positiveText = positiveText.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[HuaweiProtectedAppsConfig]
    }
    
    @scala.inline
    implicit class HuaweiProtectedAppsConfigMutableBuilder[Self <: HuaweiProtectedAppsConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDoNotShowAgainText(value: String): Self = StObject.set(x, "doNotShowAgainText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegativeText(value: String): Self = StObject.set(x, "negativeText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositiveText(value: String): Self = StObject.set(x, "positiveText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
