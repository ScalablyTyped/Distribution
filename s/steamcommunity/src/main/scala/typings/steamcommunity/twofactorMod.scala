package typings.steamcommunity

import typings.node.bufferMod.global.Buffer
import typings.steamcommunity.anon.Identitysecret
import typings.steamcommunity.mod.Callback
import typings.steamcommunity.mod.CallbackError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twofactorMod {
  
  @js.native
  trait TwoFactor extends StObject {
    
    /**
      * Disables two-factor authentication on your account given a revocation code.
      * Unlike the revocation procedure on the support site, this will not invalidate all your account's outstanding Steam Guard authorizations.
      *
      * @param revocationCode Your two-factor revocation code, which has the format Rxxxxx, where x is a number.
      * @param callback Called when the request completes.
      */
    def disableTwoFactor(revocationCode: String, callback: Callback): Unit = js.native
    
    /**
      * Starts the process to turn on TOTP for your account. You must have a phone number already linked with and verified on your account.
      *
      * @param callback Called when the request completes.
      */
    def enableTwoFactor(callback: js.Function2[/* err */ CallbackError, /* response */ Identitysecret, Any]): Unit = js.native
    
    def finalizeTwoFactor(secret: String, activationCode: Any, callback: Callback): Unit = js.native
    /**
      * Finishes the process of enabling TOTP two-factor authentication for your account. You can use steam-totp in the future when logging on to get a code.
      *
      * @param secret
      * @param activationCode
      * @param callback
      */
    def finalizeTwoFactor(secret: Buffer, activationCode: Any, callback: Callback): Unit = js.native
  }
}
