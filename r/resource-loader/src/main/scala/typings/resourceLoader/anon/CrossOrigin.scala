package typings.resourceLoader.anon

import typings.resourceLoader.resourceLoaderMod.Resource.IMetadata
import typings.resourceLoader.resourceLoaderMod.Resource.LOAD_TYPE
import typings.resourceLoader.resourceLoaderMod.Resource.XHR_RESPONSE_TYPE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrossOrigin extends js.Object {
  var crossOrigin: js.UndefOr[String | Boolean] = js.undefined
  var loadType: js.UndefOr[LOAD_TYPE] = js.undefined
  var metadata: js.UndefOr[IMetadata] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var xhrType: js.UndefOr[XHR_RESPONSE_TYPE] = js.undefined
}

object CrossOrigin {
  @scala.inline
  def apply(
    crossOrigin: String | Boolean = null,
    loadType: LOAD_TYPE = null,
    metadata: IMetadata = null,
    timeout: js.UndefOr[Double] = js.undefined,
    xhrType: XHR_RESPONSE_TYPE = null
  ): CrossOrigin = {
    val __obj = js.Dynamic.literal()
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (loadType != null) __obj.updateDynamic("loadType")(loadType.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (xhrType != null) __obj.updateDynamic("xhrType")(xhrType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossOrigin]
  }
}

