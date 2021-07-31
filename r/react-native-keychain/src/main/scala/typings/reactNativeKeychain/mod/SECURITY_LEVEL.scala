package typings.reactNativeKeychain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SECURITY_LEVEL extends StObject
@JSImport("react-native-keychain", "SECURITY_LEVEL")
@js.native
object SECURITY_LEVEL extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SECURITY_LEVEL & Double] = js.native
  
  @js.native
  sealed trait ANY
    extends StObject
       with SECURITY_LEVEL
  /* 2 */ val ANY: typings.reactNativeKeychain.mod.SECURITY_LEVEL.ANY & Double = js.native
  
  @js.native
  sealed trait SECURE_HARDWARE
    extends StObject
       with SECURITY_LEVEL
  /* 1 */ val SECURE_HARDWARE: typings.reactNativeKeychain.mod.SECURITY_LEVEL.SECURE_HARDWARE & Double = js.native
  
  @js.native
  sealed trait SECURE_SOFTWARE
    extends StObject
       with SECURITY_LEVEL
  /* 0 */ val SECURE_SOFTWARE: typings.reactNativeKeychain.mod.SECURITY_LEVEL.SECURE_SOFTWARE & Double = js.native
}
