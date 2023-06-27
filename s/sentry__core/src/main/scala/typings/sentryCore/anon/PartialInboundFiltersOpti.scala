package typings.sentryCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@sentry/core.@sentry/core/types/integrations/inboundfilters.InboundFiltersOptions> */
trait PartialInboundFiltersOpti extends StObject {
  
  var allowUrls: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
  
  var denyUrls: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
  
  var disableErrorDefaults: js.UndefOr[Boolean] = js.undefined
  
  var disableTransactionDefaults: js.UndefOr[Boolean] = js.undefined
  
  var ignoreErrors: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
  
  var ignoreInternal: js.UndefOr[Boolean] = js.undefined
  
  var ignoreTransactions: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
}
object PartialInboundFiltersOpti {
  
  inline def apply(): PartialInboundFiltersOpti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInboundFiltersOpti]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialInboundFiltersOpti] (val x: Self) extends AnyVal {
    
    inline def setAllowUrls(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "allowUrls", value.asInstanceOf[js.Any])
    
    inline def setAllowUrlsUndefined: Self = StObject.set(x, "allowUrls", js.undefined)
    
    inline def setAllowUrlsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "allowUrls", js.Array(value*))
    
    inline def setDenyUrls(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "denyUrls", value.asInstanceOf[js.Any])
    
    inline def setDenyUrlsUndefined: Self = StObject.set(x, "denyUrls", js.undefined)
    
    inline def setDenyUrlsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "denyUrls", js.Array(value*))
    
    inline def setDisableErrorDefaults(value: Boolean): Self = StObject.set(x, "disableErrorDefaults", value.asInstanceOf[js.Any])
    
    inline def setDisableErrorDefaultsUndefined: Self = StObject.set(x, "disableErrorDefaults", js.undefined)
    
    inline def setDisableTransactionDefaults(value: Boolean): Self = StObject.set(x, "disableTransactionDefaults", value.asInstanceOf[js.Any])
    
    inline def setDisableTransactionDefaultsUndefined: Self = StObject.set(x, "disableTransactionDefaults", js.undefined)
    
    inline def setIgnoreErrors(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
    
    inline def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
    
    inline def setIgnoreErrorsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "ignoreErrors", js.Array(value*))
    
    inline def setIgnoreInternal(value: Boolean): Self = StObject.set(x, "ignoreInternal", value.asInstanceOf[js.Any])
    
    inline def setIgnoreInternalUndefined: Self = StObject.set(x, "ignoreInternal", js.undefined)
    
    inline def setIgnoreTransactions(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "ignoreTransactions", value.asInstanceOf[js.Any])
    
    inline def setIgnoreTransactionsUndefined: Self = StObject.set(x, "ignoreTransactions", js.undefined)
    
    inline def setIgnoreTransactionsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "ignoreTransactions", js.Array(value*))
  }
}
