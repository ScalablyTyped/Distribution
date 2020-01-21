package typings.reactNativeSensorManager.mod.reactNativeAugmentingMod

import typings.reactNativeSensorManager.AnonAzimuth
import typings.reactNativeSensorManager.AnonIsNear
import typings.reactNativeSensorManager.AnonLight
import typings.reactNativeSensorManager.AnonSteps
import typings.reactNativeSensorManager.AnonTemp
import typings.reactNativeSensorManager.AnonX
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
  def addListener_Accelerometer(event: Accelerometer, callback: js.Function1[/* data */ AnonX, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_Gyroscope(event: Gyroscope, callback: js.Function1[/* data */ AnonX, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_LightSensor(event: LightSensor, callback: js.Function1[/* data */ AnonLight, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_Magnetometer(event: Magnetometer, callback: js.Function1[/* data */ AnonX, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_Orientation(event: Orientation, callback: js.Function1[/* data */ AnonAzimuth, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_Proximity(event: Proximity, callback: js.Function1[/* data */ AnonIsNear, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_StepCounter(event: StepCounter, callback: js.Function1[/* data */ AnonSteps, Unit]): js.Any = js.native
  @JSName("addListener")
  def addListener_Thermometer(event: Thermometer, callback: js.Function1[/* data */ AnonTemp, Unit]): js.Any = js.native
}

