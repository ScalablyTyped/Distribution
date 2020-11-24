package typings.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharpOptions extends js.Object {
  
  /** Set to `true` to read all frames/pages of an animated image (equivalent of setting `pages` to `-1`). (optional, default false) */
  var animated: js.UndefOr[Boolean] = js.native
  
  /** Describes a new image to be created. */
  var create: js.UndefOr[Create] = js.native
  
  /** Number representing the DPI for vector images. (optional, default 72) */
  var density: js.UndefOr[Double] = js.native
  
  /**
    * By default halt processing and raise an error when loading invalid images.
    * Set this flag to false if you'd rather apply a "best effort" to decode images,
    * even if the data is corrupt or invalid. (optional, default true)
    * (optional, default true)
    */
  var failOnError: js.UndefOr[Boolean] = js.native
  
  /** Level to extract from a multi-level input (OpenSlide), zero based. (optional, default 0) */
  var level: js.UndefOr[Double] = js.native
  
  /**
    * Do not process input images where the number of pixels (width x height) exceeds this limit.
    * Assumes image dimensions contained in the input metadata can be trusted.
    * An integral Number of pixels, zero or false to remove limit, true to use default limit of 268402689 (0x3FFF x 0x3FFF). (optional, default 268402689)
    */
  var limitInputPixels: js.UndefOr[Double | Boolean] = js.native
  
  /** Page number to start extracting from for multi-page input (GIF, TIFF, PDF), zero based. (optional, default 0) */
  var page: js.UndefOr[Double] = js.native
  
  /** Number of pages to extract for multi-page input (GIF, TIFF, PDF), use -1 for all pages */
  var pages: js.UndefOr[Double] = js.native
  
  /** Describes raw pixel input image data. See raw() for pixel ordering. */
  var raw: js.UndefOr[Raw] = js.native
  
  /** Set this to true to use sequential rather than random access where possible. This can reduce memory usage and might improve performance on some systems. (optional, default false) */
  var sequentialRead: js.UndefOr[Boolean] = js.native
}
object SharpOptions {
  
  @scala.inline
  def apply(): SharpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharpOptions]
  }
  
  @scala.inline
  implicit class SharpOptionsOps[Self <: SharpOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    
    @scala.inline
    def setCreate(value: Create): Self = this.set("create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setDensity(value: Double): Self = this.set("density", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDensity: Self = this.set("density", js.undefined)
    
    @scala.inline
    def setFailOnError(value: Boolean): Self = this.set("failOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailOnError: Self = this.set("failOnError", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setLimitInputPixels(value: Double | Boolean): Self = this.set("limitInputPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitInputPixels: Self = this.set("limitInputPixels", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPages(value: Double): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
    
    @scala.inline
    def setRaw(value: Raw): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setSequentialRead(value: Boolean): Self = this.set("sequentialRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequentialRead: Self = this.set("sequentialRead", js.undefined)
  }
}
