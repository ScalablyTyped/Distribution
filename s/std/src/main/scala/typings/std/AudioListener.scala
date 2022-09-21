package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The position and orientation of the unique person listening to the audio scene, and is used in audio spatialization. All PannerNodes spatialize in relation to the AudioListener stored in the BaseAudioContext.listener attribute. */
trait AudioListener extends StObject {
  
  /* standard dom */
  val forwardX: AudioParam
  
  /* standard dom */
  val forwardY: AudioParam
  
  /* standard dom */
  val forwardZ: AudioParam
  
  /* standard dom */
  val positionX: AudioParam
  
  /* standard dom */
  val positionY: AudioParam
  
  /* standard dom */
  val positionZ: AudioParam
  
  /** @deprecated */
  /* standard dom */
  def setOrientation(x: Double, y: Double, z: Double, xUp: Double, yUp: Double, zUp: Double): Unit
  
  /** @deprecated */
  /* standard dom */
  def setPosition(x: Double, y: Double, z: Double): Unit
  
  /* standard dom */
  val upX: AudioParam
  
  /* standard dom */
  val upY: AudioParam
  
  /* standard dom */
  val upZ: AudioParam
}
object AudioListener {
  
  inline def apply(
    forwardX: AudioParam,
    forwardY: AudioParam,
    forwardZ: AudioParam,
    positionX: AudioParam,
    positionY: AudioParam,
    positionZ: AudioParam,
    setOrientation: (Double, Double, Double, Double, Double, Double) => Unit,
    setPosition: (Double, Double, Double) => Unit,
    upX: AudioParam,
    upY: AudioParam,
    upZ: AudioParam
  ): AudioListener = {
    val __obj = js.Dynamic.literal(forwardX = forwardX.asInstanceOf[js.Any], forwardY = forwardY.asInstanceOf[js.Any], forwardZ = forwardZ.asInstanceOf[js.Any], positionX = positionX.asInstanceOf[js.Any], positionY = positionY.asInstanceOf[js.Any], positionZ = positionZ.asInstanceOf[js.Any], setOrientation = js.Any.fromFunction6(setOrientation), setPosition = js.Any.fromFunction3(setPosition), upX = upX.asInstanceOf[js.Any], upY = upY.asInstanceOf[js.Any], upZ = upZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioListener]
  }
  
  extension [Self <: AudioListener](x: Self) {
    
    inline def setForwardX(value: AudioParam): Self = StObject.set(x, "forwardX", value.asInstanceOf[js.Any])
    
    inline def setForwardY(value: AudioParam): Self = StObject.set(x, "forwardY", value.asInstanceOf[js.Any])
    
    inline def setForwardZ(value: AudioParam): Self = StObject.set(x, "forwardZ", value.asInstanceOf[js.Any])
    
    inline def setPositionX(value: AudioParam): Self = StObject.set(x, "positionX", value.asInstanceOf[js.Any])
    
    inline def setPositionY(value: AudioParam): Self = StObject.set(x, "positionY", value.asInstanceOf[js.Any])
    
    inline def setPositionZ(value: AudioParam): Self = StObject.set(x, "positionZ", value.asInstanceOf[js.Any])
    
    inline def setSetOrientation(value: (Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "setOrientation", js.Any.fromFunction6(value))
    
    inline def setSetPosition(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction3(value))
    
    inline def setUpX(value: AudioParam): Self = StObject.set(x, "upX", value.asInstanceOf[js.Any])
    
    inline def setUpY(value: AudioParam): Self = StObject.set(x, "upY", value.asInstanceOf[js.Any])
    
    inline def setUpZ(value: AudioParam): Self = StObject.set(x, "upZ", value.asInstanceOf[js.Any])
  }
}
