package typings.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.relayNetworkTypesMod.PayloadData
import typings.relayRuntime.relayStoreTypesMod.MutableRecordSource
import typings.relayRuntime.relayStoreTypesMod.NormalizationSelector
import typings.relayRuntime.relayStoreTypesMod.RelayResponsePayload
import typings.relayRuntime.relayStoreTypesMod.RequestDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayResponseNormalizerMod {
  
  @JSImport("relay-runtime/lib/store/RelayResponseNormalizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalize(
    recordSource: MutableRecordSource,
    selector: NormalizationSelector,
    response: PayloadData,
    options: NormalizationOptions
  ): RelayResponsePayload = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(recordSource.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], response.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RelayResponsePayload]
  
  type GetDataID = js.Function2[/* fieldValue */ StringDictionary[js.Any], /* typeName */ String, js.Any]
  
  trait NormalizationOptions extends StObject {
    
    def getDataID(fieldValue: StringDictionary[js.Any], typeName: String): js.Any
    @JSName("getDataID")
    var getDataID_Original: GetDataID
    
    var path: js.UndefOr[js.Array[String]] = js.undefined
    
    var request: RequestDescriptor
  }
  object NormalizationOptions {
    
    inline def apply(
      getDataID: (/* fieldValue */ StringDictionary[js.Any], /* typeName */ String) => js.Any,
      request: RequestDescriptor
    ): NormalizationOptions = {
      val __obj = js.Dynamic.literal(getDataID = js.Any.fromFunction2(getDataID), request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizationOptions]
    }
    
    extension [Self <: NormalizationOptions](x: Self) {
      
      inline def setGetDataID(value: (/* fieldValue */ StringDictionary[js.Any], /* typeName */ String) => js.Any): Self = StObject.set(x, "getDataID", js.Any.fromFunction2(value))
      
      inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      inline def setRequest(value: RequestDescriptor): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
}
