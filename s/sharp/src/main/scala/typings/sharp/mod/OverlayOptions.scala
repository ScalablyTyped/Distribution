package typings.sharp.mod

import typings.node.bufferMod.global.Buffer
import typings.sharp.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverlayOptions extends StObject {
  
  /** Set to true to read all frames/pages of an animated image. (optional, default false). */
  var animated: js.UndefOr[Boolean] = js.undefined
  
  /** how to blend this image with the image below. (optional, default `'over'`) */
  var blend: js.UndefOr[Blend] = js.undefined
  
  /** number representing the DPI for vector overlay image. (optional, default 72) */
  var density: js.UndefOr[Double] = js.undefined
  
  /**
    *  When to abort processing of invalid pixel data, one of (in order of sensitivity):
    *  'none' (least), 'truncated', 'error' or 'warning' (most), highers level imply lower levels, invalid metadata will always abort. (optional, default 'warning')
    */
  var failOn: js.UndefOr[FailOnOptions] = js.undefined
  
  /** gravity at which to place the overlay. (optional, default 'centre') */
  var gravity: js.UndefOr[Gravity_] = js.undefined
  
  /** Buffer containing image data, String containing the path to an image file, or Create object  */
  var input: js.UndefOr[String | Buffer | typings.sharp.anon.Create | Text] = js.undefined
  
  /** the pixel offset from the left edge. */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    * Do not process input images where the number of pixels (width x height) exceeds this limit.
    * Assumes image dimensions contained in the input metadata can be trusted.
    * An integral Number of pixels, zero or false to remove limit, true to use default limit of 268402689 (0x3FFF x 0x3FFF). (optional, default 268402689)
    */
  var limitInputPixels: js.UndefOr[Double | Boolean] = js.undefined
  
  /** Set to true to avoid premultipling the image below. Equivalent to the --premultiplied vips option. */
  var premultiplied: js.UndefOr[Boolean] = js.undefined
  
  /** describes overlay when using raw pixel data. */
  var raw: js.UndefOr[Raw] = js.undefined
  
  /** set to true to repeat the overlay image across the entire image with the given  gravity. (optional, default false) */
  var tile: js.UndefOr[Boolean] = js.undefined
  
  /** the pixel offset from the top edge. */
  var top: js.UndefOr[Double] = js.undefined
}
object OverlayOptions {
  
  inline def apply(): OverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OverlayOptions] (val x: Self) extends AnyVal {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setBlend(value: Blend): Self = StObject.set(x, "blend", value.asInstanceOf[js.Any])
    
    inline def setBlendUndefined: Self = StObject.set(x, "blend", js.undefined)
    
    inline def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    inline def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
    
    inline def setFailOn(value: FailOnOptions): Self = StObject.set(x, "failOn", value.asInstanceOf[js.Any])
    
    inline def setFailOnUndefined: Self = StObject.set(x, "failOn", js.undefined)
    
    inline def setGravity(value: Gravity_): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
    
    inline def setInput(value: String | Buffer | typings.sharp.anon.Create | Text): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setLimitInputPixels(value: Double | Boolean): Self = StObject.set(x, "limitInputPixels", value.asInstanceOf[js.Any])
    
    inline def setLimitInputPixelsUndefined: Self = StObject.set(x, "limitInputPixels", js.undefined)
    
    inline def setPremultiplied(value: Boolean): Self = StObject.set(x, "premultiplied", value.asInstanceOf[js.Any])
    
    inline def setPremultipliedUndefined: Self = StObject.set(x, "premultiplied", js.undefined)
    
    inline def setRaw(value: Raw): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setTile(value: Boolean): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    
    inline def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
