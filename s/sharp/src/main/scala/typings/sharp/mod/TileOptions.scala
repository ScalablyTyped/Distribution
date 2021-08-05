package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileOptions extends StObject {
  
  /** Tile angle of rotation, must be a multiple of 90. (optional, default 0) */
  var angle: js.UndefOr[Double] = js.undefined
  
  /** background colour, parsed by the color module, defaults to white without transparency. (optional, default {r:255,g:255,b:255,alpha:1}) */
  var background: js.UndefOr[String | RGBA] = js.undefined
  
  /** Tile container, with value fs (filesystem) or zip (compressed file). (optional, default 'fs') */
  var container: js.UndefOr[String] = js.undefined
  
  /** How deep to make the pyramid, possible values are "onepixel", "onetile" or "one" (default based on layout) */
  var depth: js.UndefOr[String] = js.undefined
  
  /** Filesystem layout, possible values are dz, iiif, zoomify or google. (optional, default 'dz') */
  var layout: js.UndefOr[TileLayout] = js.undefined
  
  /** Tile overlap in pixels, a value between 0 and 8192. (optional, default 0) */
  var overlap: js.UndefOr[Double] = js.undefined
  
  /** Tile size in pixels, a value between 1 and 8192. (optional, default 256) */
  var size: js.UndefOr[Double] = js.undefined
  
  /** Threshold to skip tile generation, a value 0 - 255 for 8-bit images or 0 - 65535 for 16-bit images */
  var skipBlanks: js.UndefOr[Double] = js.undefined
}
object TileOptions {
  
  inline def apply(): TileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileOptions]
  }
  
  extension [Self <: TileOptions](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setBackground(value: String | RGBA): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setDepth(value: String): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setLayout(value: TileLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setOverlap(value: Double): Self = StObject.set(x, "overlap", value.asInstanceOf[js.Any])
    
    inline def setOverlapUndefined: Self = StObject.set(x, "overlap", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSkipBlanks(value: Double): Self = StObject.set(x, "skipBlanks", value.asInstanceOf[js.Any])
    
    inline def setSkipBlanksUndefined: Self = StObject.set(x, "skipBlanks", js.undefined)
  }
}
