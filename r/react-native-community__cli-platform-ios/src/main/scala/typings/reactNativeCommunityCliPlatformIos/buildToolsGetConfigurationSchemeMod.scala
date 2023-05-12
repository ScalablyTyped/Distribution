package typings.reactNativeCommunityCliPlatformIos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildToolsGetConfigurationSchemeMod {
  
  @JSImport("@react-native-community/cli-platform-ios/build/tools/getConfigurationScheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getConfigurationScheme(param0: Args, sourceDir: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfigurationScheme")(param0.asInstanceOf[js.Any], sourceDir.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait Args extends StObject {
    
    var mode: String
    
    var scheme: js.UndefOr[String] = js.undefined
  }
  object Args {
    
    inline def apply(mode: String): Args = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    }
  }
}
