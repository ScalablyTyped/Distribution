package typings.reactNativeFirebaseApp.mod

import typings.reactNativeFirebaseApp.mod.Utils_.FilePath
import typings.reactNativeFirebaseApp.mod.Utils_.Module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @react-native-firebase/app.@react-native-firebase/app.ReactNativeFirebase.FirebaseModuleWithStatics<@react-native-firebase/app.@react-native-firebase/app.Utils.Module, @react-native-firebase/app.@react-native-firebase/app.Utils.Statics> */
object utils {
  
  @JSImport("@react-native-firebase/app", "utils")
  @js.native
  def apply(): Module = js.native
  @JSImport("@react-native-firebase/app", "utils")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-native-firebase/app", "utils.FilePath")
  @js.native
  def FilePath: typings.reactNativeFirebaseApp.mod.Utils_.FilePath = js.native
  @scala.inline
  def FilePath_=(x: FilePath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FilePath")(x.asInstanceOf[js.Any])
  
  /**
    * This React Native Firebase module version.
    */
  @JSImport("@react-native-firebase/app", "utils.SDK_VERSION")
  @js.native
  val SDK_VERSION: String = js.native
}
