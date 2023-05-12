package typings.steamTradeofferManager

import typings.steamTradeofferManager.mod.EResult
import typings.steamid.mod.SteamID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined steam-tradeoffer-manager.steam-tradeoffer-manager.EResultError & {  cause :'TradeBan' | 'NewDevice' | 'TargetCannotTrade' | undefined} */
  trait EResultErrorcauseTradeBan extends StObject {
    
    /* standard es2022.error */
    var cause: js.UndefOr[Any] = js.undefined
    
    var eresult: js.UndefOr[EResult] = js.undefined
    
    /* standard es5 */
    var message: String
    
    /* standard es5 */
    var name: String
    
    /* standard es5 */
    var stack: js.UndefOr[String] = js.undefined
  }
  object EResultErrorcauseTradeBan {
    
    inline def apply(message: String, name: String): EResultErrorcauseTradeBan = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[EResultErrorcauseTradeBan]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EResultErrorcauseTradeBan] (val x: Self) extends AnyVal {
      
      inline def setCause(value: Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      inline def setEresult(value: EResult): Self = StObject.set(x, "eresult", value.asInstanceOf[js.Any])
      
      inline def setEresultUndefined: Self = StObject.set(x, "eresult", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  /* Inlined std.Error & {  cause :'TradeBan' | 'NewDevice' | 'TargetCannotTrade' | 'OfferLimitExceeded' | 'ItemServerUnavailable' | undefined} */
  trait ErrorcauseTradeBanNewDevi extends StObject {
    
    /* standard es2022.error */
    var cause: js.UndefOr[Any] = js.undefined
    
    /* standard es5 */
    var message: String
    
    /* standard es5 */
    var name: String
    
    /* standard es5 */
    var stack: js.UndefOr[String] = js.undefined
  }
  object ErrorcauseTradeBanNewDevi {
    
    inline def apply(message: String, name: String): ErrorcauseTradeBanNewDevi = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorcauseTradeBanNewDevi]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorcauseTradeBanNewDevi] (val x: Self) extends AnyVal {
      
      inline def setCause(value: Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  @js.native
  trait TypeofSteamID extends StObject {
    
    val AccountIDMask: /* 0xFFFFFFFF */ Double = js.native
    
    val AccountInstanceMask: /* 0x000FFFFF */ Double = js.native
    
    def fromIndividualAccountID(accountid: String): SteamID = js.native
    def fromIndividualAccountID(accountid: js.BigInt): SteamID = js.native
    /**
      * Create an individual SteamID in the public universe given an accountid
      * @param accountid - The user's account ID
      */
    def fromIndividualAccountID(accountid: Double): SteamID = js.native
  }
}
