package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteableMetadata extends StObject {
  
  /** Number value of the EXIF Orientation header, if present */
  var orientation: js.UndefOr[Double] = js.undefined
}
object WriteableMetadata {
  
  inline def apply(): WriteableMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteableMetadata]
  }
  
  extension [Self <: WriteableMetadata](x: Self) {
    
    inline def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
  }
}
