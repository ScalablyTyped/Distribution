package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoiseReductionParams extends StObject {
  
  var nr: js.UndefOr[ImgixParamType] = js.undefined
  
  var nrs: js.UndefOr[ImgixParamType] = js.undefined
}
object NoiseReductionParams {
  
  inline def apply(): NoiseReductionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoiseReductionParams]
  }
  
  extension [Self <: NoiseReductionParams](x: Self) {
    
    inline def setNr(value: ImgixParamType): Self = StObject.set(x, "nr", value.asInstanceOf[js.Any])
    
    inline def setNrUndefined: Self = StObject.set(x, "nr", js.undefined)
    
    inline def setNrs(value: ImgixParamType): Self = StObject.set(x, "nrs", value.asInstanceOf[js.Any])
    
    inline def setNrsUndefined: Self = StObject.set(x, "nrs", js.undefined)
  }
}
