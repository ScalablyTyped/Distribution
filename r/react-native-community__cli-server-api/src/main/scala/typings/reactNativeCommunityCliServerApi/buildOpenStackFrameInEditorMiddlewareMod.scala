package typings.reactNativeCommunityCliServerApi

import typings.connect.mod.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildOpenStackFrameInEditorMiddlewareMod {
  
  @JSImport("@react-native-community/cli-server-api/build/openStackFrameInEditorMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Options): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Server]
  
  trait Options extends StObject {
    
    var watchFolders: js.Array[String]
  }
  object Options {
    
    inline def apply(watchFolders: js.Array[String]): Options = {
      val __obj = js.Dynamic.literal(watchFolders = watchFolders.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setWatchFolders(value: js.Array[String]): Self = StObject.set(x, "watchFolders", value.asInstanceOf[js.Any])
      
      inline def setWatchFoldersVarargs(value: String*): Self = StObject.set(x, "watchFolders", js.Array(value*))
    }
  }
}
