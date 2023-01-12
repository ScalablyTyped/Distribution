package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThresholdOptions extends StObject {
  
  /** alternative spelling for greyscale. (optional, default true) */
  var grayscale: js.UndefOr[Boolean] = js.undefined
  
  /** convert to single channel greyscale. (optional, default true) */
  var greyscale: js.UndefOr[Boolean] = js.undefined
}
object ThresholdOptions {
  
  inline def apply(): ThresholdOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThresholdOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThresholdOptions] (val x: Self) extends AnyVal {
    
    inline def setGrayscale(value: Boolean): Self = StObject.set(x, "grayscale", value.asInstanceOf[js.Any])
    
    inline def setGrayscaleUndefined: Self = StObject.set(x, "grayscale", js.undefined)
    
    inline def setGreyscale(value: Boolean): Self = StObject.set(x, "greyscale", value.asInstanceOf[js.Any])
    
    inline def setGreyscaleUndefined: Self = StObject.set(x, "greyscale", js.undefined)
  }
}
