package typings.reactNativeCommunityCliDoctor

import typings.reactNativeCommunityCliDoctor.anon.OnKeyPress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object printFixOptionsMod {
  
  @JSImport("@react-native-community/cli-doctor/build/tools/printFixOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasOnKeyPress: OnKeyPress): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasOnKeyPress.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object KEYS {
    
    @JSImport("@react-native-community/cli-doctor/build/tools/printFixOptions", "KEYS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-doctor/build/tools/printFixOptions", "KEYS.EXIT")
    @js.native
    def EXIT: String = js.native
    inline def EXIT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXIT")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-doctor/build/tools/printFixOptions", "KEYS.FIX_ALL_ISSUES")
    @js.native
    def FIX_ALL_ISSUES: String = js.native
    inline def FIX_ALL_ISSUES_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIX_ALL_ISSUES")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-doctor/build/tools/printFixOptions", "KEYS.FIX_ERRORS")
    @js.native
    def FIX_ERRORS: String = js.native
    inline def FIX_ERRORS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIX_ERRORS")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-doctor/build/tools/printFixOptions", "KEYS.FIX_WARNINGS")
    @js.native
    def FIX_WARNINGS: String = js.native
    inline def FIX_WARNINGS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIX_WARNINGS")(x.asInstanceOf[js.Any])
  }
}
