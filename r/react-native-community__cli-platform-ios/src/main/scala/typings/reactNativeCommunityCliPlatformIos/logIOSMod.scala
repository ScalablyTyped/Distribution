package typings.reactNativeCommunityCliPlatformIos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logIOSMod {
  
  object default {
    
    @JSImport("@react-native-community/cli-platform-ios/build/commands/logIOS", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-platform-ios/build/commands/logIOS", "default.description")
    @js.native
    def description: String = js.native
    inline def description_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("description")(x.asInstanceOf[js.Any])
    
    inline def func(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("func")().asInstanceOf[js.Promise[Unit]]
    @JSImport("@react-native-community/cli-platform-ios/build/commands/logIOS", "default.func")
    @js.native
    def func_Fdefault: js.Function0[js.Promise[Unit]] = js.native
    
    inline def func_Fdefault_=(x: js.Function0[js.Promise[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("func")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-platform-ios/build/commands/logIOS", "default.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  }
}
