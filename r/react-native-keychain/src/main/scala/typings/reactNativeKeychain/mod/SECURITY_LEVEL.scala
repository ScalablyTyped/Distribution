package typings.reactNativeKeychain.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SECURITY_LEVEL extends js.Object
@JSImport("react-native-keychain", "SECURITY_LEVEL")
@js.native
object SECURITY_LEVEL extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SECURITY_LEVEL with Double] = js.native
  
  @js.native
  sealed trait ANY extends SECURITY_LEVEL
  /* 2 */ @js.native
  object ANY extends TopLevel[ANY with Double]
  
  @js.native
  sealed trait SECURE_HARDWARE extends SECURITY_LEVEL
  /* 1 */ @js.native
  object SECURE_HARDWARE extends TopLevel[SECURE_HARDWARE with Double]
  
  @js.native
  sealed trait SECURE_SOFTWARE extends SECURITY_LEVEL
  /* 0 */ @js.native
  object SECURE_SOFTWARE extends TopLevel[SECURE_SOFTWARE with Double]
}
