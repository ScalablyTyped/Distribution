package typings.reactNative.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.reactNativeStrings.`force-cache`
import typings.reactNative.reactNativeStrings.`only-if-cached`
import typings.reactNative.reactNativeStrings.default
import typings.reactNative.reactNativeStrings.reload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageURISource extends js.Object {
  /**
    * `body` is the HTTP body to send with the request. This must be a valid
    * UTF-8 string, and will be sent exactly as specified, with no
    * additional encoding (e.g. URL-escaping or base64) applied.
    */
  var body: js.UndefOr[String] = js.native
  /**
    * `bundle` is the iOS asset bundle which the image is included in. This
    * will default to [NSBundle mainBundle] if not set.
    * @platform ios
    */
  var bundle: js.UndefOr[String] = js.native
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
  var cache: js.UndefOr[default | reload | `force-cache` | `only-if-cached`] = js.native
  /**
    * `headers` is an object representing the HTTP headers to send along with the
    * request for a remote image.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var height: js.UndefOr[Double] = js.native
  /**
    * `method` is the HTTP Method to use. Defaults to GET if not specified.
    */
  var method: js.UndefOr[String] = js.native
  /**
    * `scale` is used to indicate the scale factor of the image. Defaults to 1.0 if
    * unspecified, meaning that one image pixel equates to one display point / DIP.
    */
  var scale: js.UndefOr[Double] = js.native
  /**
    * `uri` is a string representing the resource identifier for the image, which
    * could be an http address, a local file path, or the name of a static image
    * resource (which should be wrapped in the `require('./path/to/image.png')`
    * function).
    */
  var uri: js.UndefOr[String] = js.native
  /**
    * `width` and `height` can be specified if known at build time, in which case
    * these will be used to set the default `<Image/>` component dimensions.
    */
  var width: js.UndefOr[Double] = js.native
}

object ImageURISource {
  @scala.inline
  def apply(): ImageURISource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageURISource]
  }
  @scala.inline
  implicit class ImageURISourceOps[Self <: ImageURISource] (val x: Self) extends AnyVal {
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setBundle(value: String): Self = this.set("bundle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundle: Self = this.set("bundle", js.undefined)
    @scala.inline
    def setCache(value: default | reload | `force-cache` | `only-if-cached`): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

