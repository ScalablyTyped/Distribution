package typings
package reactDashNativeDashSensorDashManagerLib.reactDashNativeDashSensorDashManagerMod.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceEventEmitterStatic extends js.Object {
  @JSName("addListener")
  def addListener_Accelerometer(
    event: reactDashNativeDashSensorDashManagerLib.reactDashNativeDashSensorDashManagerLibStrings.Accelerometer,
    callback: js.Function1[/* data */ reactDashNativeDashSensorDashManagerLib.Anon_Z, scala.Unit]
  ): js.Any = js.native
  @JSName("addListener")
  def addListener_Gyroscope(
    event: reactDashNativeDashSensorDashManagerLib.reactDashNativeDashSensorDashManagerLibStrings.Gyroscope,
    callback: js.Function1[/* data */ reactDashNativeDashSensorDashManagerLib.Anon_Z, scala.Unit]
  ): js.Any = js.native
  @JSName("addListener")
  def addListener_LightSensor(
    event: reactDashNativeDashSensorDashManagerLib.reactDashNativeDashSensorDashManagerLibStrings.LightSensor,
    callback: js.Function1[/* data */ reactDashNativeDashSensorDashManagerLib.Anon_Light, scala.Unit]
  ): js.Any = js.native
  @JSName("addListener")
  def addListener_Magnetometer(
    event: reactDashNativeDashSensorDashManagerLib.reactDashNativeDashSensorDashManagerLibStrings.Magnetometer,
    callback: js.Function1[/* data */ reactDashNativeDashSensorDashManagerLib.Anon_Z, scala.Unit]
  ): js.Any = js.native
  @JSName("addListener")
  def addListener_Orientation(
    event: reactDashNativeDashSensorDashManagerLib.reactDashNativeDashSensorDashManagerLibStrings.Orientation,
    callback: js.Function1[/* data */ reactDashNativeDashSensorDashManagerLib.Anon_Azimuth, scala.Unit]
  ): js.Any = js.native
  @JSName("addListener")
  def addListener_Proximity(
    event: reactDashNativeDashSensorDashManagerLib.reactDashNativeDashSensorDashManagerLibStrings.Proximity,
    callback: js.Function1[/* data */ reactDashNativeDashSensorDashManagerLib.Anon_IsNear, scala.Unit]
  ): js.Any = js.native
  @JSName("addListener")
  def addListener_StepCounter(
    event: reactDashNativeDashSensorDashManagerLib.reactDashNativeDashSensorDashManagerLibStrings.StepCounter,
    callback: js.Function1[/* data */ reactDashNativeDashSensorDashManagerLib.Anon_Steps, scala.Unit]
  ): js.Any = js.native
  @JSName("addListener")
  def addListener_Thermometer(
    event: reactDashNativeDashSensorDashManagerLib.reactDashNativeDashSensorDashManagerLibStrings.Thermometer,
    callback: js.Function1[/* data */ reactDashNativeDashSensorDashManagerLib.Anon_Temp, scala.Unit]
  ): js.Any = js.native
}

