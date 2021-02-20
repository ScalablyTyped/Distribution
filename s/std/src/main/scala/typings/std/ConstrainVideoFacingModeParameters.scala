package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstrainVideoFacingModeParameters extends StObject {
  
  var exact: js.UndefOr[VideoFacingModeEnum | js.Array[VideoFacingModeEnum]] = js.native
  
  var ideal: js.UndefOr[VideoFacingModeEnum | js.Array[VideoFacingModeEnum]] = js.native
}
object ConstrainVideoFacingModeParameters {
  
  @scala.inline
  def apply(): ConstrainVideoFacingModeParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstrainVideoFacingModeParameters]
  }
  
  @scala.inline
  implicit class ConstrainVideoFacingModeParametersMutableBuilder[Self <: ConstrainVideoFacingModeParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExact(value: VideoFacingModeEnum | js.Array[VideoFacingModeEnum]): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    @scala.inline
    def setExactVarargs(value: VideoFacingModeEnum*): Self = StObject.set(x, "exact", js.Array(value :_*))
    
    @scala.inline
    def setIdeal(value: VideoFacingModeEnum | js.Array[VideoFacingModeEnum]): Self = StObject.set(x, "ideal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdealUndefined: Self = StObject.set(x, "ideal", js.undefined)
    
    @scala.inline
    def setIdealVarargs(value: VideoFacingModeEnum*): Self = StObject.set(x, "ideal", js.Array(value :_*))
  }
}
