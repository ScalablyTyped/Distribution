package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PannerOptions
  extends StObject
     with AudioNodeOptions {
  
  /* standard dom */
  var coneInnerAngle: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var coneOuterAngle: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var coneOuterGain: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var distanceModel: js.UndefOr[DistanceModelType] = js.undefined
  
  /* standard dom */
  var maxDistance: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var orientationX: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var orientationY: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var orientationZ: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var panningModel: js.UndefOr[PanningModelType] = js.undefined
  
  /* standard dom */
  var positionX: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var positionY: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var positionZ: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var refDistance: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var rolloffFactor: js.UndefOr[Double] = js.undefined
}
object PannerOptions {
  
  inline def apply(): PannerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PannerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PannerOptions] (val x: Self) extends AnyVal {
    
    inline def setConeInnerAngle(value: Double): Self = StObject.set(x, "coneInnerAngle", value.asInstanceOf[js.Any])
    
    inline def setConeInnerAngleUndefined: Self = StObject.set(x, "coneInnerAngle", js.undefined)
    
    inline def setConeOuterAngle(value: Double): Self = StObject.set(x, "coneOuterAngle", value.asInstanceOf[js.Any])
    
    inline def setConeOuterAngleUndefined: Self = StObject.set(x, "coneOuterAngle", js.undefined)
    
    inline def setConeOuterGain(value: Double): Self = StObject.set(x, "coneOuterGain", value.asInstanceOf[js.Any])
    
    inline def setConeOuterGainUndefined: Self = StObject.set(x, "coneOuterGain", js.undefined)
    
    inline def setDistanceModel(value: DistanceModelType): Self = StObject.set(x, "distanceModel", value.asInstanceOf[js.Any])
    
    inline def setDistanceModelUndefined: Self = StObject.set(x, "distanceModel", js.undefined)
    
    inline def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
    
    inline def setMaxDistanceUndefined: Self = StObject.set(x, "maxDistance", js.undefined)
    
    inline def setOrientationX(value: Double): Self = StObject.set(x, "orientationX", value.asInstanceOf[js.Any])
    
    inline def setOrientationXUndefined: Self = StObject.set(x, "orientationX", js.undefined)
    
    inline def setOrientationY(value: Double): Self = StObject.set(x, "orientationY", value.asInstanceOf[js.Any])
    
    inline def setOrientationYUndefined: Self = StObject.set(x, "orientationY", js.undefined)
    
    inline def setOrientationZ(value: Double): Self = StObject.set(x, "orientationZ", value.asInstanceOf[js.Any])
    
    inline def setOrientationZUndefined: Self = StObject.set(x, "orientationZ", js.undefined)
    
    inline def setPanningModel(value: PanningModelType): Self = StObject.set(x, "panningModel", value.asInstanceOf[js.Any])
    
    inline def setPanningModelUndefined: Self = StObject.set(x, "panningModel", js.undefined)
    
    inline def setPositionX(value: Double): Self = StObject.set(x, "positionX", value.asInstanceOf[js.Any])
    
    inline def setPositionXUndefined: Self = StObject.set(x, "positionX", js.undefined)
    
    inline def setPositionY(value: Double): Self = StObject.set(x, "positionY", value.asInstanceOf[js.Any])
    
    inline def setPositionYUndefined: Self = StObject.set(x, "positionY", js.undefined)
    
    inline def setPositionZ(value: Double): Self = StObject.set(x, "positionZ", value.asInstanceOf[js.Any])
    
    inline def setPositionZUndefined: Self = StObject.set(x, "positionZ", js.undefined)
    
    inline def setRefDistance(value: Double): Self = StObject.set(x, "refDistance", value.asInstanceOf[js.Any])
    
    inline def setRefDistanceUndefined: Self = StObject.set(x, "refDistance", js.undefined)
    
    inline def setRolloffFactor(value: Double): Self = StObject.set(x, "rolloffFactor", value.asInstanceOf[js.Any])
    
    inline def setRolloffFactorUndefined: Self = StObject.set(x, "rolloffFactor", js.undefined)
  }
}
