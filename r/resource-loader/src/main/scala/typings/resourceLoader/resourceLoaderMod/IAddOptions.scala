package typings.resourceLoader.resourceLoaderMod

import typings.resourceLoader.resourceLoaderMod.Resource.IMetadata
import typings.resourceLoader.resourceLoaderMod.Resource.LOAD_TYPE
import typings.resourceLoader.resourceLoaderMod.Resource.OnCompleteSignal
import typings.resourceLoader.resourceLoaderMod.Resource.XHR_RESPONSE_TYPE
import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait IAddOptions extends js.Object {
  
  var callback: js.UndefOr[OnCompleteSignal] = js.native
  
  var crossOrigin: js.UndefOr[String | Boolean] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var loadType: js.UndefOr[LOAD_TYPE] = js.native
  
  var metadata: js.UndefOr[IMetadata] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var onComplete: js.UndefOr[OnCompleteSignal] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var xhrType: js.UndefOr[XHR_RESPONSE_TYPE] = js.native
}
object IAddOptions {
  
  @scala.inline
  def apply(): IAddOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAddOptions]
  }
  
  @scala.inline
  implicit class IAddOptionsOps[Self <: IAddOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCallback(value: /* resource */ Resource => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: String | Boolean): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLoadType(value: LOAD_TYPE): Self = this.set("loadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadType: Self = this.set("loadType", js.undefined)
    
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnComplete(value: /* resource */ Resource => Unit): Self = this.set("onComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setXhrType(value: XHR_RESPONSE_TYPE): Self = this.set("xhrType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXhrType: Self = this.set("xhrType", js.undefined)
  }
}
