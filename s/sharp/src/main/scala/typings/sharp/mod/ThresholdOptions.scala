package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThresholdOptions extends StObject {
  
  /** alternative spelling for greyscale. (optional, default true) */
  var grayscale: js.UndefOr[Boolean] = js.native
  
  /** convert to single channel greyscale. (optional, default true) */
  var greyscale: js.UndefOr[Boolean] = js.native
}
object ThresholdOptions {
  
  @scala.inline
  def apply(): ThresholdOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThresholdOptions]
  }
  
  @scala.inline
  implicit class ThresholdOptionsMutableBuilder[Self <: ThresholdOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrayscale(value: Boolean): Self = StObject.set(x, "grayscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrayscaleUndefined: Self = StObject.set(x, "grayscale", js.undefined)
    
    @scala.inline
    def setGreyscale(value: Boolean): Self = StObject.set(x, "greyscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreyscaleUndefined: Self = StObject.set(x, "greyscale", js.undefined)
  }
}
