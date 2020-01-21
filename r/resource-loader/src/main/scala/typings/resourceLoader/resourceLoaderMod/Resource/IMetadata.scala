package typings.resourceLoader.resourceLoaderMod.Resource

import typings.std.HTMLAudioElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @memberof Resource
  * @typedef {object} IMetadata
  * @property {HTMLImageElement|HTMLAudioElement|HTMLVideoElement} [loadElement=null] - The
  *      element to use for loading, instead of creating one.
  * @property {boolean} [skipSource=false] - Skips adding source(s) to the load element. This
  *      is useful if you want to pass in a `loadElement` that you already added load sources to.
  * @property {string|string[]} [mimeType] - The mime type to use for the source element
  *      of a video/audio elment. If the urls are an array, you can pass this as an array as well
  *      where each index is the mime type to use for the corresponding url index.
  */
trait IMetadata extends js.Object {
  var loadElement: js.UndefOr[HTMLImageElement | HTMLAudioElement | HTMLVideoElement] = js.undefined
  var mimeType: js.UndefOr[String | js.Array[String]] = js.undefined
  var skipSource: js.UndefOr[Boolean] = js.undefined
}

object IMetadata {
  @scala.inline
  def apply(
    loadElement: HTMLImageElement | HTMLAudioElement | HTMLVideoElement = null,
    mimeType: String | js.Array[String] = null,
    skipSource: js.UndefOr[Boolean] = js.undefined
  ): IMetadata = {
    val __obj = js.Dynamic.literal()
    if (loadElement != null) __obj.updateDynamic("loadElement")(loadElement.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (!js.isUndefined(skipSource)) __obj.updateDynamic("skipSource")(skipSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadata]
  }
}

