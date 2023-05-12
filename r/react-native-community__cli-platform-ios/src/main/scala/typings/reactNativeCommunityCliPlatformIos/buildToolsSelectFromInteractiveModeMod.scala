package typings.reactNativeCommunityCliPlatformIos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildToolsSelectFromInteractiveModeMod {
  
  @JSImport("@react-native-community/cli-platform-ios/build/tools/selectFromInteractiveMode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def selectFromInteractiveMode(param0: Args): js.Promise[Args] = ^.asInstanceOf[js.Dynamic].applyDynamic("selectFromInteractiveMode")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Args]]
  
  trait Args extends StObject {
    
    var mode: String
    
    var scheme: String
  }
  object Args {
    
    inline def apply(mode: String, scheme: String): Args = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    }
  }
}
