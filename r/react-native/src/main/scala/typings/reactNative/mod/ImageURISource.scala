package typings.reactNative.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.reactNativeStrings.`force-cache`
import typings.reactNative.reactNativeStrings.`only-if-cached`
import typings.reactNative.reactNativeStrings.default
import typings.reactNative.reactNativeStrings.reload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageURISource extends js.Object {
  /**
    * `body` is the HTTP body to send with the request. This must be a valid
    * UTF-8 string, and will be sent exactly as specified, with no
    * additional encoding (e.g. URL-escaping or base64) applied.
    */
  var body: js.UndefOr[String] = js.undefined
  /**
    * `bundle` is the iOS asset bundle which the image is included in. This
    * will default to [NSBundle mainBundle] if not set.
    * @platform ios
    */
  var bundle: js.UndefOr[String] = js.undefined
  /**
    * `cache` determines how the requests handles potentially cached
    * responses.
    *
    * - `default`: Use the native platforms default strategy. `useProtocolCachePolicy` on iOS.
    *
    * - `reload`: The data for the URL will be loaded from the originating source.
    * No existing cache data should be used to satisfy a URL load request.
    *
    * - `force-cache`: The existing cached data will be used to satisfy the request,
    * regardless of its age or expiration date. If there is no existing data in the cache
    * corresponding the request, the data is loaded from the originating source.
    *
    * - `only-if-cached`: The existing cache data will be used to satisfy a request, regardless of
    * its age or expiration date. If there is no existing data in the cache corresponding
    * to a URL load request, no attempt is made to load the data from the originating source,
    * and the load is considered to have failed.
    *
    * @platform ios
    */
  var cache: js.UndefOr[default | reload | `force-cache` | `only-if-cached`] = js.undefined
  /**
    * `headers` is an object representing the HTTP headers to send along with the
    * request for a remote image.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  /**
    * `method` is the HTTP Method to use. Defaults to GET if not specified.
    */
  var method: js.UndefOr[String] = js.undefined
  /**
    * `scale` is used to indicate the scale factor of the image. Defaults to 1.0 if
    * unspecified, meaning that one image pixel equates to one display point / DIP.
    */
  var scale: js.UndefOr[Double] = js.undefined
  /**
    * `uri` is a string representing the resource identifier for the image, which
    * could be an http address, a local file path, or the name of a static image
    * resource (which should be wrapped in the `require('./path/to/image.png')`
    * function).
    */
  var uri: js.UndefOr[String] = js.undefined
  /**
    * `width` and `height` can be specified if known at build time, in which case
    * these will be used to set the default `<Image/>` component dimensions.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ImageURISource {
  @scala.inline
  def apply(
    body: String = null,
    bundle: String = null,
    cache: default | reload | `force-cache` | `only-if-cached` = null,
    headers: StringDictionary[String] = null,
    height: js.UndefOr[Double] = js.undefined,
    method: String = null,
    scale: js.UndefOr[Double] = js.undefined,
    uri: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): ImageURISource = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (bundle != null) __obj.updateDynamic("bundle")(bundle.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageURISource]
  }
}

