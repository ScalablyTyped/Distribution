package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VRStageParameters extends StObject {
  
  var sittingToStandingTransform: js.UndefOr[Float32Array] = js.native
  
  var sizeX: js.UndefOr[Double] = js.native
  
  var sizeY: js.UndefOr[Double] = js.native
}
object VRStageParameters {
  
  @scala.inline
  def apply(): VRStageParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VRStageParameters]
  }
  
  @scala.inline
  implicit class VRStageParametersMutableBuilder[Self <: VRStageParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSittingToStandingTransform(value: Float32Array): Self = StObject.set(x, "sittingToStandingTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSittingToStandingTransformUndefined: Self = StObject.set(x, "sittingToStandingTransform", js.undefined)
    
    @scala.inline
    def setSizeX(value: Double): Self = StObject.set(x, "sizeX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeXUndefined: Self = StObject.set(x, "sizeX", js.undefined)
    
    @scala.inline
    def setSizeY(value: Double): Self = StObject.set(x, "sizeY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeYUndefined: Self = StObject.set(x, "sizeY", js.undefined)
  }
}
