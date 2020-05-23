package typings.reactNativeSensorManager.mod.reactNativeAugmentingMod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceEventEmitterStatic extends js.Object {
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

