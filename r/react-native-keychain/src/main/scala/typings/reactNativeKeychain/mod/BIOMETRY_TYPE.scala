package typings.reactNativeKeychain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BIOMETRY_TYPE extends StObject
@JSImport("react-native-keychain", "BIOMETRY_TYPE")
@js.native
object BIOMETRY_TYPE extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BIOMETRY_TYPE & String] = js.native
  
  @js.native
  sealed trait FACE
    extends StObject
       with BIOMETRY_TYPE
  /* "Face" */ val FACE: typings.reactNativeKeychain.mod.BIOMETRY_TYPE.FACE & String = js.native
  
  @js.native
  sealed trait FACE_ID
    extends StObject
       with BIOMETRY_TYPE
  /* "FaceID" */ val FACE_ID: typings.reactNativeKeychain.mod.BIOMETRY_TYPE.FACE_ID & String = js.native
  
  @js.native
  sealed trait FINGERPRINT
    extends StObject
       with BIOMETRY_TYPE
  /* "Fingerprint" */ val FINGERPRINT: typings.reactNativeKeychain.mod.BIOMETRY_TYPE.FINGERPRINT & String = js.native
  
  @js.native
  sealed trait IRIS
    extends StObject
       with BIOMETRY_TYPE
  /* "Iris" */ val IRIS: typings.reactNativeKeychain.mod.BIOMETRY_TYPE.IRIS & String = js.native
  
  @js.native
  sealed trait TOUCH_ID
    extends StObject
       with BIOMETRY_TYPE
  /* "TouchID" */ val TOUCH_ID: typings.reactNativeKeychain.mod.BIOMETRY_TYPE.TOUCH_ID & String = js.native
}
