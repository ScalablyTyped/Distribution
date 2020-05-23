package typings.reactNativeFirebaseApp

import typings.reactNativeFirebaseApp.ReactNativeFirebase.FirebaseApp
import typings.reactNativeFirebaseApp.Utils.Module
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait Call[M] extends js.Object {
    /**
      * This React Native Firebase module version.
      */
    val SDK_VERSION: String = js.native
    def apply(): M = js.native
  }
  
  /* Inlined @react-native-firebase/app.ReactNativeFirebase.FirebaseModuleWithStatics<@react-native-firebase/app.Utils.Module, @react-native-firebase/app.Utils.Statics> */
  @js.native
  trait FirebaseModuleWithStatics extends js.Object {
    var FilePath: typings.reactNativeFirebaseApp.Utils.FilePath = js.native
    /**
      * This React Native Firebase module version.
      */
    val SDK_VERSION: String = js.native
    def apply(): Module = js.native
  }
  
  @js.native
  trait SDKVERSION[M] extends js.Object {
    /**
      * This React Native Firebase module version.
      */
    val SDK_VERSION: String = js.native
    def apply(): M = js.native
    def apply(app: FirebaseApp): M = js.native
  }
  
}

