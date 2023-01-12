package typings.reactNativeSensorManager.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SensorManager extends StObject {
  
  def startAccelerometer(delay: Double): Unit
  
  def startGyroscope(delay: Double): Unit
  
  def startLightSensor(delay: Double): Unit
  
  def startMagnetometer(delay: Double): Unit
  
  def startMotionValue(delay: Double): Unit
  
  def startOrientation(delay: Double): Unit
  
  def startProximity(delay: Double): Unit
  
  def startStepCounter(delay: Double): Unit
  
  def startThermometer(delay: Double): Unit
  
  def stopAccelerometer(): Unit
  
  def stopGyroscope(): Unit
  
  def stopLightSensor(): Unit
  
  def stopMagnetometer(): Unit
  
  def stopMotionValue(): Unit
  
  def stopOrientation(): Unit
  
  def stopProximity(): Unit
  
  def stopStepCounter(): Unit
  
  def stopThermometer(): Unit
}
object SensorManager {
  
  inline def apply(
    startAccelerometer: Double => Unit,
    startGyroscope: Double => Unit,
    startLightSensor: Double => Unit,
    startMagnetometer: Double => Unit,
    startMotionValue: Double => Unit,
    startOrientation: Double => Unit,
    startProximity: Double => Unit,
    startStepCounter: Double => Unit,
    startThermometer: Double => Unit,
    stopAccelerometer: () => Unit,
    stopGyroscope: () => Unit,
    stopLightSensor: () => Unit,
    stopMagnetometer: () => Unit,
    stopMotionValue: () => Unit,
    stopOrientation: () => Unit,
    stopProximity: () => Unit,
    stopStepCounter: () => Unit,
    stopThermometer: () => Unit
  ): SensorManager = {
    val __obj = js.Dynamic.literal(startAccelerometer = js.Any.fromFunction1(startAccelerometer), startGyroscope = js.Any.fromFunction1(startGyroscope), startLightSensor = js.Any.fromFunction1(startLightSensor), startMagnetometer = js.Any.fromFunction1(startMagnetometer), startMotionValue = js.Any.fromFunction1(startMotionValue), startOrientation = js.Any.fromFunction1(startOrientation), startProximity = js.Any.fromFunction1(startProximity), startStepCounter = js.Any.fromFunction1(startStepCounter), startThermometer = js.Any.fromFunction1(startThermometer), stopAccelerometer = js.Any.fromFunction0(stopAccelerometer), stopGyroscope = js.Any.fromFunction0(stopGyroscope), stopLightSensor = js.Any.fromFunction0(stopLightSensor), stopMagnetometer = js.Any.fromFunction0(stopMagnetometer), stopMotionValue = js.Any.fromFunction0(stopMotionValue), stopOrientation = js.Any.fromFunction0(stopOrientation), stopProximity = js.Any.fromFunction0(stopProximity), stopStepCounter = js.Any.fromFunction0(stopStepCounter), stopThermometer = js.Any.fromFunction0(stopThermometer))
    __obj.asInstanceOf[SensorManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SensorManager] (val x: Self) extends AnyVal {
    
    inline def setStartAccelerometer(value: Double => Unit): Self = StObject.set(x, "startAccelerometer", js.Any.fromFunction1(value))
    
    inline def setStartGyroscope(value: Double => Unit): Self = StObject.set(x, "startGyroscope", js.Any.fromFunction1(value))
    
    inline def setStartLightSensor(value: Double => Unit): Self = StObject.set(x, "startLightSensor", js.Any.fromFunction1(value))
    
    inline def setStartMagnetometer(value: Double => Unit): Self = StObject.set(x, "startMagnetometer", js.Any.fromFunction1(value))
    
    inline def setStartMotionValue(value: Double => Unit): Self = StObject.set(x, "startMotionValue", js.Any.fromFunction1(value))
    
    inline def setStartOrientation(value: Double => Unit): Self = StObject.set(x, "startOrientation", js.Any.fromFunction1(value))
    
    inline def setStartProximity(value: Double => Unit): Self = StObject.set(x, "startProximity", js.Any.fromFunction1(value))
    
    inline def setStartStepCounter(value: Double => Unit): Self = StObject.set(x, "startStepCounter", js.Any.fromFunction1(value))
    
    inline def setStartThermometer(value: Double => Unit): Self = StObject.set(x, "startThermometer", js.Any.fromFunction1(value))
    
    inline def setStopAccelerometer(value: () => Unit): Self = StObject.set(x, "stopAccelerometer", js.Any.fromFunction0(value))
    
    inline def setStopGyroscope(value: () => Unit): Self = StObject.set(x, "stopGyroscope", js.Any.fromFunction0(value))
    
    inline def setStopLightSensor(value: () => Unit): Self = StObject.set(x, "stopLightSensor", js.Any.fromFunction0(value))
    
    inline def setStopMagnetometer(value: () => Unit): Self = StObject.set(x, "stopMagnetometer", js.Any.fromFunction0(value))
    
    inline def setStopMotionValue(value: () => Unit): Self = StObject.set(x, "stopMotionValue", js.Any.fromFunction0(value))
    
    inline def setStopOrientation(value: () => Unit): Self = StObject.set(x, "stopOrientation", js.Any.fromFunction0(value))
    
    inline def setStopProximity(value: () => Unit): Self = StObject.set(x, "stopProximity", js.Any.fromFunction0(value))
    
    inline def setStopStepCounter(value: () => Unit): Self = StObject.set(x, "stopStepCounter", js.Any.fromFunction0(value))
    
    inline def setStopThermometer(value: () => Unit): Self = StObject.set(x, "stopThermometer", js.Any.fromFunction0(value))
  }
}
