package typings.reactNativeReanimated

import typings.reactNativeReanimated.reactNativeReanimatedStrings.auto
import typings.reactNativeReanimated.reanimated2CommonTypesMod.SensorValue3D
import typings.reactNativeReanimated.reanimated2CommonTypesMod.SensorValueRotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useAnimatedSensorMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/hook/useAnimatedSensor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait SensorType extends StObject
  @JSImport("react-native-reanimated/lib/types/reanimated2/hook/useAnimatedSensor", "SensorType")
  @js.native
  object SensorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SensorType & Double] = js.native
    
    @js.native
    sealed trait ACCELEROMETER
      extends StObject
         with SensorType
    /* 1 */ val ACCELEROMETER: typings.reactNativeReanimated.useAnimatedSensorMod.SensorType.ACCELEROMETER & Double = js.native
    
    @js.native
    sealed trait GRAVITY
      extends StObject
         with SensorType
    /* 3 */ val GRAVITY: typings.reactNativeReanimated.useAnimatedSensorMod.SensorType.GRAVITY & Double = js.native
    
    @js.native
    sealed trait GYROSCOPE
      extends StObject
         with SensorType
    /* 2 */ val GYROSCOPE: typings.reactNativeReanimated.useAnimatedSensorMod.SensorType.GYROSCOPE & Double = js.native
    
    @js.native
    sealed trait MAGNETIC_FIELD
      extends StObject
         with SensorType
    /* 4 */ val MAGNETIC_FIELD: typings.reactNativeReanimated.useAnimatedSensorMod.SensorType.MAGNETIC_FIELD & Double = js.native
    
    @js.native
    sealed trait ROTATION
      extends StObject
         with SensorType
    /* 5 */ val ROTATION: typings.reactNativeReanimated.useAnimatedSensorMod.SensorType.ROTATION & Double = js.native
  }
  
  inline def useAnimatedSensor(sensorType: SensorType): AnimatedSensor = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedSensor")(sensorType.asInstanceOf[js.Any]).asInstanceOf[AnimatedSensor]
  inline def useAnimatedSensor(sensorType: SensorType, userConfig: SensorConfig): AnimatedSensor = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedSensor")(sensorType.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[AnimatedSensor]
  
  trait AnimatedSensor extends StObject {
    
    var config: SensorConfig
    
    var isAvailable: Boolean
    
    var sensor: SensorValue3D | SensorValueRotation | Null
    
    def unregister(): Unit
  }
  object AnimatedSensor {
    
    inline def apply(config: SensorConfig, isAvailable: Boolean, unregister: () => Unit): AnimatedSensor = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], isAvailable = isAvailable.asInstanceOf[js.Any], unregister = js.Any.fromFunction0(unregister), sensor = null)
      __obj.asInstanceOf[AnimatedSensor]
    }
    
    extension [Self <: AnimatedSensor](x: Self) {
      
      inline def setConfig(value: SensorConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setIsAvailable(value: Boolean): Self = StObject.set(x, "isAvailable", value.asInstanceOf[js.Any])
      
      inline def setSensor(value: SensorValue3D | SensorValueRotation): Self = StObject.set(x, "sensor", value.asInstanceOf[js.Any])
      
      inline def setSensorNull: Self = StObject.set(x, "sensor", null)
      
      inline def setUnregister(value: () => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction0(value))
    }
  }
  
  trait SensorConfig extends StObject {
    
    var interval: Double | auto
  }
  object SensorConfig {
    
    inline def apply(interval: Double | auto): SensorConfig = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
      __obj.asInstanceOf[SensorConfig]
    }
    
    extension [Self <: SensorConfig](x: Self) {
      
      inline def setInterval(value: Double | auto): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    }
  }
}
