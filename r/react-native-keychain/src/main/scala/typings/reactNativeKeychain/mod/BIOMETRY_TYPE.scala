package typings.reactNativeKeychain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BIOMETRY_TYPE extends StObject
@JSImport("react-native-keychain", "BIOMETRY_TYPE")
@js.native
object BIOMETRY_TYPE extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BIOMETRY_TYPE with String] = js.native
  
  @js.native
  sealed trait FACE extends BIOMETRY_TYPE
  /* "Face" */ val FACE: typings.reactNativeKeychain.mod.BIOMETRY_TYPE.FACE with String = js.native
  
  @js.native
  sealed trait FACE_ID extends BIOMETRY_TYPE
  /* "FaceID" */ val FACE_ID: typings.reactNativeKeychain.mod.BIOMETRY_TYPE.FACE_ID with String = js.native
  
  @js.native
  sealed trait FINGERPRINT extends BIOMETRY_TYPE
  /* "Fingerprint" */ val FINGERPRINT: typings.reactNativeKeychain.mod.BIOMETRY_TYPE.FINGERPRINT with String = js.native
  
  @js.native
  sealed trait IRIS extends BIOMETRY_TYPE
  /* "Iris" */ val IRIS: typings.reactNativeKeychain.mod.BIOMETRY_TYPE.IRIS with String = js.native
  
  @js.native
  sealed trait TOUCH_ID extends BIOMETRY_TYPE
  /* "TouchID" */ val TOUCH_ID: typings.reactNativeKeychain.mod.BIOMETRY_TYPE.TOUCH_ID with String = js.native
}
