package typings.sentryNode.anon

import typings.sentryNode.typesRequestdataMod.AddRequestDataToEventOptions
import typings.sentryNode.typesRequestdataMod.TransactionNamingScheme
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesPolymorphicsMod.PolymorphicRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@sentry/node.@sentry/node/types/integrations/requestdata.RequestDataOptions> */
trait PartialRequestDataOptions extends StObject {
  
  var addRequestData: js.UndefOr[
    js.Function3[
      /* event */ Event, 
      /* req */ PolymorphicRequest, 
      /* options */ js.UndefOr[AddRequestDataToEventOptions], 
      Event
    ]
  ] = js.undefined
  
  var include: js.UndefOr[Cookies] = js.undefined
  
  var transactionNamingScheme: js.UndefOr[TransactionNamingScheme] = js.undefined
}
object PartialRequestDataOptions {
  
  inline def apply(): PartialRequestDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRequestDataOptions]
  }
  
  extension [Self <: PartialRequestDataOptions](x: Self) {
    
    inline def setAddRequestData(
      value: (/* event */ Event, /* req */ PolymorphicRequest, /* options */ js.UndefOr[AddRequestDataToEventOptions]) => Event
    ): Self = StObject.set(x, "addRequestData", js.Any.fromFunction3(value))
    
    inline def setAddRequestDataUndefined: Self = StObject.set(x, "addRequestData", js.undefined)
    
    inline def setInclude(value: Cookies): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setTransactionNamingScheme(value: TransactionNamingScheme): Self = StObject.set(x, "transactionNamingScheme", value.asInstanceOf[js.Any])
    
    inline def setTransactionNamingSchemeUndefined: Self = StObject.set(x, "transactionNamingScheme", js.undefined)
  }
}
