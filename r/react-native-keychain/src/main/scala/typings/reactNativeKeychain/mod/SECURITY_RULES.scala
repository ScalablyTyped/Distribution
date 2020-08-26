package typings.reactNativeKeychain.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SECURITY_RULES extends js.Object

@JSImport("react-native-keychain", "SECURITY_RULES")
@js.native
object SECURITY_RULES extends js.Object {
  @js.native
  sealed trait AUTOMATIC_UPGRADE extends SECURITY_RULES
  
  @js.native
  sealed trait NONE extends SECURITY_RULES
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SECURITY_RULES with String] = js.native
  /* "automaticUpgradeToMoreSecuredStorage" */ @js.native
  object AUTOMATIC_UPGRADE extends TopLevel[AUTOMATIC_UPGRADE with String]
  
  /* "none" */ @js.native
  object NONE extends TopLevel[NONE with String]
  
}

