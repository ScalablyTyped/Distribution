package typings.reactNativeCommunityCliServerApi

import typings.connect.mod.Server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object openStackFrameInEditorMiddlewareMod {
  
  @JSImport("@react-native-community/cli-server-api/build/openStackFrameInEditorMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(options: Options): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Server]
  
  trait Options extends StObject {
    
    var watchFolders: js.Array[String]
  }
  object Options {
    
    @scala.inline
    def apply(watchFolders: js.Array[String]): Options = {
      val __obj = js.Dynamic.literal(watchFolders = watchFolders.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWatchFolders(value: js.Array[String]): Self = StObject.set(x, "watchFolders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchFoldersVarargs(value: String*): Self = StObject.set(x, "watchFolders", js.Array(value :_*))
    }
  }
}
