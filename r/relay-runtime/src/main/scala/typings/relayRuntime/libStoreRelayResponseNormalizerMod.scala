package typings.relayRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.libNetworkRelayNetworkTypesMod.PayloadData
import typings.relayRuntime.libStoreRelayStoreTypesMod.MutableRecordSource
import typings.relayRuntime.libStoreRelayStoreTypesMod.NormalizationSelector
import typings.relayRuntime.libStoreRelayStoreTypesMod.RelayResponsePayload
import typings.relayRuntime.libStoreRelayStoreTypesMod.RequestDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStoreRelayResponseNormalizerMod {
  
  @JSImport("relay-runtime/lib/store/RelayResponseNormalizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalize(
    recordSource: MutableRecordSource,
    selector: NormalizationSelector,
    response: PayloadData,
    options: NormalizationOptions
  ): RelayResponsePayload = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(recordSource.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], response.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RelayResponsePayload]
  
  type GetDataID = js.Function2[/* fieldValue */ StringDictionary[Any], /* typeName */ String, Any]
  
  trait NormalizationOptions extends StObject {
    
    def getDataID(fieldValue: StringDictionary[Any], typeName: String): Any
    @JSName("getDataID")
    var getDataID_Original: GetDataID
    
    var path: js.UndefOr[js.Array[String]] = js.undefined
    
    var request: RequestDescriptor
  }
  object NormalizationOptions {
    
    inline def apply(
      getDataID: (/* fieldValue */ StringDictionary[Any], /* typeName */ String) => Any,
      request: RequestDescriptor
    ): NormalizationOptions = {
      val __obj = js.Dynamic.literal(getDataID = js.Any.fromFunction2(getDataID), request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NormalizationOptions] (val x: Self) extends AnyVal {
      
      inline def setGetDataID(value: (/* fieldValue */ StringDictionary[Any], /* typeName */ String) => Any): Self = StObject.set(x, "getDataID", js.Any.fromFunction2(value))
      
      inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setRequest(value: RequestDescriptor): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
}
