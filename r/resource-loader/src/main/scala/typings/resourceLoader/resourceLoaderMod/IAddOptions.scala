package typings.resourceLoader.resourceLoaderMod

import typings.resourceLoader.resourceLoaderMod.Resource.IMetadata
import typings.resourceLoader.resourceLoaderMod.Resource.LOAD_TYPE
import typings.resourceLoader.resourceLoaderMod.Resource.OnCompleteSignal
import typings.resourceLoader.resourceLoaderMod.Resource.XHR_RESPONSE_TYPE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for a call to `.add()`.
  *
  * @see Loader#add
  *
  * @typedef {object} IAddOptions
  * @property {string} [name] - The name of the resource to load, if not passed the url is used.
  * @property {string} [key] - Alias for `name`.
  * @property {string} [url] - The url for this resource, relative to the baseUrl of this loader.
  * @property {string|boolean} [crossOrigin] - Is this request cross-origin? Default is to
  *      determine automatically.
  * @property {number} [timeout=0] - A timeout in milliseconds for the load. If the load takes
  *      longer than this time it is cancelled and the load is considered a failure. If this value is
  *      set to `0` then there is no explicit timeout.
  * @property {Resource.LOAD_TYPE} [loadType=Resource.LOAD_TYPE.XHR] - How should this resource
  *      be loaded?
  * @property {Resource.XHR_RESPONSE_TYPE} [xhrType=Resource.XHR_RESPONSE_TYPE.DEFAULT] - How
  *      should the data being loaded be interpreted when using XHR?
  * @property {Resource.OnCompleteSignal} [onComplete] - Callback to add an an onComplete signal istener.
  * @property {Resource.OnCompleteSignal} [callback] - Alias for `onComplete`.
  * @property {Resource.IMetadata} [metadata] - Extra configuration for middleware and the Resource object.
  */
trait IAddOptions extends StObject {
  
  var callback: js.UndefOr[OnCompleteSignal] = js.undefined
  
  var crossOrigin: js.UndefOr[String | Boolean] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var loadType: js.UndefOr[LOAD_TYPE] = js.undefined
  
  var metadata: js.UndefOr[IMetadata] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var onComplete: js.UndefOr[OnCompleteSignal] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var xhrType: js.UndefOr[XHR_RESPONSE_TYPE] = js.undefined
}
object IAddOptions {
  
  inline def apply(): IAddOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAddOptions]
  }
  
  extension [Self <: IAddOptions](x: Self) {
    
    inline def setCallback(value: /* resource */ Resource => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setCrossOrigin(value: String | Boolean): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLoadType(value: LOAD_TYPE): Self = StObject.set(x, "loadType", value.asInstanceOf[js.Any])
    
    inline def setLoadTypeUndefined: Self = StObject.set(x, "loadType", js.undefined)
    
    inline def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnComplete(value: /* resource */ Resource => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
    
    inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setXhrType(value: XHR_RESPONSE_TYPE): Self = StObject.set(x, "xhrType", value.asInstanceOf[js.Any])
    
    inline def setXhrTypeUndefined: Self = StObject.set(x, "xhrType", js.undefined)
  }
}
