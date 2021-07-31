package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PannerOptions
  extends StObject
     with AudioNodeOptions {
  
  var coneInnerAngle: js.UndefOr[Double] = js.undefined
  
  var coneOuterAngle: js.UndefOr[Double] = js.undefined
  
  var coneOuterGain: js.UndefOr[Double] = js.undefined
  
  var distanceModel: js.UndefOr[DistanceModelType] = js.undefined
  
  var maxDistance: js.UndefOr[Double] = js.undefined
  
  var orientationX: js.UndefOr[Double] = js.undefined
  
  var orientationY: js.UndefOr[Double] = js.undefined
  
  var orientationZ: js.UndefOr[Double] = js.undefined
  
  var panningModel: js.UndefOr[PanningModelType] = js.undefined
  
  var positionX: js.UndefOr[Double] = js.undefined
  
  var positionY: js.UndefOr[Double] = js.undefined
  
  var positionZ: js.UndefOr[Double] = js.undefined
  
  var refDistance: js.UndefOr[Double] = js.undefined
  
  var rolloffFactor: js.UndefOr[Double] = js.undefined
}
object PannerOptions {
  
  @scala.inline
  def apply(): PannerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PannerOptions]
  }
  
  @scala.inline
  implicit class PannerOptionsMutableBuilder[Self <: PannerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConeInnerAngle(value: Double): Self = StObject.set(x, "coneInnerAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConeInnerAngleUndefined: Self = StObject.set(x, "coneInnerAngle", js.undefined)
    
    @scala.inline
    def setConeOuterAngle(value: Double): Self = StObject.set(x, "coneOuterAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConeOuterAngleUndefined: Self = StObject.set(x, "coneOuterAngle", js.undefined)
    
    @scala.inline
    def setConeOuterGain(value: Double): Self = StObject.set(x, "coneOuterGain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConeOuterGainUndefined: Self = StObject.set(x, "coneOuterGain", js.undefined)
    
    @scala.inline
    def setDistanceModel(value: DistanceModelType): Self = StObject.set(x, "distanceModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceModelUndefined: Self = StObject.set(x, "distanceModel", js.undefined)
    
    @scala.inline
    def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDistanceUndefined: Self = StObject.set(x, "maxDistance", js.undefined)
    
    @scala.inline
    def setOrientationX(value: Double): Self = StObject.set(x, "orientationX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationXUndefined: Self = StObject.set(x, "orientationX", js.undefined)
    
    @scala.inline
    def setOrientationY(value: Double): Self = StObject.set(x, "orientationY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationYUndefined: Self = StObject.set(x, "orientationY", js.undefined)
    
    @scala.inline
    def setOrientationZ(value: Double): Self = StObject.set(x, "orientationZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationZUndefined: Self = StObject.set(x, "orientationZ", js.undefined)
    
    @scala.inline
    def setPanningModel(value: PanningModelType): Self = StObject.set(x, "panningModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanningModelUndefined: Self = StObject.set(x, "panningModel", js.undefined)
    
    @scala.inline
    def setPositionX(value: Double): Self = StObject.set(x, "positionX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionXUndefined: Self = StObject.set(x, "positionX", js.undefined)
    
    @scala.inline
    def setPositionY(value: Double): Self = StObject.set(x, "positionY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionYUndefined: Self = StObject.set(x, "positionY", js.undefined)
    
    @scala.inline
    def setPositionZ(value: Double): Self = StObject.set(x, "positionZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionZUndefined: Self = StObject.set(x, "positionZ", js.undefined)
    
    @scala.inline
    def setRefDistance(value: Double): Self = StObject.set(x, "refDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefDistanceUndefined: Self = StObject.set(x, "refDistance", js.undefined)
    
    @scala.inline
    def setRolloffFactor(value: Double): Self = StObject.set(x, "rolloffFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolloffFactorUndefined: Self = StObject.set(x, "rolloffFactor", js.undefined)
  }
}
