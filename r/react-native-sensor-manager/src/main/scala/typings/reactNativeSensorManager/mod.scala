package typings.reactNativeSensorManager

import typings.reactNativeSensorManager.anon.Azimuth
import typings.reactNativeSensorManager.anon.IsNear
import typings.reactNativeSensorManager.anon.Light
import typings.reactNativeSensorManager.anon.Steps
import typings.reactNativeSensorManager.anon.Temp
import typings.reactNativeSensorManager.anon.X
import typings.reactNativeSensorManager.reactNativeSensorManagerStrings.Accelerometer
import typings.reactNativeSensorManager.reactNativeSensorManagerStrings.Gyroscope
import typings.reactNativeSensorManager.reactNativeSensorManagerStrings.LightSensor
import typings.reactNativeSensorManager.reactNativeSensorManagerStrings.Magnetometer
import typings.reactNativeSensorManager.reactNativeSensorManagerStrings.Orientation
import typings.reactNativeSensorManager.reactNativeSensorManagerStrings.Proximity
import typings.reactNativeSensorManager.reactNativeSensorManagerStrings.StepCounter
import typings.reactNativeSensorManager.reactNativeSensorManagerStrings.Thermometer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
    
    @scala.inline
    def apply(
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
    implicit class SensorManagerMutableBuilder[Self <: SensorManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStartAccelerometer(value: Double => Unit): Self = StObject.set(x, "startAccelerometer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartGyroscope(value: Double => Unit): Self = StObject.set(x, "startGyroscope", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartLightSensor(value: Double => Unit): Self = StObject.set(x, "startLightSensor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartMagnetometer(value: Double => Unit): Self = StObject.set(x, "startMagnetometer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartMotionValue(value: Double => Unit): Self = StObject.set(x, "startMotionValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartOrientation(value: Double => Unit): Self = StObject.set(x, "startOrientation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartProximity(value: Double => Unit): Self = StObject.set(x, "startProximity", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartStepCounter(value: Double => Unit): Self = StObject.set(x, "startStepCounter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartThermometer(value: Double => Unit): Self = StObject.set(x, "startThermometer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStopAccelerometer(value: () => Unit): Self = StObject.set(x, "stopAccelerometer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopGyroscope(value: () => Unit): Self = StObject.set(x, "stopGyroscope", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopLightSensor(value: () => Unit): Self = StObject.set(x, "stopLightSensor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopMagnetometer(value: () => Unit): Self = StObject.set(x, "stopMagnetometer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopMotionValue(value: () => Unit): Self = StObject.set(x, "stopMotionValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopOrientation(value: () => Unit): Self = StObject.set(x, "stopOrientation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopProximity(value: () => Unit): Self = StObject.set(x, "stopProximity", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopStepCounter(value: () => Unit): Self = StObject.set(x, "stopStepCounter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopThermometer(value: () => Unit): Self = StObject.set(x, "stopThermometer", js.Any.fromFunction0(value))
    }
  }
  
  object reactNativeAugmentingMod {
    
    @js.native
    trait DeviceEventEmitterStatic extends StObject {
      
      @JSName("addListener")
      def addListener_Accelerometer(event: Accelerometer, callback: js.Function1[/* data */ X, Unit]): js.Any = js.native
      @JSName("addListener")
      def addListener_Gyroscope(event: Gyroscope, callback: js.Function1[/* data */ X, Unit]): js.Any = js.native
      @JSName("addListener")
      def addListener_LightSensor(event: LightSensor, callback: js.Function1[/* data */ Light, Unit]): js.Any = js.native
      @JSName("addListener")
      def addListener_Magnetometer(event: Magnetometer, callback: js.Function1[/* data */ X, Unit]): js.Any = js.native
      @JSName("addListener")
      def addListener_Orientation(event: Orientation, callback: js.Function1[/* data */ Azimuth, Unit]): js.Any = js.native
      @JSName("addListener")
      def addListener_Proximity(event: Proximity, callback: js.Function1[/* data */ IsNear, Unit]): js.Any = js.native
      @JSName("addListener")
      def addListener_StepCounter(event: StepCounter, callback: js.Function1[/* data */ Steps, Unit]): js.Any = js.native
      @JSName("addListener")
      def addListener_Thermometer(event: Thermometer, callback: js.Function1[/* data */ Temp, Unit]): js.Any = js.native
    }
    
    trait NativeModulesStatic extends StObject {
      
      var SensorManager: typings.reactNativeSensorManager.mod.SensorManager
    }
    object NativeModulesStatic {
      
      @scala.inline
      def apply(SensorManager: SensorManager): NativeModulesStatic = {
        val __obj = js.Dynamic.literal(SensorManager = SensorManager.asInstanceOf[js.Any])
        __obj.asInstanceOf[NativeModulesStatic]
      }
      
      @scala.inline
      implicit class NativeModulesStaticMutableBuilder[Self <: NativeModulesStatic] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSensorManager(value: SensorManager): Self = StObject.set(x, "SensorManager", value.asInstanceOf[js.Any])
      }
    }
  }
}
