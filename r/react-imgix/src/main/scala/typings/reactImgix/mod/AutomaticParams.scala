package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutomaticParams extends StObject {
  
  var auto: js.UndefOr[ImgixParamType] = js.native
}
object AutomaticParams {
  
  @scala.inline
  def apply(): AutomaticParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomaticParams]
  }
  
  @scala.inline
  implicit class AutomaticParamsMutableBuilder[Self <: AutomaticParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuto(value: ImgixParamType): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
  }
}
