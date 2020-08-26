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
@js.native
trait IMetadata extends js.Object {
  var loadElement: js.UndefOr[HTMLImageElement | HTMLAudioElement | HTMLVideoElement] = js.native
  var mimeType: js.UndefOr[String | js.Array[String]] = js.native
  var skipSource: js.UndefOr[Boolean] = js.native
}

object IMetadata {
  @scala.inline
  def apply(): IMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMetadata]
  }
  @scala.inline
  implicit class IMetadataOps[Self <: IMetadata] (val x: Self) extends AnyVal {
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
    def setLoadElement(value: HTMLImageElement | HTMLAudioElement | HTMLVideoElement): Self = this.set("loadElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadElement: Self = this.set("loadElement", js.undefined)
    @scala.inline
    def setMimeTypeVarargs(value: String*): Self = this.set("mimeType", js.Array(value :_*))
    @scala.inline
    def setMimeType(value: String | js.Array[String]): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    @scala.inline
    def setSkipSource(value: Boolean): Self = this.set("skipSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipSource: Self = this.set("skipSource", js.undefined)
  }
  
}

