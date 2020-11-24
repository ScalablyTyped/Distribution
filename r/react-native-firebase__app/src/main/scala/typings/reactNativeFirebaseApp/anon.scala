package typings.reactNativeFirebaseApp

import typings.reactNativeFirebaseApp.mod.ReactNativeFirebase.FirebaseApp
import typings.reactNativeFirebaseApp.mod.Utils_.Module
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Call[M] extends js.Object {
    
    def apply(): M = js.native
    
    /**
      * This React Native Firebase module version.
      */
    val SDK_VERSION: String = js.native
  }
  
  /* Inlined @react-native-firebase/app.@react-native-firebase/app.ReactNativeFirebase.FirebaseModuleWithStatics<@react-native-firebase/app.@react-native-firebase/app.Utils.Module, @react-native-firebase/app.@react-native-firebase/app.Utils.Statics> */
  @js.native
  trait FirebaseModuleWithStatics extends js.Object {
    
    def apply(): Module = js.native
    
    var FilePath: typings.reactNativeFirebaseApp.mod.Utils_.FilePath = js.native
    
    /**
      * This React Native Firebase module version.
      */
    val SDK_VERSION: String = js.native
  }
  
  @js.native
  trait SDKVERSION[M] extends js.Object {
    
    def apply(): M = js.native
    def apply(app: FirebaseApp): M = js.native
    
    /**
      * This React Native Firebase module version.
      */
    val SDK_VERSION: String = js.native
  }
}
