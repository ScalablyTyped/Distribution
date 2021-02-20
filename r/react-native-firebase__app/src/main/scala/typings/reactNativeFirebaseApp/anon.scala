package typings.reactNativeFirebaseApp

import typings.reactNativeFirebaseApp.mod.ReactNativeFirebase.FirebaseApp
import typings.reactNativeFirebaseApp.mod.Utils_.Module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call[M] extends StObject {
    
    def apply(): M = js.native
    
    /**
      * This React Native Firebase module version.
      */
    val SDK_VERSION: String = js.native
  }
  
  /* Inlined @react-native-firebase/app.@react-native-firebase/app.ReactNativeFirebase.FirebaseModuleWithStatics<@react-native-firebase/app.@react-native-firebase/app.Utils.Module, @react-native-firebase/app.@react-native-firebase/app.Utils.Statics> */
  @js.native
  trait FirebaseModuleWithStatics extends StObject {
    
    def apply(): Module = js.native
    
    var FilePath: typings.reactNativeFirebaseApp.mod.Utils_.FilePath = js.native
    
    /**
      * This React Native Firebase module version.
      */
    val SDK_VERSION: String = js.native
  }
  
  @js.native
  trait SDKVERSION[M] extends StObject {
    
    def apply(): M = js.native
    def apply(app: FirebaseApp): M = js.native
    
    /**
      * This React Native Firebase module version.
      */
    val SDK_VERSION: String = js.native
  }
}
