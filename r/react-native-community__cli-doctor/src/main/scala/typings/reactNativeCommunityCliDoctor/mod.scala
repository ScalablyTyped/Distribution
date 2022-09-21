package typings.reactNativeCommunityCliDoctor

import typings.reactNativeCommunityCliDoctor.anon.Detached
import typings.reactNativeCommunityCliDoctor.anon.Directory
import typings.reactNativeCommunityCliDoctor.anon.Func
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-native-community/cli-doctor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object commands {
    
    @JSImport("@react-native-community/cli-doctor", "commands")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-doctor", "commands.doctor")
    @js.native
    def doctor: Detached = js.native
    inline def doctor_=(x: Detached): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("doctor")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-doctor", "commands.info")
    @js.native
    def info: Func = js.native
    inline def info_=(x: Func): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
  }
  
  inline def installPods(hasDirectoryLoader: Directory): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("installPods")(hasDirectoryLoader.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
