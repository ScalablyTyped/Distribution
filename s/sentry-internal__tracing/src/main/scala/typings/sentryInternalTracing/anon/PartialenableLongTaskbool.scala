package typings.sentryInternalTracing.anon

import typings.sentryCore.mod.Hub
import typings.sentryTypes.typesTransactionMod.Transaction
import typings.sentryTypes.typesTransactionMod.TransactionContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  enableLongTask :boolean,   enableInteractions :boolean, onStartRouteTransaction (t : @sentry/types.@sentry/types.Transaction | undefined, ctx : @sentry/types.@sentry/types.TransactionContext, getCurrentHub : (): @sentry/core.@sentry/core.Hub): void}> */
trait PartialenableLongTaskbool extends StObject {
  
  var enableInteractions: js.UndefOr[Boolean] = js.undefined
  
  var enableLongTask: js.UndefOr[Boolean] = js.undefined
  
  var onStartRouteTransaction: js.UndefOr[
    js.Function3[
      /* t */ js.UndefOr[Transaction], 
      /* ctx */ TransactionContext, 
      /* getCurrentHub */ js.Function0[Hub], 
      Unit
    ]
  ] = js.undefined
}
object PartialenableLongTaskbool {
  
  inline def apply(): PartialenableLongTaskbool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialenableLongTaskbool]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialenableLongTaskbool] (val x: Self) extends AnyVal {
    
    inline def setEnableInteractions(value: Boolean): Self = StObject.set(x, "enableInteractions", value.asInstanceOf[js.Any])
    
    inline def setEnableInteractionsUndefined: Self = StObject.set(x, "enableInteractions", js.undefined)
    
    inline def setEnableLongTask(value: Boolean): Self = StObject.set(x, "enableLongTask", value.asInstanceOf[js.Any])
    
    inline def setEnableLongTaskUndefined: Self = StObject.set(x, "enableLongTask", js.undefined)
    
    inline def setOnStartRouteTransaction(
      value: (/* t */ js.UndefOr[Transaction], /* ctx */ TransactionContext, /* getCurrentHub */ js.Function0[Hub]) => Unit
    ): Self = StObject.set(x, "onStartRouteTransaction", js.Any.fromFunction3(value))
    
    inline def setOnStartRouteTransactionUndefined: Self = StObject.set(x, "onStartRouteTransaction", js.undefined)
  }
}
