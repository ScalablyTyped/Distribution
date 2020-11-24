package typings.reactNativeKeychain.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SECURITY_RULES extends js.Object
@JSImport("react-native-keychain", "SECURITY_RULES")
@js.native
object SECURITY_RULES extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SECURITY_RULES with String] = js.native
  
  @js.native
  sealed trait AUTOMATIC_UPGRADE extends SECURITY_RULES
  /* "automaticUpgradeToMoreSecuredStorage" */ @js.native
  object AUTOMATIC_UPGRADE extends TopLevel[AUTOMATIC_UPGRADE with String]
  
  @js.native
  sealed trait NONE extends SECURITY_RULES
  /* "none" */ @js.native
  object NONE extends TopLevel[NONE with String]
}
