package typings.resourceLoader.resourceLoaderMod

import typings.resourceLoader.resourceLoaderMod.Resource.IMetadata
import typings.resourceLoader.resourceLoaderMod.Resource.LOAD_TYPE
import typings.resourceLoader.resourceLoaderMod.Resource.OnCompleteSignal
import typings.resourceLoader.resourceLoaderMod.Resource.XHR_RESPONSE_TYPE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait IAddOptions extends js.Object {
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
  @scala.inline
  def apply(
    callback: /* resource */ Resource => Unit = null,
    crossOrigin: String | Boolean = null,
    key: String = null,
    loadType: LOAD_TYPE = null,
    metadata: IMetadata = null,
    name: String = null,
    onComplete: /* resource */ Resource => Unit = null,
    timeout: js.UndefOr[Double] = js.undefined,
    url: String = null,
    xhrType: XHR_RESPONSE_TYPE = null
  ): IAddOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (loadType != null) __obj.updateDynamic("loadType")(loadType.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (xhrType != null) __obj.updateDynamic("xhrType")(xhrType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddOptions]
  }
}

