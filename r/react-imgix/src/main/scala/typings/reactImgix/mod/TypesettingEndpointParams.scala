package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypesettingEndpointParams extends StObject {
  
  @JSName("~text")
  var Tildetext: js.UndefOr[ImgixParamType] = js.undefined
  
  var `txt-lead`: js.UndefOr[ImgixParamType] = js.undefined
  
  var `txt-track`: js.UndefOr[ImgixParamType] = js.undefined
}
object TypesettingEndpointParams {
  
  inline def apply(): TypesettingEndpointParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypesettingEndpointParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypesettingEndpointParams] (val x: Self) extends AnyVal {
    
    inline def setTildetext(value: ImgixParamType): Self = StObject.set(x, "~text", value.asInstanceOf[js.Any])
    
    inline def setTildetextUndefined: Self = StObject.set(x, "~text", js.undefined)
    
    inline def `setTxt-lead`(value: ImgixParamType): Self = StObject.set(x, "txt-lead", value.asInstanceOf[js.Any])
    
    inline def `setTxt-leadUndefined`: Self = StObject.set(x, "txt-lead", js.undefined)
    
    inline def `setTxt-track`(value: ImgixParamType): Self = StObject.set(x, "txt-track", value.asInstanceOf[js.Any])
    
    inline def `setTxt-trackUndefined`: Self = StObject.set(x, "txt-track", js.undefined)
  }
}
