package typings.reactNativeSensorManager.mod

import typings.reactNative.mod.EmitterSubscription
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

/* augmented module */
object reactNativeAugmentingMod {
  
  @js.native
  trait DeviceEventEmitterStatic extends StObject {
    
    def addListener(event: Accelerometer | Gyroscope | Magnetometer, callback: js.Function1[/* data */ X, Unit]): EmitterSubscription = js.native
    @JSName("addListener")
    def addListener_LightSensor(event: LightSensor, callback: js.Function1[/* data */ Light, Unit]): EmitterSubscription = js.native
    @JSName("addListener")
    def addListener_Orientation(event: Orientation, callback: js.Function1[/* data */ Azimuth, Unit]): EmitterSubscription = js.native
    @JSName("addListener")
    def addListener_Proximity(event: Proximity, callback: js.Function1[/* data */ IsNear, Unit]): EmitterSubscription = js.native
    @JSName("addListener")
    def addListener_StepCounter(event: StepCounter, callback: js.Function1[/* data */ Steps, Unit]): EmitterSubscription = js.native
    @JSName("addListener")
    def addListener_Thermometer(event: Thermometer, callback: js.Function1[/* data */ Temp, Unit]): EmitterSubscription = js.native
  }
  
  trait NativeModulesStatic extends StObject {
    
    var SensorManager: typings.reactNativeSensorManager.mod.SensorManager
  }
  object NativeModulesStatic {
    
    inline def apply(SensorManager: SensorManager): NativeModulesStatic = {
      val __obj = js.Dynamic.literal(SensorManager = SensorManager.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeModulesStatic]
    }
    
    extension [Self <: NativeModulesStatic](x: Self) {
      
      inline def setSensorManager(value: SensorManager): Self = StObject.set(x, "SensorManager", value.asInstanceOf[js.Any])
    }
  }
}
