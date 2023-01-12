package typings.sharp.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteableMetadata extends StObject {
  
  /** Number of pixels per inch (DPI) */
  var density: js.UndefOr[Double] = js.undefined
  
  /** Object keyed by IFD0, IFD1 etc. of key/value string pairs to write as EXIF data. (optional, default {}) */
  var exif: js.UndefOr[Record[String, Any]] = js.undefined
  
  /** Filesystem path to output ICC profile, defaults to sRGB. */
  var icc: js.UndefOr[String] = js.undefined
  
  /** Value between 1 and 8, used to update the EXIF Orientation tag. */
  var orientation: js.UndefOr[Double] = js.undefined
}
object WriteableMetadata {
  
  inline def apply(): WriteableMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteableMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WriteableMetadata] (val x: Self) extends AnyVal {
    
    inline def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    inline def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
    
    inline def setExif(value: Record[String, Any]): Self = StObject.set(x, "exif", value.asInstanceOf[js.Any])
    
    inline def setExifUndefined: Self = StObject.set(x, "exif", js.undefined)
    
    inline def setIcc(value: String): Self = StObject.set(x, "icc", value.asInstanceOf[js.Any])
    
    inline def setIccUndefined: Self = StObject.set(x, "icc", js.undefined)
    
    inline def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
  }
}
