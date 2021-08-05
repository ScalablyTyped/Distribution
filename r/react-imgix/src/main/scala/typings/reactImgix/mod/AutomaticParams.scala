package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomaticParams extends StObject {
  
  var auto: js.UndefOr[ImgixParamType] = js.undefined
}
object AutomaticParams {
  
  inline def apply(): AutomaticParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomaticParams]
  }
  
  extension [Self <: AutomaticParams](x: Self) {
    
    inline def setAuto(value: ImgixParamType): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    inline def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
  }
}
