package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharpOptions extends StObject {
  
  /** Set to `true` to read all frames/pages of an animated image (equivalent of setting `pages` to `-1`). (optional, default false) */
  var animated: js.UndefOr[Boolean] = js.undefined
  
  /** Describes a new image to be created. */
  var create: js.UndefOr[Create] = js.undefined
  
  /** Number representing the DPI for vector images in the range 1 to 100000. (optional, default 72) */
  var density: js.UndefOr[Double] = js.undefined
  
  /**
    *  When to abort processing of invalid pixel data, one of (in order of sensitivity):
    *  'none' (least), 'truncated', 'error' or 'warning' (most), highers level imply lower levels, invalid metadata will always abort. (optional, default 'warning')
    */
  var failOn: js.UndefOr[FailOnOptions] = js.undefined
  
  /**
    * By default halt processing and raise an error when loading invalid images.
    * Set this flag to false if you'd rather apply a "best effort" to decode images,
    * even if the data is corrupt or invalid. (optional, default true)
    *
    * @deprecated Use `failOn` instead
    */
  var failOnError: js.UndefOr[Boolean] = js.undefined
  
  /** Should the embedded ICC profile, if any, be ignored. */
  var ignoreIcc: js.UndefOr[Boolean] = js.undefined
  
  /** Level to extract from a multi-level input (OpenSlide), zero based. (optional, default 0) */
  var level: js.UndefOr[Double] = js.undefined
  
  /**
    * Do not process input images where the number of pixels (width x height) exceeds this limit.
    * Assumes image dimensions contained in the input metadata can be trusted.
    * An integral Number of pixels, zero or false to remove limit, true to use default limit of 268402689 (0x3FFF x 0x3FFF). (optional, default 268402689)
    */
  var limitInputPixels: js.UndefOr[Double | Boolean] = js.undefined
  
  /** Page number to start extracting from for multi-page input (GIF, TIFF, PDF), zero based. (optional, default 0) */
  var page: js.UndefOr[Double] = js.undefined
  
  /** Number of pages to extract for multi-page input (GIF, TIFF, PDF), use -1 for all pages */
  var pages: js.UndefOr[Double] = js.undefined
  
  /** Describes raw pixel input image data. See raw() for pixel ordering. */
  var raw: js.UndefOr[CreateRaw] = js.undefined
  
  /** Set this to false to use random access rather than sequential read. Some operations will do this automatically. */
  var sequentialRead: js.UndefOr[Boolean] = js.undefined
  
  /** subIFD (Sub Image File Directory) to extract for OME-TIFF, defaults to main image. (optional, default -1) */
  var subifd: js.UndefOr[Double] = js.undefined
  
  /** Describes a new text image to be created. */
  var text: js.UndefOr[CreateText] = js.undefined
  
  /** Set this to true to remove safety features that help prevent memory exhaustion (SVG, PNG). (optional, default false) */
  var unlimited: js.UndefOr[Boolean] = js.undefined
}
object SharpOptions {
  
  inline def apply(): SharpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharpOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharpOptions] (val x: Self) extends AnyVal {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setCreate(value: Create): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    inline def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
    
    inline def setFailOn(value: FailOnOptions): Self = StObject.set(x, "failOn", value.asInstanceOf[js.Any])
    
    inline def setFailOnError(value: Boolean): Self = StObject.set(x, "failOnError", value.asInstanceOf[js.Any])
    
    inline def setFailOnErrorUndefined: Self = StObject.set(x, "failOnError", js.undefined)
    
    inline def setFailOnUndefined: Self = StObject.set(x, "failOn", js.undefined)
    
    inline def setIgnoreIcc(value: Boolean): Self = StObject.set(x, "ignoreIcc", value.asInstanceOf[js.Any])
    
    inline def setIgnoreIccUndefined: Self = StObject.set(x, "ignoreIcc", js.undefined)
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setLimitInputPixels(value: Double | Boolean): Self = StObject.set(x, "limitInputPixels", value.asInstanceOf[js.Any])
    
    inline def setLimitInputPixelsUndefined: Self = StObject.set(x, "limitInputPixels", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPages(value: Double): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    inline def setRaw(value: CreateRaw): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setSequentialRead(value: Boolean): Self = StObject.set(x, "sequentialRead", value.asInstanceOf[js.Any])
    
    inline def setSequentialReadUndefined: Self = StObject.set(x, "sequentialRead", js.undefined)
    
    inline def setSubifd(value: Double): Self = StObject.set(x, "subifd", value.asInstanceOf[js.Any])
    
    inline def setSubifdUndefined: Self = StObject.set(x, "subifd", js.undefined)
    
    inline def setText(value: CreateText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUnlimited(value: Boolean): Self = StObject.set(x, "unlimited", value.asInstanceOf[js.Any])
    
    inline def setUnlimitedUndefined: Self = StObject.set(x, "unlimited", js.undefined)
  }
}
