package typings.resourceLoader

import typings.resourceLoader.resourceLoaderMod.Resource.IMetadata
import typings.resourceLoader.resourceLoaderMod.Resource.LOAD_TYPE
import typings.resourceLoader.resourceLoaderMod.Resource.XHR_RESPONSE_TYPE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CrossOrigin extends StObject {
    
    var crossOrigin: js.UndefOr[String | Boolean] = js.undefined
    
    var loadType: js.UndefOr[LOAD_TYPE] = js.undefined
    
    var metadata: js.UndefOr[IMetadata] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var xhrType: js.UndefOr[XHR_RESPONSE_TYPE] = js.undefined
  }
  object CrossOrigin {
    
    inline def apply(): CrossOrigin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrossOrigin]
    }
    
    extension [Self <: CrossOrigin](x: Self) {
      
      inline def setCrossOrigin(value: String | Boolean): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setLoadType(value: LOAD_TYPE): Self = StObject.set(x, "loadType", value.asInstanceOf[js.Any])
      
      inline def setLoadTypeUndefined: Self = StObject.set(x, "loadType", js.undefined)
      
      inline def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setXhrType(value: XHR_RESPONSE_TYPE): Self = StObject.set(x, "xhrType", value.asInstanceOf[js.Any])
      
      inline def setXhrTypeUndefined: Self = StObject.set(x, "xhrType", js.undefined)
    }
  }
}
