package typings.reactNativeKeychain.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BIOMETRY_TYPE extends js.Object
@JSImport("react-native-keychain", "BIOMETRY_TYPE")
@js.native
object BIOMETRY_TYPE extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BIOMETRY_TYPE with String] = js.native
  
  @js.native
  sealed trait FACE extends BIOMETRY_TYPE
  /* "Face" */ @js.native
  object FACE extends TopLevel[FACE with String]
  
  @js.native
  sealed trait FACE_ID extends BIOMETRY_TYPE
  /* "FaceID" */ @js.native
  object FACE_ID extends TopLevel[FACE_ID with String]
  
  @js.native
  sealed trait FINGERPRINT extends BIOMETRY_TYPE
  /* "Fingerprint" */ @js.native
  object FINGERPRINT extends TopLevel[FINGERPRINT with String]
  
  @js.native
  sealed trait IRIS extends BIOMETRY_TYPE
  /* "Iris" */ @js.native
  object IRIS extends TopLevel[IRIS with String]
  
  @js.native
  sealed trait TOUCH_ID extends BIOMETRY_TYPE
  /* "TouchID" */ @js.native
  object TOUCH_ID extends TopLevel[TOUCH_ID with String]
}
