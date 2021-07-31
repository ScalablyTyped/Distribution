package typings.reactNativeKeychain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SECURITY_RULES extends StObject
@JSImport("react-native-keychain", "SECURITY_RULES")
@js.native
object SECURITY_RULES extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SECURITY_RULES & String] = js.native
  
  @js.native
  sealed trait AUTOMATIC_UPGRADE
    extends StObject
       with SECURITY_RULES
  /* "automaticUpgradeToMoreSecuredStorage" */ val AUTOMATIC_UPGRADE: typings.reactNativeKeychain.mod.SECURITY_RULES.AUTOMATIC_UPGRADE & String = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with SECURITY_RULES
  /* "none" */ val NONE: typings.reactNativeKeychain.mod.SECURITY_RULES.NONE & String = js.native
}
