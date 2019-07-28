package typings.reactDashNativeDashSensorDashManager.reactDashNativeDashSensorDashManagerMod.reactDashNativeMod

import typings.reactDashNativeDashSensorDashManager.Anon_Azimuth
import typings.reactDashNativeDashSensorDashManager.Anon_IsNear
import typings.reactDashNativeDashSensorDashManager.Anon_Light
import typings.reactDashNativeDashSensorDashManager.Anon_Steps
import typings.reactDashNativeDashSensorDashManager.Anon_Temp
import typings.reactDashNativeDashSensorDashManager.Anon_X
import typings.reactDashNativeDashSensorDashManager.reactDashNativeDashSensorDashManagerStrings.Accelerometer
import typings.reactDashNativeDashSensorDashManager.reactDashNativeDashSensorDashManagerStrings.Gyroscope
import typings.reactDashNativeDashSensorDashManager.reactDashNativeDashSensorDashManagerStrings.LightSensor
import typings.reactDashNativeDashSensorDashManager.reactDashNativeDashSensorDashManagerStrings.Magnetometer
import typings.reactDashNativeDashSensorDashManager.reactDashNativeDashSensorDashManagerStrings.Orientation
import typings.reactDashNativeDashSensorDashManager.reactDashNativeDashSensorDashManagerStrings.Proximity
import typings.reactDashNativeDashSensorDashManager.reactDashNativeDashSensorDashManagerStrings.StepCounter
import typings.reactDashNativeDashSensorDashManager.reactDashNativeDashSensorDashManagerStrings.Thermometer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceEventEmitterStatic extends js.Object {
  @JSName("addListener")
  def addListener_Accelerometer(event: Accelerometer, callback: js.Function1[/* data */ Anon_X, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_Gyroscope(event: Gyroscope, callback: js.Function1[/* data */ Anon_X, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_LightSensor(event: LightSensor, callback: js.Function1[/* data */ Anon_Light, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_Magnetometer(event: Magnetometer, callback: js.Function1[/* data */ Anon_X, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_Orientation(event: Orientation, callback: js.Function1[/* data */ Anon_Azimuth, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_Proximity(event: Proximity, callback: js.Function1[/* data */ Anon_IsNear, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_StepCounter(event: StepCounter, callback: js.Function1[/* data */ Anon_Steps, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_Thermometer(event: Thermometer, callback: js.Function1[/* data */ Anon_Temp, Unit]): js.Any = js.native
}

